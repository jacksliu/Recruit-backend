package edu.cn.cpu.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.sql.DataSource;

/**
 * Copyright [2019] [http://www.snowj.com]
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    private final WebCorsFilter corsFilter;

    private final AuthenticationManagerBuilder authenticationManagerBuilder;

    private final UserDetailsService userDetailsService;

    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    private final DataSource dataSource;

    public SecurityConfiguration(AuthenticationManagerBuilder authenticationManagerBuilder,
                                    UserDetailsService userDetailsService,
                                    BCryptPasswordEncoder bCryptPasswordEncoder,
                                 WebCorsFilter corsFilter, DataSource dataSource) {
        this.authenticationManagerBuilder = authenticationManagerBuilder;
        this.userDetailsService = userDetailsService;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
        this.corsFilter = corsFilter;
        this.dataSource = dataSource;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        enableMysqlAuthentication(auth);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .cors()
                .and()
                .addFilter(corsFilter)
                .userDetailsService(userDetailsService)
                .formLogin()
                .and()
                .logout()
                .and()
                .csrf()
                .disable()
                .authorizeRequests()
                .antMatchers("/api/**").permitAll();
//                .antMatchers("/api/**").hasAnyAuthority(AuthoritiesConstants.ADMIN);
    }

    /**
     * 认证方式： mysql 权限认证
     * @param auth 认证构建器
     */
    private void enableMysqlAuthentication(AuthenticationManagerBuilder auth) {
        try {
            auth.jdbcAuthentication()
                    .dataSource(dataSource)
                    .authoritiesByUsernameQuery("select `username`, `authority` from `authorities` where `username` = ?")
                    .groupAuthoritiesByUsername("select g.`id`, g.`group_name`, ga.`authority` from `groups` g, `group_members` gm, `group_authorities` ga where gm.`username` = ? and g.`id` = ga.`group_id` and g.`id` = gm.`group_id`")
                    .usersByUsernameQuery("select `username`, `password`, `enabled` from `users` where `username` = ?")
                    .passwordEncoder(bCryptPasswordEncoder);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

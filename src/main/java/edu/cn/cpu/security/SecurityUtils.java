package edu.cn.cpu.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

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
public class SecurityUtils {

    /**
     * 获取当前登录用户
     *
     * @return 用户名
     */
    public static String getCurrentUserLogin() {
        Authentication authentication = SecurityContextHolder
                .getContext().getAuthentication();
        Object principal = authentication.getPrincipal();
        return String.valueOf(principal);
    }
}

package edu.cn.cpu.repository.auto;

import edu.cn.cpu.domain.auto.Tblapply;
import edu.cn.cpu.domain.auto.TblapplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblapplyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblApply
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    long countByExample(TblapplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblApply
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    int deleteByExample(TblapplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblApply
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblApply
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    int insert(Tblapply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblApply
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    int insertSelective(Tblapply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblApply
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    List<Tblapply> selectByExample(TblapplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblApply
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    Tblapply selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblApply
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    int updateByExampleSelective(@Param("record") Tblapply record, @Param("example") TblapplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblApply
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    int updateByExample(@Param("record") Tblapply record, @Param("example") TblapplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblApply
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    int updateByPrimaryKeySelective(Tblapply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblApply
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    int updateByPrimaryKey(Tblapply record);
}
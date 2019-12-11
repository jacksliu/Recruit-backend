package edu.cn.cpu.repository.auto;

import edu.cn.cpu.domain.auto.Tbldiseasetype;
import edu.cn.cpu.domain.auto.TbldiseasetypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbldiseasetypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblDiseaseType
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    long countByExample(TbldiseasetypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblDiseaseType
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    int deleteByExample(TbldiseasetypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblDiseaseType
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblDiseaseType
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    int insert(Tbldiseasetype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblDiseaseType
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    int insertSelective(Tbldiseasetype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblDiseaseType
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    List<Tbldiseasetype> selectByExample(TbldiseasetypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblDiseaseType
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    Tbldiseasetype selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblDiseaseType
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    int updateByExampleSelective(@Param("record") Tbldiseasetype record, @Param("example") TbldiseasetypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblDiseaseType
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    int updateByExample(@Param("record") Tbldiseasetype record, @Param("example") TbldiseasetypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblDiseaseType
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    int updateByPrimaryKeySelective(Tbldiseasetype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblDiseaseType
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    int updateByPrimaryKey(Tbldiseasetype record);
}
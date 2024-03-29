package edu.cn.cpu.repository.auto;

import edu.cn.cpu.domain.auto.Tblpromulgator;
import edu.cn.cpu.domain.auto.TblpromulgatorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblpromulgatorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblPromulgator
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    long countByExample(TblpromulgatorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblPromulgator
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    int deleteByExample(TblpromulgatorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblPromulgator
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblPromulgator
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    int insert(Tblpromulgator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblPromulgator
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    int insertSelective(Tblpromulgator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblPromulgator
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    List<Tblpromulgator> selectByExample(TblpromulgatorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblPromulgator
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    Tblpromulgator selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblPromulgator
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    int updateByExampleSelective(@Param("record") Tblpromulgator record, @Param("example") TblpromulgatorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblPromulgator
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    int updateByExample(@Param("record") Tblpromulgator record, @Param("example") TblpromulgatorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblPromulgator
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    int updateByPrimaryKeySelective(Tblpromulgator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tblPromulgator
     *
     * @mbg.generated Thu Dec 05 14:02:57 CST 2019
     */
    int updateByPrimaryKey(Tblpromulgator record);
}
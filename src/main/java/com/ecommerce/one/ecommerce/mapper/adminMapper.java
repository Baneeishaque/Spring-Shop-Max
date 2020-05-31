package com.ecommerce.one.ecommerce.mapper;

import com.ecommerce.one.ecommerce.domain.admin;
import com.ecommerce.one.ecommerce.domain.adminExample;
import java.util.List;

import com.ecommerce.one.ecommerce.domain.customer;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface adminMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    long countByExample(adminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    int deleteByExample(adminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    int deleteByPrimaryKey(Integer adminid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    int insert(admin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    int insertSelective(admin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    List<admin> selectByExample(adminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    admin selectByPrimaryKey(Integer adminid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    int updateByExampleSelective(@Param("record") admin record, @Param("example") adminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    int updateByExample(@Param("record") admin record, @Param("example") adminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    int updateByPrimaryKeySelective(admin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    int updateByPrimaryKey(admin record);

    @Select("SELECT * FROM admin WHERE adminname = #{adminname} AND adminpassword = #{adminpassword}")
    admin findAdmin(@Param("adminname") String adminname, @Param("adminpassword") String adminpassword);
}
package com.ecommerce.one.ecommerce.mapper;

import com.ecommerce.one.ecommerce.domain.customer;
import com.ecommerce.one.ecommerce.domain.customerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface customerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Thu May 21 23:21:31 CST 2020
     */
    long countByExample(customerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Thu May 21 23:21:31 CST 2020
     */
    int deleteByExample(customerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Thu May 21 23:21:31 CST 2020
     */
    int deleteByPrimaryKey(Short customerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Thu May 21 23:21:31 CST 2020
     */
    int insert(customer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Thu May 21 23:21:31 CST 2020
     */
    int insertSelective(customer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Thu May 21 23:21:31 CST 2020
     */
    List<customer> selectByExample(customerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Thu May 21 23:21:31 CST 2020
     */
    customer selectByPrimaryKey(Short customerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Thu May 21 23:21:31 CST 2020
     */
    int updateByExampleSelective(@Param("record") customer record, @Param("example") customerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Thu May 21 23:21:31 CST 2020
     */
    int updateByExample(@Param("record") customer record, @Param("example") customerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Thu May 21 23:21:31 CST 2020
     */
    int updateByPrimaryKeySelective(customer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Thu May 21 23:21:31 CST 2020
     */
    int updateByPrimaryKey(customer record);
}
package com.ecommerce.one.ecommerce.mapper;

import com.ecommerce.one.ecommerce.domain.product;
import com.ecommerce.one.ecommerce.domain.productExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface productMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Sat May 23 21:39:24 CST 2020
     */
    long countByExample(productExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Sat May 23 21:39:24 CST 2020
     */
    int deleteByExample(productExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Sat May 23 21:39:24 CST 2020
     */
    product selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Sat May 23 21:39:24 CST 2020
     */
    int updateByPrimaryKey(product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Sat May 23 21:39:24 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Sat May 23 21:39:24 CST 2020
     */
    int insert(product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Sat May 23 21:39:24 CST 2020
     */
    int insertSelective(product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Sat May 23 21:39:24 CST 2020
     */
    List<product> selectByExample(productExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Sat May 23 21:39:24 CST 2020
     */
    int updateByExampleSelective(@Param("record") product record, @Param("example") productExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Sat May 23 21:39:24 CST 2020
     */
    int updateByExample(@Param("record") product record, @Param("example") productExample example);
}
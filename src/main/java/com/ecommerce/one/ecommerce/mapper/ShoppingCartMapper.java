package com.ecommerce.one.ecommerce.mapper;

import com.ecommerce.one.ecommerce.domain.ShoppingCart;
import com.ecommerce.one.ecommerce.domain.ShoppingCartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface ShoppingCartMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbg.generated Mon Jun 01 21:39:19 CST 2020
     */
    long countByExample(ShoppingCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbg.generated Mon Jun 01 21:39:19 CST 2020
     */
    int deleteByExample(ShoppingCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbg.generated Mon Jun 01 21:39:19 CST 2020
     */
    int deleteByPrimaryKey(Long cartid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbg.generated Mon Jun 01 21:39:19 CST 2020
     */
    int insert(ShoppingCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbg.generated Mon Jun 01 21:39:19 CST 2020
     */
    int insertSelective(ShoppingCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbg.generated Mon Jun 01 21:39:19 CST 2020
     */
    List<ShoppingCart> selectByExample(ShoppingCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbg.generated Mon Jun 01 21:39:19 CST 2020
     */
    ShoppingCart selectByPrimaryKey(Long cartid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbg.generated Mon Jun 01 21:39:19 CST 2020
     */
    int updateByExampleSelective(@Param("record") ShoppingCart record, @Param("example") ShoppingCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbg.generated Mon Jun 01 21:39:19 CST 2020
     */
    int updateByExample(@Param("record") ShoppingCart record, @Param("example") ShoppingCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbg.generated Mon Jun 01 21:39:19 CST 2020
     */
    int updateByPrimaryKeySelective(ShoppingCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbg.generated Mon Jun 01 21:39:19 CST 2020
     */
    int updateByPrimaryKey(ShoppingCart record);

    @Select("Select * from ShoppingCart sc LEFT JOIN product p ON p.productid = sc.productid WHERE customeriid = #{customeriid}")
    List<ShoppingCart> productInfo(@Param("customeriid") Integer id);
    ShoppingCart getShoppingCartByCustomerId(@Param("customerid") Integer customeriid);
}
package com.ecommerce.one.ecommerce.domain;

import java.util.Date;

public class shipping {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipping.SHIPPINGID
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    private Integer shippingid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipping.ORDERID
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    private Integer orderid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipping.SHIPPINGFEE
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    private Float shippingfee;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipping.SHIPPINGTIME
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    private Date shippingtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shipping.SHIPPINGID
     *
     * @return the value of shipping.SHIPPINGID
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public Integer getShippingid() {
        return shippingid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shipping.SHIPPINGID
     *
     * @param shippingid the value for shipping.SHIPPINGID
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public void setShippingid(Integer shippingid) {
        this.shippingid = shippingid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shipping.ORDERID
     *
     * @return the value of shipping.ORDERID
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public Integer getOrderid() {
        return orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shipping.ORDERID
     *
     * @param orderid the value for shipping.ORDERID
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shipping.SHIPPINGFEE
     *
     * @return the value of shipping.SHIPPINGFEE
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public Float getShippingfee() {
        return shippingfee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shipping.SHIPPINGFEE
     *
     * @param shippingfee the value for shipping.SHIPPINGFEE
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public void setShippingfee(Float shippingfee) {
        this.shippingfee = shippingfee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shipping.SHIPPINGTIME
     *
     * @return the value of shipping.SHIPPINGTIME
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public Date getShippingtime() {
        return shippingtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shipping.SHIPPINGTIME
     *
     * @param shippingtime the value for shipping.SHIPPINGTIME
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public void setShippingtime(Date shippingtime) {
        this.shippingtime = shippingtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        shipping other = (shipping) that;
        return (this.getShippingid() == null ? other.getShippingid() == null : this.getShippingid().equals(other.getShippingid()))
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getShippingfee() == null ? other.getShippingfee() == null : this.getShippingfee().equals(other.getShippingfee()))
            && (this.getShippingtime() == null ? other.getShippingtime() == null : this.getShippingtime().equals(other.getShippingtime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getShippingid() == null) ? 0 : getShippingid().hashCode());
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getShippingfee() == null) ? 0 : getShippingfee().hashCode());
        result = prime * result + ((getShippingtime() == null) ? 0 : getShippingtime().hashCode());
        return result;
    }
}
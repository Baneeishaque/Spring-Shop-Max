package com.ecommerce.one.ecommerce.domain;

import java.util.Date;

public class orders {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.ORDERID
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    private Integer orderid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.ADDRESSID
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    private Integer addressid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.PAYMENTID
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    private Integer paymentid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.CUSTOMERIID
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    private Integer customeriid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.SHIPPINGID
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    private Integer shippingid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.ORDERDATE
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    private Date orderdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.TOTALPRICE
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    private Float totalprice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.QUANTITY
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    private Float quantity;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.ORDERID
     *
     * @return the value of orders.ORDERID
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public Integer getOrderid() {
        return orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.ORDERID
     *
     * @param orderid the value for orders.ORDERID
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.ADDRESSID
     *
     * @return the value of orders.ADDRESSID
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public Integer getAddressid() {
        return addressid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.ADDRESSID
     *
     * @param addressid the value for orders.ADDRESSID
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.PAYMENTID
     *
     * @return the value of orders.PAYMENTID
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public Integer getPaymentid() {
        return paymentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.PAYMENTID
     *
     * @param paymentid the value for orders.PAYMENTID
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public void setPaymentid(Integer paymentid) {
        this.paymentid = paymentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.CUSTOMERIID
     *
     * @return the value of orders.CUSTOMERIID
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public Integer getCustomeriid() {
        return customeriid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.CUSTOMERIID
     *
     * @param customeriid the value for orders.CUSTOMERIID
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public void setCustomeriid(Integer customeriid) {
        this.customeriid = customeriid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.SHIPPINGID
     *
     * @return the value of orders.SHIPPINGID
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public Integer getShippingid() {
        return shippingid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.SHIPPINGID
     *
     * @param shippingid the value for orders.SHIPPINGID
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public void setShippingid(Integer shippingid) {
        this.shippingid = shippingid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.ORDERDATE
     *
     * @return the value of orders.ORDERDATE
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public Date getOrderdate() {
        return orderdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.ORDERDATE
     *
     * @param orderdate the value for orders.ORDERDATE
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.TOTALPRICE
     *
     * @return the value of orders.TOTALPRICE
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public Float getTotalprice() {
        return totalprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.TOTALPRICE
     *
     * @param totalprice the value for orders.TOTALPRICE
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public void setTotalprice(Float totalprice) {
        this.totalprice = totalprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.QUANTITY
     *
     * @return the value of orders.QUANTITY
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public Float getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.QUANTITY
     *
     * @param quantity the value for orders.QUANTITY
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public void setQuantity(Float quantity) {
        this.quantity = quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
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
        orders other = (orders) that;
        return (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getAddressid() == null ? other.getAddressid() == null : this.getAddressid().equals(other.getAddressid()))
            && (this.getPaymentid() == null ? other.getPaymentid() == null : this.getPaymentid().equals(other.getPaymentid()))
            && (this.getCustomeriid() == null ? other.getCustomeriid() == null : this.getCustomeriid().equals(other.getCustomeriid()))
            && (this.getShippingid() == null ? other.getShippingid() == null : this.getShippingid().equals(other.getShippingid()))
            && (this.getOrderdate() == null ? other.getOrderdate() == null : this.getOrderdate().equals(other.getOrderdate()))
            && (this.getTotalprice() == null ? other.getTotalprice() == null : this.getTotalprice().equals(other.getTotalprice()))
            && (this.getQuantity() == null ? other.getQuantity() == null : this.getQuantity().equals(other.getQuantity()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getAddressid() == null) ? 0 : getAddressid().hashCode());
        result = prime * result + ((getPaymentid() == null) ? 0 : getPaymentid().hashCode());
        result = prime * result + ((getCustomeriid() == null) ? 0 : getCustomeriid().hashCode());
        result = prime * result + ((getShippingid() == null) ? 0 : getShippingid().hashCode());
        result = prime * result + ((getOrderdate() == null) ? 0 : getOrderdate().hashCode());
        result = prime * result + ((getTotalprice() == null) ? 0 : getTotalprice().hashCode());
        result = prime * result + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        return result;
    }
}
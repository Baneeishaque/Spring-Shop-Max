package com.ecommerce.one.ecommerce.domain;

public class aKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column a.PRODUCTID
     *
     * @mbg.generated Sat May 23 21:26:19 CST 2020
     */
    private Integer productid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column a.ORDERID
     *
     * @mbg.generated Sat May 23 21:26:19 CST 2020
     */
    private Integer orderid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column a.PRODUCTID
     *
     * @return the value of a.PRODUCTID
     *
     * @mbg.generated Sat May 23 21:26:19 CST 2020
     */
    public Integer getProductid() {
        return productid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column a.PRODUCTID
     *
     * @param productid the value for a.PRODUCTID
     *
     * @mbg.generated Sat May 23 21:26:19 CST 2020
     */
    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column a.ORDERID
     *
     * @return the value of a.ORDERID
     *
     * @mbg.generated Sat May 23 21:26:19 CST 2020
     */
    public Integer getOrderid() {
        return orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column a.ORDERID
     *
     * @param orderid the value for a.ORDERID
     *
     * @mbg.generated Sat May 23 21:26:19 CST 2020
     */
    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a
     *
     * @mbg.generated Sat May 23 21:26:19 CST 2020
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
        aKey other = (aKey) that;
        return (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a
     *
     * @mbg.generated Sat May 23 21:26:19 CST 2020
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        return result;
    }
}
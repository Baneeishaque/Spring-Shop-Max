package com.ecommerce.one.ecommerce.domain;

import java.util.Arrays;

public class product {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.PRODUCTID
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    private Integer productid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.WISHLISTID
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    private Integer wishlistid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.ADMINID
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    private Integer adminid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.NAME
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.PRICE
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    private Float price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.DESCRIPTION
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.IMAGE
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    private byte[] image;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.PRODUCTID
     *
     * @return the value of product.PRODUCTID
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public Integer getProductid() {
        return productid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.PRODUCTID
     *
     * @param productid the value for product.PRODUCTID
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.WISHLISTID
     *
     * @return the value of product.WISHLISTID
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public Integer getWishlistid() {
        return wishlistid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.WISHLISTID
     *
     * @param wishlistid the value for product.WISHLISTID
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public void setWishlistid(Integer wishlistid) {
        this.wishlistid = wishlistid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.ADMINID
     *
     * @return the value of product.ADMINID
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public Integer getAdminid() {
        return adminid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.ADMINID
     *
     * @param adminid the value for product.ADMINID
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.NAME
     *
     * @return the value of product.NAME
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.NAME
     *
     * @param name the value for product.NAME
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.PRICE
     *
     * @return the value of product.PRICE
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public Float getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.PRICE
     *
     * @param price the value for product.PRICE
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.DESCRIPTION
     *
     * @return the value of product.DESCRIPTION
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.DESCRIPTION
     *
     * @param description the value for product.DESCRIPTION
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.IMAGE
     *
     * @return the value of product.IMAGE
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public byte[] getImage() {
        return image;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.IMAGE
     *
     * @param image the value for product.IMAGE
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public void setImage(byte[] image) {
        this.image = image;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
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
        product other = (product) that;
        return (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
                && (this.getWishlistid() == null ? other.getWishlistid() == null : this.getWishlistid().equals(other.getWishlistid()))
                && (this.getAdminid() == null ? other.getAdminid() == null : this.getAdminid().equals(other.getAdminid()))
                && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
                && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
                && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
                && (Arrays.equals(this.getImage(), other.getImage()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getWishlistid() == null) ? 0 : getWishlistid().hashCode());
        result = prime * result + ((getAdminid() == null) ? 0 : getAdminid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + (Arrays.hashCode(getImage()));
        return result;
    }
}

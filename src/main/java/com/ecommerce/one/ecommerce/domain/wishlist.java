package com.ecommerce.one.ecommerce.domain;

public class wishlist {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wishlist.WISHLISTID
     *
     * @mbg.generated Mon Jun 01 21:28:37 CST 2020
     */
    private Integer wishlistid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wishlist.CUSTOMERIID
     *
     * @mbg.generated Mon Jun 01 21:28:37 CST 2020
     */
    private Integer customeriid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wishlist.PRODUCTID
     *
     * @mbg.generated Mon Jun 01 21:28:37 CST 2020
     */
    private Integer productid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wishlist.WISHLISTID
     *
     * @return the value of wishlist.WISHLISTID
     *
     * @mbg.generated Mon Jun 01 21:28:37 CST 2020
     */
    public Integer getWishlistid() {
        return wishlistid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wishlist.WISHLISTID
     *
     * @param wishlistid the value for wishlist.WISHLISTID
     *
     * @mbg.generated Mon Jun 01 21:28:37 CST 2020
     */
    public void setWishlistid(Integer wishlistid) {
        this.wishlistid = wishlistid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wishlist.CUSTOMERIID
     *
     * @return the value of wishlist.CUSTOMERIID
     *
     * @mbg.generated Mon Jun 01 21:28:37 CST 2020
     */
    public Integer getCustomeriid() {
        return customeriid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wishlist.CUSTOMERIID
     *
     * @param customeriid the value for wishlist.CUSTOMERIID
     *
     * @mbg.generated Mon Jun 01 21:28:37 CST 2020
     */
    public void setCustomeriid(Integer customeriid) {
        this.customeriid = customeriid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wishlist.PRODUCTID
     *
     * @return the value of wishlist.PRODUCTID
     *
     * @mbg.generated Mon Jun 01 21:28:37 CST 2020
     */
    public Integer getProductid() {
        return productid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wishlist.PRODUCTID
     *
     * @param productid the value for wishlist.PRODUCTID
     *
     * @mbg.generated Mon Jun 01 21:28:37 CST 2020
     */
    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wishlist
     *
     * @mbg.generated Mon Jun 01 21:28:37 CST 2020
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
        wishlist other = (wishlist) that;
        return (this.getWishlistid() == null ? other.getWishlistid() == null : this.getWishlistid().equals(other.getWishlistid()))
            && (this.getCustomeriid() == null ? other.getCustomeriid() == null : this.getCustomeriid().equals(other.getCustomeriid()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wishlist
     *
     * @mbg.generated Mon Jun 01 21:28:37 CST 2020
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWishlistid() == null) ? 0 : getWishlistid().hashCode());
        result = prime * result + ((getCustomeriid() == null) ? 0 : getCustomeriid().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        return result;
    }
}

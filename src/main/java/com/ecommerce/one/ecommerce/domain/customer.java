package com.ecommerce.one.ecommerce.domain;

import java.util.Date;

public class customer {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.customer_id
     *
     * @mbg.generated Sat May 23 21:26:19 CST 2020
     */
    private Integer customerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.store_id
     *
     * @mbg.generated Sat May 23 21:26:19 CST 2020
     */
    private Byte storeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.first_name
     *
     * @mbg.generated Sat May 23 21:26:19 CST 2020
     */
    private String firstName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.last_name
     *
     * @mbg.generated Sat May 23 21:26:19 CST 2020
     */
    private String lastName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.email
     *
     * @mbg.generated Sat May 23 21:26:19 CST 2020
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.address_id
     *
     * @mbg.generated Sat May 23 21:26:19 CST 2020
     */
    private Integer addressId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.active
     *
     * @mbg.generated Sat May 23 21:26:19 CST 2020
     */
    private Boolean active;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.create_date
     *
     * @mbg.generated Sat May 23 21:26:19 CST 2020
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.last_update
     *
     * @mbg.generated Sat May 23 21:26:19 CST 2020
     */
    private Date lastUpdate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.customer_id
     *
     * @return the value of customer.customer_id
     *
     * @mbg.generated Sat May 23 21:26:19 CST 2020
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.customer_id
     *
     * @param customerId the value for customer.customer_id
     *
     * @mbg.generated Sat May 23 21:26:19 CST 2020
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.store_id
     *
     * @return the value of customer.store_id
     *
     * @mbg.generated Sat May 23 21:26:19 CST 2020
     */
    public Byte getStoreId() {
        return storeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.store_id
     *
     * @param storeId the value for customer.store_id
     *
     * @mbg.generated Sat May 23 21:26:19 CST 2020
     */
    public void setStoreId(Byte storeId) {
        this.storeId = storeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.first_name
     *
     * @return the value of customer.first_name
     *
     * @mbg.generated Sat May 23 21:26:19 CST 2020
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.first_name
     *
     * @param firstName the value for customer.first_name
     *
     * @mbg.generated Sat May 23 21:26:19 CST 2020
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.last_name
     *
     * @return the value of customer.last_name
     *
     * @mbg.generated Sat May 23 21:26:19 CST 2020
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.last_name
     *
     * @param lastName the value for customer.last_name
     *
     * @mbg.generated Sat May 23 21:26:19 CST 2020
     */
    public void setLastName(String lastName) {
        this.lastName = lastName == null ? null : lastName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.email
     *
     * @return the value of customer.email
     *
     * @mbg.generated Sat May 23 21:26:19 CST 2020
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.email
     *
     * @param email the value for customer.email
     *
     * @mbg.generated Sat May 23 21:26:19 CST 2020
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.address_id
     *
     * @return the value of customer.address_id
     *
     * @mbg.generated Sat May 23 21:26:19 CST 2020
     */
    public Integer getAddressId() {
        return addressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.address_id
     *
     * @param addressId the value for customer.address_id
     *
     * @mbg.generated Sat May 23 21:26:19 CST 2020
     */
    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.active
     *
     * @return the value of customer.active
     *
     * @mbg.generated Sat May 23 21:26:19 CST 2020
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.active
     *
     * @param active the value for customer.active
     *
     * @mbg.generated Sat May 23 21:26:19 CST 2020
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.create_date
     *
     * @return the value of customer.create_date
     *
     * @mbg.generated Sat May 23 21:26:19 CST 2020
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.create_date
     *
     * @param createDate the value for customer.create_date
     *
     * @mbg.generated Sat May 23 21:26:19 CST 2020
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.last_update
     *
     * @return the value of customer.last_update
     *
     * @mbg.generated Sat May 23 21:26:19 CST 2020
     */
    public Date getLastUpdate() {
        return lastUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.last_update
     *
     * @param lastUpdate the value for customer.last_update
     *
     * @mbg.generated Sat May 23 21:26:19 CST 2020
     */
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
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
        customer other = (customer) that;
        return (this.getCustomerId() == null ? other.getCustomerId() == null : this.getCustomerId().equals(other.getCustomerId()))
            && (this.getStoreId() == null ? other.getStoreId() == null : this.getStoreId().equals(other.getStoreId()))
            && (this.getFirstName() == null ? other.getFirstName() == null : this.getFirstName().equals(other.getFirstName()))
            && (this.getLastName() == null ? other.getLastName() == null : this.getLastName().equals(other.getLastName()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getAddressId() == null ? other.getAddressId() == null : this.getAddressId().equals(other.getAddressId()))
            && (this.getActive() == null ? other.getActive() == null : this.getActive().equals(other.getActive()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getLastUpdate() == null ? other.getLastUpdate() == null : this.getLastUpdate().equals(other.getLastUpdate()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Sat May 23 21:26:19 CST 2020
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        result = prime * result + ((getStoreId() == null) ? 0 : getStoreId().hashCode());
        result = prime * result + ((getFirstName() == null) ? 0 : getFirstName().hashCode());
        result = prime * result + ((getLastName() == null) ? 0 : getLastName().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getAddressId() == null) ? 0 : getAddressId().hashCode());
        result = prime * result + ((getActive() == null) ? 0 : getActive().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getLastUpdate() == null) ? 0 : getLastUpdate().hashCode());
        return result;
    }

}
package com.ecommerce.one.ecommerce.domain;

public class product {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.id
     *
     * @mbg.generated Thu May 21 23:23:43 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.name
     *
     * @mbg.generated Thu May 21 23:23:43 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.description
     *
     * @mbg.generated Thu May 21 23:23:43 CST 2020
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.price
     *
     * @mbg.generated Thu May 21 23:23:43 CST 2020
     */
    private Float price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.image
     *
     * @mbg.generated Thu May 21 23:23:43 CST 2020
     */
    private String image;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.category_id
     *
     * @mbg.generated Thu May 21 23:23:43 CST 2020
     */
    private Integer categoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.stock
     *
     * @mbg.generated Thu May 21 23:23:43 CST 2020
     */
    private Float stock;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.sell_count
     *
     * @mbg.generated Thu May 21 23:23:43 CST 2020
     */
    private Integer sellCount;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.id
     *
     * @return the value of product.id
     *
     * @mbg.generated Thu May 21 23:23:43 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.id
     *
     * @param id the value for product.id
     *
     * @mbg.generated Thu May 21 23:23:43 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.name
     *
     * @return the value of product.name
     *
     * @mbg.generated Thu May 21 23:23:43 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.name
     *
     * @param name the value for product.name
     *
     * @mbg.generated Thu May 21 23:23:43 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.description
     *
     * @return the value of product.description
     *
     * @mbg.generated Thu May 21 23:23:43 CST 2020
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.description
     *
     * @param description the value for product.description
     *
     * @mbg.generated Thu May 21 23:23:43 CST 2020
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.price
     *
     * @return the value of product.price
     *
     * @mbg.generated Thu May 21 23:23:43 CST 2020
     */
    public Float getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.price
     *
     * @param price the value for product.price
     *
     * @mbg.generated Thu May 21 23:23:43 CST 2020
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.image
     *
     * @return the value of product.image
     *
     * @mbg.generated Thu May 21 23:23:43 CST 2020
     */
    public String getImage() {
        return image;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.image
     *
     * @param image the value for product.image
     *
     * @mbg.generated Thu May 21 23:23:43 CST 2020
     */
    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.category_id
     *
     * @return the value of product.category_id
     *
     * @mbg.generated Thu May 21 23:23:43 CST 2020
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.category_id
     *
     * @param categoryId the value for product.category_id
     *
     * @mbg.generated Thu May 21 23:23:43 CST 2020
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.stock
     *
     * @return the value of product.stock
     *
     * @mbg.generated Thu May 21 23:23:43 CST 2020
     */
    public Float getStock() {
        return stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.stock
     *
     * @param stock the value for product.stock
     *
     * @mbg.generated Thu May 21 23:23:43 CST 2020
     */
    public void setStock(Float stock) {
        this.stock = stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.sell_count
     *
     * @return the value of product.sell_count
     *
     * @mbg.generated Thu May 21 23:23:43 CST 2020
     */
    public Integer getSellCount() {
        return sellCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.sell_count
     *
     * @param sellCount the value for product.sell_count
     *
     * @mbg.generated Thu May 21 23:23:43 CST 2020
     */
    public void setSellCount(Integer sellCount) {
        this.sellCount = sellCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Thu May 21 23:23:43 CST 2020
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
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getImage() == null ? other.getImage() == null : this.getImage().equals(other.getImage()))
            && (this.getCategoryId() == null ? other.getCategoryId() == null : this.getCategoryId().equals(other.getCategoryId()))
            && (this.getStock() == null ? other.getStock() == null : this.getStock().equals(other.getStock()))
            && (this.getSellCount() == null ? other.getSellCount() == null : this.getSellCount().equals(other.getSellCount()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Thu May 21 23:23:43 CST 2020
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getImage() == null) ? 0 : getImage().hashCode());
        result = prime * result + ((getCategoryId() == null) ? 0 : getCategoryId().hashCode());
        result = prime * result + ((getStock() == null) ? 0 : getStock().hashCode());
        result = prime * result + ((getSellCount() == null) ? 0 : getSellCount().hashCode());
        return result;
    }
}
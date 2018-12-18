package org.lt.demo.dataobject;

/*
类目表
 */

import org.hibernate.annotations.Proxy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// 此处类名自动对应表名 product_category
// 如果想不对应，则
// @Table(name = "s_product_category")
@Entity
@Proxy(lazy = false)
public class ProductCategory {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer categoryId;

    private String categoryName;

    private Integer categoryType;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
                "categoryID=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", categoryType=" + categoryType +
                '}';
    }

    public Integer getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }
}

package org.lt.demo.dataobject;

/*
类目表
 */

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
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
@DynamicUpdate
@Data
public class ProductCategory {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer categoryId;

    private String categoryName;

    private Integer categoryType;

        public ProductCategory() {}
        public ProductCategory(String categoryName, Integer categoryType) {
            this.categoryName = categoryName;
            this.categoryType = categoryType;
        }
}

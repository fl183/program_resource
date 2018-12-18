package org.lt.demo.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lt.demo.dataobject.ProductCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryDaoTest {
    @Autowired
    private ProductCategoryRepository Repository;

    @Test
    public void getOneTest() {
        ProductCategory productCategory = Repository.getOne(1);
        System.out.println(productCategory.toString());
    }
}
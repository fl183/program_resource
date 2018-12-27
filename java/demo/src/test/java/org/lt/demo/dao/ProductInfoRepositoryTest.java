package org.lt.demo.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lt.demo.dataobject.ProductInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository repository;

    @Test
    public void findByProductStatus() {
        ;
    }

    @Test
    public void saveTest() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123456");
        productInfo.setProductName("皮蛋粥");
        productInfo.setProductPrice(new BigDecimal(3.2));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("好吃");
        productInfo.setProductIcon("http://aaa.jpg");
//        productInfo.setProductStatus(0);
//        productInfo.setCategoryType(2);

        ProductInfo ret = repository.save(productInfo);
        Assert.assertNotNull(ret);
    }
}
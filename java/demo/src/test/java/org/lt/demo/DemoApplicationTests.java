package org.lt.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lt.demo.dao.ProductCategoryRepository;
import org.lt.demo.dataobject.ProductCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private ProductCategoryRepository repository;

	@Test
	public void getOneTest() {
		ProductCategory productCategory = repository.getOne(1);
		productCategory.setCategoryType(10);
		repository.save(productCategory);
		System.out.println(productCategory.toString());
	}

	@Test
	public void getAll() {
		List<ProductCategory> productCategory = (List<ProductCategory>) repository.findAll();
		System.out.println(productCategory.toString());
	}

	@Test
    public void saveTest() {
//	    ProductCategory productCategory = new ProductCategory();
//	    productCategory.setCategoryName("女生最爱");
//	    productCategory.setCategoryType(3);
//	    repository.save(productCategory);
		;
    }

    @Test
	@Transactional
	public void saveTest2() {
		ProductCategory productCategory = new ProductCategory("男频uuu", 5);
		ProductCategory rest =  repository.save(productCategory);
		Assert.assertNotNull(rest);
	}

}


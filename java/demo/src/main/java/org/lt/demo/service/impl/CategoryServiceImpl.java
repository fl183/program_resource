package org.lt.demo.service.impl;

import org.lt.demo.dao.ProductCategoryRepository;
import org.lt.demo.dataobject.ProductCategory;
import org.lt.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private ProductCategoryRepository repository;

    @Override
    public ProductCategory findOne(Integer categoryId) {
        return repository.getOne(categoryId);
    }

    @Override
    public List<ProductCategory> findAll() {
        return repository.findAll();
    }

//    @Override
//    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
//        ;
//    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return repository.save(productCategory);
    }
}

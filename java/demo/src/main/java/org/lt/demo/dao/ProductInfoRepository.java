package org.lt.demo.dao;

import org.lt.demo.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;

public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    List<ProductInfo> findByProductPrice(BigDecimal productPrice);
    List<ProductInfo> findByProductStatus(Integer status);
}

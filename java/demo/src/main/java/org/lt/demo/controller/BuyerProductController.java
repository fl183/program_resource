package org.lt.demo.controller;

import org.lt.demo.VO.ProductInfoVO;
import org.lt.demo.VO.ProductVO;
import org.lt.demo.VO.ResultVO;
import org.lt.demo.dataobject.ProductCategory;
import org.lt.demo.dataobject.ProductInfo;
import org.lt.demo.service.CategoryService;
import org.lt.demo.service.ProductService;
import org.lt.demo.utils.ResultVOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public ResultVO list() {

        // 1. 查询所有的上架商品
        List<ProductInfo> productInfoList = productService.findUpAll();

        // 2. 查询所有类目
        ProductCategory productCategory = categoryService.findOne(1);

        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("cheng gong");

        ProductVO productVO = new ProductVO();
        ProductInfoVO productInfoVO = new ProductInfoVO();
        productVO.setProductInfoVOList(Arrays.asList(productInfoVO));
        productVO.setCategory_name("aaaa");
        resultVO.setData(productVO);

        return ResultVOUtils.success(resultVO);
    }

}

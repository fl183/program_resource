package org.lt.demo.controller;

import org.lt.demo.VO.ProductInfoVO;
import org.lt.demo.VO.ProductVO;
import org.lt.demo.VO.ResultVO;
import org.lt.demo.dataobject.ProductInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @GetMapping("/list")
    public ResultVO list() {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("cheng gong");

        ProductVO productVO = new ProductVO();
        ProductInfoVO productInfoVO = new ProductInfoVO();
        productVO.setProductInfoVOList(Arrays.asList(productInfoVO));
        productVO.setCategory_name("aaaa");
        resultVO.setData(productVO);

        return resultVO;
    }

}

package com.pinyougou.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergood.service.BrandServices;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class BrandController {

   @Reference
   private BrandServices brandServices;

   @RequestMapping("/brand/findAll")
   public List<TbBrand> findAll(){
      return brandServices.findAll();
   }

}

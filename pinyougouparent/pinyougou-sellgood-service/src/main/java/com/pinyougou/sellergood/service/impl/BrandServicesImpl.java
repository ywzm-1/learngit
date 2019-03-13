package com.pinyougou.sellergood.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pinyougou.mapper.TbBrandMapper;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergood.service.BrandServices;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class BrandServicesImpl implements BrandServices {
   @Autowired
   private TbBrandMapper tbBrandMapper;

   @Override
   public List<TbBrand> findAll() {
      return tbBrandMapper.selectByExample(null);
   }
}

package com.itheima.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.Mapper.categoryMapper;
import com.itheima.Service.categoryService;
import com.itheima.entity.category;
import org.springframework.stereotype.Service;


@Service
public class categoryServiceImpl extends ServiceImpl<categoryMapper,category>implements categoryService
{

}
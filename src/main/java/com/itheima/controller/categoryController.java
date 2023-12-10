package com.itheima.controller;

import com.itheima.Service.categoryService;
import com.itheima.entity.category;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.web.bind.annotation.*;


@RestController
@Slf4j
@RequestMapping("/category")
public class categoryController {
    @Autowired
    categoryService categoryService;

    @Autowired
    private CacheManager cacheManager;


    @PostMapping
    @CachePut(value="userCache",key="#category.id")
    public category save(category category)
    {
        log.info("category: {}",category);
        categoryService.save(category);
        return category;
    }

    @DeleteMapping("/{id}")
    @CacheEvict(value="userCache",key="#id")
    public void delete(@PathVariable Long id)
    {
        categoryService.removeById(id);
    }

}

package com.noname.demo.serviceimpl;

import com.noname.demo.entity.Category;
import com.noname.demo.mapper.CategoryMapper;
import com.noname.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper=null;
    @Override
    public List<Category> findAllCate() {
        return categoryMapper.findAll();
    }
}
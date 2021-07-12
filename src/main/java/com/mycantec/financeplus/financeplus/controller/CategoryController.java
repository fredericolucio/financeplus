package com.mycantec.financeplus.financeplus.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mycantec.financeplus.financeplus.model.Category;
import com.mycantec.financeplus.financeplus.repository.CategoryRepository;



@RestController
@RequestMapping("/api/category")
public class CategoryController {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@PostMapping
	public @ResponseBody Category newCategory(@Valid Category category) {
		
		categoryRepository.save(category);
		return category;
		
	}
}

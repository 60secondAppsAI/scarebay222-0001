package com.scarebay222.dao;

import java.util.List;

import com.scarebay222.dao.GenericDAO;
import com.scarebay222.domain.Category;





public interface CategoryDAO extends GenericDAO<Category, Integer> {
  
	List<Category> findAll();
	






}



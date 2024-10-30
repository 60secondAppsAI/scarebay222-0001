package com.scarebay222.dao;

import java.util.List;

import com.scarebay222.dao.GenericDAO;
import com.scarebay222.domain.ItemCategory;





public interface ItemCategoryDAO extends GenericDAO<ItemCategory, Integer> {
  
	List<ItemCategory> findAll();
	






}



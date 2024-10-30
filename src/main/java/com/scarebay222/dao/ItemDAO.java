package com.scarebay222.dao;

import java.util.List;

import com.scarebay222.dao.GenericDAO;
import com.scarebay222.domain.Item;





public interface ItemDAO extends GenericDAO<Item, Integer> {
  
	List<Item> findAll();
	






}



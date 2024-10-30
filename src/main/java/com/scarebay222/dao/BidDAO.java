package com.scarebay222.dao;

import java.util.List;

import com.scarebay222.dao.GenericDAO;
import com.scarebay222.domain.Bid;





public interface BidDAO extends GenericDAO<Bid, Integer> {
  
	List<Bid> findAll();
	






}



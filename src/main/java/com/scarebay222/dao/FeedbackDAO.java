package com.scarebay222.dao;

import java.util.List;

import com.scarebay222.dao.GenericDAO;
import com.scarebay222.domain.Feedback;





public interface FeedbackDAO extends GenericDAO<Feedback, Integer> {
  
	List<Feedback> findAll();
	






}



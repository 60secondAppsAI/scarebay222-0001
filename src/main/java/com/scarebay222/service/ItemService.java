package com.scarebay222.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.scarebay222.domain.Item;
import com.scarebay222.dto.ItemDTO;
import com.scarebay222.dto.ItemSearchDTO;
import com.scarebay222.dto.ItemPageDTO;
import com.scarebay222.dto.ItemConvertCriteriaDTO;
import com.scarebay222.service.GenericService;
import com.scarebay222.dto.common.RequestDTO;
import com.scarebay222.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface ItemService extends GenericService<Item, Integer> {

	List<Item> findAll();

	ResultDTO addItem(ItemDTO itemDTO, RequestDTO requestDTO);

	ResultDTO updateItem(ItemDTO itemDTO, RequestDTO requestDTO);

    Page<Item> getAllItems(Pageable pageable);

    Page<Item> getAllItems(Specification<Item> spec, Pageable pageable);

	ResponseEntity<ItemPageDTO> getItems(ItemSearchDTO itemSearchDTO);
	
	List<ItemDTO> convertItemsToItemDTOs(List<Item> items, ItemConvertCriteriaDTO convertCriteria);

	ItemDTO getItemDTOById(Integer itemId);







}






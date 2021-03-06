package com.roytuts.spring.tx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roytuts.spring.tx.dao.ItemDao;
import com.roytuts.spring.tx.model.Item;

@Service
public class ItemService {

	@Autowired
	private ItemDao itemDao;

	public List<Item> getItems() {
		return itemDao.getItems();
	}

}

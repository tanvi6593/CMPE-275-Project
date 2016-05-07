package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.TOMSystem.Item.Item;
import com.dao.ItemDao;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemDao itemDao;
	
	@Transactional
	public void addItem(Item item) {
		// TODO Auto-generated method stub
		itemDao.addItem(item);
	}

	@Transactional
	public void editItem(Item item) {
		// TODO Auto-generated method stub
		itemDao.editItem(item);
	}

	@Transactional
	public void removeItem(int itemId) {
		// TODO Auto-generated method stub
		itemDao.removeItem(itemId);
	}

	@Transactional
	public Item getItem(int itemId) {
		// TODO Auto-generated method stub
		return itemDao.getItem(itemId);
	}

	@Transactional
	public List getAllItems() {
		// TODO Auto-generated method stub
		return itemDao.getAllItems();
	}

}
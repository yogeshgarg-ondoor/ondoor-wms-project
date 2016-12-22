package com.ondoor.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ondoor.commons.generics.dao.GenericDao;
import com.ondoor.commons.generics.service.impl.GenericServiceImpl;
import com.ondoor.dao.ItemDao;
import com.ondoor.model.Item;
import com.ondoor.service.ItemService;

@Service
public class ItemServiceImpl extends GenericServiceImpl<Item, Long> implements ItemService {

	@Autowired
	private  ItemDao itemDao;

	public ItemServiceImpl() {
	}
	
	
	@Autowired
	public ItemServiceImpl(@Qualifier("itemDaoImpl") GenericDao<Item, Long> genericDao) {
	    super(genericDao);
		 this.itemDao = (ItemDao) genericDao;
	}

	/*
	 * @Override public void save(Item item) { itemDao.save(item); }
	 * 
	 * @Override public void update(Item item) { // TODO Auto-generated method
	 * stub
	 * 
	 * }
	 * 
	 * @Override public void findById(Item item) { // TODO Auto-generated method
	 * stub
	 * 
	 * }
	 * 
	 * @Override public void list(Item item) { // TODO Auto-generated method
	 * stub
	 * 
	 * }
	 */

}

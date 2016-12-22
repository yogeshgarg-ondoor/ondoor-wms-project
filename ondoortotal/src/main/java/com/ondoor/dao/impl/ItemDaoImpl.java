package com.ondoor.dao.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.ondoor.commons.generics.dao.impl.GenericDaoImpl;
import com.ondoor.dao.ItemDao;
import com.ondoor.model.Item;

@Transactional
@Repository
public class ItemDaoImpl extends GenericDaoImpl<Item, Long> implements ItemDao {

	

/*	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(Item item) {
		Session session = sessionFactory.openSession();
		session.save(item);
	}

	@Override
	public void update(Item item) {
		// TODO Auto-generated method stub

	}

	@Override
	public void findById(Item item) {
		// TODO Auto-generated method stub

	}

	@Override
	public void list(Item item) {
		// TODO Auto-generated method stub

	}*/

}

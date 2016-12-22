package com.ondoor.dao.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.ondoor.commons.generics.dao.impl.GenericDaoImpl;
import com.ondoor.dao.RoleDao;
import com.ondoor.model.Role;

@Repository
@Transactional
public class RoleDaoImpl extends GenericDaoImpl<Role, Long> implements RoleDao {

//	@SuppressWarnings("unchecked")
//	public List<Role> getAll() {
//		return currentSession().createQuery("from Role").list();
//	}

	@Override
	public Set<Role> findAll() {
		
		return new HashSet<Role>();
	}

}

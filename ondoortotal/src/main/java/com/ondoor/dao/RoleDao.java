package com.ondoor.dao;

import java.util.Set;

import com.ondoor.commons.generics.dao.GenericDao;
import com.ondoor.model.Role;

//@Repository
//public interface RoleDao extends JpaRepository<Role, Long> {
//}

 public interface RoleDao extends GenericDao<Role, Long> {

 public Set<Role> findAll();

 }
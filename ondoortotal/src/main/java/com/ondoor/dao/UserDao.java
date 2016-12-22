package com.ondoor.dao;

import com.ondoor.commons.generics.dao.GenericDao;
import com.ondoor.model.User;

//public interface UserDao extends JpaRepository<User, Long> {
//    User findByUsername(String username);
//}

public interface UserDao extends GenericDao<User, Long> {

	public void save(User user);

	public void delete(User user);

	public User getByEmail(String email);

	public User getById(long id);

	public User findByUsername(String username);

	public void update(User user);

}
package com.ondoor.dao.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.ondoor.commons.generics.dao.impl.GenericDaoImpl;
import com.ondoor.dao.UserDao;
import com.ondoor.model.User;

@Repository
@Transactional
public class UserDaoImpl extends GenericDaoImpl<User, Long> implements UserDao{


//	private final SessionFactory _sessionFactory;
//
//	@Autowired
//	public UserDaoImpl(SessionFactory sf) {
//		this._sessionFactory = sf;
//	}


	public void save(User user) {
		add(user);
	}

	public void delete(User user) {
		remove(user);
	}

//	@SuppressWarnings("unchecked")
//	public List<User> getAll() {
//		return getSession().createQuery("from User").list();
//	}

	public User getByEmail(String email) {
		return (User) getSession().createQuery("from User where email = :email").setParameter("email", email)
				.uniqueResult();
	}

	public User getById(long id) {
		return (User) getSession().load(User.class, id);
	}

	public User findByUsername(String username) {

		return (User) getSession().createQuery("from User where username = :username")
				.setParameter("username", username).uniqueResult();
	}

	public void update(User user) {
		getSession().update(user);
		return;
	}

} // class UserDao

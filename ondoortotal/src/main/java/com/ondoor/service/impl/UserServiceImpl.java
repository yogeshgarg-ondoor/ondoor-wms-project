package com.ondoor.service.impl;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.ondoor.commons.generics.service.impl.GenericServiceImpl;
import com.ondoor.dao.RoleDao;
import com.ondoor.dao.UserDao;
import com.ondoor.model.User;
import com.ondoor.service.UserService;

@Service
public class UserServiceImpl extends GenericServiceImpl<User, Long> implements UserService 
{
	@Autowired
	private UserDao userRepository;
	@Autowired
	private RoleDao roleRepository;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public UserServiceImpl() {
	}

//	@Autowired
//	public UserServiceImpl(@Qualifier("userDaoImpl") GenericDao<User, Long> genericDao) {
//		super(genericDao);
//		this.userRepository = (UserDao) genericDao;
//	}

	@Override
	public void save(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user.setRoles(new HashSet<>(roleRepository.findAll()));
		userRepository.save(user);
	}

	@Override
	public User findByUsername(String username) {
		return userRepository.findByUsername(username);
	}


}

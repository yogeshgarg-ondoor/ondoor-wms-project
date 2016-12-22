package com.ondoor.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ondoor.commons.generics.dao.GenericDao;
import com.ondoor.commons.generics.service.impl.GenericServiceImpl;
import com.ondoor.dao.BrandDao;
import com.ondoor.model.Brand;
import com.ondoor.service.BrandService;

@Service
public class BrandServiceImpl extends GenericServiceImpl<Brand, Long> implements BrandService {

	@Autowired
	private BrandDao brandDao;

	public BrandServiceImpl() {
	}

	@Autowired
	public BrandServiceImpl(@Qualifier("brandDaoImpl") GenericDao<Brand, Long> genericDao) {
		super(genericDao);
		this.brandDao = (BrandDao) genericDao;
	}

}

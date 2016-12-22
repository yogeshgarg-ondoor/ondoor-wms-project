package com.ondoor.dao.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.ondoor.commons.generics.dao.impl.GenericDaoImpl;
import com.ondoor.dao.BrandDao;
import com.ondoor.model.Brand;

@Transactional
@Repository
public class BrandDaoImpl extends GenericDaoImpl<Brand, Long> implements BrandDao {


}

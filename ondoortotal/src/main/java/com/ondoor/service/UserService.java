package com.ondoor.service;

import com.ondoor.commons.generics.service.GenericService;
import com.ondoor.model.User;

public interface UserService extends GenericService<User,Long>
{
    void save(User user);

    User findByUsername(String username);
}

package com.urtrends.jersy.domain.dao;

import com.urtrends.jersy.model.User;

/**
 * Created by ZUBCARZ on 2/27/2016.
 */
public interface DaoUser {

    User getUser(String email, String password);

    User insert(User user );

    String changePassword(String email);
}

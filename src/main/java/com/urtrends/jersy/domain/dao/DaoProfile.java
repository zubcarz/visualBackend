package com.urtrends.jersy.domain.dao;

import com.urtrends.jersy.model.Profile;

import java.util.List;

/**
 * Created by ZUBCARZ on 2/27/2016.
 */
public interface DaoProfile {

    Profile selectById(Long id);

    List<Profile> selectAll(int limit);

}

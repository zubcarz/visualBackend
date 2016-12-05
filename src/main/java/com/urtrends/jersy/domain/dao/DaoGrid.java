package com.urtrends.jersy.domain.dao;

import com.urtrends.jersy.model.Grid;
import com.urtrends.jersy.model.Profile;

import java.util.List;

/**
 * Created by ZUBCARZ on 2/27/2016.
 */
public interface DaoGrid {

    List<Grid> getGrid(int limit);

}

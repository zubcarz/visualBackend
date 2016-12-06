package com.urtrends.jersy.domain.dao;

import java.util.List;
import com.urtrends.jersy.model.Activity;

/**
 * Created by ZUBCARZ on 12/6/2016.
 */
public interface DaoActivity {
    List<Activity> getEarnedValue(String wsPath, String type, String start, String String);
    List<Activity> getEarnedValueByItem(String date, String wsPath,String type);
}

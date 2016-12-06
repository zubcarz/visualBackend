package com.urtrends.jersy.domain.implement;

import com.urtrends.jersy.domain.ConnectionDataBase;
import com.urtrends.jersy.domain.dao.DaoActivity;
import com.urtrends.jersy.model.Activity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZUBCARZ on 12/6/2016.
 */
public class ImplementActivity implements DaoActivity {
    public List<Activity> getEarnedValue(String wsPath, String type, String start, String end) {

        List<Activity> response = new ArrayList<Activity>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            List<Activity> activities = new ArrayList<Activity>();

            connection = (Connection) ConnectionDataBase.getConnection();

            preparedStatement = connection.prepareCall("{call `schema`.activity2(?,?,?,?)}");
            preparedStatement.setString(1, wsPath);
            preparedStatement.setString(2, type);
            preparedStatement.setString(3, start);
            preparedStatement.setString(4, end);

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Activity activity = new Activity();
                activity.setFecha(resultSet.getString("fecha"));
                activity.setWBSPath(resultSet.getString("WBSPath"));
                activity.setTypeActivity(resultSet.getString("TypeActivity"));
                activity.setPV(resultSet.getLong("PV"));
                activity.setEV(resultSet.getLong("EV"));
                activity.setAC(resultSet.getLong("AC"));
                activity.setCPI(resultSet.getFloat("CPI"));
                activity.setSPI(resultSet.getFloat("SPI"));
                activities.add(activity);
            }

            response = activities;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return response;
    }

    public List<Activity> getEarnedValueByItem(String date, String wsPath, String type) {
        List<Activity> response = new ArrayList<Activity>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            List<Activity> activities = new ArrayList<Activity>();

            connection = (Connection) ConnectionDataBase.getConnection();

            preparedStatement = connection.prepareCall("{call `schema`.activity(?,?,?)}");
            preparedStatement.setString(1, date);
            preparedStatement.setString(2, wsPath);
            preparedStatement.setString(3, type);

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Activity activity = new Activity();
                activity.setFecha(resultSet.getString("fecha"));
                activity.setWBSPath(resultSet.getString("WBSPath"));
                activity.setActivityName(resultSet.getString("ActivityName"));
                activity.setTypeActivity(resultSet.getString("TypeActivity"));
                activity.setPV(resultSet.getLong("PV"));
                activity.setEV(resultSet.getLong("EV"));
                activity.setAC(resultSet.getLong("AC"));
                activity.setCPI(resultSet.getFloat("CPI"));
                activity.setSPI(resultSet.getFloat("SPI"));
                activity.setEVDesviation(resultSet.getLong("EVDesviation"));
                activities.add(activity);
            }

            response = activities;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return response;
    }
}

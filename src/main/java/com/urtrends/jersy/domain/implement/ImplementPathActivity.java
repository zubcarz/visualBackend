package com.urtrends.jersy.domain.implement;

import com.urtrends.jersy.domain.dao.DaoPathActivity;
import com.urtrends.jersy.model.PathActivity;
import com.urtrends.jersy.domain.ConnectionDataBase;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * Created by ZUBCARZ on 12/6/2016.
 */
public class ImplementPathActivity implements DaoPathActivity{


    public List<PathActivity> selectAll() {

        List<PathActivity> response= new ArrayList<PathActivity>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            List<PathActivity> PathActivities = new ArrayList<PathActivity>();

            connection = (Connection) ConnectionDataBase.getConnection();
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM `schema`.wbsnames";
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                PathActivity pathActivity = new PathActivity();
                pathActivity.setWBSName(resultSet.getString("WBSName"));
                pathActivity.setWBSPadre(resultSet.getString("WBSPadre"));
                pathActivity.setWBSPath(resultSet.getString("WBSPath"));
                PathActivities.add(pathActivity);
            }

            response = PathActivities;
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
            return response;
        }
    }
}

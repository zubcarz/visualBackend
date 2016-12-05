package com.urtrends.jersy.domain.implement;

import com.urtrends.jersy.domain.ConnectionDataBase;
import com.urtrends.jersy.domain.dao.DaoGrid;
import com.urtrends.jersy.domain.dao.DaoProfile;
import com.urtrends.jersy.model.Grid;
import com.urtrends.jersy.model.Profile;
import com.urtrends.jersy.model.Socialnetwork;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by ZUBCARZ on 2/27/2016.
 */
public class ImplementGrid implements DaoGrid {

    public List<Grid> getGrid(int limit) {
        List<Grid> grids = new ArrayList<Grid>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {

            connection = (Connection) ConnectionDataBase.getConnection();
            preparedStatement = connection.prepareCall("{call URCORETRENDS.sp_get_whats_news(?)}");
            preparedStatement.setInt(1, limit);
            resultSet = preparedStatement.executeQuery();


            while (resultSet.next()) {
                Grid grid = new Grid();
                grid.setId(resultSet.getLong("id"));
                grid.setUsername(resultSet.getString("username"));
                grid.setBio(resultSet.getString("bio"));
                grid.setFeature(resultSet.getString("feature"));
                grid.setWebsite(resultSet.getString("website"));
                grid.setUrlphoto(resultSet.getString("urlPhoto"));
                grids.add(grid);
            }

            //reorder grid list
            //Collections.shuffle(grids);

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

        return grids;

    }
}

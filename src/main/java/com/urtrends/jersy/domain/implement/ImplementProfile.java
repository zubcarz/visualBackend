package com.urtrends.jersy.domain.implement;

import com.urtrends.jersy.domain.ConnectionDataBase;
import com.urtrends.jersy.domain.dao.DaoProfile;
import com.urtrends.jersy.model.Profile;
import com.urtrends.jersy.model.Socialnetwork;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/**
 * Created by ZUBCARZ on 2/27/2016.
 */
public class ImplementProfile implements DaoProfile {
    public Profile selectById(Long id) {
        Profile profile = new Profile();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = (Connection) ConnectionDataBase.getConnection();
            preparedStatement = connection.prepareCall("{call URCORETRENDS.sp_new_query_user(?)}");
            preparedStatement.setLong(1, id);
            System.out.println("query : " +preparedStatement.toString());
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                profile.setId(resultSet.getLong("id"));
                profile.setUrpin(resultSet.getString("urpin"));
                profile.setBio(resultSet.getString("bio"));
                profile.setWebsite(resultSet.getString("website"));
                profile.setUrlPhoto(resultSet.getString("urlPhoto"));
                profile.setUrlCover(resultSet.getString("urlCover"));

                List socialnetworks = new ArrayList<Socialnetwork>();

                String[] providers = resultSet.getString("providers").split(",");
                String[] userids = resultSet.getString("userids").split(",");
                String[] usernames = resultSet.getString("usernames").split(",");
                String[] photos = resultSet.getString("photos").split(",");
                String[] status = resultSet.getString("status").split(",");

                if (providers.length == userids.length &&
                        providers.length == usernames.length &&
                        providers.length == photos.length &&
                        providers.length == status.length
                        ) {

                    for (int i = 0; i < providers.length; i++) {
                        Socialnetwork socialnetwork = new Socialnetwork(status[i],providers[i],userids[i],usernames[i],photos[i]);
                        socialnetworks.add(socialnetwork);
                    }
                }

                profile.setSocialnetwork(socialnetworks);
            }

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

        return profile;
    }

    public List<Profile> selectAll(int limit) {
        return null;
    }
}

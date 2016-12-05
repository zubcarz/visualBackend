package com.urtrends.jersy.domain.implement;

import com.urtrends.jersy.domain.ConnectionDataBase;
import com.urtrends.jersy.domain.dao.DaoUser;
import com.urtrends.jersy.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * Created by ZUBCARZ on 2/27/2016.
 */
public class ImplementUser implements DaoUser {

    public User getUser(String email, String password) {
        User user = new User();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = (Connection) ConnectionDataBase.getConnection();
            preparedStatement = connection.prepareCall("{call URCORETRENDS.sp_get_login_user(?,?)}");
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                user.setId(resultSet.getLong("idurlogin"));
                user.setEmail(resultSet.getString("email"));
                user.setPassword(resultSet.getString("password"));
                user.setCreationdate(resultSet.getString("creationdate"));
                user.setStatus(resultSet.getString("status"));
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

        return user;
    }

    public User insert(User user) {
        User userCreated = new User();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {

            connection = (Connection) ConnectionDataBase.getConnection();
            preparedStatement = connection.prepareCall("{call URCORETRENDS.sp_new_create_user(?, ?)}");
            preparedStatement.setString(1, user.getEmail());
            preparedStatement.setString(2, user.getPassword());
            System.out.println("query : " + preparedStatement.toString());
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                userCreated.setId(resultSet.getLong("idurlogin"));
                userCreated.setEmail(resultSet.getString("email"));
                userCreated.setPassword(resultSet.getString("password"));
                userCreated.setCreationdate(resultSet.getString("creationdate"));
                userCreated.setStatus(resultSet.getString("status"));
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
        return userCreated;
    }

    public String changePassword(String email) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String result = null;

        try {
            System.out.println("email : " + email);
            connection = (Connection) ConnectionDataBase.getConnection();
            preparedStatement = connection.prepareCall("{call URCORETRENDS.sp_new_recover_pass(?)}");
            preparedStatement.setString(1, email);
            resultSet = preparedStatement.executeQuery();
            System.out.println("result : " + resultSet);

            while (resultSet.next()) {
                result = resultSet.getString("password");
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

        return result;
    }


}

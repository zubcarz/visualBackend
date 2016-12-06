/**
 * Created by ZUBCARZ on 2/27/2016.
 */

package com.urtrends.jersy;

import com.google.gson.Gson;
import com.urtrends.jersy.domain.implement.*;
import com.urtrends.jersy.model.*;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.SQLException;
import java.util.List;


@Path("/visual")
public class Services {

    @GET
    @Path("/test")
    @Produces(MediaType.APPLICATION_JSON)
    public Response messageSuccess(@QueryParam("userId") Long idUser)
            throws ClassNotFoundException, SQLException {
        try {
            String out = "{state : 'successful'}";
            return Response.ok(out, MediaType.APPLICATION_JSON).build();
        } catch (Exception e) {
            e.printStackTrace();
            return Response.serverError().entity("internal service error : " + e).build();
        }
    }

    @GET
    @Path("/path-activity")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPathActivity()
            throws ClassNotFoundException, SQLException {
        try {
            ImplementPathActivity implementPathActivity = new ImplementPathActivity();
            List<PathActivity> pathActivities = implementPathActivity.selectAll();
            Gson gson = new Gson();
            String out = gson.toJson(pathActivities);
            return Response.ok(out, MediaType.APPLICATION_JSON).build();
        } catch (Exception e) {
            e.printStackTrace();
            return Response.serverError().entity("internal service error : " + e).build();
        }
    }

    @GET
    @Path("/earned-value")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getEarnedValue(@QueryParam("wsPath") String wsPath,
                                   @QueryParam("type") String type,
                                   @QueryParam("start") String start,
                                   @QueryParam("end") String end)
            throws ClassNotFoundException, SQLException {
        try {
            ImplementActivity implementActivity = new ImplementActivity();
            List<Activity> activities = implementActivity.getEarnedValue(wsPath,type,start,end);
            Gson gson = new Gson();
            String out = gson.toJson(activities);
            return Response.ok(out, MediaType.APPLICATION_JSON).build();
        } catch (Exception e) {
            e.printStackTrace();
            return Response.serverError().entity("internal service error : " + e).build();
        }
    }

    @GET
    @Path("/earned-value-type")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getEarnedValueType(@QueryParam("date") String date,
                                       @QueryParam("wsPath") String wsPath,
                                       @QueryParam("type") String type)
            throws ClassNotFoundException, SQLException {
        try {
            ImplementActivity implementActivity = new ImplementActivity();
            List<Activity> activities = implementActivity.getEarnedValueByItem(date,wsPath,type);
            Gson gson = new Gson();
            String out = gson.toJson(activities);
            return Response.ok(out, MediaType.APPLICATION_JSON).build();
        } catch (Exception e) {
            e.printStackTrace();
            return Response.serverError().entity("internal service error : " + e).build();
        }
    }

    @GET
    @Path("/getUser")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMessage(@QueryParam("userId") Long idUser)
            throws ClassNotFoundException, SQLException {
        try {
            ImplementProfile implementProfile = new ImplementProfile();
            Profile profile = implementProfile.selectById(idUser);
            Gson gson = new Gson();
            String out = gson.toJson(profile);
            return Response.ok(out, MediaType.APPLICATION_JSON).build();
        } catch (Exception e) {
            e.printStackTrace();
            return Response.serverError().entity("internal service error : " + e).build();
        }
    }

    @POST
    @Path("/createUserLogin")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public Response insertUser(JSONObject user) {
        try {
            User user1 = new User(user.getString("email"), user.getString("password"));
            ImplementUser implementUser = new ImplementUser();

            User user2 = implementUser.insert(user1);
            Gson gson = new Gson();
            String out = gson.toJson(user2);
            return Response.ok(out, MediaType.APPLICATION_JSON).build();

        } catch (JSONException e) {
            e.printStackTrace();
            return Response.serverError().entity("internal service error : " + e).build();
        }
    }

    @POST
    @Path("/loginUser")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response loginUser(JSONObject user) {
        try {
            System.out.println("in");
            ImplementUser implementUser = new ImplementUser();
            User user1 = implementUser.getUser(user.getString("email"), user.getString("password"));
            Gson gson = new Gson();
            String out = gson.toJson(user1);
            return Response.ok(out, MediaType.APPLICATION_JSON).build();
        } catch (JSONException e) {
            e.printStackTrace();
            return Response.serverError().entity("No logging").build();
        }
    }

    @GET
    @Path("/getWhatsNews")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMessage(@QueryParam("limit") Integer limit)
            throws ClassNotFoundException, SQLException {
        try {
            ImplementGrid implementGrid = new ImplementGrid();
            List<Grid> grid = implementGrid.getGrid(limit);
            Gson gson = new Gson();
            String out = gson.toJson(grid);
            return Response.ok(out, MediaType.APPLICATION_JSON).build();
        } catch (Exception e) {
            e.printStackTrace();
            return Response.serverError().entity("internal service error : " + e).build();
        }
    }
}
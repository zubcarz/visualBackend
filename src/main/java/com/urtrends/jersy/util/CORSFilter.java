package com.urtrends.jersy.util;

import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerResponse;
import com.sun.jersey.spi.container.ContainerResponseFilter;

import javax.ws.rs.ext.Provider;

/**
 * Created by ZUBCARZ on 5/17/2016.
 */
@Provider
public class CORSFilter implements ContainerResponseFilter {

    public ContainerResponse filter(ContainerRequest request,
                                    ContainerResponse response) {

        response.getHttpHeaders().add("Access-Control-Allow-Origin", "*");
        response.getHttpHeaders().add("Access-Control-Allow-Headers",
                "origin, content-type, accept, authorization, client_id");
        response.getHttpHeaders().add("Access-Control-Allow-Credentials", "true");
        response.getHttpHeaders().add("Access-Control-Allow-Methods",
                "GET, POST, PUT, DELETE, OPTIONS, HEAD");

        return response;
    }
}

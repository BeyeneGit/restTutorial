package com.tafesse.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class MessageResource {
    @GET
    public String sayHello(){
        return "Good moring mister again and again!!!!";
    }

}

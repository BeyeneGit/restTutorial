package com.tafesse.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class MessageResource {
    @GET
    public String sayHello(){
        System.out.println("I am here to check debugging.");
        System.out.println("I am here to check debugging again.");
        return "Good moring mister again and again!!!!";
    }

}

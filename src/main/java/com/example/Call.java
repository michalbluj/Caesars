
package com.example;

import java.io.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.StreamingOutput;

import com.sun.jersey.core.header.FormDataContentDisposition;

@Path("/rest")
public class Call {

    @GET
    @Path("/callJava")
    @Produces("text/plain")
    public String callJava(){
        return "message from Java application";
    }

}
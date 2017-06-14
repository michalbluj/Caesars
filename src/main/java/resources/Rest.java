package resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.SecurityContext;

@Path("/rest")
public class Rest {

    @GET
    @Produces("text/plain")
    @Path("/helloWorld")
    public String handleGreeting() {
        return "Hello World";
    }

    @GET
    @Produces("text/plain")
    @Path("/time")
    public String handleTime() {
        return String.valueOf(System.currentTimeMillis());
    }

}
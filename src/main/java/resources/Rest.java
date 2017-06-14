package resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import resources.model.Timer;

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
        return new Timer().getCurrentTime();
    }

    @GET
    @Path("/doSomething")
    @Produces("text/plain")
    public String doSomething(){
        return "something was done successfully";
    }

}
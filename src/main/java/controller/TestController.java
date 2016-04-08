package controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author renantdesouza.
 * @since 07/04/2016.
 */
@Path("test")
public class TestController {

    @GET
    @Path("get")
    public String insert() {
        return "user";
    }

}

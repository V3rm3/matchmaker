package controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author renantdesouza.
 * @since 08/04/2016.
 */
@Path("user")
public class UserController {

    @Path("insert")
    @GET
    public String insert() {
        return "user";
    }

}

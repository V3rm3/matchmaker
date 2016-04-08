package controller;

import model.User;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 * @author renantdesouza.
 * @since 08/04/2016.
 */
@Path("user")
public class UserController {

    @Path("insert")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void insert(User user) {
    }

}

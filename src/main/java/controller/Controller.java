package controller;

import model.Model;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * @author renantdesouza.
 * @since 09/05/2016.
 * */
public class Controller<T extends Model> {

    @POST
    @Path("insert")
    @Consumes(MediaType.APPLICATION_JSON)
    public void insert(T entity) {
    }

    @PUT
    @Path("update")
    @Consumes(MediaType.APPLICATION_JSON)
    public void update(T entity) {
    }

    @GET
    @Path("find/{id}")
    public void find(@PathParam("id") String id) {
    }

    @DELETE
    @Path("delete")
    @Consumes(MediaType.APPLICATION_JSON)
    public void delete(T entity) {
        delete(entity.getId());
    }

    @DELETE
    @Path("delete/{id}")
    public void delete(@PathParam("id") String id) {
    }

}

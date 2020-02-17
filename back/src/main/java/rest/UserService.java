package rest;


import dao.UserDAO;
import model.User;

import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("/users")
public class UserService {
    @EJB
    private UserDAO userDAO;

    @POST
    @Consumes(value = {MediaType.APPLICATION_JSON})
    public void saveUser(User user){
        userDAO.saveOrUpdate(user);
    }

    @GET
    @Produces(value = {MediaType.APPLICATION_JSON})
    public List<User> getAll(){
        return userDAO.getAll();
    }


    @DELETE
    @Path("/{id}")
    public void deleteUser(@PathParam("id") Integer id){
        userDAO.delete(id);
    }
}

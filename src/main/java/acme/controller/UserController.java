package acme.controller;

import acme.domain.Users;
import acme.service.UserService;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/users")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserController {

  // Injecao de dependencias do UserService por construtor
  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }
  
  @POST
  @Transactional
  public Response createUser(Users user) {
    return Response.ok(userService.createUser(user)).build();
  }

  @GET
  public String getUsers() {
    return "List of users";
  }

}
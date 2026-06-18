package acme.service;

import acme.domain.Users;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserService {
  public Users createUser(Users users) {
    Users.persist(users);
    return users;
  }
}

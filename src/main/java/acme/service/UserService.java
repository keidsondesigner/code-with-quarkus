package acme.service;

import java.util.List;

import acme.domain.Users;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserService {

  public Users createUser(Users users) {
    Users.persist(users);
    return users;
  }

  public List<Users> findAllUsers(Integer page, Integer size) {
    return Users.findAll().page(page, size).list();
  }
}

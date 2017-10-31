package tn.rachedanis.service;

import java.util.List;
import tn.rachedanis.persistence.model.User;

public interface IUserService {

 public void addUser(User user);
 public void updateUser(User user);
 public void deleteUser(User user);
 public User getUserById(int id);
 public List<User> getUsers();
}

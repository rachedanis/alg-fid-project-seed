package tn.rachedanis.persistence.dao;

import java.util.List;
import tn.rachedanis.persistence.model.User;

public interface IUserDAO {

 public void addUser(User user);
 public void updateUser(User user);
 public void deleteUser(User user);
 public User getUserById(int id);
 public List<User> getUsers();

}

package tn.rachedanis.service;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import tn.rachedanis.persistence.model.User;
import tn.rachedanis.persistence.dao.IUserDAO;

@Transactional(readOnly = true)
public class UserService implements IUserService {

 IUserDAO userDAO;

 @Transactional(readOnly = false)
 @Override
 public void addUser(User user) {
  getUserDAO().addUser(user);
 }

 @Transactional(readOnly = false)
 @Override
 public void deleteUser(User user) {
  getUserDAO().deleteUser(user);
 }

 @Transactional(readOnly = false)
 @Override
 public void updateUser(User user) {
  getUserDAO().updateUser(user);
 }

 @Override
 public User getUserById(int id) {
  return getUserDAO().getUserById(id);
 }

 @Override
 public List<User> getUsers() {
  return getUserDAO().getUsers();
 }

 public IUserDAO getUserDAO() {
  return userDAO;
 }

 public void setUserDAO(IUserDAO userDAO) {
  this.userDAO = userDAO;
 }
}

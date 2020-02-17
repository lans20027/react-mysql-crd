package dao;


import model.User;

import javax.ejb.Local;
import java.util.List;

@Local
public interface UserDAO {
    List<User> getAll();
    void saveOrUpdate(User user);
    void delete(Integer id);
}

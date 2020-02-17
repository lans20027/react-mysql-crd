package dao;

import model.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;



@Stateless
public class UserDAOBean implements UserDAO {
    @PersistenceContext(unitName = "mysql-unit")
    private EntityManager em;

    @Override
    public List<User> getAll(){
        return em.createNativeQuery("select * from users", User.class).getResultList();
    }

    @Override
    public void saveOrUpdate(User user){
        em.persist(user);
    }

    @Override
    public void delete(Integer id){
        User toDelete = em.find(User.class,id);
        em.remove(toDelete);
    }
}

package ru.pseudocode.springcourse.PPBootCRUD.serice;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.pseudocode.springcourse.PPBootCRUD.dao.UserDAOImpl;
import ru.pseudocode.springcourse.PPBootCRUD.model.User;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {

    private final UserDAOImpl userDAO;

    public UserServiceImpl(UserDAOImpl userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    @Transactional
    public List<User> index() {
        return userDAO.index();
    }

    @Override
    @Transactional
    public User show(int id) {
        return userDAO.show(id);
    }

    @Override
    @Transactional
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    @Transactional
    public void update(User updatedUser) {
        userDAO.update(updatedUser);
    }

    @Override
    @Transactional
    public void delete(int id) {
        userDAO.delete(id);
    }
}

package ru.freeomsk.springbootbootstrap.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import ru.freeomsk.springbootbootstrap.model.User;
import java.util.List;

public interface UserDao extends Repository<User, Long> {
    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(long id);

    List<User> getAllUsers();

    User getUserByLogin(String login);

    User getUserById(long id);

    @Query("SELECT u from User u join fetch u.roles where u.login = :username")
    User findByUsername(@Param("username") String username);
}

package ru.freeomsk.springbootbootstrap.dao;

import ru.freeomsk.springbootbootstrap.model.Role;
import ru.freeomsk.springbootbootstrap.model.User;

import java.util.List;

public interface RoleDao {

    List<Role> getAllRoles();

    Role getRole(String userRole);

    Role getRoleById(Long id);

    void addRole(Role role);
    void getUserRoles(User user);
}

package com.ahmed.users.service;

import com.ahmed.users.entities.User;
import com.ahmed.users.entities.Role;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    User findUserByUsername (String username);
    Role addRole(Role role);
    User addRoleToUser(String username, String rolename);

    List<User> findAllUsers();
}
package com.seamus.roster.service;

import com.seamus.roster.data.User;

public interface UserService {

    User createUser(User user);

    User getUser(Long id);

    User updateUser(User user);

    void deleteUser(Long id);
}

package com.demo.lesson9.streams;

import com.demo.lesson9.domain.ExtendedUser;
import com.demo.lesson9.domain.User;

import java.util.List;

public class UserStreamService {

    private final UserListProvider userListProvider = new UserListProvider();

    public List<User> getFemaleUsers() {
        List<ExtendedUser> userList = userListProvider.get();
    }
}

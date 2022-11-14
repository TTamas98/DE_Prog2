package com.demo.lesson9.streams;

import com.demo.lesson9.domain.ExtendedUser;
import com.demo.lesson9.domain.Gender;
import com.demo.lesson9.domain.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserStreamService {

    private final UserListProvider userListProvider = new UserListProvider();

    public List<ExtendedUser> getFemaleUsers() {
        List<ExtendedUser> userList = userListProvider.get();
        List<ExtendedUser> res = new ArrayList<>();
        for(ExtendedUser user: userList) {
            if(user.getGender() == Gender.FEMALE) {
                res.add(user);
            }
        }
        return res;
    }

    public List<ExtendedUser> getFemaleUsersStream() {
        return userListProvider.get().stream()
                .filter(user -> user.getGender() == Gender.FEMALE)
                .collect(Collectors.toList());
    }

    /*public List<ExtendedUser> getUsersOver30() {

    }

    public List<String> getUserNamesFromArizona() {

    }

    public List<String> getStates() {}*/

    // Create a function that writes every user to the console in this format: name:age:state
    // Create a function that returns the name of the male users over age 20.
    // Create a function that writes the names of the users that are over age 30. List their name in reversed order.
    // Create a function that calculates the average age of the users
    // Create a function that maps the users to their state.
}

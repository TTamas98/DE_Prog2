package com.demo.lesson9.streams;

import com.demo.lesson9.domain.ExtendedUser;
import com.demo.lesson9.domain.Gender;
import com.demo.lesson9.domain.User;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public class UserListProvider implements ServiceLoader.Provider<List<ExtendedUser>> {

    private final List<ExtendedUser> userList = new ArrayList<>(List.of(
            new ExtendedUser(1,"Apollo","Jake","Blue","test@gmail.com",23,"Oklahoma", Gender.MALE,15000L),
            new ExtendedUser(2,"Beta","Max","Green","green@gmail.com",43,"Texas", Gender.MALE,11234L),
            new ExtendedUser(3,"Mike","Michael","Red","red@gmail.com",32,"Oklahoma", Gender.MALE,6137731L),
            new ExtendedUser(4,"Rob","Robert","Yellow","yellow@gmail.com",18,"New York", Gender.MALE,15000L),
            new ExtendedUser(5,"Alice","Alice","White","white@gmail.com",27,"Arizona", Gender.FEMALE,140400L),
            new ExtendedUser(6,"Anna","Anna","Tibers","tibers@gmail.com",39,"Oklahoma", Gender.FEMALE,null),
            new ExtendedUser(7,"April","April","Black","black@gmail.com",67,"Utah", Gender.FEMALE,116261L),
            new ExtendedUser(8,"Blake","Blake","Orange","orange@gmail.com",19,"Texas", Gender.MALE,63161L)

    ));

    @Override
    public Class<? extends List<ExtendedUser>> type() {
        return null;
    }

    @Override
    public List<ExtendedUser> get() {
        return userList;
    }
}

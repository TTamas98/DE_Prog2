package com.demo.lesson9.reflection;

import com.demo.lesson9.domain.User;

import java.lang.reflect.Field;

public class ReflectionMain {

    public static void main(String[] args) throws NoSuchFieldException {
        User user = new User(1,"Test","Test","Test","test@test.test");
        System.out.println(user);
        System.out.print("\n\n\n");

        modifyUserAttribute("username",user,"japoxfrod");
        modifyUserAttribute("firstName",user,"Tamás");

        System.out.println(user);
        System.out.println(user.getClass().getDeclaredField("username").canAccess(user));
    }

    private static final void modifyUserAttribute(String fieldName, User user, String value) {
        try {
            Field field = user.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(user,value);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            System.err.println("Error " + e.getMessage());
        }
    }
}

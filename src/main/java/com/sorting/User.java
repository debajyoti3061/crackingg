package com.sorting;

public class User implements Comparable<User>{

    int id;
    String name;
    String desc;

    public User(int id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }


    @Override
    public int compareTo(User u) {
        return id-u.id;
    }
}

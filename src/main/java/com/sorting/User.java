package com.sorting;

public class User implements Comparable<User>{

    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

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

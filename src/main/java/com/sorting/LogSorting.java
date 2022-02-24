package com.sorting;

import java.util.*;

public class LogSorting {

    public static void main(String[] args) {
        String[] input = {"2.10.0", "1.0.100", "1.0.1", "1.1.100", "2.1.10", "1.1.1"};
        PriorityQueue<Parse> str = new PriorityQueue<Parse>();
        for (String i : input) {
            String[] result = i.split("\\.");
            str.add(new Parse(Integer.parseInt(result[0]), Integer.parseInt(result[1]), Integer.parseInt(result[2])));
        }


        while (!str.isEmpty()) {
            Parse p = str.peek();
            str.remove();
            System.out.println(p.major + "." + p.minor + "." + p.patch);
        }
    }
}

class Parse implements Comparable<Parse> {
    int major;
    int minor;
    int patch;

    Parse(int major, int minor, int patch) {
        this.major = major;
        this.minor = minor;
        this.patch = patch;
    }

    public int compareTo(Parse p) {

        if (major == p.major && minor == p.minor)
            return Integer.compare(patch, p.patch);
        if (major == p.major)
            return Integer.compare(minor, p.minor);
        return Integer.compare(major, p.major);
    }
}



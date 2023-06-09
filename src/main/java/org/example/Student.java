package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student {
    Map<String, ArrayList<Integer>> marks = new HashMap<>();
    String name;
    String lastName;

    public Student(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        marks.put("Математика", new ArrayList<>());
    }
    public ArrayList<Integer> getMark(String course) {
        return marks.get(course);
    }
    public void addMark(String course, int mark) {
        (marks.get(course)).add(mark);
    }
}

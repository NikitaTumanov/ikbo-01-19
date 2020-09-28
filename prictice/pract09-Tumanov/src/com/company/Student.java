package com.company;

public class Student implements Comparable {
    private int mark;
    private String name;
    Student(String name, int mark)
    {
        this.mark = mark;
        this.name = name;
    }
    @Override
    public Object getValue() {
        return mark;
    }
    @Override
    public void setValue(int mark) {
        this.mark = mark;
    }
    @Override
    public String getName() {
        return name;
    }
}

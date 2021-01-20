package com.sfencs.jc.builder;

public class Main {
    public static void main(String[] args) {
        People people = new People.Builder(22, "Sfencs").address("xxx").phone("123456").sex("man").build();
        System.out.println(
                people.getSex() + " "
                        + people.getAddress()
                        + " " + people.getName()
                        + " " + people.getPhone()
                        + " " + people.getAge());
    }
}

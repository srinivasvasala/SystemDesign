package org.srinivas.Builder;

public class Main {
    public static void main(String[] args) {
        Student student = new Student
                .Builder()
                .withName("srinivas","vasala")
                .setFirstName("srinivas")
                .setLastname("Vasala")
                .setEmail("vasalasrinivas$gmail.com")
                .build();
        System.out.println(student.getFirstName()+" "+student.getLastname());

    }
}

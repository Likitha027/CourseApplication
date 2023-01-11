package org.example;

public class Main
{
    public static void main(String[] args) {
        Course c=new Course();
        c.setCourseName("Software Development");
        c.setCourseDuration("1 month");
        c.setNumOfVideos(30);
        c.setLecturerName("Jonas Schmedtmann");

        Course c1=new Course();
        c1.setCourseName("Finance");
        c1.setCourseDuration("25 days");
        c1.setNumOfVideos(20);
        c1.setLecturerName("Stephen");

        System.out.println("Course Name:" +c.getCourseName());
        System.out.println("Course Duration:"+c.getCourseDuration());
        System.out.println("Number Of Videos:" +c.getNumOfVideos());
        System.out.println("Lecturer Name:"+c.getLecturerName());
        System.out.println("");

        System.out.println("Course Name:" +c1.getCourseName());
        System.out.println("Course Duration:"+c1.getCourseDuration());
        System.out.println("Number Of Videos:" +c1.getNumOfVideos());
        System.out.println("Lecturer Name:"+c1.getLecturerName());

    }
}
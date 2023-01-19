package model;

import java.util.ArrayList;

public class Children extends Parent {
    String name;
    int grade;
    int age;
    ArrayList<hobbies> hobbiesArraylist;
    private ArrayList<Children> hobbyArraylist;

    public Children(String name, int grade, int age, ArrayList<hobbies> hobbyArraylist) {
        this.name = name;
        this.grade = grade;
        this.age = age;
        this.hobbiesArraylist = hobbyArraylist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Children> getHobbiesArraylist() {
        return hobbyArraylist;
    }

    public void setHobbyArraylist(ArrayList<Children> hobbiesArraylist) {
        this.hobbyArraylist = hobbyArraylist;
    }

    public String getFullName() {
        String fullName = "My name is " + this.name + " " + this.family_name;
        return fullName;
    }

    public void gethobby() {
        ArrayList<Children> hobbiesArraylist = this.hobbyArraylist;
        for (Children singleHobby : hobbiesArraylist) {
            System.out.println("\tHobby is: " + singleHobby.getName());
        }


    }
}


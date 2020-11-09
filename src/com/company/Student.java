package com.company;

import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {
    String firstName  = " ";                // first name of student
    String lastName = " ";                  // last name of student
    int yearOfStudies = 1;                  // year of studies
    String classroom = " ";                 // classroom
    ArrayList <SubjectWithRatings> subjectWithRatingsArray;  //array with ratings from subjects

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYearOfStudies() {
        return yearOfStudies;
    }

    public String getClassroom() {
        return classroom;
    }

    public ArrayList<SubjectWithRatings> getSubjectWithRatings() {
        return subjectWithRatingsArray;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setYearOfStudies(int yearOfStudies) {
        this.yearOfStudies = yearOfStudies;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public void setSubjectWithRatings(ArrayList<SubjectWithRatings> subjectWithRatings) {
        this.subjectWithRatingsArray = subjectWithRatings;

    }
}


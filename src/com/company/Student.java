package com.company;

import java.io.Serializable;
import java.time.LocalDate;

public class Student implements Serializable {
    String firstName  = " ";                // first name of student
    String lastName = " ";                  // last name of student
    int yearOfStudies = 1;                  // year of studies
    String classroom = " ";                 // classroom
    SubjectWithRatings[] subjectWithRatings;  //array with ratings from subjects

    public SubjectWithRatings[] getSubjectWithRatings() {
        return subjectWithRatings;
    }

    public void setSubjectWithRatings(SubjectWithRatings[] subjectWithRatings) {
        this.subjectWithRatings = subjectWithRatings;
    }
}


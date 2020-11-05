package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {

        addDataInFile();

    }




    // add a new student to "database" of school - only for testing
    public static void addDataInFile() throws Exception {
        SubjectWithRatings[] subjectWithRatingsArray = new SubjectWithRatings[10];
        SubjectWithRatings subjectWithRatings = new SubjectWithRatings();

        subjectWithRatings.setSubject(Subject.AJ);
        subjectWithRatings.setRatings("1231132322212");
        subjectWithRatingsArray[0] = subjectWithRatings;

        subjectWithRatings.setSubject(Subject.M);
        subjectWithRatings.setRatings("1231132322212");
        subjectWithRatingsArray[1] = subjectWithRatings;

        Student student = new Student();
        student.firstName = "Valerii";
        student.lastName = "Kuiovda";
        student.yearOfStudies = 1;
        student.classroom = "1A";
        student.setSubjectWithRatings(subjectWithRatingsArray);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file1.dat"));
        oos.writeObject(student);
        System.out.println("File has been written");
    }
}


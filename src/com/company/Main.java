package com.company;

import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws Exception {
        ArrayList <Student> students = readDataFromFile();
        //addDataInFile();

        int option = 1;
        while (option != 0) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Please choose option:");
            System.out.println(" --- Škola-třída --- ");
            System.out.println("1.Výpis žáků");
            System.out.println("2.Výpis počet žáků - předmět");
            System.out.println("3.Výpis průměrů za předměty");
            System.out.println("4.Výpis společných předmětů pro třídu");
            System.out.println("5.Výpis všech volitelných předmětů");
            System.out.println(" --- Třída-Žák: --- ");
            System.out.println("6.Výpis všech předmětů");
            System.out.println("7.Výpis známek z předmětů");
            System.out.println("8.Výpis průměrů z předmětů");
            System.out.println("9.Výpis volitelných předmětů");
            System.out.println("10.Výpis společných předmětů");
            System.out.println("0.Exit");
            option = sc.nextInt();

            switch (option) {
                case 0 : break;
                case 1 :
                    int i = 0;
                    for (Student student: students) {
                        System.out.println("Student " + i + " - " + students.get(i).getFirstName() + " "
                                + students.get(i).getLastName());
                        i++;
                    }
                    break;
                case 2 :
                    for (Subject subject : Subject.values()) {
                        int counterOfSubjects = 0;
                        for (Student student: students) {
                            for (SubjectWithRatings tmpSubject: student.getSubjectWithRatings()) {
                                if (subject.equals(tmpSubject.getSubject())) counterOfSubjects++;
                            }
                        }
                        System.out.println("Předmět  " + subject.getSubject() + "  "
                                + counterOfSubjects + "  žáků");
                    }
                    break;
                case 3 :
                    for (Subject subject : Subject.values()) {
                        double averageRating = 0;
                        String ratings = "";
                        for (Student student: students) {
                            for (SubjectWithRatings tmpSubject: student.getSubjectWithRatings()) {

                                if (subject.equals(tmpSubject.getSubject()))
                                    ratings += tmpSubject.getRatings();
                            }
                        }

                        for (int j=0; j < ratings.length(); j++) {
                            averageRating += Integer.parseInt(String.valueOf(ratings.charAt(j)));
                        };
                        averageRating = averageRating/ratings.length();
                        if (ratings.isEmpty()) averageRating = 0;
                        System.out.println(subject.getSubject() + "  "
                                + averageRating);
                    }
                    break;
                default:
                    System.out.println("Please choose option from below:");
            }
        }


        System.out.println("End program");

    }




    // add a new student to "database" of school - only for testing
    public static void addDataInFile() throws Exception {

        ArrayList <Student> students = new ArrayList <Student>();

        ArrayList <SubjectWithRatings> subjectWithRatingsArray = new ArrayList<SubjectWithRatings>();
        SubjectWithRatings subjectWithRatings = new SubjectWithRatings();
        subjectWithRatings.setSubject(Subject.AJ);
        subjectWithRatings.setRatings("1231132322212");
        subjectWithRatingsArray.add(subjectWithRatings);

        subjectWithRatings.setSubject(Subject.M);
        subjectWithRatings.setRatings("123113422212");
        subjectWithRatingsArray.add(subjectWithRatings);

        subjectWithRatings.setSubject(Subject.VL);
        subjectWithRatings.setRatings("123113422212");
        subjectWithRatingsArray.add(subjectWithRatings);

        subjectWithRatings.setSubject(Subject.HV);
        subjectWithRatings.setRatings("123113422212");
        subjectWithRatingsArray.add(subjectWithRatings);

        subjectWithRatings.setSubject(Subject.TV);
        subjectWithRatings.setRatings("123113422212");
        subjectWithRatingsArray.add(subjectWithRatings);

        subjectWithRatings.setSubject(Subject.UJ);
        subjectWithRatings.setRatings("123111122212");
        subjectWithRatingsArray.add(subjectWithRatings);

        Student studentTmp = new Student();
        studentTmp.setFirstName("Jackie");
        studentTmp.setLastName("Chan");
        studentTmp.setYearOfStudies(1);
        studentTmp.setClassroom("1A");
        studentTmp.setSubjectWithRatings(subjectWithRatingsArray);

        students.add(0, studentTmp);


        FileOutputStream fos = new FileOutputStream("file1.dat", true);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(students);

        oos.flush();
        oos.close();

        System.out.println("File has been written");
    }

    // read student's "database" of school
    public static ArrayList<Student> readDataFromFile() throws Exception {

        FileInputStream fis = new FileInputStream("file1.dat");
        ObjectInputStream oin = new ObjectInputStream(fis);
        ArrayList <Student> students = new ArrayList <Student> ();

        students  = (ArrayList <Student>) oin.readObject();
        System.out.println("File has been read");
        return students;
    }
}


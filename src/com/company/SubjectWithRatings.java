package com.company;

import java.io.Serializable;

public class SubjectWithRatings implements Serializable {
    Subject subject;
    String ratings;

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public String getRatings() {
        return ratings;
    }

    public void setRatings(String ratings) {
        this.ratings = ratings;
    }
}

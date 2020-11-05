package com.company;

public enum Subject {
        CJL ("Český jazyk a literatura"),
        AJ ("Anglický jazyk"),
        M ("Matematika"),
        CSP ("Člověk a svět práce"),
        SKN ("Svět kolem nás"),
        TV ("Tělesná výchova"),
        HV ("Hudební výchova"),
        VV ("Výtvarná výchova"),
        VL ("Vlastivěda"),
        PRV ("Přírodověda");

        private String subject;

        Subject(String subject) {
        this.subject = subject;
        }

        public String getSubject() {
        return subject;
        }

}



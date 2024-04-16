package com.medical.reports;

public class Patient {
    private final String PatientName;
    private final int Age;
    private final  String Gender;
    private Eye lefteye;
    private Eye righteye;
    private Heart heart;
    private Stomach stomach;
    private Skin skin;

    public Patient(String patientName, int age, String gender, Eye lefteye, Eye righteye, Heart heart, Stomach stomach, Skin skin) {
        PatientName = patientName;
        Age = age;
        Gender = gender;
        this.lefteye = lefteye;
        this.righteye = righteye;
        this.heart = heart;
        this.stomach = stomach;
        this.skin = skin;
    }

    public String getPatientName() {
        return PatientName;
    }

    public int getAge() {
        return Age;
    }

    public String getGender() {
        return Gender;
    }

    public Eye getLefteye() {
        return lefteye;
    }

    public void setLefteye(Eye lefteye) {
        this.lefteye = lefteye;
    }

    public Eye getRighteye() {
        return righteye;
    }

    public void setRighteye(Eye righteye) {
        this.righteye = righteye;
    }

    public Heart getHeart() {
        return heart;
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public Stomach getStomach() {
        return stomach;
    }

    public void setStomach(Stomach stomach) {
        this.stomach = stomach;
    }

    public Skin getSkin() {
        return skin;
    }

    public void setSkin(Skin skin) {
        this.skin = skin;
    }
}

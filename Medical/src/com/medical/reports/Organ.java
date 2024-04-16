package com.medical.reports;

public class Organ {
    private String OrganName ;
    private String OrganCondition;

    public Organ(String organName, String organCondition) {
        OrganName = organName;
        OrganCondition = organCondition;
    }

    public void Getdetalits()
    {
        System.out.println("Organ Name: "+getOrganName());
        System.out.println("MedicalCondition: "+OrganCondition);
    }
    public String getOrganName() {
        return OrganName;
    }


}

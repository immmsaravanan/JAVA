package com.medical.reports;

public class Skin extends Organ {
    private String Skincolor;
    private String Softness;

    public Skin(String organName, String organCondition, String skincolor, String softness) {
        super(organName, organCondition);
        Skincolor = skincolor;
        Softness = softness;
    }

    @Override
    public void Getdetalits() {
        super.Getdetalits();
        System.out.println("Skin Color : "+this.Skincolor);
        System.out.println("Skin Softness : "+this.Softness);
    }

    public String getSkincolor() {
        return Skincolor;
    }



    public String getSoftness() {
        return Softness;
    }


}

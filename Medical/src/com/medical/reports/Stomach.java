package com.medical.reports;

public class Stomach extends Organ {
    private boolean IsStomachFull;

    public Stomach(String organName, String organCondition, boolean isStomachFull) {
        super(organName, organCondition);
        IsStomachFull = isStomachFull;
    }

    @Override
    public void Getdetalits() {
        super.Getdetalits();
        if (IsStomachFull == true)
            System.out.println("The stomach Is Full");
        else
            System.out.println("The stomach Is Empty");
    }

    public void Digest() {
        System.out.println("Digesting The Stomach.......!");
    }

    public boolean isStomachFull() {
        return IsStomachFull;
    }
}



package com.medical.reports;

public class Eye extends Organ{
    private String EyeColor;
    private boolean IsOpened;

    public Eye(String organName, String organCondition, String eyeColor, boolean isOpened) {
        super(organName, organCondition);
        EyeColor = eyeColor;
        IsOpened = isOpened;
    }

    @Override
    public void Getdetalits() {
        super.Getdetalits();
        System.out.println("The Color Of The Eye Is : "+this.EyeColor);
    }

    public void isopen()
{
    if(IsOpened==true)
    {
        System.out.println(getOrganName()+" is opened");
    }
    else
    {
        System.out.println(getOrganName()+" is closed");
    }
}

    public String getEyeColor() {
        return EyeColor;
    }



    public boolean isOpened() {
        return IsOpened;
    }

    public void setOpened(boolean opened) {
        IsOpened = opened;
    }
}

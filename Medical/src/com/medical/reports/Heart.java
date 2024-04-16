package com.medical.reports;

public class Heart extends Organ{
    private float HeartRate;

    public Heart(String organName, String organCondition, float heartRate) {
        super(organName, organCondition);
        HeartRate = heartRate;
    }

    @Override
    public void Getdetalits() {
super.Getdetalits();
        System.out.println("Heart Rate: "+this.HeartRate);
    }

    public void ChangeHeartRate(float heart)
    {
        HeartRate=heart;
        System.out.println("Heart Rate Changed!");
    }

    public float getHeartRate() {
        return HeartRate;
    }

    public void setHeartRate(float heartRate) {
        HeartRate = heartRate;
    }
}

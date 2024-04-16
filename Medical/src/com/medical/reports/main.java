package com.medical.reports;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Patient PatientTom = new Patient("Tom", 30, "Male",
                new Eye("Left Eye", "ShortEye", "brown", true),
                new Eye("Right Eye", "Short Sighted", "brown", true),
                new Heart("Heart", "normal", 80),
                new Stomach("Stomach", "Normal", true),
                new Skin("skin", "Burnned", "White", "89/100"));
        System.out.println("Patient Name: " + PatientTom.getPatientName());
        System.out.println("Patient Age : " + PatientTom.getAge());
        System.out.println("Patient Gender : " + PatientTom.getGender());
        boolean Finish = false;
        int choice;
        Scanner s = new Scanner(System.in);
        while (!Finish) {
            System.out.println("Choose The Organ : ");
            System.out.println("\t1.Left Eye");
            System.out.println("\t2.Right Eye");
            System.out.println("\t3.Heart");
            System.out.println("\t4.Stomach");
            System.out.println("\t5.Skin");
            System.out.println("\t6.Quit");
            choice = s.nextInt();

            switch (choice) {
                case 1:
                    PatientTom.getLefteye().Getdetalits();
                    PatientTom.getLefteye().isopen();
                    if (PatientTom.getLefteye().isOpened()) {
                        System.out.println("\t1.Close The Eye!");
                        if (s.nextInt() == 1) {
                            PatientTom.getLefteye().setOpened(false);
                            System.out.println("The Eye Is Closed!");
                        }
                    }
                        else {
                            System.out.println("\t1.Open The Eye!");
                            if (s.nextInt() == 1) {
                                PatientTom.getLefteye().setOpened(true);
                                System.out.println("The Eye Is opened!");
                            }
                        }
                        continue;





                case 2:
                    PatientTom.getRighteye().Getdetalits();
                    PatientTom.getRighteye().isopen();
                    if (PatientTom.getRighteye().isOpened()) {
                        System.out.println("\t1.Close The Eye!");
                        if (s.nextInt() == 1) {
                            PatientTom.getRighteye().setOpened(false);
                            System.out.println("The Eye Is Closed!");
                        }
                    }
                        else
                        {
                            System.out.println("\t1.Open The Eye!");
                            if (s.nextInt() == 1) {
                                PatientTom.getRighteye().setOpened(true);
                                System.out.println("The Eye Is Opened!");
                            }
                            }

                            continue;


                case 3:
                    PatientTom.getHeart().Getdetalits();
                    System.out.println("\t1.Change Heart Rate!");
                    System.out.println("\t2.Exit Menu");
                    if(s.nextInt()==1)
                    {
                        PatientTom.getHeart().ChangeHeartRate(s.nextFloat());
                        continue;
                    }
                    else
                    {
                        continue;
                    }

                case 4:
                    PatientTom.getStomach().Getdetalits();
                    System.out.println("\t1.Digest");
                    if(s.nextInt()==1)
                    {
                        PatientTom.getStomach().Digest();
                        continue;
                    }
                  break;

                case 5:
                    PatientTom.getSkin().Getdetalits();
                    continue;

                case 6:
                    Finish=true;
                    break;
                default:gv
                    System.out.println("Enter A Valid Choice!");



            }

        }
    }
}
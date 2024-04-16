package RandomNumberGame;

import com.sun.jdi.event.MethodExitEvent;

import java.util.Random;
import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        System.out.println("Welcome to The Game");
        System.out.println("Please Enter Your Name");
        Scanner s=new Scanner(System.in);
        String name = s.nextLine();
        Random r=new Random();
        System.out.println(name+ " Guess A Number between 0-5 ");
        int ran=r.nextInt(5)+1;
        int j=5;
        for(int i=1;i<=5;i++)
        {
            int ans=s.nextInt();
            if(ans==ran)
            {
                System.out.println("congratulation "+name+" you have guessed the correct number");
                System.exit(0);
            }
            if(j>1) {
                if (ans < ran) {
                    System.out.println(name + " guess higher values to find the number");
                } else {
                    System.out.println(name + " guess lower values to find the number");
                }
            }
            j-=1;
            if(j==0)
                System.out.println("Game Over!");
            else
            System.out.println(name+" your answer is wrong you have only "+j+" chances left to complete the game");

        }
        System.out.println("The Number Is: "+ran+".");
    }
}

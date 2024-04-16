import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static ArrayList<Messages>contact=new ArrayList<>();
    static ArrayList<Messages> emsg =new ArrayList<>();
    private static int id =0;
     static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Welcome to My contacts Program");
        System.out.println("Please Enter Your Name");
        String usr= s.nextLine();
        System.out.println("Welcome "+usr);
        ShowMainMenu(usr);

    }

    private static void ShowMainMenu(String usr) {
        System.out.println("Hello "+usr);
        System.out.println("Hi Iam Sarah Your Virtual Assistant Of My Contacts Program :)");
        System.out.println("\tHow Can I Help You ?");
        System.out.println("\t\t1.Contacts:");
        System.out.println("\t\t2.Messages");
        System.out.println("\t\t3.Exit The Program");
        System.out.println("(sarah):Enter A Option");
        int choice=s.nextInt();
        switch (choice)
        {
            case 1:
                Contact(usr);
                break;
            case 2:
                ContactMessages(usr);
                break;
            case 3:
                break;
            default:
                System.out.println("(sarah):oops!Your Option Is Not Valid"+usr+ ":( Please Enter A Valid One");
                ShowMainMenu(usr);
        }
    }

    private static void ContactMessages(String usr) {
        System.out.println("(sarah):Welcome To Message Homepage"+usr+".");
        System.out.println("Press 1. To See All The Messages.");
        System.out.println("Press 2. To Send A Message.");
        System.out.println("Press 3. To exit");
        switch (s.nextInt()) {
            case 1:
                seemsg(usr);
                break;

            case 2:
                sendmsg(usr);
                break;
            case 3:
                break;
            default:
                System.out.println("(sarah):oops!Your Option Is Not Valid" + usr + ":( Please Enter A Valid One");
                break;
        }
    }

    private static void sendmsg(String usr) {
        System.out.println("(sarah):"+usr+" Enter The Name Of The Contact To Send Message!.");
        String nrr=s.nextLine();
        String n=s.nextLine();
        boolean found=false;
        Messages nmessage;
        for(Messages m:contact)
        {
            if(m.getName().equals(n))
            {
                found=true;
                nmessage=m;

            }

        }
        if(found)
        {
            System.out.println("(sarah):Successfully Found The Contact!");
            System.out.println("(sarah):"+usr+" Enter The Message To Send");
            String msg=s.nextLine();
            if(msg.equals(" "))
            {
                System.out.println("(sarah):Please Enter A Message");
                sendmsg(usr);
            }
            else
            {
                for(Messages m:contact)
                {
                    if(m.getName().equals(n))
                    {
                        contact.remove(m);
                        id++;
                        m.setId(id);
                        m.setMsg(msg);
                        contact.add(m);
                        emsg.add(m);
                        System.out.println("(sarah): "+usr+" Succesfully Sended The Message!");
                    }
                }
            }
        }
        else {
            System.out.println("(sarah):Cannot  Found The Contact!");
            System.out.println("(sarah):" + usr + " If You Wanna Add Some Contacts Press 1");
            System.out.println("Press 2 To Go To The Previous Menu");
            System.out.println("Press 3 To Go To The Main Menu");
            switch (s.nextInt()) {
                case 1:
                    Newcontact(usr);
                    break;
                case 2:
                    ContactMessages(usr);
                    break;
                case 3:
                    ShowMainMenu(usr);
                    break;
                default:
                    System.out.println("(sarah):oops!Your Option Is Not Valid" + usr + ":( Please Enter A Valid One");
                    sendmsg(usr);
                    break;
            }
        }
        System.out.println("Press 1 To Previous Menu");
        System.out.println("Press 2 To Main Menu");
        if(s.nextInt()==1) {
            ContactMessages(usr);
        }
        else
        {
            ShowMainMenu(usr);
        }
    }

    private static void seemsg(String usr) {
        if(emsg.isEmpty())
        {
            System.out.println("(Sarah):There Are No Messages Found!"+usr+".");
            System.out.println("Press 1 To Previous Menu");
            System.out.println("Press 2 To Main Menu");
            if(s.nextInt()==1) {
                ContactMessages(usr);
            }
            else
            {
                ShowMainMenu(usr);
            }
        }
        else {
            System.out.println("(sarah):Displaying Messages!");
            for (Messages m:contact)
            {
                System.out.println("Name: "+m.getName()+".");
                System.out.println("message: "+m.getMsg());
                System.out.println("ID : "+m.getId()+".");
            }

        }
        System.out.println("Press 1 To Previous Menu");
        System.out.println("Press 2 To Main Menu");
        if(s.nextInt()==1) {
            Contact(usr);
        }
        else
        {
            ShowMainMenu(usr);
        }

    }

    private static void Contact(String usr) {
        System.out.println("(Sarah):Hey "+usr+" Here Is You Contact Menu......");
        System.out.println("\t\t1.View Contacts.");
        System.out.println("\t\t2.Create A New Contact.");
        System.out.println("\t\t3.Search Contacts.");
        System.out.println("\t\t4.Delete Contacts.");
        System.out.println("\t\t5.Back To Main Menu.");
            System.out.println("\t\t6.Exit.");
        System.out.println("(sarah):Enter A Option");
        int choice =s.nextInt();
        switch (choice)
        {
            case 1:
                viewcontacts(usr);
                break;

            case 2:
                Newcontact(usr);
                break;
            case 3:
                Searchcontact(usr);
                break;
            case 4:
                DeleteContacts(usr);
                break;
            case 5:
                ShowMainMenu(usr);
                break;
            case 6:
                break;
            default:
                System.out.println("(sarah):oops!Your Option Is Not Valid"+usr+ ":( Please Enter A Valid One");
                break;

        }


    }

    private static void DeleteContacts(String usr) {
        if(contact.isEmpty())
        {
            System.out.println("(Sarah): The Contacts Are Empty");
            System.out.println("(sarah):"+usr+" If You Wanna Add Some Contacts Press 1");
            System.out.println("Press 2 To Go To The Previous Menu");
            System.out.println("Press 3 To Go To The Main Menu");
            switch(s.nextInt()) {
                case 1:
                    Newcontact(usr);
                    break;
                case 2:
                    Contact(usr);
                    break;
                case 3:
                    ShowMainMenu(usr);
                    break;
                default:
                    System.out.println("(sarah):oops!Your Option Is Not Valid" + usr + ":( Please Enter A Valid One");
                    DeleteContacts(usr);
                    break;
            }
        }
        else
        {
            System.out.println("(sarah):Enter The Contact Name To Delete! "+usr+".");
            String del2=s.nextLine();
            String del=s.nextLine();
            boolean found=false;
            for(Messages m:contact)
            {
                if(m.getName().equals(del))
                {
                    found=true;
                    contact.remove(m);
                    System.out.println("(sarah):Successfully Deleted The Contact With Name "+del+"From The Contact "+usr+".");

                }
            }
        }
        System.out.println("Press 1 To Previous Menu");
        System.out.println("Press 2 To Main Menu");
        if(s.nextInt()==1) {
            Contact(usr);
        }
        else
        {
            ShowMainMenu(usr);
        }
    }

    private static void Searchcontact(String usr) {
        if(contact.isEmpty())
        {
            System.out.println("(Sarah): The Contacts Are Empty");
            System.out.println("(sarah):"+usr+" If You Wanna Add Some Contacts Press 1");
            System.out.println("Press 2 To Go To The Previous Menu");
            System.out.println("Press 3 To Go To The Main Menu");
            switch(s.nextInt()) {
                case 1:
                    Newcontact(usr);
                    break;
                case 2:
                    Contact(usr);
                    break;
                case 3:
                    ShowMainMenu(usr);
                    break;
                default:
                    System.out.println("(sarah):oops!Your Option Is Not Valid" + usr + ":( Please Enter A Valid One");
                    Searchcontact(usr);
                    break;
            }
        }
        else
        {
            System.out.println("(sarah):Enter A Name To Search "+usr+".");
            String Searchi=s.nextLine();
            String Search=s.nextLine();
            boolean find=false;
            for(Messages m:contact)
            {
                if(m.getName().equals(Search))
                {
                    find=true;
                    System.out.println("(sarah):Found The Contact Success Fully!");
                    System.out.println("\tName : "+m.getName()+".");
                    System.out.println("\tPhone Number : "+m.getPhonenumber()+".");
                    System.out.println("\tMail Id : "+m.getMailid()+".");
                    System.out.println("__________________________________________");
                }
            }
        }
        System.out.println("Press 1 To Previous Menu");
        System.out.println("Press 2 To Main Menu");
        if(s.nextInt()==1) {
            Contact(usr);
        }
        else
        {
            ShowMainMenu(usr);
        }

    }

    private static void Newcontact(String usr) {
        System.out.println("(sarah): "+usr+" Enter The Below Details Correctly To Create A Contact");
        System.out.println("Name Of The Contact : ");
        String name =s.nextLine();
        String Name=s.nextLine();
        System.out.println("Enter The Phone Number : ");
        String phone=s.nextLine();
        System.out.println("Enter The Mail : ");
        String mail=s.nextLine();
        if(Name.equals(" ")||phone.equals(" ")||mail.equals(" "))
        {
            System.out.println("(sarah): Can You Enter A Correct Details To Create The Contact "+usr+" ?");
        }
        else
        {
boolean isfound = false;
            Messages Newcontact =new Messages(Name,phone,mail);
            for(Messages msg:contact)
            {
                if(msg.getName().equals(Name))
                {
                    isfound =true;
                }

            }
            if(isfound) {
                System.out.println("(sarah): The Contact Already Exist");
                System.out.println("Press 1 To Previous Menu");
                System.out.println("Press 2 To Main Menu");
                if(s.nextInt()==1) {
                    Contact(usr);
                }
                else
                {
                    ShowMainMenu(usr);
                }
            }
            else
            {
                System.out.println("(sarah):Adding The New Contact......");
                contact.add(Newcontact);
                System.out.println("(sarah):Added The New Contact Successfully "+usr+".");
                System.out.println("(sarah): The Contact Already Exist");
                System.out.println("Press 1 To Previous Menu");
                System.out.println("Press 2 To Main Menu");
                if(s.nextInt()==1) {
                    Contact(usr);
                }
                else
                {
                    ShowMainMenu(usr);
                }

            }
        }
    }

    private static void viewcontacts(String usr) {
        if(contact.isEmpty())
        {
            System.out.println("(sarah):Hey "+usr+" The Contacts Are Empty Add Some Of Them");
            System.out.println("(sarah):"+usr+" If You Wanna Add Some Contacts Press 1");
            System.out.println("Press 2 To Go To The Previous Menu");
            System.out.println("Press 3 To Go To The Main Menu");
            switch(s.nextInt())
            {
                case 1:
                    Newcontact(usr);
                    break;
                case 2:
                    Contact(usr);
                    break;
                case 3:
                    ShowMainMenu( usr);
                    break;
                default:
                    System.out.println("(sarah):oops!Your Option Is Not Valid"+usr+ ":( Please Enter A Valid One");
                    viewcontacts(usr);
                    break;
            }
        }
        else
        {
            System.out.println("(sarah):"+usr+" Here All The Contacts You Are Saved!\n\n\n");
            for(Messages m:contact)
            {
                System.out.println("\tName : "+m.getName()+".");
                System.out.println("\tPhone Number : "+m.getPhonenumber()+".");
                System.out.println("\tMail Id : "+m.getMailid()+".");
                System.out.println("__________________________________________");
            }

        }
        System.out.println("Press 1 To Previous Menu");
        System.out.println("Press 2 To Main Menu");
        if(s.nextInt()==1) {
            Contact(usr);
        }
        else
        {
            ShowMainMenu(usr);
        }
        
    }

    public static String usr;
}

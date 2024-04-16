public class Contacts {
    private String Name;
    private String phonenumber;
    private String mailid;
    int id;

    public Contacts(String name, String phonenumber, String mailid) {
        Name = name;
        this.phonenumber = phonenumber;
        this.mailid = mailid;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getMailid() {
        return mailid;
    }

    public void setMailid(String mailid) {
        this.mailid = mailid;
    }


}

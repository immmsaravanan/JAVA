public class Messages extends Contacts {
    private String msg;
    private int id;

    public Messages(String name, String phonenumber, String mailid) {
        super(name, phonenumber, mailid);

    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

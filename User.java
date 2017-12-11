
public class User {
    private String webPic;
    private String userName;
    private String realName;
    private String emailAdd;

    User(String webPic, String userName, String realName, String emailAdd) {
        this.webPic = webPic;
        this.userName = userName;
        this.realName = realName;
        this.emailAdd = emailAdd;

    }

    public String getUserString() {
        return webPic + "  " + userName + " | " + realName + " | " + emailAdd;
    }

}

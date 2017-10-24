import static java.lang.System.out;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class User
{
        private String webPic;
        private String userName;
        private String realName;
        private String emailAdd;
        private ArrayList posts;
       
        public void User(String webPic, String userName, String realName,
    String emailAdd)
    {
        this.webPic=webPic;
        this.userName=userName;
        this.realName=realName;
        this.emailAdd=emailAdd;
        
}
         public String getUserString()
    { 
        return this.webPic+"  " +this.userName+ " "+this.realName+" | "+this.emailAdd;
    }
        
}






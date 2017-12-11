package Microblog;
import java.util.*;


class Content2 {

    private static int nextPostNum = 1;
    private int postNum;
    private String newPost;
    private String currentUser;
    private String website;

    Content2(int postNum,String newPost, String currentUser, String website) {

        this.postNum= postNum;
        this.newPost = newPost;
        this.currentUser = currentUser;
        this.website = website;
    }

    public void getContent() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter current user's username");
        this.currentUser = keyboard.next();
        System.out.println("Post:");
        this.newPost = keyboard.next();
    }


    public void printContent() {
        System.out.println(this.postNum + " " + this.currentUser);
        System.out.println(this.newPost);
    }

    public String toString() {
        return this.postNum + " " + this.currentUser + "/n" + this.newPost;

    }
    public String getUser(){
        return this.currentUser;
    }
}

import static java.lang.System.out;
import java.util.Scanner;

public class MicroBlog1 {

    Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        out.println("--WELCOME TO MICROBLOG!--");
        System.out.println("");

        User[] allUsers = {
                new User("https://goo.gl/images/9MhB5i", "PhoenixRising", "Cory Spruce", "CSpruce777@gmail.com"),
                new User("https://goo.gl/images/9uCRAd", "AliceForest", "Jesse Andes", "Jandes@yahoo.com"),
                new User("https://goo.gl/images/rGOXMb", "SideshowBob", "Robert Underdunk Terwilliger", "MurderBart123@sbcglobal.com"),
        };

        Post[] createdPost = {
                new Post("PhoenixRising", "ONE:", "I blessed the rains down in Africa.", "www.astro.com"),
                new Post("PhoenixRising", "TWO:", "I will pee in your butt...", "www.facebook.com"),
                new Post("AliceForest", "THREE:", "As above so below.", "www.astro.com"),
                new Post("AliceForest", "FOUR:", "As within so without.", "www.astro.com"),
                new Post("SideshowBob", "FIVE:", "The only thing flat earthers have to fear... Is sphere itself...", "www.jokes.com"),
        };


        out.println("Here is a list of current users in Microblog:");
        for (int i = 0; i < allUsers.length; i++) {
            out.println("Users: " + allUsers[i].getUserString() + "\n");

        }

        out.println("Here is the list of the posts in Microblog:\n");
        for (int i = 0; i < createdPost.length; i++) {
            out.println("Posts: " + createdPost[i].getPostString() + "\n");
        }
    }
}

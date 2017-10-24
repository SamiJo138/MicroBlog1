import static java.lang.System.out;
import java.util.Scanner;
import java.util.ArrayList;

public class MicroBlog1
{
    Scanner keyboard=new Scanner(System.in);
    
    public void main(String[]args)
    {
         System.out.println("Welcome to MICROBLOG Edition 1!");
         System.out.println("Please choose a user: PhoenixRising\nAliceForest\nSideshowBob");
         String users=keyboard.nextLine();
         
         String userName1="PhoenixRising";
         String userName2="AliceForest";
         String userName3="SideshowBob";
         
            User[] user=new User[3];
            user[0]=new User("https://goo.gl/images/9MhB5i","PhoenixRising","Cory Spruce","CSpruce777@gmail.com");
            user[1]=new User("https://goo.gl/images/9uCRAd","AliceForest","Jesse Andes","Jandes@yahoo.com");
            user[2]=new User("https://goo.gl/images/rGOXMb","SideshowBob","Robert Underdunk Terwilliger","MurderBart123@sbcglobal.com");
          
            Post[]posts=new Post[5];
            posts[0]=new Post("PhoenixRising","ONE:","I blessed the rains down in Africa.","www.astro.com");
            posts[1]=new Post("PhoenixRising","TWO:","I will pee in your butt...","www.facebook.com");
            posts[2]=new Post("AliceForest","THREE:","As above so below.","www.astro.com");
            posts[3]=new Post("AliceForest","FOUR:","As within so without.","www.astro.com");
            posts[4]=new Post("SideshowBob","FIVE:","The only thing flat earthers have to fear... Is sphere itself...","www.jokes.com");
          
            
        }
        
        public static void printUser(User[]users){
            for (int i=0; i<users.length; i++){
                System.out.println(users[i].getUserString());
            }
        }
        
        public static void printPost(Post[]posts){
        for(int i=0; i<posts.length; i++){
            System.out.println(posts[i].getPostString());
        }
    }
}

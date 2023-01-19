import model.Children;
import model.hobbies;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {





        hobbies hobby1 = new hobbies("Football","Outdoor");
        hobbies hobby2 = new hobbies("tt","Indoor");
        hobbies hobby3 = new hobbies("Swimming","Outdoor");

        ArrayList<hobbies> A = new ArrayList<>();
        A.add(hobby1);
        ArrayList<hobbies> B = new ArrayList<>();
        B.add(hobby2);
        ArrayList<hobbies> C = new ArrayList<>();
        C.add(hobby3);


        Children child1 = new Children("Aaditya",12,17,A);
        Children child2 = new Children("Anubhav",7,22,B);

        System.out.println(child1.getFullName());

        child2.gethobby();





    }
}
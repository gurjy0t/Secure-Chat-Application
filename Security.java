import java.util.*;

public class Security {
      public static Boolean confidentiality;
      public static Boolean integrity;
      public static Boolean authenticaion;
      public Security(){
            checkUserInput();
      }

      public static void checkUserInput() {
            // Prompt user to enable/disable security properties
            Scanner reader = new Scanner(System.in);
            String c, i, a;

            System.out.println("Require confidentiality? (y or n)");
            while(true){
                  c = reader.nextLine();
                  if(c.equals("y")){
                        confidentiality = true;
                        break;
                  }
                  else if(c.equals("n")) {
                        confidentiality = false;
                        break;
                  } 
                  System.out.println("Invalid input, try again.");
            }

            System.out.println("Require integrity? (y or n)");
            while(true){
                  i = reader.nextLine();
                  if(i.equals("y")){
                        integrity = true;
                        break;
                  }
                  else if(i.equals("n")) {
                        integrity = false;
                        break;
                  } 
                  System.out.println("Invalid input, try again.");
            }

            System.out.println("Require authenticaion? (y or n)");
            while(true){
                  a = reader.nextLine();
                  if(a.equals("y")){
                        authenticaion = true;
                        break;
                  }
                  else if(a.equals("n")) {
                        authenticaion = false;
                        break;
                  } 
                  System.out.println("Invalid input, try again.");
            }
      }
}

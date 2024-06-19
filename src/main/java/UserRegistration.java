import java.util.regex.*;
import java.util.Scanner;
public class UserRegistration {
    public static String FirstName(String name){
        Pattern pattern = Pattern.compile("[A-Z][a-z]{3,}");
        Matcher matcher = pattern.matcher(name);
        boolean ismatch= matcher.matches();
        if(ismatch){
            System.out.println("valid");
            return "Valid";
        }
        else{
            System.out.println("Invalid");
            return "Invalid";
        }
    }
    public static String LastName(String name){
        Pattern pattern = Pattern.compile("[A-Z][a-z]{3,}");
        Matcher matcher = pattern.matcher(name);
        boolean ismatch= matcher.matches();
        if(ismatch){
            System.out.println("Valid");
            return "Valid";
        }
        else{
            System.out.println("Invalid");
            return "Invalid";
        }
    }
    public static String emailId(String name ){
        Pattern pattern=Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
        Matcher match= pattern.matcher(name);
        boolean ismatch= match.matches();
        if(ismatch){
            return "Valid";
        }else {
            return "Invalid";
        }

    }
    public static String phNumber(String name ){
        Pattern pattern=Pattern.compile("^\\+[0-9]{0,2}\\s[1-9][0-9]{9}$");
        Matcher match= pattern.matcher(name);
        boolean ismatch= match.matches();
        if(ismatch){
            System.out.println("valid");
            return "Valid";

        }else {
            System.out.println("Invalid");
            return "Invalid";
        }
    }
    public static String Password(String text) {
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z])(?=.*[!@#$%&])[A-Za-z0-9!@#$%&]{8,}$");
        Matcher match = pattern.matcher(text);
        boolean ismatch = match.matches();
        if (ismatch) {
            System.out.println("Valid");
            return "Valid";
        } else {
            System.out.println("Invalid");
            return "Invalid";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name");
        String name =sc.nextLine();
        System.out.println("Enter Last Name");
        String lastname =sc.nextLine();
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter the Email ID: ");
            String email = sc.nextLine();
            emailId(email);
        }
        FirstName(name);
        LastName(lastname);

        System.out.println("Enter Number: ");
        String number= sc.nextLine();
        phNumber(number);
        System.out.println("Enter Password");
        String password=sc.nextLine();
        Password(password);
    }
}
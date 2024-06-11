import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
    public void validateName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password : ");
        String password=sc.nextLine();
        String regex=  "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(password);
        boolean b = m.matches();
        System.out.println(b);

    }


    public static void main(String[] args) {
        UserRegistration ur=new UserRegistration();
        ur.validateName();
    }
}

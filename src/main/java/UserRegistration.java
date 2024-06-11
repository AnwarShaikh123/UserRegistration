import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
    public void validateName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Contact number: ");
        String Contact=sc.nextLine();
        String regex=  "^[0-9]{2} [0-9]{10}$";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(Contact);
        boolean b = m.matches();
        System.out.println(b);

    }


    public static void main(String[] args) {
        UserRegistration ur=new UserRegistration();
        ur.validateName();
    }
}

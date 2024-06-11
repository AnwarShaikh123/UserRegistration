import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
    public void validateName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name ");
        String firstName=sc.nextLine();
        String regex=  "[A-Z][a-z]{4,10}";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(firstName);
        boolean b = m.matches();
        System.out.println(b);

    }

    public static void main(String[] args) {
        UserRegistration ur=new UserRegistration();
        ur.validateName();
    }
}

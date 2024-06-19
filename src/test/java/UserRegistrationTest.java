import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
class UserRegistrationTest {
    @Test
public void validatedFirstName(){
        Assertions.assertEquals(UserRegistration.FirstName("Anwar"), "Valid");
    }
    @Test
    public void validatedLastName(){
        Assertions.assertEquals( UserRegistration.LastName("Shaikh"),"Valid");
    }
    @Test
    public void validatedEmailId(){
        Assertions.assertEquals( UserRegistration.emailId("Anwar@gmail.com"),"Valid");
    }

    @Test
    public void ValidatedPhNumber(){
        Assertions.assertEquals( UserRegistration.phNumber("+91 1234567890"),"Valid");
    }
    @Test
    public void ValidatedPassword(){
        Assertions.assertEquals( UserRegistration.Password("Password1@"),"Valid");
    }

}
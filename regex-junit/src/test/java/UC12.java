import com.day11.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class UC12 {
    @Test
    public void TestSadFirstName() {
        assertThrows(InvalidFirstNameException.class, () -> {
            UC12Main.IsValidFirstName("vish");
        });
    }

    @Test
    public void TestSadLastName() {
        assertThrows(InvalidLastNameException.class, () -> {
            UC12Main.IsValidLastName("singh");
        });
    }

    @Test
    public void TestSadEmail() {
        assertThrows(InvalidEmailException.class, () -> {
            UC12Main.IsValidEmail("abc.com");
        });
    }

    @Test
    public void TestSadPhoneNo() {
        assertThrows(InvalidPhoneNoException.class, () -> {
            UC12Main.IsValidPhoneNo("1234");
        });
    }

    @Test
    public void TestSadPassword() {
        assertThrows(InvalidPasswordException.class, () -> {
            UC12Main.IsValidPassword("1234");
        });
    }
}
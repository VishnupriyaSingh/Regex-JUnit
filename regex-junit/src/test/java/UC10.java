import com.day11.Main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UC10 {

    @Test
    public void TestHappyFirstName() {
        assertTrue(Main.IsValidFirstName("Vishnupriya"));
    }

    @Test
    public void TestSadFirstName() {
        assertFalse(Main.IsValidFirstName("vish"));
    }

    @Test
    public void TestHappyLastName() {
        assertTrue(Main.IsValidLastName("Singh"));
    }

    @Test
    public void TestSadLastName() {
        assertFalse(Main.IsValidLastName("singh"));
    }

    @Test
    public void TestHappyEmail() {
        assertTrue(Main.IsValidEmail("priya.singh@gmail.com"));
    }

    @Test
    public void TestSadEmail() {
        assertFalse(Main.IsValidEmail("priyaabc.com"));
    }

    @Test
    public void TestHappyPhoneNo() {
        assertTrue(Main.IsValidPhoneNo("+918368026079"));
    }

    @Test
    public void TestSadPhoneNo() {
        assertFalse(Main.IsValidPhoneNo("12345"));
    }

    @Test
    public void TestHappyPassword() {
        assertTrue(Main.IsValidPassWordR4("Abcd@123"));
    }

    @Test
    public void TestSadPassword() {
        assertFalse(Main.IsValidPassWordR4("abcd"));
    }
}
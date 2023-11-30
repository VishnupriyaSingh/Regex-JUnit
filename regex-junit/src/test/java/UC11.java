import com.day11.Main;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UC11 {

    @ParameterizedTest
    @CsvSource({
            "abc@yahoo.com, true",
            "abc-100@yahoo.com, true",
            "abc.100@yahoo.com, true",
            "abc111@abc.com, true",
            "abc-100@abc.net, true",
            "abc.100@abc.com.au, true",
            "abc@1.com, true",
            "abc@gmail.com.com, true",
            "abc+100@gmail.com, true",
            "abc..2002@gmail.com, true",
            "abc, false",
            "abc@.com.my, false",
            "abc123@gmail.a, false",
            "abc123@.com, false",
            "abc123@.com.com, false",
            "abc()*@gmail.com, false",
            "abc@%*.com, false",
            "abc@abc@gmail.com, false",
            "abc@gmail.com.1a, false",
    })
    public void TestEmailValidation(String email, boolean expected) {
        assertEquals(expected, Main.IsValidEmail(email));
    }
}
package ru.netology.javaqa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.RestService;
public class RestServiceTest {
    @Test
    public void RestTest(int income, int expenses, int threshold) {
        RestService service = new RestService();
        int expected = 2;
        int actual = service.calculate(income = 10_000, expenses = 3_000, threshold = 20_000);

        Assertions.assertEquals(expected, actual);
    }
}

package ru.netology.javaqa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RestServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/count.csv")
    public void test(int expected, int income, int expenses,int threshold) {
        RestService service = new RestService();
        int count = service.calculate(income, expenses,threshold);
         Assertions.assertEquals(expected,count);
    }

}

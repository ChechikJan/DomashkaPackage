package ru.netology.sqr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files ="src/test/java/data.test")
    public void testNumbersSq(int expected, int range1, int range2) {
        SQRService service = new SQRService();

        int actual = service.numbersSquaresInRange(range1, range2);
        Assertions.assertEquals(expected, actual);

    }
}
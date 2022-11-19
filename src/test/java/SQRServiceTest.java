
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.javaqamvn.services.SQRService;

public class SQRServiceTest {

    @ParameterizedTest
    //  @CsvFileSource(files="scr/test/resources/SQRT.csv")
    @CsvSource({

            "3,200,300"


    })
    public void calcSqrt(int expected, int start, int finish) {
        SQRService service = new SQRService();

        int actual = service.calcSqrt(start, finish);

    }
}


package hr.unipu.rpii.backendfinally;

import hr.unipu.rpii.backendfinally.service.model.ItdSeminarTwoDetails;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ItdSeminarTwoDetailsTest {
    @Test
    public void scoreMaxTest() {
        int maxPresValue = 10;
        int maxQualityValue = 20;
        int negativePoints = 0;
        ItdSeminarTwoDetails details = ItdSeminarTwoDetails.builder()
                .presDesign(maxPresValue)
                .presContent(maxPresValue)
                .presLive(maxPresValue)
                .quality(maxQualityValue)
                .negativePoints(negativePoints)
                .build();

        int expectedPoints = 35;
        assertEquals(expectedPoints, details.calculateResult());
    }

    @Test
    public void scoreMaxWithNegativePointsTest() {
        int maxPresValue = 10;
        int maxQualityValue = 20;
        int negativePoints = 3;
        ItdSeminarTwoDetails details = ItdSeminarTwoDetails.builder()
                .presDesign(maxPresValue)
                .presContent(maxPresValue)
                .presLive(maxPresValue)
                .quality(maxQualityValue)
                .negativePoints(negativePoints)
                .build();

        int expectedPoints = 32;
        assertEquals(expectedPoints, details.calculateResult());
    }

    @Test
    public void scoreMinTest() {
        int minValue = 0;
        ItdSeminarTwoDetails details = ItdSeminarTwoDetails.builder()
                .presDesign(minValue)
                .presContent(minValue)
                .presLive(minValue)
                .quality(minValue)
                .negativePoints(minValue)
                .build();

        int expectedPoints = 0;
        assertEquals(expectedPoints, details.calculateResult());
    }

    @Test
    public void scoreValueGoesBellowZero_Test() {
        int minValue = 0;
        int negativePoints = 1;
        ItdSeminarTwoDetails details = ItdSeminarTwoDetails.builder()
                .presDesign(minValue)
                .presContent(minValue)
                .presLive(minValue)
                .quality(minValue)
                .negativePoints(negativePoints)
                .build();

        int expectedPoints = 0; // total points bellow 0 should be treated as 0
        assertEquals(expectedPoints, details.calculateResult());
    }

    @Test
    public void scoreFiftyPercentTest() {
        int fiftyPercentValue = 5;
        ItdSeminarTwoDetails details = ItdSeminarTwoDetails.builder()
                .presDesign(fiftyPercentValue)
                .presContent(fiftyPercentValue)
                .presLive(fiftyPercentValue)
                .quality(fiftyPercentValue)
                .build();

        int expectedPoints = 13; // this is intentional (25/2 = 12.5 = round up to 13 - to not damage students)
        assertEquals(expectedPoints, details.calculateResult());
    }

    @Test
    public void noSeminarQualityTest() {
        ItdSeminarTwoDetails details = ItdSeminarTwoDetails.builder()
                .build();

        Exception exception = assertThrows(RuntimeException.class, () -> details.calculateResult());
        assertEquals("Invalid scores for second seminar.", exception.getMessage());
    }
}

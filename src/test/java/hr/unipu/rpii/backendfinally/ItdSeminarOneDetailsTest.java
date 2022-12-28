package hr.unipu.rpii.backendfinally;

import hr.unipu.rpii.backendfinally.service.model.ItdSeminarOneDetails;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ItdSeminarOneDetailsTest {

    @Test
    public void scoreMaxTest() {
        int maxValue = 10;
        ItdSeminarOneDetails details = ItdSeminarOneDetails.builder()
                .presDesign(maxValue)
                .presContent(maxValue)
                .presLive(maxValue)
                .size(maxValue)
                .formatting(maxValue)
                .quality(maxValue)
                .build();

        int expectedPoints = 25;
        assertEquals(expectedPoints, details.calculateResult());
    }

    @Test
    public void scoreMinTest() {
        int minValue = 0;
        ItdSeminarOneDetails details = ItdSeminarOneDetails.builder()
                .presDesign(minValue)
                .presContent(minValue)
                .presLive(minValue)
                .size(minValue)
                .formatting(minValue)
                .quality(minValue)
                .build();

        int expectedPoints = 0;
        assertEquals(expectedPoints, details.calculateResult());
    }

    @Test
    public void scoreFiftyPercentTest() {
        int fiftyPercentValue = 5;
        ItdSeminarOneDetails details = ItdSeminarOneDetails.builder()
                .presDesign(fiftyPercentValue)
                .presContent(fiftyPercentValue)
                .presLive(fiftyPercentValue)
                .size(fiftyPercentValue)
                .formatting(fiftyPercentValue)
                .quality(fiftyPercentValue)
                .build();

        int expectedPoints = 13; // this is intentional (25/2 = 12.5 = round up to 13 - to not damage students)
        assertEquals(expectedPoints, details.calculateResult());
    }

    @Test
    public void scoreMaxNoPresentationTest() {
        int maxValue = 10;
        ItdSeminarOneDetails details = ItdSeminarOneDetails.builder()
                .presDesign(null)
                .presContent(null)
                .presLive(null)
                .size(maxValue)
                .formatting(maxValue)
                .quality(maxValue)
                .build();

        int expectedPoints = 25;
        assertEquals(expectedPoints, details.calculateResult());
    }

    @Test
    public void noSeminarQualityTest() {
        int value = 10;
        ItdSeminarOneDetails details = ItdSeminarOneDetails.builder()
                .presDesign(value)
                .presContent(value)
                .presLive(value)
                .size(value)
                .formatting(value)
                .quality(null)
                .build();

        Exception exception = assertThrows(RuntimeException.class, () -> details.calculateResult());
        assertEquals("No score for first seminar (quality).", exception.getMessage());
    }
}

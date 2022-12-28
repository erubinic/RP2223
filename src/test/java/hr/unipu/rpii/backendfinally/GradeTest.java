package hr.unipu.rpii.backendfinally;

import hr.unipu.rpii.backendfinally.service.model.Grade;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradeTest {

    @Test
    public void grade100Test(){
        assertEquals(Grade.A, Grade.fromPoints(100));
    }

    @Test
    public void grade95Test(){
        assertEquals(Grade.A, Grade.fromPoints(95));
    }

    @Test
    public void grade90Test(){
        assertEquals(Grade.A, Grade.fromPoints(90));
    }

    @Test
    public void grade85Test(){
        assertEquals(Grade.B, Grade.fromPoints(85));
    }

    @Test
    public void grade80Test(){
        assertEquals(Grade.B, Grade.fromPoints(80));
    }

    @Test
    public void grade75Test(){
        assertEquals(Grade.C, Grade.fromPoints(75));
    }

    @Test
    public void grade70Test(){
        assertEquals(Grade.C, Grade.fromPoints(70));
    }

    @Test
    public void grade65Test(){
        assertEquals(Grade.D, Grade.fromPoints(65));
    }

    @Test
    public void grade60Test(){
        assertEquals(Grade.D, Grade.fromPoints(65));
    }

    @Test
    public void grade55Test(){
        assertEquals(Grade.E, Grade.fromPoints(55));
    }

    @Test
    public void grade50Test(){
        assertEquals(Grade.E, Grade.fromPoints(50));
    }

    @Test
    public void grade20Test(){
        assertEquals(Grade.E, Grade.fromPoints(20));
    }
}

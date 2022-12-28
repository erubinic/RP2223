package it.hr.unipu.rpii.backendfinally.providers;

import hr.unipu.rpii.backendfinally.model.student.Student;
import hr.unipu.rpii.backendfinally.providers.StudentProvider;
import it.hr.unipu.rpii.backendfinally.helper.TestHelper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class StudentProviderTest extends TestHelper {
    @Autowired
    StudentProvider studentProvider;

    @Test
    public void testPeroIsInDatabase() {
        // from test-changelogs
        Student pero = studentProvider.getByJmbag("123456");

        assertNotNull(pero);
        assertEquals("Pero", pero.getFirstName());
        assertEquals("Peric", pero.getSurname());
    }
}

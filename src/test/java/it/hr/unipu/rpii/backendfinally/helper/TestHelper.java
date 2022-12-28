package it.hr.unipu.rpii.backendfinally.helper;

import hr.unipu.rpii.backendfinally.ResultsRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(classes = ResultsRunner.class)
@Import(TestConfig.class)
@ActiveProfiles("test")
public abstract class TestHelper {

}


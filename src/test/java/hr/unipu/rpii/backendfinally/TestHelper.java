package hr.unipu.rpii.backendfinally;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = ResultsRunner.class)
@Import(TestConfig.class)
@ActiveProfiles("test")
public abstract class TestHelper {

}


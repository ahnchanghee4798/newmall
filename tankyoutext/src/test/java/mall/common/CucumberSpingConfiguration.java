package mall.common;


import mall.TankyoutextApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { TankyoutextApplication.class })
public class CucumberSpingConfiguration {
    
}

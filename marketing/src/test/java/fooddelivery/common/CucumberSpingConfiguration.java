package fooddelivery.common;


import fooddelivery.MarketingApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { MarketingApplication.class })
public class CucumberSpingConfiguration {
    
}

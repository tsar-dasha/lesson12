package properties.tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemPropertiesTests {

    @Test
    void systemPropertiesTests(){
        System.getProperty("browser", "chrome");
        String browser = System.getProperty("browser");
        System.out.println(browser);
    }

    @Test
    @Tag("property")
    void systemProperties2Tests(){
        System.getProperty("browser", "chrome");
        String browser = System.getProperty("browser");
        System.out.println(browser);
    }
}

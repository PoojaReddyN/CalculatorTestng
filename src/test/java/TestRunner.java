import org.testng.TestNG;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;
import org.testng.xml.XmlClass;
import java.util.Collections;

public class TestRunner {
    public static void main(String[] args) {

        TestNG testNG = new TestNG();

        XmlSuite suite = new XmlSuite();
        suite.setName("Calculator Test Suite");

        XmlTest test = new XmlTest(suite);
        test.setName("Calculator Tests");
        test.setXmlClasses(Collections.singletonList(new XmlClass("CalculatorTesting")));

        testNG.setXmlSuites(Collections.singletonList(suite));

        testNG.run();
    }
}

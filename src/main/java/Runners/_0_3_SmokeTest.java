package Runners;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;

@CucumberOptions(

        tags = {"@SmokeTest"} //contactUs.feature içerisinde sayfa başında @SmokeTest tanımladık o yüzden onu çalıştıracak.
        ,
        features = {"src/test/java"},

        glue = {"stepDefinition"},

        plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html" },
        dryRun = false
)


public class _0_3_SmokeTest extends AbstractTestNGCucumberTests {
    @AfterClass
    public static void afterClass() {
        Reporter.loadXMLConfig("src/main/java/XMLFiles/extendReportSet.xml");

        Reporter.setSystemInfo("QA Tester : ", "Sefa Kucukarslan");
        Reporter.setSystemInfo("Application name : ", "Your Store Test  ");
        Reporter.setSystemInfo("Operating System Info", System.getProperty("os.name"));
        Reporter.setSystemInfo("Department", "QA");
        Reporter.setTestRunnerOutput("Test execution Cucumber Report");
    }
}

//Smoke Test : Bir uygulamanın en önemli fonksiyonlarının çalışıp çalışmadığını anlamak amacıyla,detaylara girmeden yapılan teste denir.
//Duman testi genellikle uygulamanın yeni sürümünün yayınlanması sonrasında kritik fonksiyonların kontrolü için gerçekleştirilir.

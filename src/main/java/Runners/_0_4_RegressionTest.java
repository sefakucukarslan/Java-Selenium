package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(

        tags = {"@RegressionTest"} //Register.feature'a ekledik. şuan o feature'ı test eder.
        ,
        features = {"src/test/java"},

        glue = {"stepDefinition"},

        plugin = { "pretty",
                "html:target/site/cucumber-pretty",
                "json:target/cucumber.json","html:target/cucumber-html-report","usage:target/cucumber-usage.json","" +
                "junit:target/cucumber-results.xml" },
        dryRun = false



)

public class _0_4_RegressionTest extends AbstractTestNGCucumberTests {
}

//Yazılım üzerinde yapılan herhangi bir değişiklik sonrası,uygulama kodunun bozulup bozulmadığını doğrulamak için
// ve bu değişikliğin yazılımın diğer alanlarını etkilemediğini test etmek amacıyla kullanılan bir test tipidir.
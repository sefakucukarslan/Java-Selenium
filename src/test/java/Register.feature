@RegressionTest
Feature:Register Test
  Scenario Outline: Create An Account

    Given Navigate to Website
    And click Sign in button
    And type email "<Email>"
    And click on Create an Account button
    And choose title
    And type firstname "<firstname>" and lastname"<lastname>"
    And type password "<password>"
    And type Company "<Company>"
    And type address "<address>"
    Examples:
      | Email | firstname | lastname | password | Company | address |

    |sefa@gmail.com|sefa|kucukarslan|sefa123|Software Tech.|Istanbul|
    |kisi1@gmail.com|kisi|kisisoyisim|kisi123|Amazon|California|
    |kisi2@gmail.com|kisi2|kisi2soyisim|kisi12345|Dell|Georgia|
Feature:Register Test
  Background:
    Given Navigate to Website
    And click Sign in button
    And type email "sefa@gmail.com"
    And click on Create an Account button

  Scenario:Person1
      And type firstname "Sefa" and lastname"Kucukarslan"

  Scenario:Person2
    And type Company "Software Tech."
    And type address "Istanbul"

  Scenario Outline: Person3
    And type firstname "<firstname>" and lastname"<lastname>"
    And type password "<password>"
    And type Company "<Company>"
    And type address "<address>"
    Examples:
      | firstname | lastname | password | Company | address |

      |Sefa|kucukarslan|sefa123|Software Tech.|Istanbul|
      |kisi|kisisoyisim|kisi123|Amazon|California|
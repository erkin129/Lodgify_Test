@smoke
Feature:Lodgify Price Search

  Scenario Outline:Price Search Using Slider
    Given User is on the Lodgify pricing page
    When User move Number of Results slider from 360 to 0
    Then User should see "50" result on Number of Result slider
    Then User should be able to see following prices depending on "<currency>" "<Ultimate>" "<Professional>" "<Starter>"
    Examples:
      | currency | Ultimate | Professional | Starter |
      | usd      | 525      | 375          | 64      |
      | gbp      | 414      | 294          | 51      |
      | eur      | 466      | 330          | 60      |





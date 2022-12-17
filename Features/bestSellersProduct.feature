Feature: searching best sellers
Scenario: searching best sellers in amazon

Given I am in amazon home page

When I click on the all button 
And I click on the best sellers button

Then I can see the list of best selling products successfully
Feature: Search and plance the order for products

Scenario: Search the produt in search in both home and offers

Given the user is on the Greencht landing page 
When user is searched with shortname "Tom" and extract acutal name of the product
Then user searched "Tom" short name into the offers page to check the product is avilable or not.
And verify both name are same or not

@Regression
Scenario Outline: Search the produt in search in both home and offers with different data

Given the user is on the Greencht landing page 
When user is searched with shortname <Name> and extract acutal name of the product
Then user searched <Name> short name into the offers page to check the product is avilable or not.
And verify both name are same or not

Examples: 

| Name  |
| Pot   |
| Beet  |


Feature: Search and add the product into cart 

@smoketest
Scenario Outline: Search and add the product into cart 

Given the user is on the Greencht landing page 
When user is searched with shortname <Name> and add the <Quantity>.
And click on add to cart then clicked proceed to check out
Then check add name into landing page is same or not.

Examples: 

| Name  | Quantity |
| Pot   |   5 		 |	
| Beet  |  10      |

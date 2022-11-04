Feature: discount during holidays

Scenario: Customer wants to aply for insurance during december
Given a customer during december
When I calculate the premium
Then I give a 10% discount 

Scenario Outline: Customer wants to aply for insurance during "<month>"
Given a customer during "<month>"
When I calculate the premium
Then I give a "<percentage>"% discount 

Examples:
| month    | percentage |
| december    | 10 |
| january    | 10 |
| october    | 5 |
| april    | 3 |

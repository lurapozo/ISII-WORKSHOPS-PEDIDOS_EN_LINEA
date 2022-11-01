Feature: Know if the customer have used the service before

Scenario: A customer wants to aply for a second insurance
Given: someone whpo already is a client
When: Before calculating insurance
Then: show "already has insurance"

Feature: Know if the id is invalid

Scenario: Customer gives invalid id
Given: invalid id
When: Before calculating insurance
Then: show -1

Feature: discount during december

Scenario: Customer wants to aply for insurance during december
Given a customer during december
When I calculate the premium
Then I give a 10% discount 

Feature: discount during holidays

Scenario: Customer wants to aply for insurance during "<month>"
Given a customer during "<month>"
When I calculate the premium
Then I give a "<percentage>"% discount 

Examples:
| month    | percentage |
| december    | 10 |
| january    | 10 |
| october    | 5 |
| april    | 3 |

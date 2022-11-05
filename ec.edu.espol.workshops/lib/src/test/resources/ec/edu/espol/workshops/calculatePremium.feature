Feature: discount during holidays

Scenario: Customer wants to aply for insurance during december
Given a customer during december
When I calculate the premium
Then I give a 10% discount 

Scenario Outline: Customer wants to aply for insurance during "<month>"
Given a customer during "<month>"
When I calculate the premium
Then I give "<discount>"

Examples:
| month    | discount |
| december    | "Discount" |
| january    | "NO Discount" |
| october    | "Discount" |





Feature: Know if the id is invalid

Scenario: Customer gives invalid id
Given a customer with false id
When I calculate insurance
Then show -1

Scenario Outline: Customer gives valid or "<validated>" id
Given a customer with "<validated>" id
When I calculate insurance
Then show "<answer>"

Examples:
| validated    | answer |
| true    | 1 |
| false    | -1 |





Feature: Know if the customer have used the service before

Scenario: A customer wants to aply for a second insurance for the second time
Given someone who already is a client
When Before calculating insurance
Then show "already has insurance"

Scenario Outline: A customer wants to aply for an insurance for the "<time>" time
Given a customer who comes for the "<time>" time
When I see if the customer has insurance
Then show "<validation>"

Examples:
| time    | validation |
| first    | "new customer" |
| second    | "already has insurance" |
| third    | "already has insurance" |

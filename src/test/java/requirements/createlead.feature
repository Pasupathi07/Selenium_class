Feature: Create Lead
Background:
Given Open the chrome Browser
And Maximize the browser
And Set the Timeouts
And Load URL
And Enter the Username as DemoSalesManager
And Enter the Password as crmsfa
And Click on Login Button
And Click on CRM/SFA
And Click on Create Lead

Scenario Outline: TC001 Creating a new lead
And Enter the company name as <companyname>
And Enter the Firstname as <firstname>
And Enter Lastname as <lastname>
When User click  on Create Lead Button
Then Verify whether the new lead has been created
Examples:
|companyname|firstname|lastname|
|Visa|Pasupathi|N|
|MasterCard|Karthi|P|
|AMEX|Sathish|J|
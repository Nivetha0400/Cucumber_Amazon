Feature: Add new Customer in NopCommerce site

Background: 
Given User enter into the NopCommerce site
When User enter the username into the Username field
And User enter the password into the password field
When User Click the login button
Then User landed on the Homepage



Scenario: Add New Customer
When User Click the customer
And User click the customers
And User enter the  emailId 
And User enter the password
And User Enter the firstname
And User enter the lastname
And User click the gender
And User select the month and day of their date of birth
And User enter the company name
And User click is tax exembt
And User enter the customer role
And User click the manage of vendor
And User click the active
And User enter the comments
When User click save button
And user go back to Homepage
When User click log out



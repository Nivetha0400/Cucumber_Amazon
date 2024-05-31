Feature: Buy one product from Amazon

Scenario: User Login into the Amazon Page
Given User Enter into the Amazon Home Page
When  User Click the Sign In Button
And User Enter the Valid UserName "916369547837"
And User Click the SignIn1 Button
And User Enter the Valid Psssword "nivetha0412"
And User Click the Continue Button
Then User Landed on the Amazon Home Page

Scenario Outline: User Search one Product then add the Product into Cart
When User Click the Search Bar
And User Enter the required Product name"<watch>"into it
And User Click the Search Button
And User Click the Product
And User Click the Add to Cart Button
Then Product added into the Cart
And User Close the current page And User Clear the Searchbar

Examples:
     |watch|
     |earbuds|
    

Scenario Outline: User Buy the Product
When User Click the Cart 
When User Click Proceed to Pay
And User Click the Use The Address
And User Click the Credit Or Debit
And User Click Enter the Card Details
And User Enter the Card Number
And User Click the Enter details
Then User landed on the CheckOut Page




Feature: Facebook Login

Scenario: User login with Username And Password in Facebook Page

Given User landed on the Facebook page

When User enter the Username into the Username Field 

And User enter the Password into the Password Field 

And User Click the Login button

Then User landed on the Facebook Home Page

Examples:

     |userName|passWord|
     |aaa|bbb|
     |CCC|ddd|
     |eee|fff|
     |ggg|hhh|

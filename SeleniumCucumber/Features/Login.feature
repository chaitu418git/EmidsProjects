Feature: Login
@sanity
Scenario: Successfull Login with Valid credentials
Given User Launch Chrome browser
And user opens URL "https://admin-demo.nopcommerce.com/login"
And user enters Email as "admin@yourstore.com" and password as "admin"
When user click on Login
Then page title should be "Dashboard / nopCommerce administration"
When user click on Logout link
Then page title should be "Your store. Login"
And close browser 

@regression
Scenario Outline: Successfull Login with Valid credentials
Given User Launch Chrome browser
And user opens URL "https://admin-demo.nopcommerce.com/login"
And user enters Email as "<uname>" and password as "<password>"
When user click on Login
Then page title should be "Dashboard / nopCommerce administration"
When user click on Logout link
Then page title should be "Your store. Login"
And close browser 
Examples:
|uname|password|
|admin@yourstore.com|admin|
|admin@yourstore.comm|admin1|
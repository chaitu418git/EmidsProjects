Feature: Customers
@sanity
Scenario: Add a new Customer 
Given User Launch Chrome browser
 And user opens URL "https://admin-demo.nopcommerce.com/login"
 And user enters Email as "admin@yourstore.com" and password as "admin"
 When user click on Login
 Then user can view Dashboard 
 When user click on Customers Menu
 And click on customers Menu Item
 And user landed on Customers Page
 And click on Add New Button
 Then user can view Add new customer page
 When user enters customer info
 And click on save button
 Then user can view confirmation message as "The new customer has been added successfully."
 And close browser
 
 @regression
 Scenario: Search customer by Emailid
 Given User Launch Chrome browser
 And user opens URL "https://admin-demo.nopcommerce.com/login"
 And user enters Email as "admin@yourstore.com" and password as "admin"
 When user click on Login
 Then user can view Dashboard 
  When user click on Customers Menu
 And click on customers Menu Item
 And user landed on Customers Page
 And user entered email in Email field
 When user click on Search button
 Then search results related to email will be displayed
 And close browser
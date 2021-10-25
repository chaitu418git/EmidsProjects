Feature: Validating Place API's
@AddPlace
Scenario Outline: Verify place is added succesffuly with Add Place API
Given AddPlace API request with <accuracy> "<name>" "<phone_number>" "<address>" "<website>" "<language>" 
When user submit "AddPlaceAPI" the "POST" http request
Then user should be able to see a standard successful response with the status code of '200'
And verify that the response is received in less than 3 seconds
And verify "status" in response body is "OK"
And verify "scope" in response body is "APP"
And Verify "placeid" displays matches with DB reesult
Examples:
|accuracy| |name| |phone_number| |address| |website| |language| 
|50|       |chaitunew| |7353656986| |test street| |chaitu.com| |English|
#|100|   |hellotest| |9876098712| |janipet| |hello.com| |French|

#Scenario: Verify GetPlaceAPI response for a placeid
#Given GetPlaceAPI request with placeid
#When user submit "GetPlaceAPI" the "GET" http request
#Then user should be able to see a standard successful response with the status code of '200'
#And verify "name" in the respone maps to "<name>" requestParameter name

@DeletePlace
Scenario: Verify DeletePlaceAPi response for a placeid
Given DeletePlaceAPI request with placeid
When user submit "DeletePlaceAPI" the "POST" http request
Then user should be able to see a standard successful response with the status code of '200'
And verify "status" in response body is "OK"


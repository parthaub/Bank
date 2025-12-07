@Smoke @Regression @Function
Feature: Test login function 

Description: As register user can login with valid credential and check their account details. 

Background:
Given Open browser
And Add URL

@Positive @TC11
Scenario: Login with valid credential 
When Enter valid username
And Enter valid password
And Click login button
Then Login successful and see logout button

@Negative @TC12
Scenario: Login with invalid credential 
When Enter invalid username
And Enter invalid password
And Click login button
Then Login fail and see error message

@Negative @TC13
Scenario: Login with invalid username and valid password credential 
When Enter invalid username
And Enter valid password
And Click login button
Then  Login fail and see error message

@Negative @TC14
Scenario: Login with valid username and invalid password credential 
When Enter valid username
And Enter invalid password
And Click login button
Then  Login fail and see error message

@Negative @TC15
Scenario: Login with empty credential 
When Enter empty username
And Enter empty password
And Click login button
Then  Login fail and see error message

@Negative @TC16
Scenario: Login with empty username and valid password  
When Enter empty username
And Enter valid password
And Click login button
Then  Login fail and see error message

@Negative @TC17
Scenario: Login with valid username and empty password  
When Enter valid username
And Enter empty password
And Click login button
Then  Login fail and see error message

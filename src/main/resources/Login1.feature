@Smoke @Regression @Function
Feature: Test login function 



Description: As register user can login with valid credential and check their account details. 

@Positive @Negative
Scenario Outline:  Check login with valid and invalid credentials



Given Open browser 
And Add URL
When Enter username "<username>"
And Enter passwrod "<password>"
And Click login button
When check login status

Examples:

|    	username|   password		|
|		Batch44	|	student123@		|
|		atch44	|	tudent123@		|
|		atch44	|	student123@		|
|		Batch44	|	tudent123@		|
|				|					|
|			    |	student123@		|
|		Batch44	|					|


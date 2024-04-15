Feature: login functionalities
Background: common steps
Given user launch browser
When user launches url as "http://localhost/opencart/upload/admin/"


@tag1
Scenario: 1 login with valid credentials
Then user enter username as "admin"
Then user enter password as "admin"
Then click on login button
Then verify  as "Administration"

@tag2
Scenario: 2 login with valid credentials
Then user enter username and password
|username|password|
|admin   |admin   |

Then click on login button
Then verify  as "Administration"

@tag3
Scenario: 3 login with valid credentials
Then user enter username,password
|username|admin|
|password|admin|

Then click on login button
Then verify  as "Administration!"

@tag4
Scenario Outline: 4 login with valid credentials
Then user enter username as "<username>"
Then user enter password as "<password>"
Then click on login button
Then verify  as "Administration"
 
 Examples: dataprovider
 |username|password|
 |admin   |admin	 |	






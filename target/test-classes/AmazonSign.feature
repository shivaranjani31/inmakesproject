Feature: To validate the account creation of amazon application

Scenario: To create new account
Given To launch the browser and maximise the window
When To launch url of amazon application
And To click the account button

And To pass email or mobileno in email box
|8675445433|selenium@gmail.com|7639288001|
|shivaranjani@gmail.com|987654123|6554577543|
|inmakesinfo@gmail.com|9626284611|6655456578|
|8997565453|cucumberframe@gmail.com|ammushiva33@gmail.com|

And To click continue button 

And To create new password using new password text box
|hgafha@1|ahjakha%12|ddjahdha&9|
|ewehfi@1|a%12dwffwe|123345@ah|
|uuafh123|ahjha%12|dddha&9|
|afgfg&123|ahj@123Agh|AMMahdh098|

And To click the sign in button
Then To close the chrome browser

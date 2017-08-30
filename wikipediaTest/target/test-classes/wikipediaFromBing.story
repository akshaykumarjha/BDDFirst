Narrative:
In order to launch Wikipedia through Bing
As a developer
I want to use Behaviour-Driven Development for it
					 
Scenario:  Launch Wikipedia from Bing
Given the user arrives at the Bing Page
When the user enters <resultPage> in the search field
And the user clicks on the search button
And the user clicks on the first link
Then the user should reach the <resultPage> Page

Examples:
|resultPage|
|Wikipedia|
|Google|

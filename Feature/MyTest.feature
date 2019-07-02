Feature: Reset functionality on login page of Application 
Scenario: Verification of reset button 
	Given Open the browser and launch the application 
	When Enter Username and password
	  |username  |password  |
	  |7040007049|kailas0101| 
	  |jakhotiyaabhishek@gmail.com|Abhishek@123|
	  |7020934512|kailas1010|
	  |7020934512|kailas1010|
	  |7020934512|kailas1010|
	  
	Then click on submit button
 	

Scenario: Product add to cart
    Given Search product on search bar
    When click on add to cart
    Then product should added on cart
    
Scenario: This to hover the element 	
 	Given should be login user
    When hovor the mouse on login
    Then click on logout button
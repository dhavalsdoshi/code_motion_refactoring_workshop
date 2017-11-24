# code motion refactoring workshop

## Steps to setup
* Make sure you have java(version 1.8) installed on your machine
* Make sure you have maven on your machine and is in your path
* Try to run cmd `mvn clean test`
  * Make sure the build is successful with two tests passing
* Open the project in you an IDE
  * IntelliJ Idea 
  * Eclipse
* Try to run calculatorTest from the IDE
  * Make sure two tests pass


###Extension Part 2:

Business is doing great! To cater to bigger groups and make my accommodation cheaper, I have added rooms with 12 beds. The prices are as follows: 
* For room with 4 beds, price per bed is 20€. If you want to book the whole room, then for each empty bed, you pay 10€ 
* For room with 8 beds, price per bed is 15€. If you want to book the whole room, then for each empty bed, you pay 5€
* For room with 12 beds, price per bed is 12€. If you want to book the whole room, and then for each empty bed, you pay 5€
* At a time, you can only book 12 or less beds.
* All other charges remain the same

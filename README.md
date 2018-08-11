# PicoyPlacaPredictor
Predicts based on an integer representing a license plate, String date and a local Time object, wheter a car can transit following Ecuadorian Pico y Placa rules. 

## Assumptions
License plates are fed as integers based on requirements so only numbers are allowed
Based on research these license plates are only allowed to have between 3 and 5 digits
http://www.worldlicenseplates.com/world/SA_ECU1.html

Date parameters are strings and so would be ideally formatted as "Monday, 11 of December of 2018". Not having the day name on the date will cause a InvalidDateException.

A local Time object was created to have an easy Time Class that had setters and getters for hours, minutes and seconds. Although seconds are not neccesary for Pico y Placa checking. This was due to the Time java.sql object was deprecated and so was not used, and the other inbuilt time objects in Java require the creation of a full date so it was believed to include to much repetition. 

You can use the Main class argument function to feed the program parameters. 
<br>
0: License plate
<br>
1: Date
<br>
2: Hour
<br>
3: Minute
<br>
4: Seconds
<br>
Assuming that the license plates and time parameters are integers. If fed incorrect time parameters an invalid time exception will occur.
<br>
Javadoc comments have been added to explain each class and method.


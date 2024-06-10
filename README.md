# Final-Exam-IMAD

NAME:ATLEGANG PEDINYANE
STUDENT NUMNER:ST10454437

PSUEDOCODE
// Splash Screen
SplashScreen:
displayAppName ("WeatherApp") displayDeveloperName ("Your
Name")
displayStudentNumber ("Your
Student Number")
displayLogo("path/to/logo.png")
button ("Go to Main Screen",
navigateTo(MainScreen))
button ("Exit App", exitApp())
// Main Screen
MainScreen:
initialize weeklyTemperatureArray[7]
initialize weeklyConditionsArrayl7]
displayTextBox ("Input
Temperature for Day 1")
displayTextBox ("Input
Temperature for Day 2)
displayTextBox"Input
Temperature for Day 3")
displayTextBox("Input
Temperature for Day 4")
displayTextBox ("Input
Temperature for Day 5")
displayTex & ("Input
Temperature for vay 6")

displayTextBox ("Input
Temperature for Day 7")
button ("Submit Data", submitTemperatureData ())
function
submitTemperatureData () :
for i from 0 to 6:
if inputTemperature (1)
is not valid:
displayMessage("Invalid input.
Please enter numeric values.")
return
weeklyTemperatureArray[i] =
inputTemperature (i)
averageTemperature =
calculateAverageTemperature (weekly-TemperatureArray)

displayAverageTemperature (average-Temperature)
function
calculateAverageTemperature (temper-atureArray) :
total = 0
for temp in
temperatureArray:
total = total + temp
return total /
length (temperatureArray)
button ("Go to Detailed View" navigateTo (DetailedViewScreen) )
button ("Clear Data"
clearTemperatureData())
button ("Exit App"
, exitApp())
function clearTemperatureData (:
for i from o to 6:
weeklyTemperatureArray［i］ = 0
weeklyConditionsArray[i] = ""
clearTextBoxes ()

// Detailed View Screen
DetailedViewScreen:
for i from 0 to 6:
displayDayDetaili,
weeklyTemperatureArray[il,
weeklyConditionsArray[i])
button ("Back to Main Screen"
navigateTo(MainScreen) )
function displayDayDetail(dayIndex, temperature, condition):
displayText ("Day " + (dayIndex
+ 1))
displayText ("Temperature: " + temperature)
displayText ("Condition: " + condition)
// Navigation Functions
function navigateTo(screen) :
if screen == MainScreen:
show MainScreen
else if screen ==
DetailedViewScreen:
show DetailedViewScreen
else if screen == SplashScreen:
show SplashScreen

// Error Handling
function
inputTemperature (dayIndex) :
temp =
getTextBoxValue (dayIndex)
if temp is numeric:
return temp else:
return "invalid"




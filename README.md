Practium

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
STOP

SCREENSHOTS
SCREEN 1

![SCREEN 1](https://github.com/Atlii-Angiie/Final-Exam-IMAD/assets/162302010/b617daf9-93ea-4e4c-8aeb-5ea85789941a)

![SCREEN 1 CODE](https://github.com/Atlii-Angiie/Final-Exam-IMAD/assets/162302010/f86e5d00-3c65-42e9-bbb7-6d2449a4bc72)

SCREEN 2

![SCREEN 2](https://github.com/Atlii-Angiie/Final-Exam-IMAD/assets/162302010/28872953-5e9f-416d-b84d-2ba92cd105a9)

![SCREEN 2 CODE](https://github.com/Atlii-Angiie/Final-Exam-IMAD/assets/162302010/5b541d61-bfcb-45f7-b0f7-7028de5aaeaf)

![SCREEN 2 CODE 2PNG](https://github.com/Atlii-Angiie/Final-Exam-IMAD/assets/162302010/9e2830b4-411e-4d5e-9830-954d59fc7ba6)

SCREEN 3

![SCREEN 3](https://github.com/Atlii-Angiie/Final-Exam-IMAD/assets/162302010/0420c02e-b081-452d-9796-d2fb5bd88c74)

![SCREEN 3 CODE](https://github.com/Atlii-Angiie/Final-Exam-IMAD/assets/162302010/28b68d64-c517-4e04-a4b8-04b921244fc8)

![SCREEN 3 CODE 2 ](https://github.com/Atlii-Angiie/Final-Exam-IMAD/assets/162302010/be35eb56-b31d-48c4-ae1b-007bce78e5f4)












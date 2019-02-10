# java4roadmap
hello, 
my name is Kseniya and I am learning java =)
## task 1 
### What is the program does
Based on the age and relaxed heart rate, calculate the permissible pulse values in cardio-zones, using the formula described by this (http://adidas.lifehacker.ru/2013/09/12/chto-takoe-chss-i-kak-rasschitat-svoyu-celevuyu -zonu-pulsa /) article.
### Project structure
FileHelper.java - class with OpenInputFile and WriteOutputFile methods
Main.java - the main class. There is all calculations are happens.
inputFile.txt - file with input date. The first value is age, the second is relaxed heart rate
outputFile.txt - file with results
### How to run the project
1. Clone the repository on your own computer or download zip and unpack it
2. Change inputFile.txt if needed
3. Open Terminal in the project's folder
4. Сompile the project:
```
javac -sourcepath ./src/ -d bin src/task1/Main.java
```
6. Run the project:
```
java -classpath ./bin task1.Main
```
7. Check outputFile.txt file

## Readme.md File

1. Write a function that takes in a list of integers as an argument
and returns true if it contains two integers that are the same, false
otherwise.

First solution: Nested Loop
For this code, I created 2 for loops, in a nested for loop with two different vairables for each loop. After the outer loop, I declared a encounter variable to show the amont of times a value would appear in the list. Logically, each value would at least show up once, but if it appears multiple times, specifically 2, its encounter counter would eqaual 2. In the inner loop, I do the comparison to compare one value to all values in the and if it encounters itself, the encounter counter will increase by one. When the inner loop ends, the encounters will be checked to see if it equals 2, if it does, it'll return true and false if not. 

Second solution: Set 
**I honestly don't remember the Set example from class and since it's been a while since I've used python, I'm using this video for examples of 
[Python Sets] (https://www.w3schools.com/python/python_sets.asp)

This one is fairly similiar in build, besides some python syntax. I changed  "one_loop" in the starter code to "set" to match the use of a set and most of the code followed similar structure to the java code. Two for loops that happen to be nested have different values, with the # of encounters in the center to reset after every value. It checks to see if any value is the same to the current value and increments. Returns True if it gets up to 2 and False if not. 

Trade offs: Sets can store all types of values in the python code, but it is limited to strictly Lists of Integers in the Java code, so we loose versitility in the Java code. Sets cannot be changed so I couldn't take "23" and assign it to "12" for example, it would need to be removed and replaced with adding 12, which is something that can be done through Java lists with "set(int index, Object element)".

# SaveEnvironment

the object of the game is to make the sum of the array 0 or less than 0 with the least cost.
you are allowed only 2 functions: x and y, where x costs 2 energy points and y costs 5 energy points

function x: cost = 2 energy points ....works by reducing the value of the element to 0
Ex. given the array [3, 2, 5, 8, 3] , if we applied function x to element 1...current value is 2. 
it will become 0, now making the array look like: [3, 0, 5, 8, 3] 

function y: cost = 2 energy points ....works by reducing the value of the element to 0
Ex. given the array [3, 2, 5, 8, 3] , if we applied function x to element 1...current value is 2. 
it will become 0, now making the array look like: [3, 0, 5, 8, 3] 

Ex. given the array [3, 2, 5, 8, 3] you need to make the sum of all the elements 0 or less than 0
right now : 3+2+5+8+3 = 21 

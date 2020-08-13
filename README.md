# SaveEnvironment

<br>the object of the game is to make the sum of the array 0 or less than 0 with the least cost</br>
<br>you are allowed only 2 functions: x and y, where x costs 2 energy points and y costs 5 energy points</br>

function x: cost = 2 energy points ....works by reducing the value of the element to 0
Ex. given the array [3, 2, 5, 8, 3] , if we applied function x to element 1...current value is 2. 
it will become 0, now making the array look like: [3, 0, 5, 8, 3] 

function y: cost = 5 energy points ....works by inverting the value of the element to its negative
Ex. given the array [3, 2, 5, 8, 3] , if we applied function x to element 4...current value is 3. 
it will become -3, now making the array look like: [3, 2, 5, 8, -3] 


So, using these 2 function the player must make the sum of the array 0 or less than 0 with the least cost.
Ex. given the array [3, 2, 5, 8, 3] you can perform function x to element 1 and function x to element 4.
sum right now : 3+2+5+8+3 = 21 
cost right now: 0

sum after function x to element 1 and function x to element 4: 3+0+5+8+(-3) = 16
cost after function x to element 1 and function x to element 4: 2 + 5 = 7

the player is competing with the algorithem (i wrote) which can produce a sum of 0 in the least cost
In order to win, the player must use the same energy points as the algorithm.

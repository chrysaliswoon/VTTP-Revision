# Revision Tasks

## While Loops: Reps and Reps 

### 1

Write a *while* loop that will log in the console

```
'Ginger chocolate honey patties'
```

1000 times. You can test it out with a smaller number first, such as 10, and when that works, use 1000.

Make sure you do not run an infinite loop! If you do, close your Terminal. Oops!


### 2

Write another *while* loop that counts from 0 to 1000 and will log in the console the current loop number.

> => 0
>
> => 1
>
> => 2
>
> => 3

etc.

### 3

Write another *while* loop that prints a message to the console _and_ concatenates the current loop number. Make it count from 0 to 1000.

> => "Current loop number is: 0"
>
> => "Current loop number is: 1"
>
> => "Current loop number is: 2"
>
> => "Current loop number is: 3"


**NOTE:** You should not need to see the 'correct answers' in this markdown for these loops. Either they work, or they don't. **Test** them thoroughly to make sure they are giving you the desired output.

## For Loops 

### 1
* Write a **for loop** that counts from 0 to 100 and console.logs each number.

### 2
* Write another **for loop** that counts from 7 to 635 (no more, no less!), and console.logs each number.

### 3
* Declare a variable `let start = 0`
* Declare a variable `const limit = 100`
* Write a for loop that counts from the value of `start` to the value of `limit`, using those variables in the **control panel** of the loop.

Test the loop thoroughly.

### 4
* Think of something in real life, or nature, or wherever / whenever that displays **looping** behavior.

Use a **for loop** to model the looping behavior of that thing.

Where does the loop begin? Where should it end? Does it simply count from one number to another? Or does it change or mutate data?

<br>

### Section 3

#### While loops

Increase your **code literacy** by reading code, line by line.

#### Infinite loop?

Read the following code very carefully.

**DO NOT RUN** the code because it _might_ run an **infinite loop**

Infinite loops can sometimes be hard to stop and may require you to reboot your computer. Being able to determine whether you've created an infinite loop _before_ running your code is a handy skill to have

**Answer:**

- Is the code below an infinite loop? Why or why not?
- Don't worry about getting it 'wrong' - you'll be graded on your reasoning, not if your ultimate answer is correct.

You should **NOT** test (run) this code, so read it line by line and 'execute' the code in your head.

```js
while (true) {
  console.log("Do not run this loop");
}
```

#### Infinite loop II

- is this loop an infinite loop? Why or why not?

 <!---  [comment]: <> (`const` will throw an error - let the students spot this)-->

```js
const runProgram = true;

while (runProgram) {
  console.log("Do not run this loop");
  runProgram = false;
}
```

**Answer:**

Infinite or not infinite? What is the expected output?

#### Reading code

Ok rest easy, no more infinite loops for now!

The following while loop uses a [compound assignment](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Assignment_Operators) operator, i.e. `+=`

_Without running this loop_, what is the expected output?

Read the code line by line-- everything happens in sequence. Write down what you think the code will log in the Terminal by adding comments before each line of code, explaining what that line of code will do. Be patient with your thought! There is no rush.

**Example:**

```js
let q = 20;

// start a while loop that will run as long as q is greater than 10
while (q > 10) {
  // prints the value of q to the screen/Terminal window
  console.log(q);
  // decrements the value of q by 1
  q--;
  // closes the while loop, the code inside this loop will keep running until the while condition is evaluated to false
}
```

**Code:**

```js
let letters = "A";
let i = 0;

while (i < 20) {
  letters += "A";
  i++;
}

console.log(letters);
```

- Copy the above code into your `.js` file
- Add a comment for each line, like the above example
- Write a comment with your expected result
- Run the code
- Write another sentence confirming whether the code was what you expected. If it isn't what you expected, don't change what you wrote about your expected result. Rather write one sentence explaining what you learned. Remember the goals are to learn how to code, how to think critically, how to fix bugs, and learn from mistakes. [Try to adapt to the growth mindset](https://www.brainpickings.org/2014/01/29/carol-dweck-mindset/) (Bonus reading)

<br>
<hr>

### Section 4

#### For loops

**Answer:**

- A for loop performs the same operation as a while loop. But what are the key differences, if any? What are the similarities?

#### For loop control panel

Here is an example for loop that prints a message 100 times:

```js
for (let i = 0; i < 100; i++) {
  console.log("Without you, today's emotions are the scurf of yesterday's");
}
```

**Answer:**

What are the three components of the **control panel**? Each component is separated by a semicolon `;`.

Remember: Write your answers as comments in the file.

- The first part of the control panel is:
- The second part of the control panel is:
- The third part of the control panel is:

#### For loop II

Write a for loop that will console.log the numbers 0 to 999.

**Bonus Challenge (optional):**

What is the difference between `\` (`backslash`, above the `enter`/`return` key) and `/` (`forward slash` or just `slash`, shares the key with the `?`)?
What is `\` doing in the string?

```js
console.log("Without you, today's emotions are the scurf of yesterday's");
```

```js
console.log("Without you, today's emotions are the scurf of yesterday's");
```

#### For loop in reverse

**Code:**

Using a [postfix operator](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Arithmetic_Operators) `i--` instead of `i++`, write a _for_ loop that iterates in _reverse_. Console.log a countdown from 999 to 0.

#### More counting

Write a _for_ loop that uses **string concatenation** to send a message to the console as well as the current value of `i`.

The loop should run from 1 to 10.

Expected Result:

```
The value of i is: 1 of 10
The value of i is: 2 of 10
The value of i is: 3 of 10
The value of i is: 4 of 10
The value of i is: 5 of 10
The value of i is: 6 of 10
The value of i is: 7 of 10
The value of i is: 8 of 10
The value of i is: 9 of 10
The value of i is: 10 of 10
```

**Bonus Challenge (optional):**

Rewrite the above loop using [String Interpolation/Template Literals](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Template_literals) instead of **concatenation**

Note: string interpolation uses `backticks`, this is a different character than a single quote. The `backtick` can usually be found above the left `tab` key/below the `esc` key and it shares it with the `tilda` `~`

## Iteration

```js
const StarWars = ["Han", "C3PO", "R2D2", "Luke", "Leia", "Anakin"];
```

- Iterate over the `StarWars` array and print each element to the console.

- Iterate over the `StarWars` array again and print each character's name **as well as** the value of `i`.

**Bonus Challenge (optional):**

- Figure out how to iterate over **every second** element of the `StarWars` array, starting with the first element.

> => Han, R2D2, Leia

<br>

#### Learning Objectives

- Practice using conditionals and / or loops to solve problems

## Directions
Write loops, `if`, or `if, else` statements to complete the following questions. Some of the problems may require you to use a loop inside the conditional. Refer back to your class notes from today if you need help.

## Conceptual Questions

Rate your understanding of the following questions on a scale of 1 - 5. If your understanding is less than or equal to 3, research the answer or ask for help:

1. How do we assign a value to a variable?
  - Which line(s) is/are valid?

    ```js
    let a = 0;
    const b = 1;
    9 = a;
    b = b + 5;
    ```

2. How do we change the value of a variable?
3. How do we assign an existing variable to a new variable?

## Let's get Mathy!

```js
const a = 42.78
const b = 1.1
const c = -2
const d = .5
const e = 16
```

- Round `a` down
- Round `b` up
- Find the absolute value of `b - a`
- Find the largest number of `a, b, c, d, e`
- Find the smallest number of `a, b, c, d, e`
- Find the square root of `e`
- Raise `e` to the power of `d`
- Make a digital die 0 generate a random number between 1 - 6 

## Strings Activity 1

### Strings - Switcharoo
1. Create a variable called `firstVariable`.
1. assign it the value of a string: `"Hello World"`
1. On the next line, change the value of this variable to a number.
1. store the value of `firstVariable` into a new variable called `secondVariable`
1. On the next line, change the value of `secondVariable` to a string.
1. What is the value of `firstVariable`?

### Strings - Combine it
1. Create a variable called `yourName` and set it equal to your name as a string.
  - Write an expression that takes the string "Hello, my name is " and the variable `yourName` so that it prints a new string with them concatenated

>ex: `Hello, my name is Jean Valjean`

## Booleans Activity
- Using the provided variable definitions, replace the blanks with a mathematical or boolean operator **that evaluates the expression to true**.

[MDN Comparison Operators](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Comparison_Operators)

```
  const a = 6;
  const b = 100;
  const c = -5;
  const d = 3000;
  const e = 'Jelly Bean';
```

1.  a _ b;
1.  c _ d;
1.  'Peanut' _ 'Peanut';
1.  a _ b _ c;
1.  a _ a _ d;
1.  e _ 'Jelly Bean';
1.  48 _ '48';
1. 'e' _ 'Eh'

...


## The Farm
1) Write code that will print out "mooooo" if the variable `animal` is equal to `cow`.

2) Change your code so that if the variable `animal` is anything other than a cow, your should print out "Hey! You're not a cow."

## Driver's Ed

1) Write a variable that will hold a person's age.

2) Write code that will print out "Here are the keys", if the age is 16 years or older.

3) Change your code so that if the age is younger than 16, a message will print "Sorry, you're too young."

## Just Loop It
1) Write code that will print out all the numbers in the range 0 - 10.

2) Write code that will print out all the numbers in the range  500 - 50.


## Let's get odd
1) Print out the odd numbers that are within the range of 1 - 100.

2) Adjust your code to add a message next to the odd number that says: "is an odd number".

>Example Output:
```
3 is an odd number
5 is an odd number
7 is an odd number
```

## Give me Five
1) For the numbers 0 - 100, print out "I found a `number`. High five!" if the number is a multiple of five.

>Example Output:
```
I found a 5. High five!
I found a 10. High five!
```

2) Add to the code from above to print out "I found a `number`. Three is a crowd" if the number is a multiple of three.

>Example Output:
```
I found a 3. Three is a crowd
I found a 5. High five!
I found a 6. Three is a crowd
I found a 9. Three is a crowd
I found a 10. High five!
```

**Bonus** : You're close to solving [Project Euler](https://projecteuler.net/problem=1) problem 1! If you didn't get to solve it yet, go for it today!

## Savings account
1) Write code that will save the sum of all the numbers between 1 - 10 to a variable called `bank_account`.

>Check your work! Your banck_account should have $55 in it.

2) You got a bonus! Your pay is now doubled each week. Write code that will save the sum of all the numbers between 1 - 100 multiplied by 2.

>Check your work! Your banck_account should have $10,100 in it.


#Optional

## Fibonacci
Fibonacci is a classic example in coding. Its name will appear often. In its essence, it is adding numbers together in a specific sequence. Don't let the inherent 'mathyness' or fancy name scare you. You've got this!

Here are some sequences, can you figure out the next number? Can you figure out the pattern so you could write a loop to generate these?:

1, 2, 3, 4

Here is another one:

2, 4, 6, 8

And another:

5, 10, 15, 20

and one more:

2, 4, 8, 16, 32

Fibonacci is just another sequence of numbers.

Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:


```
1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...


1 + 2 = 3
2 + 3 = 5
3 + 5 = 8
8 + 5 = 13
```

Can you see the pattern?

Think about how you would create that pattern using JavaScript
<br>

Here is the challenge: By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

Fun fact! Fibonacci appears often in nature. [Check it out](xhttp://jwilson.coe.uga.edu/emat6680/parveen/fib_nature.htm)  

Feeling overwhelmed?

- Start with some pseudoecode!
- First just try to console.log the first 10 Fibonacci numbers
- Try thinking of the smallest step, solve it and then find the next step to take

## Checkerboard

Set a checkerboard size to a variable

```js
const boardSize = 8;
```

Now, using what you know about control flow, build a checkerboard

```
 # # # #
# # # #
 # # # #
# # # #
```

You should be able to change the variable `boardSize` and generate a larger or smaller grid

```js
const boardSize = 20;
```

Should now generate:

```
 # # # # # # # # # #
# # # # # # # # # #
 # # # # # # # # # #
# # # # # # # # # #
 # # # # # # # # # #
# # # # # # # # # #
 # # # # # # # # # #
# # # # # # # # # #
 # # # # # # # # # #
# # # # # # # # # #
```


## Hungry for More?
Sign up for [Project Euler](https://projecteuler.net/problem=1) and start tackling the problems.

Try out some [Project Euler](https://projecteuler.net/archives) problems. Specifically try out numbers 1 & 2.

[How about Kaprekars Constant?](https://coderbyte.com/editor/guest:Kaprekars%20Constant:JavaScript)

<br>
<hr>

### Section 3
#### While loops

Increase your **code literacy** by reading code, line by line.

#### Infinite loop?

Read the following code very carefully.

**DO NOT RUN** the code because it _might_ run an **infinite loop**

Infinite loops can sometimes be hard to stop and may require you to reboot your computer. Being able to determine whether you've created an infinite loop _before_ running your code is a handy skill to have

**Answer:**

* Is the code below an infinite loop? Why or why not?
* Don't worry about getting it 'wrong' - you'll be graded on your reasoning, not if your ultimate answer is correct.

You should **NOT** test (run) this code, so read it line by line and 'execute' the code in your head.

```js
while (true) {
	console.log('Do not run this loop');
}
```

#### Infinite loop II

* is this loop an infinite loop? Why or why not?

 <!---  [comment]: <> (`const` will throw an error - let the students spot this)-->

```js
const runProgram = true;

while (runProgram) {
	console.log('Do not run this loop');
	runProgram = false;
}
```

**Answer:**

Infinite or not infinite? What is the expected output?


#### Reading code

Ok rest easy, no more infinite loops for now!

The following while loop uses a [compound assignment](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Assignment_Operators) operator, i.e. `+=`


_Without running this loop_, what is the expected output?

Read the code line by line-- everything happens in sequence. Write down what you think the code will log in the Terminal by adding comments before each line of code, explaining what that line of code will do. Be patient with your thought! There is no rush.

**Example:**

```js
let q = 20;

// start a while loop that will run as long as q is greater than 10
while (q > 10){
  // prints the value of q to the screen/Terminal window
  console.log(q)
  // decrements the value of q by 1
  q--
// closes the while loop, the code inside this loop will keep running until the while condition is evaluated to false
}
```

**Code:**

```js
let letters = "A";
let i = 0;

while (i < 20) {
	letters += "A";
	i++;
}

console.log(letters);
```

- Copy the above code into your `.js` file
- Add a comment for each line, like the above example
- Write a comment with your expected result
- Run the code
- Write another sentence confirming whether the code was what you expected. If it isn't what you expected, don't change what you wrote about your expected result. Rather write one sentence explaining what you learned. Remember the goals are to learn how to code, how to think critically, how to fix bugs, and learn from mistakes. [Try to adapt to the growth mindset](https://www.brainpickings.org/2014/01/29/carol-dweck-mindset/) (Bonus reading)

<br>
<hr>

### Section 4
#### For loops

**Answer:**

* A for loop performs the same operation as a while loop. But what are the key differences, if any? What are the similarities?


#### For loop control panel

Here is an example for loop that prints a message 100 times:

```js
for (let i = 0; i < 100; i++) {
	console.log('Without you, today\'s emotions are the scurf of yesterday\'s');
}
```

**Answer:**

What are the three components of the **control panel**? Each component is separated by a semicolon `;`.

Remember: Write your answers as comments in the file.

* The first part of the control panel is:
* The second part of the control panel is:
* The third part of the control panel is:

#### For loop II

Write a for loop that will console.log the numbers 0 to 999.

**Bonus Challenge (optional):**

What is the difference between `\` (`backslash`, above the `enter`/`return` key) and `/` (`forward slash` or just `slash`, shares the key with the `?`)?
What is `\` doing in the string?

```js
  console.log('Without you, today\'s emotions are the scurf of yesterday\'s');
```

```js
  console.log("Without you, today's emotions are the scurf of yesterday's");
```



#### For loop in reverse

**Code:**

Using a [postfix operator](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Arithmetic_Operators) `i--` instead of `i++`, write a *for* loop that iterates in *reverse*. Console.log a countdown from 999 to 0.


#### More counting

Write a *for* loop that uses **string concatenation** to send a message to the console as well as the current value of `i`.

The loop should run from 1 to 10.

Expected Result:

```
The value of i is: 1 of 10
The value of i is: 2 of 10
The value of i is: 3 of 10
The value of i is: 4 of 10
The value of i is: 5 of 10
The value of i is: 6 of 10
The value of i is: 7 of 10
The value of i is: 8 of 10
The value of i is: 9 of 10
The value of i is: 10 of 10
```

**Bonus Challenge (optional):**

Rewrite the above loop using [String Interpolation/Template Literals](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Template_literals) instead of **concatenation**

Note: string interpolation uses `backticks`, this is a different character than a single quote. The `backtick` can usually be found above the left `tab` key/below the `esc` key and it shares it with the `tilda` `~`

## Iteration

```js
const StarWars = ["Han", "C3PO", "R2D2", "Luke", "Leia", "Anakin"];
```

* Iterate over the `StarWars` array and print each element to the console.

* Iterate over the `StarWars` array again and print each character's name **as well as** the value of `i`.

**Bonus Challenge (optional):**

* Figure out how to iterate over **every second** element of the `StarWars` array, starting with the first element.

> => Han, R2D2, Leia

<br>
<hr>

# Arrays & Conditionals

Using combinations of arrays, loops, and conditionals to solve problems

#### Learning Objectives

- Practice using combinations of arrays, loops, and conditionals to solve problems

## Getting Started

- Use or Create the file `arrays_and_conditions.js` to write arrays, loops, `if`, or `if, else` statements to complete the following questions.
- Refer back to your class notes from today if you need help.


## Exercises

### Easy Does It
1. Create an array that contains three quotes and store it in a variable called `quotes`.

### Random
Given the following array `const randomThings = [1, 10, "Hello", true]`

1. how do you access the 1st element in the array?

2. Reassign the value of `"Hello"` to `"World"`.

3. Check the value of the array to make sure it updated the array.

### We've Got Class
Given the following array `const ourClass = ["Stan Lee", "Zoom", "Github", "Slack"]`

1. What would you write to access the 3rd element of the array?

2. Change the value of "Github" to "Octocat"

3. Add a new element, "Cloud City" to the array.

### Mix It Up
1. Given the following array `const myArray = [5 ,10 ,500, 20]`

1. Using the `push` method, add the string `"Egon"` to the end of the array.

1. Using a method, remove the string from the end of the array.

1. Using the `unshift` method, add the string `"Bob Marley"` to the beginning of the array

1. Using a different method, remove the string from the beginning of the array

1. Use the reverse method on this array

### Biggie Smalls
Write an `if..else` statement that iterates over the `myArray` array declared above:

1. console.log `little number` if the number is entered is less than **100**

2. If the number entered is 100 or more, alert `big number`.

### Monkey in the Middle
Write an `if...else if...else` statement:

1. console.log `little number` if the number entered is less than **5**.<br>

2.  If the number entered is more than 10, log `big number`.

3. Otherwise, console.log "monkey". <br>

### What's in Your Closet?

Below, we've given you examples of Kristyn and Thom's closets modeled as data in JavaScript.

```javascript
const kristynsCloset = [
  "left shoe",
  "cowboy boots",
  "right sock",
  "GA hoodie",
  "green pants",
  "yellow knit hat",
  "marshmallow peeps"
];

// Thom's closet is more complicated. Check out this nested data structure!!
const thomsCloset = [
  [
    // These are Thom's shirts
    "grey button-up",
    "dark grey button-up",
    "light blue button-up",
    "blue button-up",
  ],[
    // These are Thom's pants
    "grey jeans",
    "jeans",
    "PJs"
  ],[
    // Thom's accessories
    "wool mittens",
    "wool scarf",
    "raybans"
  ]
];
```

1. What's Kristyn wearing today? Using bracket notation to access items in `kristynsCloset`, log the sentence "Kristyn is rocking that " + *the third item in Kristyn's closet* + " today!" to the console.

1. Kristyn can't find her left shoe. Remove this item from her closet and save it to a variable named `kristynShoe`.

1. Kristyn just bought some sweet shades! Add `"raybans"` to her closet **after `"yellow knit hat"`.**

1. Kristyn spilled coffee on her hat... modify this item to read `"stained knit hat"` instead of yellow.

1. Put together an outfit for Thom! Using **bracket notation**, access the first element in Thom's `shirts` array.

1. In the same way, access one item from Thom's pants array.

1. Access one item from Thom's accessories array.

1. Log a sentence about what Thom's wearing. Example: `"Thom is looking fierce in a grey button-up, jeans and wool scarf!"`

1. Get more specific about what kind of PJs Thom's wearing this winter. Modify the name of his PJ pants to `Footie Pajamas`.


### HFM

Write a loop that prints the numbers in order

```js
const twoDArray = [
  [9,8,7],
  [6,5,4],
  [3,2,1],
];
```
expect:
```
1
2
3
4
5
6
7
8
9
```
Try using `for of` loops instead of a regular `for` loop - does it make sense for this task?


### Wildly Ravenous For Even More

##### Spiral Path

Write a function called "spiral" that takes an NxM array as input and returns a "spiral" path through the array, starting in the upper-left corner and moving clockwise.  

For example, if

```ruby
array = [[1,2,3],
         [8,9,4],
         [7,6,5]]
```

then

```ruby
spiral(array) # => [1,2,3,4,5,6,7,8,9]
```

It should work on any NxM array, so don’t assume the input is a square array.  However, every row will have the same number of elements.

<details><summary> More Test Cases </summary>

```ruby         
a =
  [
    [1, 2, 3],
    [8, 9, 4],
    [7, 6, 5]
  ]

b = [
      [ 1,  2,  3,  4,  5,  6],
      [18, 19, 20, 21, 22,  7],
      [17, 28, 29, 30, 23,  8],
      [16, 27, 26, 25, 24,  9],
      [15, 14, 13, 12, 11, 10]
    ]

c = [
      [ 1,  2,  3,  4,  5,  6,  7,  8,  9, 10],
      [36, 37, 38, 39, 40, 41, 42, 43, 44, 11],
      [35, 64, 65, 66, 67, 68, 69, 70, 45, 12],
      [34, 63, 84, 85, 86, 87, 88, 71, 46, 13],
      [33, 62, 83, 96, 97, 98, 89, 72, 47, 14],
      [32, 61, 82, 95, 100, 99, 90, 73, 48, 15],
      [31, 60, 81, 94, 93, 92, 91, 74, 49, 16],
      [30, 59, 80, 79, 78, 77, 76, 75, 50, 17],
      [29, 58, 57, 56, 55 ,54, 53, 52, 51, 18],
      [28, 27, 26, 25, 24, 23, 22, 21, 20, 19]
   ]

e = [
      [1,2],
      [4,3]
    ]

f = [
      [1,2,3,4],
      [8,7,6,5]
    ]

g = [
      [1, 2],
      [10,3],
      [9, 4],
      [8, 5],
      [7, 6]
    ]

h = [
      [1,2,3,4]
    ]```

</details>

<br>
<hr>

## Getting Started

1. On your computer, create a directory in the `homework_submission/homework/w01d3` directory with your name. e.g. `homework_submission/homework/w01d3/desmond_lim`

1. In directory you created above, create a `answer.js`

1. Keep your answers organized! Included a commented header for each section in your answers file. Something like the following:

```js
////////////////////////////////
// Easy Going
////////////////////////////////

////////////////////////////////
// Get Even
////////////////////////////////

////////////////////////////////
// Fizz Buzz
////////////////////////////////

////////////////////////////////
// Wild Wild Life
////////////////////////////////

////////////////////////////////
// Yell at the Ninja Turtles
////////////////////////////////

////////////////////////////////
// Methods, Revisited
////////////////////////////////

////////////////////////////////
// Where is Waldo
////////////////////////////////

////////////////////////////////
//  Excited Kitten
////////////////////////////////

////////////////////////////////
//  Find the Median
////////////////////////////////
```

4. TEST YOUR WORK! Make sure that your code works.

5. If you're stuck on something for "too long" or get overly frustrated, make a comment and move on. Return to it later. You may find some later problems easier or need a break from what you're working on and set some fresh eyes on something you've been stuck on.

6. After each section (even if you're not fully done with it), _add_ and _commit_ your work.

Please use the commit messages that you see at the end of each section (modify it if you need to ie `checkers almost solved`). We will see these messages on Github. It will help us to see your progress. If you go back and fix a section, commit again with an updated message.

7. When you are done with your homework, push it to your `origin` (this is your Github) and make an issue on our repo.

**Final note:** You are not alone! Everyone else in the class is working on this as well. Send Slack messages, make a Zoom channel, or meet with the TA to discuss sticking points.

### Part I: HTML & CSS

Prepare yourself for HTML and CSS. Watch the following videos.

Rank you comfort with the following material on a scale of 0 - 5:

0 - I have no idea what it is

1 - I am not sure

2 - I am shakey, I could use a refresher

3 - I almost feel like I've got it

4 - I feel pretty good about the material, but some extra review would help

5 - I got this! I am ready to code

Based on your self-assessed score, watch the appropriate video(s)

The videos are between 5 - 15 minutes long

[HTML Intro (tags, content, attributes, semantic HTML)](https://www.youtube.com/watch?v=DxhXFpsN5I4&index=1&list=PLdnONIhPScST0Vy4LrIZiYKpFNoxgyH7J)

[HTML Elements (headers, navigation, lists, sections, etc.) and Media (images, audio, videos)](https://www.youtube.com/watch?v=KhbnrDhWDdE&index=2&list=PLdnONIhPScST0Vy4LrIZiYKpFNoxgyH7J)

[CSS Intro (including css files in HTML, elements)](https://www.youtube.com/watch?v=xWiT2TWCFjc&index=3&list=PLdnONIhPScST0Vy4LrIZiYKpFNoxgyH7J)

[CSS Basics (colors, background, font properties)](https://www.youtube.com/watch?v=UMMHsQPmfug&index=4&list=PLdnONIhPScST0Vy4LrIZiYKpFNoxgyH7J)

<hr>

### Part II: JavaScript Reps

#### Easy Going

- Write a for loop that will log the numbers 1 through 20.

<hr>
&#x1F534; The commit message should read: <br>
"Easy Going answered"
<hr>

#### Get Even

- Write a for loop that will log only the even numbers in 0 through 200.
  > Hint: Think about the increment expression.

<hr>
&#x1F534; The commit message should read: <br>
"Get Even answered"
<hr>

#### Fizz Buzz

This is a classic problem that you should get really comfortable solving. If you've solved it before, try to make it more elegant and short.

1. Write a javascript application that logs all numbers from 1 - 100.

2. If a number is divisible by 3 log "Fizz" instead of the number.

3. If a number is divisible by 5 log "Buzz" instead of the number.

4. If a number is divisible by 3 and 5 log "FizzBuzz" instead of the number.

<hr>
&#x1F534; The commit message should read: <br>
"Fizz Buzz answered"
<hr>

#### Wild Wild Life

Use the following arrays to answer the questions below (name,species ,age, hometown):
You should be modifying the elements by accessing them. It is up to you which methods to use.

```js
const wolfy = ["Wolfy", "wolf", 16, "Yukon Territory"];
const sharky = ["Sharky", "shark", 20, "Left Coast"];
const plantee = ["Plantee", "plant", 5000, "Mordor"];
const porgee = ["Porgee", "Porg", 186, "Ahch-To"];
const dart = ["D'Art", "Demogorgan Dog", 2, "Upside Down"];
```

1. Plantee just had her birthday; change Plantee's array to reflect her being a year older.

2. Change Wolfy's hometown from "Yukon Territory" to "Gotham City".

3. Give D'Art a second hometown by adding "Hawkins"

4. Porgee decides that Wolfy can't be named "Wolfy" anymore. Remove "Wolfy" from the `wolfy` array and replace it with "Gameboy".

<hr>
&#x1F534; The commit message should read: <br>
"Wild Wild Life answered"
<hr>

#### Yell at the Ninja Turtles

1. Create an array with the members of the ninja turtles (Donatello, Leonardo, Raphael, Michaelangelo)

2. Use a `for of loop` (not a typo - try it out! Try a `for of` loop) to call `toUpperCase()` on each of them and print out the result.

As a developer, you'll be a lifelong learner and constantly encountering new things. We'll give you little stretches like this to get you used to looking at documentation and figuring some things out on your own. You've got this!

<hr>
&#x1F534; The commit message should read: <br>
"Yell at the Ninja Turtles answered"
<hr>

#### Methods, Revisited

Here is a list of favMovies:

```
const favMovies = ['Jaws', 'The Fellowship of the Ring', 'Howl\'s Moving Castle', 'Django Unchained', 'Cloud Atlas', 'The Usual Suspects', 'Toy Story', 'Conan the Barbarian', 'Titanic', 'Harry Potter', 'Fried Green Tomatoes', 'Volver', 'Oculus', 'Seven', 'Black Panther', 'Harry Potter', 'Imitation of Life', 'Snatch', 'Fast and Furious'];
```

- Console log: the index of `Titanic`

- Do the following and console.log the final results (I have included some _thought_ questions, you don't have to write out an answer for those marked as such):

Note: if you have to add to the array, feel free to add any movie you'd like

1.  use the `.sort` method Thought question: what did this do to the array? Did it permanently alter it?
1.  Use the method `pop`
1.  `push` "Guardians of the Galaxy"
1.  Reverse the array
1.  Use the `shift` method
1.  `unshift` - what does it return?
1.  `splice` "Django Unchained" and add "Avatar" (try finding the index of "Django Unchained", instead of counting it yourself) Thought question: did this permanently alter our array?
1.  `slice` the last half of the array (challenge yourself and try to programatically determine the middle of the array rather than counting it and hard coding it) - Thought question: did this permanently alter our array?
1.  store the value of your `slice` in a variable, console.log it - Thought question: what is going on here?
1.  console.log your final results

- After running the above tasks, console.log the index of "Fast and Furious"
  -We removed it from the array, what value do we get when we look for the index of something that is not in the array?

- Thought question: that we declared the variable `favMovies` with `const`, and yet, we were allowed to change the array. Weird? Should we have used `let`?
<hr>
&#x1F534; The commit message should read: <br>
"Methods Revisited answered"
<hr>

#### Where is Waldo

- With the following multi-dimensional array

```js
const whereIsWaldo = [
  ["Timmy", "Frank"],
  "Eggbert",
  ["Lucinda", "Jacc", "Neff", "Snoop"],
  ["Petunia", ["Baked Goods", "Waldo"]],
];
```

- Remove Eggbert (hint look at the slice/splice method(s))
- Change "Neff" to "No One"
- Access and console.log "Waldo"

<hr>
&#x1F534; The commit message should read: <br>
"Where is Waldo answered"
<hr>

#### Excited Kitten

1. Write code that logs "Love me, pet me! HSSSSSS!" 20 times.

2. For every **even** number in your loop, log "...human...why you taking pictures of me?...", "...the catnip made me do it...", or "...why does the red dot always get away..." at random.

<details><summary>Hint 1</summary>

Make an array of the kitten's talking points

</details>

<details><summary>Hint 2</summary>

Use bracket notation to access each talking point
`kittyTalk[1];`

</details>

<details><summary>Hint 3</summary>
 Rather than hard-coding the array position number set a variable

```
  let meow = 0;
  kittyTalk[meow]
```

</details>

<details><summary>Hint 4</summary>

You will need to use Math.random() in order to choose a random number and assign this random number to the variable you created (rather than have the variable equal 0)

</details>

<details><summary>Hint 5</summary>

Math.random() will return a number between 0 and 1. Array positions are integers. You will need to multiply the Math.random() number so that the range is between 0 and the length of the array

</details>

<details><summary>Hint 6</summary>

Then round the number by using another Math method like `Math.floor()` or `Math.ceil()` or `Math.round()`

</details>

![Image of cat with funny quote about dot](https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRETGsssSXu2AS15GpQIBhuSgkhP2q_4JZcPopN4dFP-v85mAePGA)

<hr>
&#x1F534; The commit message should read: <br>
"Excited Kittens answered"
<hr>

#### Find the Median

- Find the median number in the following `nums` array, then console.log that number.
- _hint_ if you check the length of the array / 2, you might get not get a whole number. In which case, look into `Math.floor( // something )`

```
const nums = [14,11,16,15,13,16,15,17,19,11,12,14,19,11,15,17,11,18,12,17,12,71,18,15,12];

Expected output:
=> 15
```

<hr>
&#x1F534; The commit message should read: <br>
"Find the Median answered"
<hr>

### Hungry for More?

#### Lab Time Revisited

Choose one that you didn't get to solve in lab

##### Fibonnacci

##### Checkerboard

##### TwoDArray

##### Finish all 3 Lab Questions

#### Return of the Closets

Below, we've given you examples of Kristyn and Thom's closets modeled as data in JavaScript. Use this data to answer the following questions.

```javascript
const kristynsCloset = [
  "left shoe",
  "cowboy boots",
  "right sock",
  "GA hoodie",
  "green pants",
  "yellow knit hat",
  "marshmallow peeps",
];

// Thom's closet is more complicated. Check out this nested data structure!!
const thomsCloset = [
  [
    // These are Thom's shirts
    "grey button-up",
    "dark grey button-up",
    "light blue button-up",
    "blue button-up",
  ],
  [
    // These are Thom's pants
    "grey jeans",
    "jeans",
    "PJs",
  ],
  [
    // Thom's accessories
    "wool mittens",
    "wool scarf",
    "raybans",
  ],
];
```

#### Alien Attire

1. Kristyn's left shoe has traveled through time and space and turned up in Thom's accessories drawer! Remove Kristyn's shoe from the array and save it to the variable `kristynsShoe`. Use that variable to add Kristyn's lost shoe to Thom's accessories array.

#### Dress Us Up

1. Modify your code to put together **3 separate outfits** for Kristyn and Thom. Put the output in a sentence to tell us what we'll be wearing. Mix and match!

<hr>
&#x1F534; The commit message should read: <br>
"Kristyn and Thom have their outfits ready for class - array practice"
<hr>

#### Dirty Laundry

Continue looking at the closet arrays:

1. Time to do laundry - loop through Kristyn's closet and log the sentence "WHIRR: Now washing (item)" for each item in the array.

#### Inventory

2. Thom wants to do inventory on his closet. Using **bracket notation**, log the arrays containing all of Thom's shirts, pants, and accessories.

<hr>
&#x1F534; The commit message should read: <br>
"Hungry for More: I tackled..."
<hr>




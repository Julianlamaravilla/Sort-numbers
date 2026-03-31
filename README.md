# Java Swing Number Comparator

## Overview

This is a simple Java application that uses **Swing (JOptionPane)** to interact with the user. The program prompts the user to input two numeric values and then determines which one is larger and which one is smaller.

## Features

* Graphical input dialogs using `JOptionPane`
* Accepts decimal numbers (`Double`)
* Compares two numbers using a ternary operator
* Displays results in a pop-up dialog
* Basic error handling with retry mechanism

## How It Works

1. The program asks the user to input the first number.
2. Then it requests the second number.
3. It compares both values:

   * Determines the **largest number**
   * Determines the **smallest number**
4. Displays both results in a message dialog.
5. If an invalid value is entered:

   * An error message is shown
   * The program restarts automatically

## Code Structure

* `main` method: Entry point of the application
* `JOptionPane.showInputDialog`: Used for user input
* `Double.parseDouble`: Converts input string to numeric value
* Ternary operator (`? :`): Handles comparison logic
* `try-catch`: Manages invalid input errors

## Requirements

* Java Development Kit (JDK) 8 or higher
* Any Java IDE (e.g., IntelliJ IDEA, Eclipse, NetBeans) or terminal

## How to Run

### Option 1: Using an IDE

1. Open the project in your preferred IDE
2. Run the `Main` class

### Option 2: Using Terminal

```bash
javac Main.java
java Main
```

## Example Output

* Input:

  * First number: 10
  * Second number: 5
* Output:

```
Biggest Number: 10
Second one Number: 5
```

## Error Handling

If the user inputs a non-numeric value:

* The program shows an error message
* It automatically restarts by calling `main(args)`

## Notes

* The program uses recursion (`main(args)`) to retry on error, which is functional but not ideal for large-scale applications.
* A loop-based retry mechanism would be more efficient and safer in production environments.

## Possible Improvements

* Replace recursion with a loop for better performance
* Validate input before parsing
* Allow comparison of more than two numbers
* Add a graphical interface (buttons, fields) instead of dialog boxes

## Author

Developed as a basic Java practice exercise using Swing and exception handling.

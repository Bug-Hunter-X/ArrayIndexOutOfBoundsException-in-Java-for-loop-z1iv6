# ArrayIndexOutOfBoundsException in Java

This repository contains a simple Java program demonstrating a common coding error: `ArrayIndexOutOfBoundsException`. The error is caused by an incorrect loop condition in a `for` loop, leading to an attempt to access an array element beyond its valid index.

## Bug Description
The program attempts to populate an integer array with values, doubling each index value.  However, the loop's termination condition `i <= array.length` is wrong; it should be `i < array.length`.  This results in an attempt to access array[5] which causes the exception.

## Solution
The solution simply corrects the loop condition to ensure that the loop iterates only up to the valid index range of the array.

## How to run
1. Clone the repository.
2. Compile the Java code using a Java compiler (e.g., `javac bug.java` and `javac bugSolution.java`).
3. Run the compiled code (e.g., `java bug` and `java bugSolution`).
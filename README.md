# Palindrome Checker App

A console-based Java application that validates whether a given string is a palindrome under different conditions. This project demonstrates core programming fundamentals, data structure concepts, and design patterns in Java.

---

## Overview

The Palindrome Checker App checks if strings read the same forwards and backwards, implementing 13 use cases that progressively introduce different algorithms, data structures, and design patterns.

---

## Features

### UC1: Application Entry & Welcome Message

- Displays the application name and version on startup
- **Key Concepts:** Constants (`static final`), `System.out.println`

### UC2: Hardcoded Palindrome Check

- Checks a hardcoded string (`"madam"`) using character-by-character comparison
- Iterates from both ends toward the center
- **Key Concepts:** Loops, string indexing

### UC3: Palindrome Check Using String Reverse

- Reverses the input string manually using a loop
- Compares the reversed string with the original using `.equals()`
- Displays both the original and reversed string
- **Key Concepts:** String manipulation, loop-based reversal

### UC4: Character Array Based Palindrome Check

- Converts the string to a `char[]` using `.toCharArray()`
- Uses a two-pointer approach (start and end indices)
- **Key Concepts:** Character arrays, two-pointer technique

### UC5: Stack-Based Palindrome Checker

- Pushes all characters onto a `Stack`
- Pops characters (LIFO order) and compares with original
- **Key Concepts:** Stack, LIFO principle

### UC6: Queue + Stack Based Palindrome Check

- Simultaneously enqueues characters into a `Queue` and pushes to a `Stack`
- Dequeues (FIFO) and pops (LIFO) simultaneously to compare
- **Key Concepts:** Queue, Stack, FIFO vs LIFO

### UC7: Deque-Based Optimized Palindrome Checker

- Adds characters to an `ArrayDeque`
- Removes from both front and rear simultaneously for comparison
- **Key Concepts:** Deque, `ArrayDeque`, double-ended access

### UC8: Linked List Based Palindrome Checker

- Stores characters in a `LinkedList`
- Removes and compares first and last elements until the list is empty or has one element
- **Key Concepts:** LinkedList, `removeFirst()`, `removeLast()`

### UC9: Recursive Palindrome Checker

- Uses a recursive helper method with `start` and `end` index parameters
- Base case: when `start >= end`, returns `true`
- **Key Concepts:** Recursion, base condition, call stack

### UC10: Case-Insensitive & Space-Ignored Palindrome

- Normalizes input by removing spaces (`replaceAll("\\s+", "")`) and converting to lowercase
- Applies two-pointer check on the normalized string
- Example: `"A man a plan a canal Panama"` → `true`
- **Key Concepts:** String normalization, `replaceAll`, `toLowerCase`

### UC11: Object-Oriented Palindrome Service

- Introduces a `PalindromeChecker` static inner class
- Encapsulates the palindrome logic inside a `checkPalindrome()` method
- **Key Concepts:** Encapsulation, Single Responsibility Principle, inner classes

### UC12: Strategy Pattern for Palindrome Algorithms

- Defines a `PalindromeStrategy` interface with a `check(String input)` method
- Implements two concrete strategies: `StackStrategy` and `DequeStrategy`
- Strategy is injected and invoked at runtime (polymorphism)
- **Key Concepts:** Interface, Polymorphism, Strategy Design Pattern

### UC13: Performance Comparison

- Runs five palindrome algorithms on the same input (`"level"`)
- Captures execution time of each using `System.nanoTime()`
- Displays input, result, and elapsed nanoseconds for each approach
- Algorithms compared: Two-Pointer, String Reverse, Stack, Deque, Recursive
- **Key Concepts:** `System.nanoTime()`, algorithm benchmarking

---

## Sample Output

```
Welcome to the Palindrome Checker Management System
Version : 1.0
Input text: madam
Is it a palindrome? : true
Input text: madam
Reversed text: madam
Is it a palindrome? : true
Input: radar
Is Palindrome? : true
Input: noon
Is Palindrome? : true
Input: civic
Is Palindrome? : true
Input : refer
Is Palindrome? : true
Input: level
Is Palindrome? : true
Input: madam
Is Palindrome? : true
Input: A man a plan a canal Panama
Is palindrome? : true
Input: racecar
Is Palindrome? : true
Input: level
Is Palindrome? : true
Input: level
Is Palindrome? : true
[Two-Pointer]
Input: level
Is Palindrome? : true
Execution Time: 852600 ns
...
System initialized successfully.
```

---

## Author

<b>Name</b>: Yatin Annam<br>
<b>Registration Number</b>: RA2411030010101

---

# Data Structures <!-- omit in toc -->

## Contents <!-- omit in toc -->

- [1. Data Structure](#1-data-structure)
- [2. Implementing Arrays](#2-implementing-arrays)
- [3. Big O Notation and Time Complexity](#3-big-o-notation-and-time-complexity)
  - [3.1. Why Execution Time Isn’t Reliable](#31-why-execution-time-isnt-reliable)
  - [3.2. Types of Complexity](#32-types-of-complexity)
  - [3.3. Why We Focus on the Worst Case](#33-why-we-focus-on-the-worst-case)
  - [3.4. Example Algorithm: Adding Sugar to Tea](#34-example-algorithm-adding-sugar-to-tea)
    - [3.4.1. Step Count Based on Number of Sugars (N)](#341-step-count-based-on-number-of-sugars-n)
  - [3.5. Introducing Big O Notation](#35-introducing-big-o-notation)
  - [3.6. What Big O Tells Us](#36-what-big-o-tells-us)
  - [3.7. Common Big O Time Complexities](#37-common-big-o-time-complexities)
  - [3.8. Visual Growth Intuition](#38-visual-growth-intuition)
  - [3.9. Final Takeaway](#39-final-takeaway)
- [4. Arrays in Memory](#4-arrays-in-memory)
- [5. Abstract Data Types (ADT)](#5-abstract-data-types-adt)
  - [5.1. Key Characteristics of ADTs](#51-key-characteristics-of-adts)
  - [5.2. ADT vs Concrete Data Structures](#52-adt-vs-concrete-data-structures)
  - [5.3. ADTs in Java](#53-adts-in-java)
  - [5.4. Key Takeaway](#54-key-takeaway)
- [6. Stack](#6-stack)
  - [6.1. Time Complexity](#61-time-complexity)
- [7. Queue](#7-queue)

# 1. Data Structure

- Organizes and stores data.
- Each has strengths and weaknesses.
- _The fact is, there aren't just two sides to any issue, there's almost always a range of responses, and “it depends” is almost always the right answer in any big question._ Linus Torvalds

# 2. Implementing Arrays

- An **array** is a data structure used to store multiple values of the **same type** in a fixed number of positions.
- Fixed Size (Arrays Are Not Dynamic).
- The size of an array is defined when it is created.
- After creation, the size cannot be changed.
  - **This means**
    - You cannot add more elements than the array can hold.
    - You cannot remove capacity to make it smaller.
- Because of this, arrays can be less flexible than dynamic data structures.

[Arrays](/Examples/Java/arrays/)

# 3. Big O Notation and Time Complexity

- Before comparing sorting algorithms, we need a fair way to measure their performance.

## 3.1. Why Execution Time Isn’t Reliable

- Measuring an algorithm by timing how long it runs is **not accurate** because results depend on hardware:
  - A modern computer runs the same code much faster than an old machine.
  - A supercomputer could make an inefficient algorithm look fast.
  - Therefore, **runtime in seconds is not an objective measure**.
- Instead, we measure **how many steps** an algorithm takes.

## 3.2. Types of Complexity

There are two main kinds:

| Type                          | Meaning                            |
| ----------------------------- | ---------------------------------- |
| **Time Complexity**           | Number of steps an algorithm takes |
| **Space (Memory) Complexity** | Amount of memory an algorithm uses |

Today, **time complexity** is usually more important because memory is relatively cheap.

## 3.3. Why We Focus on the Worst Case

- We usually analyze the **worst-case scenario** because:
  - Best case is rare.
  - Average case does not show the upper performance limit.
  - Worst case tells us the **maximum time** an algorithm might take.
- This helps us understand how an algorithm behaves as the input grows.

## 3.4. Example Algorithm: Adding Sugar to Tea

1. Fetch the bowl containing the sugar
2. Get a spoon
3. Scoop out sugar using the spoon
4. Pour the sugar from the spoon into the tea
5. Repeat steps 3 and 4 until you've added the desired amount of sugar.

### 3.4.1. Step Count Based on Number of Sugars (N)

| Sugars (N) | Steps |
| ---------- | ----- |
| 1          | 4     |
| 2          | 6     |
| 3          | 8     |
| 4          | 10    |

- Step formula:
  - `2N` -> repeating scoop + pour
  - `+2` -> getting sugar bowl and spoon

## 3.5. Introducing Big O Notation

- Big O notation describes how an algorithm’s runtime **grows** as input size grows.
  - Written as **O(expression)**
  - We ignore constants and lower-order terms.
- This is called **linear time complexity**.

## 3.6. What Big O Tells Us

- Big O describes **scalability**:
  - > How does performance change when input size increases from 10 -> 100 -> 1,000 -> 1,000,000?

## 3.7. Common Big O Time Complexities

Ordered from **best** to **worst**:

| Big O          | Name         | Growth Pattern                     |
| -------------- | ------------ | ---------------------------------- |
| **O(1)**       | Constant     | Same time regardless of input size |
| **O(log N)**   | Logarithmic  | Grows very slowly                  |
| **O(N)**       | Linear       | Grows proportionally with input    |
| **O(N log N)** | Linearithmic | Faster growth than linear          |
| **O(N²)**      | Quadratic    | Growth increases very rapidly      |

---

## 3.8. Visual Growth Intuition

![Big-O Algorithm Complexity](/Images/Big-OAlgorithmComplexity.png)

## 3.9. Final Takeaway

- Big O notation gives us a way to:
  - Compare algorithms objectively
  - Ignore hardware differences
  - Understand how performance scales
  - Predict worst-case performance
- his will be essential when analyzing and comparing sorting algorithms.

# 4. Arrays in Memory

- Contiguous block in memory.
- Every element occupies the same amount of space in memory.
- If an array starts at memory address x, and the size of each element in the array is y, we can calculate the memory address of the ith element by using the following expression: x + i \* y.
- If we know the index of an element, the time to retrieve the element will be the same, no matter where it is in the array.

# 5. Abstract Data Types (ADT)

- An **abstract data type (ADT)** defines **what operations can be performed on a data set**, not **how the data is stored**.
- Unlike **arrays**, which are concrete data structures that dictate memory layout (contiguous storage and equal-sized elements), **lists** are a conceptual model.
- They focus on **behavior**, such as how elements can be accessed or manipulated.

## 5.1. Key Characteristics of ADTs

- Define **operations and behavior**.
- Do **not** specify how data is stored in memory.
- Focus on **access patterns** (first element, last element, random access, etc.).

## 5.2. ADT vs Concrete Data Structures

- **Concrete data structures** (e.g., arrays, linked lists)
  - Define _how_ data is stored
  - Usually implemented as **classes** in Java
- **Abstract data types**
  - Define _what_ can be done with the data
  - Usually represented as **interfaces** in Java

## 5.3. ADTs in Java

- In Java, an abstract data type is commonly implemented as an **interface**, since interfaces define behavior without enforcing implementation details.
- Any class that **implements an ADT interface** can be treated as that ADT, regardless of how it stores data.
- **Examples**
  - A list implemented using an array.
  - A list implemented using a linked structure.
  - Any unconventional implementation that follows the interface contract.

## 5.4. Key Takeaway

- **ADT** -> defines behavior and allowed operations.
- **Concrete data structure** -> defines how data is implemented and stored.

# 6. Stack

- Abstract data type.
- `LIFO` - Last in, first out.
- `push` - Adds an item as the top item on the stack.
- `pop` - Removes the top item on the stack.
- `peek` - Gets the top item on the stack without popping it.
- Ideal backing data structure: Linked list.

## 6.1. Time Complexity

- O(1) for push, pop, and peek, when using a linked list.
- If you use an array, then push is O(n), because the array may have to be resized.
- If you know the maximum number of items that will ever be on the stack, an array can be a good choice.
- If memory is tight, an array might be a good choice.
- Linked list is ideal.

# 7. Queue

- Abstract data type.
- `FIFO` - First in, first out.
- `add` - Also called enqueue - add an item to the end of the queue.
- `remove` - Also called dequeue - remove the item at the front of the queue.
- `peek` - Get the item at the front of the queue, but don’t remove it.

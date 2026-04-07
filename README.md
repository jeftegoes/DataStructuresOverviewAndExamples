# Data Structures <!-- omit in toc -->

## Contents <!-- omit in toc -->

- [1. Data Structure](#1-data-structure)
- [2. Implementing Arrays](#2-implementing-arrays)
- [3. Big O Notation and Time Complexity](#3-big-o-notation-and-time-complexity)
  - [3.1. Why Execution Time Isn't Reliable](#31-why-execution-time-isnt-reliable)
  - [3.2. Types of Complexity](#32-types-of-complexity)
  - [3.3. Why We Focus on the Worst Case](#33-why-we-focus-on-the-worst-case)
  - [3.4. Example Algorithm: Adding Sugar to Tea](#34-example-algorithm-adding-sugar-to-tea)
    - [3.4.1. Step Count Based on Number of Sugars (N)](#341-step-count-based-on-number-of-sugars-n)
  - [3.5. Introducing Big O Notation](#35-introducing-big-o-notation)
  - [3.6. What Big O Tells Us](#36-what-big-o-tells-us)
  - [3.7. Common Big O Time Complexities](#37-common-big-o-time-complexities)
  - [3.8. Visual Growth Intuition](#38-visual-growth-intuition)
  - [3.9. Final Takeaway](#39-final-takeaway)
- [4. Sort Algorithms](#4-sort-algorithms)
  - [4.1. Bubble Sort](#41-bubble-sort)
- [5. Arrays in Memory](#5-arrays-in-memory)
- [6. Abstract Data Types (ADT)](#6-abstract-data-types-adt)
  - [6.1. Key Characteristics of ADTs](#61-key-characteristics-of-adts)
  - [6.2. ADT vs Concrete Data Structures](#62-adt-vs-concrete-data-structures)
  - [6.3. ADTs in Java](#63-adts-in-java)
  - [6.4. Key Takeaway](#64-key-takeaway)
- [7. List](#7-list)
  - [7.1. Linked List](#71-linked-list)
  - [7.2. Double Linked List](#72-double-linked-list)
- [8. Stack](#8-stack)
  - [8.1. Time Complexity](#81-time-complexity)
- [9. Queue](#9-queue)
- [10. Search Algorithms](#10-search-algorithms)
  - [10.1. Linear](#101-linear)
  - [10.2. Binary](#102-binary)
- [11. Hash Tables](#11-hash-tables)
  - [11.1. Hashing](#111-hashing)
  - [11.2. Load Factor](#112-load-factor)
  - [11.3. Chaining (Encadeamento)](#113-chaining-encadeamento)
- [12. Trees](#12-trees)
  - [12.1. Characteristics](#121-characteristics)
    - [12.1.1. Structure Rules](#1211-structure-rules)
    - [12.1.2. Important Terms](#1212-important-terms)
    - [12.1.3. Relationships](#1213-relationships)
    - [12.1.4. Real-World Examples](#1214-real-world-examples)
    - [12.1.5. Key Insight](#1215-key-insight)
  - [12.2. Binary Tree](#122-binary-tree)
  - [12.3. Binary Search Tree (BST)](#123-binary-search-tree-bst)
  - [12.4. Traversal](#124-traversal)
- [13. Heaps](#13-heaps)
  - [13.1. Heaps](#131-heaps)
  - [13.2. Not a heap](#132-not-a-heap)
  - [13.3. A Heap](#133-a-heap)
  - [13.4. Heaps as Arrays](#134-heaps-as-arrays)

# 1. Data Structure

- Organizes and stores data.
- Each has strengths and weaknesses.
- _The fact is, there aren't just two sides to any issue, there's almost always a range of responses, and "it depends" is almost always the right answer in any big question._ Linus Torvalds

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

## 3.1. Why Execution Time Isn't Reliable

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

- Big O notation describes how an algorithm's runtime **grows** as input size grows.
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
  - Compare algorithms objectively.
  - Ignore hardware differences.
  - Understand how performance scales.
  - Predict worst-case performance.
- His will be essential when analyzing and comparing sorting algorithms.

# 4. Sort Algorithms

## 4.1. Bubble Sort

- In-place algorithm.
- O(n2) time complexity - quadratic.
- It will take 100 steps to sort 10 items, 10,000 steps to sort 100 items, 1,000,000 steps to sort 1000 items.
- Algorithm degrades quickly.

# 5. Arrays in Memory

- Contiguous block in memory.
- Every element occupies the same amount of space in memory.
- If an array starts at memory address x, and the size of each element in the array is y, we can calculate the memory address of the ith element by using the following expression: x + i \* y.
- If we know the index of an element, the time to retrieve the element will be the same, no matter where it is in the array.

# 6. Abstract Data Types (ADT)

- An **abstract data type (ADT)** defines **what operations can be performed on a data set**, not **how the data is stored**.
- Unlike **arrays**, which are concrete data structures that dictate memory layout (contiguous storage and equal-sized elements), **lists** are a conceptual model.
- They focus on **behavior**, such as how elements can be accessed or manipulated.

## 6.1. Key Characteristics of ADTs

- Define **operations and behavior**.
- Do **not** specify how data is stored in memory.
- Focus on **access patterns** (first element, last element, random access, etc.).

## 6.2. ADT vs Concrete Data Structures

- **Concrete data structures** (e.g., arrays, linked lists)
  - Define _how_ data is stored.
  - Usually implemented as **classes** in Java.
- **Abstract data types**
  - Define _what_ can be done with the data.
  - Usually represented as **interfaces** in Java.

## 6.3. ADTs in Java

- In Java, an abstract data type is commonly implemented as an **interface**, since interfaces define behavior without enforcing implementation details.
- Any class that **implements an ADT interface** can be treated as that ADT, regardless of how it stores data.
- **Examples**
  - A list implemented using an array.
  - A list implemented using a linked structure.
  - Any unconventional implementation that follows the interface contract.

## 6.4. Key Takeaway

- **ADT** -> defines behavior and allowed operations.
- **Concrete data structure** -> defines how data is implemented and stored.

# 7. List

## 7.1. Linked List

![Singly Linked List Diagram](/Images/SinglyLinkedListDiagram.png)

- Each item in the list is called a node.
- The first item in the list is the head of the list.

## 7.2. Double Linked List

![Double Linked List Diagram](/Images/DoubleLinkedListDiagram.png)

# 8. Stack

- Abstract data type.
- `LIFO` - Last in, first out.
- `push` - Adds an item as the top item on the stack.
- `pop` - Removes the top item on the stack.
- `peek` - Gets the top item on the stack without popping it.
- Ideal backing data structure: Linked list.

## 8.1. Time Complexity

- O(1) for push, pop, and peek, when using a linked list.
- If you use an array, then push is O(n), because the array may have to be resized.
- If you know the maximum number of items that will ever be on the stack, an array can be a good choice.
- If memory is tight, an array might be a good choice.
- Linked list is ideal.

# 9. Queue

- Abstract data type.
- `FIFO` - First in, first out.
- `add` - Also called enqueue - add an item to the end of the queue.
- `remove` - Also called dequeue - remove the item at the front of the queue.
- `peek` - Get the item at the front of the queue, but don't remove it.

# 10. Search Algorithms

## 10.1. Linear

- Linear search scans the elements one by one until it finds the target value or reaches the end of the list.
- Linear search works with both sorted and unsorted data.
- O(n).

## 10.2. Binary

- Data must be sorted!
- Chooses the element in the middle of the array and compares it against the search value.
  1. If element is equal to the value, we're done.
  2. If element is greater than the value, search the left half of the array.
  3. If the element is less than the value, search the right half of the array.
  4. At some point, there will be only one element in the partition you're checking, but it doesn't have to get to that point.
- Iterative Binary Search in Java (non-recursive)
- Can be implemented recursively.
- O(log n) - keeps dividing the array in half.
  ![Iterative Binary Search](/Images/IterativeBinarySearch.png)

# 11. Hash Tables

- Abstract data type.
- Provide access to data using keys.
- Key doesn't have to be an integer.
- Consists of key/value pairs - data types don't have to match.
- Optimized for retrieval (when you know the key). O(1)
- Associative array is one type of hash table.
- A good hash function should distribute the keys uniformly across the table.
- Hash tables are inefficient for retrieving data in a sorted (ordered) manner.

## 11.1. Hashing

- Maps keys of any data type to an integer.
- Hash function maps keys to int.
- In Java, hash function is Object.hashCode().
- **Collision** occurs when more than one value has the same hashed value.

## 11.2. Load Factor

- Tells us how full a hash table is.
- Load factor = # of items / capacity = size / capacity.
  - Load factor is used to decide when to resize the array backing the hash table.
  - Don't want load factor too low (lots of empty space).
  - Don't want load factor too high (will increase the likelihood of collisions).
- Can play a role in determining the time complexity for retrieval.

## 11.3. Chaining (Encadeamento)

|     Strategy      |                    Idea                     |
| :---------------: | :-----------------------------------------: |
|     Chaining      | Store elements in a list in the bucket O(n) |
|  Linear Probing   |        Check the next free position         |
| Quadratic Probing |        Quadratic jumps in the table         |
|  Double Hashing   |         Use a second hash function          |
|     Rehashing     |             Increase table size             |

# 12. Trees

- A tree is a hierarchical data structure made up of nodes connected by edges.
  ![Trees](/Images/Trees.png)

## 12.1. Characteristics

- **Node:** Each element in the tree.
- **Root:** The top node (has no parent). There is only one root.
- **Parent & Child**
  - Each node has only one parent (except the root).
  - A node can have multiple children.
- **Leaf:** A node with no children.
- **Edge:** The connection between nodes.
  ![Trees Details](/Images/TreesDetai ls.png)

### 12.1.1. Structure Rules

- No node can have more than one parent.
- No cycles are allowed (you can't loop back to a node).
- Trees represent hierarchical relationships.

### 12.1.2. Important Terms

- **Subtree:** A node and all its descendants.
- **Path:** Sequence of nodes from one node to another.
- **Depth:** Number of edges from a node to the root.
- **Height:** Number of edges in the longest path from a node to a leaf.
- **Level:** Nodes grouped by the same depth.

### 12.1.3. Relationships

- **Ancestors:** Nodes above a given node (toward the root).
- **Descendants:** Nodes below a given node.

### 12.1.4. Real-World Examples

- File systems (folders and files)
- Java class hierarchy (e.g., everything extends Object)

### 12.1.5. Key Insight

- A tree is ideal when data has a "parent -> child" relationship.
- Each node has one parent but can have many children.

## 12.2. Binary Tree

- Every node has 0, 1, or 2 children.
- Children are referred to as left child and right child.
  - In practice, we use binary search trees.

## 12.3. Binary Search Tree (BST)

- Can perform insertions, deletions, and retrievals in `O(log n)` time.
- The left child always has a smaller value than its parent.
- The right child always has a larger value than its parent.
- This means everything to:
  - The left of the root is less than the value of the root.
  - Everything to the right of the root is greater than the value of the root.
- Because of that, we can do a binary search.

## 12.4. Traversal

- There are 4 ways to traverse a tree:
  1. Level Order (rarely used)
     - Visit nodes level by level, from top to bottom
     - Left → right in each level
       ![Tree - Traversal - Level Order](/Images/TreeLevelOrder.png)
  2. Pre-order (Root → Left → Right)
     - Visit node first, then:
       - Left subtree
       - Right subtree
         ![Tree - Traversal - Pre-order](/Images/TreePreOrder.png)
  3. In-order (Left → Root → Right)
     - **Visit**
       - Left subtree
       - Node
       - Right subtree
     - In a Binary Search Tree, this returns values sorted.
       ![Tree - Traversal - In-order](/Images/TreeInOrder.png)
  4. Post-order (Left → Right → Root)
     - **Visit**
       - Left subtree
       - Right subtree
       - Node last
         ![Tree - Traversal - Post-order](/Images/TreePostOrder.png)

# 13. Heaps

- A complete binary trees.
- Must satisfy the heap property (order).
  - **Max heap:** Every parent is greater than or equal to its children.
  - **Min heap:** Every parent is less than or equal to its children.

## 13.1. Heaps

- A binary heap must be a complete tree.
  - Every level of the tree is fully filled, except possibly the last level.
- Children are added at each level from left to right.
- Usually implemented as arrays.
- The maximum or minimum value will always be at the root of the tree - the advantage of using a heap.
- **Heapify:** Process of converting a binary tree into a heap - this often has to be done after an insertion or deletion.
- No required ordering between siblings.

## 13.2. Not a heap

![Heap - Not a heap](/Images/HeapNotAHeap.png)

## 13.3. A Heap

![Heap](/Images/Heap.png)

## 13.4. Heaps as Arrays

- We can store binary heaps as arrays.
- We put the root at array[0].
- We then traverse each level from left to right, and so the left child of the root would go into array[1], its right child would to into array[2], etc.
  ![Heap](/Images/HeapsAsArrays.png)
- For the node at array[i]:
  - left child = 2i + 1
  - right child = 2i + 2
  - parent = floor((i - 1) / 2)

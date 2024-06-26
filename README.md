﻿# NaryTreeValidation
## Project Description
This repository contains a Java program that creates an N-ary tree structure and checks if the given input is suitable for this tree. If suitable, it places the input into the tree and then prints the inorder traversal of the tree.

## Files
- `Node.java`: Defines the node structure used in the N-ary tree.
- `Tree.java`: Implements the N-ary tree structure and its operations such as adding elements and performing inorder traversal.
- `Main.java`: Main class to test the N-ary tree validation and inorder traversal by taking user input and producing the required output.

## Algorithm Explanation

### Node Class
The `Node` class defines the basic unit of the N-ary tree. Each node contains:
- An integer (`int data`): The data stored in the node.
- An array of nodes (`Node[] children`): Points to the children nodes of the current node.

### Tree Class
The `Tree` class manages the nodes and provides methods to manipulate the tree:
- `addNode(int data)`: Adds a new node with the specified integer to the tree.
  - If the tree is empty (`root` is `null`), the new node becomes the root.
  - Otherwise, it places the new node according to the N-ary tree structure.
- `inorderTraversal()`: Performs an inorder traversal of the tree and prints the nodes.

### Main Class
The `Main` class contains the main method to run the N-ary tree validation application:
- Reads the value of `k` (number of children per node) as a runtime argument.
- Reads a sequence of integers representing the tree levels, ending with a `$` symbol.
- Uses the `Tree` class to construct the N-ary tree and perform the inorder traversal.
- Outputs "Tree olusturulamaz." if the input is not suitable for the tree structure.

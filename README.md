# DSA

Java implementations of core data structures and algorithms from my DSA practice and bootcamp work.

## Coverage

### Data structures

- Graphs: adjacency list/matrix, BFS, DFS, Dijkstra
- Hash table
- Singly, doubly, and circular linked lists
- Linear, circular, bounded, and priority queues
- Stack
- Trees: binary tree, BST, AVL tree, trie, prefix/suffix structures

### Searching

- Linear search
- Binary search
- Uniform binary search
- Fibonacci search
- Interpolation search

### Sorting

- Bubble sort
- Selection sort
- Insertion sort
- Quick sort
- Radix sort
- Merge sort
- Shell sort
- Heap sort

## Repository layout

The implementations are grouped by topic so each algorithm can be compiled and studied independently. The `Notes/` directory contains learning notes from the bootcamp.

## Example

    javac Algorithms/Searching-Algorithms/Binary-Search/BinarySearch.java
    java -cp Algorithms/Searching-Algorithms/Binary-Search BinarySearch

Check the individual source files for the exact class and package conventions.

## Learning focus

This repository prioritizes readable implementations and understanding algorithm flow over micro-optimizations. For interview preparation, each implementation should eventually have:

- time and space complexity notes
- edge-case coverage
- small deterministic tests
- a short explanation of when the algorithm is preferable

## Provenance

This is my maintained learning repository. Some early material originated from a DSA bootcamp/fork; repository history should be treated as the source of truth for attribution.

## License

MIT
# DSA

> Java implementations of core data structures and algorithms from my DSA practice and bootcamp work.

## Coverage

### Data structures

- Graphs: adjacency list/matrix, BFS, DFS, Dijkstra
- Hash table
- Singly, doubly, and circular linked lists
- Linear, circular, bounded, and priority queues
- Stack
- Trees: binary tree, BST, AVL tree, trie, and prefix/suffix structures

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

## How the repository is organized

Implementations are grouped by topic so individual examples can be compiled and studied independently. The `Notes/` directory contains learning material from the bootcamp.

Example:

```bash
javac Algorithms/Searching-Algorithms/Binary-Search/BinarySearch.java
java -cp Algorithms/Searching-Algorithms/Binary-Search BinarySearch
```

Check each source file for its exact class and package conventions before compiling.

## Learning focus

The repository prioritizes readable implementations and understanding algorithm flow over micro-optimizations.

For stronger interview-preparation value, each implementation can be extended with:

- time and space complexity notes
- edge-case coverage
- small deterministic tests
- guidance on when the algorithm is useful

## CI

A GitHub Actions workflow performs compile checks on representative Java implementations. CI is intended as a basic build sanity check; it does not prove every algorithm is correct.

## Provenance

This is a maintained learning repository. Some early material originated from a DSA bootcamp/fork; repository history should be treated as the source of truth for attribution.

## License

See [LICENSE](LICENSE).

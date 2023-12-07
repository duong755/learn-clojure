# Problem 53, Longest Increasing Sub-Seq

**Difficulty:** hard

Given a vector of integers, find the longest consecutive sub-sequence of increasing numbers. If two sub-sequences have the same length, use the one that occurs first. An increasing sub-sequence must have a length of 2 or greater to qualify.

```clj
(= (__ [1 0 1 2 3 0 4 5]) [0 1 2 3])
```

```clj
(= (__ [5 6 1 3 2 7]) [5 6])
```

```clj
(= (__ [2 3 3 4 5]) [3 4 5])
```

```clj
(= (__ [7 6 5 4]) [])
```

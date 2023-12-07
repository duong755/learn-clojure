# Problem 54, Partition a Sequence

**Difficulty:** medium

Write a function which returns a sequence of lists of x items each. Lists of less than x items should not be returned.

```clj
(= (__ 3 (range 9)) '((0 1 2) (3 4 5) (6 7 8)))
```

```clj
(= (__ 2 (range 8)) '((0 1) (2 3) (4 5) (6 7)))
```

```clj
(= (__ 3 (range 8)) '((0 1 2) (3 4 5)))
```

# Problem 33, Replicate a Sequence

**Difficulty:** easy

Write a function which replicates each element of a sequence a variable number of times.

```clj
(= (__ [1 2 3] 2) '(1 1 2 2 3 3))
```

```clj
(= (__ [:a :b] 4) '(:a :a :a :a :b :b :b :b))
```

```clj
(= (__ [4 5 6] 1) '(4 5 6))
```

```clj
(= (__ [[1 2] [3 4]] 2) '([1 2] [1 2] [3 4] [3 4]))
```

```clj
(= (__ [44 33] 2) [44 44 33 33])
```

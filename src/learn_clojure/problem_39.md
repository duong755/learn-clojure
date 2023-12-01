# Problem 39, Interleave Two Seqs

**Difficulty:** easy

Write a function which takes two sequences and returns the first item from each, then the second item from each, then the third, etc.

```clj
(= (__ [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c))
```

```clj
(= (__ [1 2] [3 4 5 6]) '(1 3 2 4))
```

```clj
(= (__ [1 2 3 4] [5]) [1 5])
```

```clj
(= (__ [30 20] [25 15]) [30 25 20 15])
```

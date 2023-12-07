# Problem 56, Find Distinct Items

**Difficulty:** medium

Write a function which removes the duplicates from a sequence. Order of the items must be maintained.

```clj
(= (__ [1 2 1 3 1 2 4]) [1 2 3 4])
```

```clj
(= (__ [:a :a :b :b :c :c]) [:a :b :c])
```

```clj
(= (__ '([2 4] [1 2] [1 3] [1 3])) '([2 4] [1 2] [1 3]))
```

```clj
(= (__ (range 50)) (range 50))
```

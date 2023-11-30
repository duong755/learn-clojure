# Problem 31, Pack a Sequence

**Difficulty:** easy

Write a function which packs consecutive duplicates into sub-lists.

```clj
(= (__ [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3)))
```

```clj
(= (__ [:a :a :b :b :c]) '((:a :a) (:b :b) (:c)))
```

```clj
(= (__ [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4])))
```

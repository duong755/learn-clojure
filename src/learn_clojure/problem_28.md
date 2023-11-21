# Problem 28, Flatten a Sequence

**Difficulty:** easy

Write a function which flattens a sequence.

```clj
(= (__ '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))
```

```clj
(= (__ ["a" ["b"] "c"]) '("a" "b" "c"))
```

```clj
(= (__ '((((:a))))) '(:a))
```

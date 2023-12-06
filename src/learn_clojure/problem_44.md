# Problem 44, Rotate Sequence

**Difficulty:** medium

Write a function which can rotate a sequence in either direction.

```clj
(= (__ 2 [1 2 3 4 5]) '(3 4 5 1 2))
```

```clj
(= (__ -2 [1 2 3 4 5]) '(4 5 1 2 3))
```

```clj
(= (__ 6 [1 2 3 4 5]) '(2 3 4 5 1))
```

```clj
(= (__ 1 '(:a :b :c)) '(:b :c :a))
```

```clj
(= (__ -4 '(:a :b :c)) '(:c :a :b))
```

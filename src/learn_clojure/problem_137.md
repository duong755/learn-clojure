# Problem 137, Digits and bases

**Difficulty:** medium

Write a function which returns a sequence of digits of a non-negative number (first argument) in numerical system with an arbitrary base (second argument). Digits should be represented with their integer values, e.g. 15 would be [1 5] in base 10, [1 1 1 1] in base 2 and [15] in base 16.

```clj
(= [1 2 3 4 5 0 1] (__ 1234501 10))
```

```clj
(= [0] (__ 0 11))
```

```clj
(= [1 0 0 1] (__ 9 2))
```

```clj
(= [1 0] (let [n (rand-int 100000)] (__ n n)))
```

```clj
(= [22 6 10 5 0 19 6 9 6 31] (__ js/Number.MAX_SAFE_INTEGER 42))
```

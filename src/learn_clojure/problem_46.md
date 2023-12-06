# Problem 46, Flipping out

**Difficulty:** medium

Write a higher-order function which flips the order of the arguments of an input function.

```clj
(= 3 ((__ nth) 2 [1 2 3 4 5]))
```

```clj
(= true ((__ >) 7 8))
```

```clj
(= 4 ((__ quot) 2 8))
```

```clj
(= [1 2 3] ((__ take) [1 2 3 4 5] 3))
```

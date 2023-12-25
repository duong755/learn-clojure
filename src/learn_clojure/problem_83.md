# Problem 83, A Half-Truth

**Difficulty:** easy

Write a function which takes a variable number of booleans. Your function should return true if some of the parameters are true, but not all of the parameters are true. Otherwise your function should return false.

```clj
(= false (__ false false))
```

```clj
(= true (__ true false))
```

```clj
(= false (__ true))
```

```clj
(= true (__ false true false))
```

```clj
(= false (__ true true true))
```

```clj
(= true (__ true true true false))
```

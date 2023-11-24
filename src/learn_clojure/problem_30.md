# Problem 30, Compress a Sequence

**Difficulty:** easy

Write a function which removes consecutive duplicates from a sequence.

```clj
(= (apply str (__ "Leeeeeerrroyyy")) "Leroy")
```

```clj
(= (__ [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))
```

```clj
(= (__ [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))
```

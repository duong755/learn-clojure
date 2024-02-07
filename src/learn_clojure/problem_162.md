# Problem 162, Logical falsity and truth

**Difficulty:** elementary

In Clojure, only nil and false represent the values of logical falsity in conditional tests - anything else is logical truth.

```clj
(= __ (if-not false 1 0))
```

```clj
(= __ (if-not nil 1 0))
```

```clj
(= __ (if true 1 0))
```

```clj
(= __ (if [] 1 0))
```

```clj
(= __ (if [0] 1 0))
```

```clj
(= __ (if 0 1 0))
```

```clj
(= __ (if 1 1 0))
```

# Problem 14, Functions

**Difficulty:** elementary

Clojure has many different ways to create functions.

```clj
(= __ ((fn add-five [x] (+ x 5)) 3))
```

```clj
(= __ ((fn [x] (+ x 5)) 3))
```

```clj
(= __ (#(+ % 5) 3))
```

```clj
(= __ ((partial + 5) 3))
```

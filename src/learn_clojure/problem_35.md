# Problem 35, Local bindings

**Difficulty:** elementary

Clojure lets you give local names to values using the special let-form.

```clj
(= __ (let [x 5] (+ 2 x)))
```

```clj
(= __ (let [x 3, y 10] (- y x)))
```

```clj
(= __ (let [x 21] (let [y 3] (/ x y))))
```

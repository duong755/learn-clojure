# Problem 10, Maps

**Difficulty:** elementary

Maps store key-value pairs. Both maps and keywords can be used as lookup functions. Commas are whitespace.

```clj
(= __ ((hash-map :a 10, :b 20, :c 30) :b))
```

```clj
(= __ (:b {:a 10, :b 20, :c 30}))
```

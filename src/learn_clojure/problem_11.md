# Problem 11, conj on maps

**Difficulty:** elementary

When operating on a map, the conj function returns a new map with one or more key-value pairs "added".

```clj
(= {:a 1, :b 2, :c 3} (conj {:a 1} __ [:c 3]))
```

# Problem 161, Subset and Superset

**Difficulty:** elementary

Set A is a subset of set B, or equivalently B is a superset of A, if A is "contained" inside B. A and B may coincide.

```clj
(clojure.set/superset? __ #{2})
```

```clj
(clojure.set/subset? #{1} __)
```

```clj
(clojure.set/superset? __ #{1 2})
```

```clj
(clojure.set/subset? #{1 2} __)
```

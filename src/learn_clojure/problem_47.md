# Problem 47, Contain Yourself

**Difficulty:** easy

The contains? function checks if a KEY is present in a given collection. This often leads beginner clojurians to use it incorrectly with numerically indexed collections like vectors and lists.

```clj
(contains? #{4 5 6} __)
```

```clj
(contains? [1 1 1 1 1] __)
```

```clj
(contains? {4 :a 2 :b} __)
```

```clj
(not (contains? [1 2 4] __))
```

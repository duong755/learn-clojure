# Problem 134, A nil key

**Difficulty:** elementary

Write a function which, given a key and map, returns true iff the map contains an entry with that key and its value is nil.

```clj
(true?  (__ :a {:a nil :b 2}))
```

```clj
(false? (__ :b {:a nil :b 2}))
```

```clj
(false? (__ :c {:a nil :b 2}))
```

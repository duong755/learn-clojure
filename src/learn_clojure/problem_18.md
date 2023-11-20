# Problem 18, filter

**Difficulty:** elementary

The filter function takes two arguments: a predicate function (f) and a sequence (s). Filter returns a new sequence consisting of all the items of s for which (f item) returns true.

```clj
(= __ (filter #(> % 5) '(3 4 5 6 7)))
```

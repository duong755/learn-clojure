# Problem 81, Set Intersection

**Difficulty:** easy

Write a function which returns the intersection of two sets. The intersection is the sub-set of items that each set has in common.

```clj
(= (__ #{0 1 2 3} #{2 3 4 5}) #{2 3})
```

```clj
(= (__ #{0 1 2} #{3 4 5}) #{})
```

```clj
(= (__ #{:a :b :c :d} #{:c :e :a :f :d}) #{:a :c :d})
```

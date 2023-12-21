# Problem 85, Power Set

**Difficulty:** medium

Write a function which generates the power set of a given set. The power set of a set x is the set of all subsets of x, including the empty set and x itself.

```clj
(= (__ #{1 :a}) #{#{1 :a} #{:a} #{} #{1}})
```

```clj
(= (__ #{}) #{#{}})
```

```clj
(= (__ #{1 2 3})
   #{#{} #{1} #{2} #{3} #{1 2} #{1 3} #{2 3} #{1 2 3}})
```

```clj
(= (count (__ (into #{} (range 10)))) 1024)
```

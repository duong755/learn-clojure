# Problem 41, Drop Every Nth Item

**Difficulty:** easy

Write a function which drops every Nth item from a sequence.

```clj
(= (__ [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8])
```

```clj
(= (__ [:a :b :c :d :e :f] 2) [:a :c :e])
```

```clj
(= (__ [1 2 3 4 5 6] 4) [1 2 3 5 6])
```

# Problem 40, Interpose a Seq

**Difficulty:** easy

Write a function which separates the items of a sequence by an arbitrary value.

```clj
(= (__ 0 [1 2 3]) [1 0 2 0 3])
```

```clj
(= (apply str (__ ", " ["one" "two" "three"])) "one, two, three")
```

```clj
(= (__ :z [:a :b :c :d]) [:a :z :b :z :c :z :d])
```

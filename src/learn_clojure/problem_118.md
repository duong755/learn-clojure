# Problem 118, Re-implement Map

**Difficulty:** easy

Map is one of the core elements of a functional programming language. Given a function f and an input sequence s, return a lazy sequence of (f x) for each element x in s.

```clj
(= [3 4 5 6 7]
                       (__ inc [2 3 4 5 6]))
```

```clj
(= (repeat 10 nil)
                       (__ (fn [_] nil) (range 10)))
```

```clj
(= [1000000 1000001]
                       (->> (__ inc (range))
                            (drop (dec 1000000))
                            (take 2)))
```

```clj
(= [1000000 1000001]
                       (->> (__ inc (range))
                            (drop (dec 1000000))
                            (take 2)))
```

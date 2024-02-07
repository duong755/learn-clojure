# Problem 158, Decurry

**Difficulty:** medium

Write a function that accepts a curried function of unknown arity n. Return an equivalent function of n arguments.

```clj
(= 10 ((__ (fn [a]
                                (fn [b]
                                  (fn [c]
                                    (fn [d]
                                      (+ a b c d))))))
                          1 2 3 4))
```

```clj
(= 24 ((__ (fn [a]
                                (fn [b]
                                  (fn [c]
                                    (fn [d]
                                      (* a b c d))))))
                          1 2 3 4))
```

```clj
(= 25 ((__ (fn [a]
                                (fn [b]
                                  (* a b))))
                          5 5))
```

# Problem 58, Function Composition

**Difficulty:** medium

Write a function which allows you to create function compositions. The parameter list should take a variable number of functions, and create a function applies them from right-to-left.

```clj
(= [3 2 1] ((__ rest reverse) [1 2 3 4]))
```

```clj
(= 5 ((__ (partial + 3) second) [1 2 3 4]))
```

```clj
(= true ((__ zero? #(mod % 8) +) 3 5 7 9))
```

```clj
(= "HELLO" ((__ #(.toUpperCase %) #(apply str %) take) 5 "hello world"))
```


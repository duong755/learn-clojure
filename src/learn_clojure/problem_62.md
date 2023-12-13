# Problem 62, Re-implement Iteration

**Difficulty:** easy

Given a side-effect free function f and an initial value x write a function which returns an infinite lazy sequence of x, (f x), (f (f x)), (f (f (f x))), etc.

```clj
(= (take 5 (__ #(* 2 %) 1)) [1 2 4 8 16])
```

```clj
(= (take 100 (__ inc 0)) (take 100 (range)))
```

```clj
(= (take 9 (__ #(inc (mod % 3)) 1)) (take 9 (cycle [1 2 3])))
```

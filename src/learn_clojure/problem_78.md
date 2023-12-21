# Problem 78, Reimplement Trampoline

**Difficulty:** medium

Reimplement the function described in ["Intro to Trampoline"](https://4clojure.oxal.org/#/problem/76).

```clj
(= (letfn [(triple [x] #(sub-two (* 3 x)))
          (sub-two [x] #(stop?(- x 2)))
          (stop? [x] (if (> x 50) x #(triple x)))]
    (__ triple 2))
  82)
```

```clj
(= (letfn [(my-even? [x] (if (zero? x) true #(my-odd? (dec x))))
          (my-odd? [x] (if (zero? x) false #(my-even? (dec x))))]
    (map (partial __ my-even?) (range 6)))
  [true false true false true false])
```

# Problem 145, For the win

**Difficulty:** elementary

Clojure's for macro is a tremendously versatile mechanism for producing a sequence based on some other sequence(s). It can take some time to understand how to use it properly, but that investment will be paid back with clear, concise sequence-wrangling later. With that in mind, read over these for expressions and try to see how each of them produces the same result.

```clj
(= __ (for [x (range 40)
                               :when (= 1 (rem x 4))]
                           x))
```

```clj
(= __ (for [x (iterate #(+ 4 %) 0)
                               :let [z (inc x)]
                               :while (< z 40)]
                           z))
```

```clj
(= __ (for [[x y] (partition 2 (range 20))]
                           (+ x y)))
```

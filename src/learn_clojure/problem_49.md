# Problem 49, Split a sequence

**Difficulty:** easy

Write a function which will split a sequence into two parts.

```clj
(= (__ 3 [1 2 3 4 5 6]) [[1 2 3] [4 5 6]])
```

```clj
(= (__ 1 [:a :b :c :d]) [[:a] [:b :c :d]])
```

```clj
(= (__ 2 [[1 2] [3 4] [5 6]]) [[[1 2] [3 4]] [[5 6]]])
```

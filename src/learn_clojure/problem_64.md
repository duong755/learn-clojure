# Problem 64, Intro to Reduce

**Difficulty:** elementary

Reduce takes a 2 argument function and an optional starting value. It then applies the function to the first 2 items in the sequence (or the starting value and the first element of the sequence). In the next iteration the function will be called on the previous return value and the next item from the sequence, thus reducing the entire collection to one value. Don't worry, it's not as complicated as it sounds.

```clj
(= 15 (reduce __ [1 2 3 4 5]))
```

```clj
(=  0 (reduce __ []))
```

```clj
(=  6 (reduce __ 1 [2 3]))
```

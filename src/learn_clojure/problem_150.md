# Problem 150, Palindromic Numbers

**Difficulty:** medium

A palindromic number is a number that is the same when written forwards or backwards (e.g., 3, 99, 14341). Write a function which takes an integer n, as its only argument, and returns an increasing lazy sequence of all palindromic numbers that are not less than n. The most simple solution will exceed the time limit!

```clj
(= (take 26 (__ 0))
                      [0 1 2 3 4 5 6 7 8 9
                       11 22 33 44 55 66 77 88 99
                       101 111 121 131 141 151 161])
```

```clj
(= (take 16 (__ 162))
                      [171 181 191 202
                       212 222 232 242
                       252 262 272 282
                       292 303 313 323])
```

```clj
(= (take 6 (__ 1234550000))
                      [1234554321 1234664321 1234774321
                       1234884321 1234994321 1235005321])
```

```clj
(= (first (__ (* 111111111 111111111)))
                      (* 111111111 111111111))
```

```clj
(= (set (take 199 (__ 0)))
                      (set (map #(first (__ %)) (range 0 10000))))
```

```clj
(= true
                      (apply < (take 6666 (__ 9999999))))
```

```clj
(= (nth (__ 0) 10101)
                      9102019)
```

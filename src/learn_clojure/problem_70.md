# Problem 70, Word Sorting

**Difficulty:** medium

Write a function which splits a sentence up into a sorted list of words. Capitalization should not affect sort order and punctuation should be ignored.

```clj
(= (__  "Have a nice day.")
   ["a" "day" "Have" "nice"])
```

```clj
(= (__  "Clojure is a fun language!")
   ["a" "Clojure" "fun" "is" "language"])
```

```clj
(= (__  "Fools fall for foolish follies.")
   ["fall" "follies" "foolish" "Fools" "for"])
```

# Problem 90, Cartesian Product

**Difficulty:** easy

Write a function which calculates the Cartesian product of two sets.

```clj
(= (__ #{"ace" "king" "queen"} #{"♠" "♥" "♦" "♣"})
   #{["ace"   "♠"] ["ace"   "♥"] ["ace"   "♦"] ["ace"   "♣"]
     ["king"  "♠"] ["king"  "♥"] ["king"  "♦"] ["king"  "♣"]
     ["queen" "♠"] ["queen" "♥"] ["queen" "♦"] ["queen" "♣"]})
```

```clj
(= (__ #{1 2 3} #{4 5})
   #{[1 4] [2 4] [3 4] [1 5] [2 5] [3 5]})
```

```clj
(= 300 (count (__ (into #{} (range 10))
                  (into #{} (range 30)))))
```

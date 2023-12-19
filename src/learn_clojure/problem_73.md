# Problem 73, Analyze a Tic-Tac-Toe Board

**Difficulty:** hard

A tic-tac-toe board is represented by a two dimensional vector. X is represented by :x, O is represented by :o, and empty is represented by :e. A player wins by placing three Xs or three Os in a horizontal, vertical, or diagonal row. Write a function which analyzes a tic-tac-toe board and returns :x if X has won, :o if O has won, and nil if neither player has won.

```clj
(= nil (__ [[:e :e :e]
            [:e :e :e]
            [:e :e :e]]))
```

```clj
(= :x (__ [[:x :e :o]
           [:x :e :e]
           [:x :e :o]]))
```

```clj
(= :o (__ [[:e :x :e]
           [:o :o :o]
           [:x :e :x]]))
```

```clj
(= nil (__ [[:x :e :o]
            [:x :x :e]
            [:o :x :o]]))
```

```clj
(= :x (__ [[:x :e :e]
           [:o :x :e]
           [:o :e :x]]))
```

```clj
(= :o (__ [[:x :e :o]
           [:x :o :e]
           [:o :e :x]]))
```

```clj
(= nil (__ [[:x :o :x]
            [:x :o :x]
            [:o :x :o]]))
```

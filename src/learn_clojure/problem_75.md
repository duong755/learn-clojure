# Problem 75, Euler's Totient Function

**Difficulty:** medium

Two numbers are coprime if their greatest common divisor equals 1. Euler's totient function f(x) is defined as the number of positive integers less than x which are coprime to x. The special case f(1) equals 1. Write a function which calculates Euler's totient function.

```clj
(= (__ 1) 1)
```

```clj
(= (__ 10) (count '(1 3 7 9)) 4)
```

```clj
(= (__ 40) 16)
```

```clj
(= (__ 99) 60)
```

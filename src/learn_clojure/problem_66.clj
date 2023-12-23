(ns learn-clojure.problem-66)

(defn result-1-gcd
  [a b]
  (if (zero? (rem a b))
    b
    (result-1-gcd b (rem a b))))

(defn result-2-gcd
  [a b]
  (loop [x a
         y b]
    (if (zero? (rem x y))
      y
      (recur y (rem x y)))))

(defn result-3-gcd
  "Extended Euclidean algorithm"
  [a b]
  (loop [r0 a, r1 b
         s0 1, s1 0
         t0 0, t1 1]
    (if (zero? r1)
      r0
      (let [q (quot r0 r1)]
        (recur
         r1 (- r0 (* q r1))
         s1 (- s0 (* q s1))
         t1 (- t0 (* q t1)))))))

(defn problem_66 []
  (println "Problem 66, Greatest Common Divisor")
  (assert (= (result-1-gcd 2 4) 2))
  (assert (= (result-1-gcd 10 5) 5))
  (assert (= (result-1-gcd 5 7) 1))
  (assert (= (result-1-gcd 1023 858) 33))

  (assert (= (result-2-gcd 2 4) 2))
  (assert (= (result-2-gcd 10 5) 5))
  (assert (= (result-2-gcd 5 7) 1))
  (assert (= (result-2-gcd 1023 858) 33))

  (assert (= (result-3-gcd 2 4) 2))
  (assert (= (result-3-gcd 10 5) 5))
  (assert (= (result-3-gcd 5 7) 1))
  (assert (= (result-3-gcd 1023 858) 33)))

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

(defn problem_66 []
  (println "Problem 66, Greatest Common Divisor")
  (assert (= (result-1-gcd 2 4) 2))
  (assert (= (result-1-gcd 10 5) 5))
  (assert (= (result-1-gcd 5 7) 1))
  (assert (= (result-1-gcd 1023 858) 33))

  (assert (= (result-2-gcd 2 4) 2))
  (assert (= (result-2-gcd 10 5) 5))
  (assert (= (result-2-gcd 5 7) 1))
  (assert (= (result-2-gcd 1023 858) 33)))
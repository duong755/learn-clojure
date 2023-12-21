(ns learn-clojure.problem-75)

(defn result-1-euler-totient
  [n]
  (letfn [(gcd [a b]
            (loop [x a
                   y b]
              (if (zero? (mod x y))
                y
                (recur y (mod x y)))))
          (coprime? [a b]
            (= 1 (gcd a b)))]
    (count (filter #(coprime? n %) (range 1 (inc n))))))

(defn problem-75 []
  (println "Problem 75, Euler's Totient Function")
  (assert (= (result-1-euler-totient 1) 1))
  (assert (= (result-1-euler-totient 10) (count '(1 3 7 9))) 4)
  (assert (= (result-1-euler-totient 40) 16))
  (assert (= (result-1-euler-totient 99) 60)))

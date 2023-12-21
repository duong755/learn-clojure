(ns learn-clojure.problem-80)

(defn result-1-perfect
  [n]
  (= n
     (reduce
      #(if (zero? (mod n %2)) (+ %1 %2) %1)
      0
      (range 1 n))))

(defn problem-80 []
  (println "Problem 80, Perfect Numbers")
  (assert (= (result-1-perfect 6) true))
  (assert (= (result-1-perfect 7) false))
  (assert (= (result-1-perfect 496) true))
  (assert (= (result-1-perfect 500) false))
  (assert (= (result-1-perfect 8128) true)))

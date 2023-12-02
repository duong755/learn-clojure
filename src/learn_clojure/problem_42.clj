(ns learn-clojure.problem-42)

(defn result-1-factorial
  [n]
  (loop [result 1
         next n]
    (if (zero? next)
      result
      (recur (* result next) (dec next)))))

(defn problem_42 []
  (println "Problem 42, Factorial Fun")

  (assert (= (result-1-factorial 1) 1))
  (assert (= (result-1-factorial 3) 6))
  (assert (= (result-1-factorial 5) 120))
  (assert (= (result-1-factorial 8) 40320)))

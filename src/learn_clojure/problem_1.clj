(ns learn-clojure.problem-1)

(defn problem_1 []
  (println "Problem 1, Nothing but the truth")
  (assert (= true true))
  (assert (= (= 1 1) true))
  (assert (= (< 1 2) true))
  (assert (= (not= 1 2) true))
  (assert (= (not false) true)))


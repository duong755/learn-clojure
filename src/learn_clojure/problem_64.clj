(ns learn-clojure.problem-64)

(defn problem_64 []
  (println "Problem 64, Intro to Reduce")
  (assert (= 15 (reduce + [1 2 3 4 5])))
  (assert (=  0 (reduce + [])))
  (assert (=  6 (reduce + 1 [2 3]))))

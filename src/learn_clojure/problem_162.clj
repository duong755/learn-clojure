(ns learn-clojure.problem-162)

(def result 1)

(defn problem_162
  []
  (println "Problem 162, Logical falsity and truth")
  (assert (= result (if-not false 1 0)))
  (assert (= result (if-not nil 1 0)))
  (assert (= result (if true 1 0)))
  (assert (= result (if [] 1 0)))
  (assert (= result (if [0] 1 0)))
  (assert (= result (if 0 1 0)))
  (assert (= result (if 1 1 0))))

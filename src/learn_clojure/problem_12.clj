(ns learn-clojure.problem-12)

(defn problem_12 []
  (println "Problem 12, Sequences")
  (let [result 3]
    (assert (= result (first '(3 2 1))))
    (assert (= result (second [2 3 4])))
    (assert (= result (last (list 1 2 3))))))

(ns learn-clojure.problem-13)

(defn problem_13 []
  (println "Problem 13, rest")
  (assert (= [20 30 40] (rest [10 20 30 40])))
  (assert (= '(20 30 40) (rest [10 20 30 40]))))

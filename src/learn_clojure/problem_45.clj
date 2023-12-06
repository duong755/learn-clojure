(ns learn-clojure.problem-45)

(defn problem_45 []
  (println "Problem 45, Intro to Iterate")

  (assert (= '(1 4 7 10 13) (take 5 (iterate #(+ 3 %) 1)))))

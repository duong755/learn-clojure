(ns learn-clojure.problem-38)

(defn result-1-max
  [& args]
  (reduce #(if (< %1 %2) %2 %1) ##-Inf args))

(defn problem_38 []
  (println "Problem 38, Maximum value")
  (assert (= (result-1-max 1 8 3 4) 8))
  (assert (= (result-1-max 30 20) 30))
  (assert (= (result-1-max 45 67 11) 67)))

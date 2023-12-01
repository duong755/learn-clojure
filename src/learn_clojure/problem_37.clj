(ns learn-clojure.problem-37)

(defn problem_37 []
  (println "Problem 37, Regular Expressions")
  (= "ABC" (apply str (re-seq #"[A-Z]+" "bA1B3Ce "))))

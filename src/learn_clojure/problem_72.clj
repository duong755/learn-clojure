(ns learn-clojure.problem-72)

(defn problem_72 []
  (println "Problem 72, Rearranging Code ->>")
  (assert (= (apply + (map inc (take 3 (drop 2 [2 5 4 1 3 6]))))
             (->> [2 5 4 1 3 6] (drop 2) (take 3) (map inc) (apply +))
             11)))

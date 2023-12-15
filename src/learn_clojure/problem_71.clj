(ns learn-clojure.problem-71)

(defn problem_71 []
  (println "Problem 71, Rearranging Code: ->")
  (assert (= (last (sort (rest (reverse [2 5 4 1 3 6]))))
             (-> [2 5 4 1 3 6] reverse rest sort last)
             5)))

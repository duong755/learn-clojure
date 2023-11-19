(ns learn-clojure.problem-9)

(defn problem_9 []
  (println "Problem 9, conj on sets")
  (let [result 2]
    (assert
     (= #{1 2 3 4} (conj #{1 4 3} result)))))

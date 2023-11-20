(ns learn-clojure.problem-17)

(defn problem_17 []
  (println "Problem 17, map")
  (let [result '(6 7 8)]
    (assert (= result (map #(+ % 5) '(1 2 3))))))

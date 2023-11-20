(ns learn-clojure.problem-18)

(defn problem_18 []
  (println "Problem 18, filter")
  (let [result '(6 7)]
    (assert (= result (filter #(> % 5) '(3 4 5 6 7))))))

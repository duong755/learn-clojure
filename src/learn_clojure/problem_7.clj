(ns learn-clojure.problem-7)

(defn problem_7 []
  (println "Problem 7, conj on vectors")
  (let [result [1 2 3 4]]
    (assert true
            (= result (conj [1 2 3] 4)))
    (assert true
            (= result (conj [1 2] 3 4)))))


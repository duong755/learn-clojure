(ns learn-clojure.problem-5)

(defn problem_5 []
  (println "Problem 5, conj on lists")
  (let [result '(1 2 3 4)]
    (assert true
            (= result (conj '(2 3 4) 1)))
    (assert true
            (= result (conj '(3 4) 2 1)))))

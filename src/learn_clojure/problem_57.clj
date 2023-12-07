(ns learn-clojure.problem-57)

(defn problem_57 []
  (println "Problem 57, Simple Recursion")
  (let [result '(5 4 3 2 1)]
    (assert (= result ((fn foo [x] (when (> x 0) (conj (foo (dec x)) x))) 5)))))

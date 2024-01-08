(ns learn-clojure.problem-143)

(def result-1-dot-product #(apply + (apply map * %&)))

(defn problem_143
  []
  (println "Problem 143, Dot Product")
  (assert (= 0 (result-1-dot-product [0 1 0] [1 0 0])))
  (assert (= 3 (result-1-dot-product [1 1 1] [1 1 1])))
  (assert (= 32 (result-1-dot-product [1 2 3] [4 5 6])))
  (assert (= 256 (result-1-dot-product [2 5 6] [100 10 1]))))

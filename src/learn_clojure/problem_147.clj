(ns learn-clojure.problem-147)

(defn result-1-pascal-trapezoid
  [row]
  (iterate
   (fn [current-row]
     (map +' (conj (vec current-row) 0) (vec (cons 0 current-row))))
   row))

(defn problem_147
  []
  (println "Problem 147, Pascal's Trapezoid")
  (assert (= (second (result-1-pascal-trapezoid [2 3 2])) [2 5 5 2]))
  (assert (= (take 5 (result-1-pascal-trapezoid [1])) [[1] [1 1] [1 2 1] [1 3 3 1] [1 4 6 4 1]]))
  (assert (= (take 2 (result-1-pascal-trapezoid [3 1 2])) [[3 1 2] [3 4 3 2]]))
  (assert (= (take 100 (result-1-pascal-trapezoid [2 4 2])) (rest (take 101 (result-1-pascal-trapezoid [2 2]))))))

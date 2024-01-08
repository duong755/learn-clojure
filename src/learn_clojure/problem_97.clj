(ns learn-clojure.problem-97)

(defn result-1-pascal
  [n]
  (map
   (partial first)
   (take n
         (iterate
          #(vector
            (/ (* (first %) (second %)) (- n (second %)))
            (dec (second %))) [1 (dec n)]))))

(defn problem_97
  []
  (println "Problem 97, Pascal's Triangle")
  (assert (= (result-1-pascal 1) [1]))
  (assert (= (map result-1-pascal (range 1 6))
             [[1]
              [1 1]
              [1 2 1]
              [1 3 3 1]
              [1 4 6 4 1]]))
  (assert (= (result-1-pascal 11)
             [1 10 45 120 210 252 210 120 45 10 1])))

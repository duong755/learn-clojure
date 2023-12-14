(ns learn-clojure.problem-67)

(defn result-1-prime-seq
  [n]
  (let [prime? (fn [x]
                 (when (>= x 2)
                   (loop [n 2]
                     (if (> (* n n) x)
                       true
                       (if (zero? (rem x n))
                         false
                         (recur (inc n)))))))]
    (take n (filter prime? (iterate inc 2)))))

(defn problem_67 []
  (println "Problem 67, Prime Numbers")
  (assert (= (result-1-prime-seq 2) [2 3]))
  (assert (= (result-1-prime-seq 5) [2 3 5 7 11]))
  (assert (= (last (result-1-prime-seq 100)) 541)))

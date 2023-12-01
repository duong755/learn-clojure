(ns learn-clojure.problem-24)

(defn result-1-sum [s]
  (if (zero? (count s))
    0
    (+ (first s) (result-1-sum (rest s)))))

(defn result-2-sum [x]
  (loop [input-seq x, result 0]
    (if (empty? input-seq)
      result
      (recur
       (rest input-seq)
       (long (+ result (first input-seq)))))))

(defn problem_24 []
  (println "Problem 24, Sum It All Up")

  (assert (= (result-1-sum [1 2 3]) 6))
  (assert (= (result-1-sum (list 0 -2 5 5)) 8))
  (assert (= (result-1-sum #{4 2 1}) 7))
  (assert (= (result-1-sum '(0 0 -1)) -1))
  (assert (= (result-1-sum '(1 10 3)) 14))

  (assert (= (reduce + [1 2 3]) 6))
  (assert (= (reduce + (list 0 -2 5 5)) 8))
  (assert (= (reduce + #{4 2 1}) 7))
  (assert (= (reduce + '(0 0 -1)) -1))
  (assert (= (reduce + '(1 10 3)) 14))

  (assert (= (apply + [1 2 3]) 6))
  (assert (= (apply + (list 0 -2 5 5)) 8))
  (assert (= (apply + #{4 2 1}) 7))
  (assert (= (apply + '(0 0 -1)) -1))
  (assert (= (apply + '(1 10 3)) 14))

  (assert (= (result-2-sum [1 2 3]) 6))
  (assert (= (result-2-sum (list 0 -2 5 5)) 8))
  (assert (= (result-2-sum #{4 2 1}) 7))
  (assert (= (result-2-sum '(0 0 -1)) -1))
  (assert (= (result-2-sum '(1 10 3)) 14)))

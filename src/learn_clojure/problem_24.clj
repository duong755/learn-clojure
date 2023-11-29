(ns learn-clojure.problem-24)

(defn problem_24 []
  (println "Problem 24, Sum It All Up")
  (let [result-1
        (fn my-sum [x]
          (if (zero? (count x))
            0
            (+ (first x) (my-sum (rest x)))))]
    (assert (= (result-1 [1 2 3]) 6))
    (assert (= (result-1 (list 0 -2 5 5)) 8))
    (assert (= (result-1 #{4 2 1}) 7))
    (assert (= (result-1 '(0 0 -1)) -1))
    (assert (= (result-1 '(1 10 3)) 14)))

  (assert (= (reduce + [1 2 3]) 6))
  (assert (= (reduce + (list 0 -2 5 5)) 8))
  (assert (= (reduce + #{4 2 1}) 7))
  (assert (= (reduce + '(0 0 -1)) -1))
  (assert (= (reduce + '(1 10 3)) 14))

  (let [result-2
        (fn [x]
          (loop [input-seq x, result 0]
            (if (empty? input-seq)
              result
              (recur
               (rest input-seq)
               (long (+ result (first input-seq)))))))]
    (assert (= (result-2 [1 2 3]) 6))
    (assert (= (result-2 (list 0 -2 5 5)) 8))
    (assert (= (result-2 #{4 2 1}) 7))
    (assert (= (result-2 '(0 0 -1)) -1))
    (assert (= (result-2 '(1 10 3)) 14))))

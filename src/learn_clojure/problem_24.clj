(ns learn-clojure.problem-24)

(defn problem_24 []
  (println "Problem 24, Sum It All Up")
  (let [result-1
        (fn my-sum [x]
          (if (= (count x) 0)
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
  (assert (= (reduce + '(1 10 3)) 14)))

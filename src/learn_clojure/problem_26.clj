(ns learn-clojure.problem-26
  (:require clojure.data))

(defn problem_26 []
  (println "Problem 26, Fibonacci Sequence")
  (let [result
        (fn fib [n]
          (if (= n 0) '()
            (if (= n 1) '(1)
              (if (= n 2) '(1 1)
                (let [previous (fib (dec n))]
                  (concat previous
                          (conj nil (+ (last previous) (nth previous (- (count previous) 2))))))))))]
    (assert (= (result 3) '(1 1 2)))
    (assert (= (result 6) '(1 1 2 3 5 8)))
    (assert (= (result 8) '(1 1 2 3 5 8 13 21)))))

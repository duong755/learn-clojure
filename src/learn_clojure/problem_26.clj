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
    (assert (= (result 8) '(1 1 2 3 5 8 13 21))))
  (let [result-2
        (fn fib [n]
          (cond
            (= n 0) '()
            (= n 1) '(1)
            (= n 2) '(1 1)
            :else (let [previous (fib (dec n))]
                    (concat previous
                            (conj nil
                                  (+ (last previous)
                                     (last (butlast previous))))))))]
    (assert (= (result-2 3) '(1 1 2)))
    (assert (= (result-2 6) '(1 1 2 3 5 8)))
    (assert (= (result-2 8) '(1 1 2 3 5 8 13 21))))
  (let [result-3
        (fn [n]
          (loop [length n
                 fib-seq '(1)
                 first-num 1]
            (cond
              (= length 0) '()
              (= length 1) fib-seq
              :else (recur
               (dec length)
               (concat fib-seq (list first-num))
               (+ (last fib-seq) first-num)))))]
    (assert (= (result-3 3) '(1 1 2)))
    (assert (= (result-3 6) '(1 1 2 3 5 8)))
    (assert (= (result-3 8) '(1 1 2 3 5 8 13 21)))))

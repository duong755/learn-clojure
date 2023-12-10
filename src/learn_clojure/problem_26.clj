(ns learn-clojure.problem-26)

(defn result-1-fib
  [n]
  (if (= n 0) '()
      (if (= n 1) '(1)
          (if (= n 2) '(1 1)
              (let [previous (result-1-fib (dec n))]
                (concat previous
                        (conj nil (+ (last previous) (nth previous (- (count previous) 2))))))))))

(defn result-2-fib
  [n]
  (cond
    (= n 0) '()
    (= n 1) '(1)
    (= n 2) '(1 1)
    :else (let [previous (result-2-fib (dec n))]
            (concat previous
                    (conj nil
                          (+ (last previous)
                             (last (butlast previous))))))))

(defn result-3-fib
  [n]
  (loop [length n
         fib-seq '(1)
         next-num 1]
    (cond
      (= length 0) '()
      (= length 1) fib-seq
      :else (recur
             (dec length)
             (concat fib-seq (list next-num))
             (long (+ (last fib-seq) next-num))))))

(defn result-4-fib [n] (take n (map first (iterate (fn [[a b]] [b (+' a b)]) [1 1]))))

(defn problem_26 []
  (println "Problem 26, Fibonacci Sequence")

  (assert (= (result-1-fib 3) '(1 1 2)))
  (assert (= (result-1-fib 6) '(1 1 2 3 5 8)))
  (assert (= (result-1-fib 8) '(1 1 2 3 5 8 13 21)))

  (assert (= (result-2-fib 3) '(1 1 2)))
  (assert (= (result-2-fib 6) '(1 1 2 3 5 8)))
  (assert (= (result-2-fib 8) '(1 1 2 3 5 8 13 21)))

  (assert (= (result-3-fib 3) '(1 1 2)))
  (assert (= (result-3-fib 6) '(1 1 2 3 5 8)))
  (assert (= (result-3-fib 8) '(1 1 2 3 5 8 13 21)))

  (assert (= (result-4-fib 3) '(1 1 2)))
  (assert (= (result-4-fib 6) '(1 1 2 3 5 8)))
  (assert (= (result-4-fib 8) '(1 1 2 3 5 8 13 21))))

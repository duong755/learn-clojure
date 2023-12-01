(ns learn-clojure.problem-21)

(defn result-1-nth
  [s i]
  (if (zero? i)
    (first s)
    (result-1-nth
     (rest s) (dec i))))

(defn result-2-nth
  [s i]
  (loop [my-list s
         index i]
    (if (zero? index)
      (first my-list)
      (recur (rest my-list) (dec index)))))

(defn problem_21 []
  (println "Problem 21, Nth Element")

  (assert (= (result-1-nth '(4 5 6 7) 2) 6))
  (assert (= (result-1-nth [:a :b :c] 0) :a))
  (assert (= (result-1-nth [1 2 3 4] 1) 2))
  (assert (= (result-1-nth '([1 2] [3 4] [5 6]) 2) [5 6]))

  (assert (= (result-2-nth '(4 5 6 7) 2) 6))
  (assert (= (result-2-nth [:a :b :c] 0) :a))
  (assert (= (result-2-nth [1 2 3 4] 1) 2))
  (assert (= (result-2-nth '([1 2] [3 4] [5 6]) 2) [5 6])))

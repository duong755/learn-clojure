(ns learn-clojure.problem-33)

(defn result-1-replicate [s n]
  (reduce
   #(concat %1 (repeat n %2)) (empty s) s))

(defn problem_33 []
  (println "Problem 33, Replicate a Sequence")

  (assert (= (result-1-replicate [1 2 3] 2) '(1 1 2 2 3 3)))
  (assert (= (result-1-replicate [:a :b] 4) '(:a :a :a :a :b :b :b :b)))
  (assert (= (result-1-replicate [4 5 6] 1) '(4 5 6)))
  (assert (= (result-1-replicate [[1 2] [3 4]] 2) '([1 2] [1 2] [3 4] [3 4])))
  (assert (= (result-1-replicate [44 33] 2) [44 44 33 33])))

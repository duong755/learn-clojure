(ns learn-clojure.problem-33)

(defn problem_33 []
  (println "Problem 33, Replicate a Sequence")
  (let [my-replicate
        (fn [s n]
          (reduce
           #(concat %1 (repeat n %2)) (empty s) s))]
    (assert (= (my-replicate [1 2 3] 2) '(1 1 2 2 3 3)))
    (assert (= (my-replicate [:a :b] 4) '(:a :a :a :a :b :b :b :b)))
    (assert (= (my-replicate [4 5 6] 1) '(4 5 6)))
    (assert (= (my-replicate [[1 2] [3 4]] 2) '([1 2] [1 2] [3 4] [3 4])))
    (assert (= (my-replicate [44 33] 2) [44 44 33 33]))))

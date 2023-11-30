(ns learn-clojure.problem-32)

(defn problem_32 []
  (println "Problem 32, Duplicate a Sequence")
  (let [duplicate
        (fn [s]
          (reduce
           #(concat %1 (list %2 %2)) (empty s) s))]
    (assert (= (duplicate [1 2 3]) '(1 1 2 2 3 3)))
    (assert (= (duplicate [:a :a :b :b]) '(:a :a :a :a :b :b :b :b)))
    (assert (= (duplicate [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4])))
    (assert (= (duplicate [44 33]) [44 44 33 33]))))

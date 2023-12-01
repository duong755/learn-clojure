(ns learn-clojure.problem-32)

(defn result-1-duplicate [s]
  (reduce
   #(concat %1 (list %2 %2)) (empty s) s))

(defn problem_32 []
  (println "Problem 32, Duplicate a Sequence")

  (assert (= (result-1-duplicate [1 2 3]) '(1 1 2 2 3 3)))
  (assert (= (result-1-duplicate [:a :a :b :b]) '(:a :a :a :a :b :b :b :b)))
  (assert (= (result-1-duplicate [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4])))
  (assert (= (result-1-duplicate [44 33]) [44 44 33 33])))

(ns learn-clojure.problem-88
  (:require clojure.set))

(defn result-1-symmetric-difference
  [set1 set2]
  (clojure.set/union
   (reduce #(if (contains? set2 %2) %1 (conj %1 %2)) #{} set1)
   (reduce #(if (contains? set1 %2) %1 (conj %1 %2)) #{} set2)))

(defn problem_88
  []
  (println "Problem 88, Symmetric Difference")
  (assert (= (result-1-symmetric-difference #{1 2 3 4 5 6} #{1 3 5 7}) #{2 4 6 7}))
  (assert (= (result-1-symmetric-difference #{:a :b :c} #{}) #{:a :b :c}))
  (assert (= (result-1-symmetric-difference #{} #{4 5 6}) #{4 5 6}))
  (assert (= (result-1-symmetric-difference #{[1 2] [2 3]} #{[2 3] [3 4]}) #{[1 2] [3 4]})))

(ns learn-clojure.problem-54)

(defn result-1-partition
  [len input-seq]
  (loop [result (empty input-seq)
         the-rest input-seq]
    (if (< (count the-rest) len)
      result
      (recur (concat result (list (take len the-rest))) (drop len the-rest)))))

(defn problem_54 []
  (println "Problem 54, Partition a Sequence")
  (assert (= (result-1-partition 3 (range 9)) '((0 1 2) (3 4 5) (6 7 8))))
  (assert (= (result-1-partition 2 (range 8)) '((0 1) (2 3) (4 5) (6 7))))
  (assert (= (result-1-partition 3 (range 8)) '((0 1 2) (3 4 5)))))

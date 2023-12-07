(ns learn-clojure.problem-49)

(defn result-1-split-at
  [index input-seq]
  (concat (list (take index input-seq)) (list (drop index input-seq))))

(defn problem_49 []
  (println "Problem 49, Split a sequence")
  (assert (= (result-1-split-at 3 [1 2 3 4 5 6]) [[1 2 3] [4 5 6]]))
  (assert (= (result-1-split-at 1 [:a :b :c :d]) [[:a] [:b :c :d]]))
  (assert (= (result-1-split-at 2 [[1 2] [3 4] [5 6]]) [[[1 2] [3 4]] [[5 6]]])))

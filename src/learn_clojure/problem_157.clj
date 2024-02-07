(ns learn-clojure.problem-157)

(def result-1-index-seq #(map-indexed (fn [index value] [value index]) %))

(defn problem_157
  []
  (println "Problem 157, Indexing Sequences")
  (assert (= (result-1-index-seq [:a :b :c]) [[:a 0] [:b 1] [:c 2]]))
  (assert (= (result-1-index-seq [0 1 3]) '((0 0) (1 1) (3 2))))
  (assert (= (result-1-index-seq [[:foo] {:bar :baz}]) [[[:foo] 0] [{:bar :baz} 1]])))

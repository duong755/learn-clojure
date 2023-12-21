(ns learn-clojure.problem-55)

(defn result-1-count-occurrences
  [input-seq]
  (reduce
   #(if (%1 %2)
      (update %1 %2 inc)
      (assoc %1 %2 1)) {} input-seq))

(defn result-2-count-occurrences
  [input-seq]
  (loop [result {}
         [first-rest & rest-rest :as the-rest] input-seq]
    (if (empty? the-rest)
      result
      (if (result first-rest)
        (recur (update result first-rest inc) rest-rest)
        (recur (assoc result first-rest 1) rest-rest)))))

(defn problem_55 []
  (println "Problem 55, Count Occurences")
  (assert (= (result-1-count-occurrences [1 1 2 3 2 1 1]) {1 4, 2 2, 3 1}))
  (assert (= (result-1-count-occurrences [:b :a :b :a :b]) {:a 2, :b 3}))
  (assert (= (result-1-count-occurrences '([1 2] [1 3] [1 3])) {[1 2] 1, [1 3] 2}))

  (assert (= (result-2-count-occurrences [1 1 2 3 2 1 1]) {1 4, 2 2, 3 1}))
  (assert (= (result-2-count-occurrences [:b :a :b :a :b]) {:a 2, :b 3}))
  (assert (= (result-2-count-occurrences '([1 2] [1 3] [1 3])) {[1 2] 1, [1 3] 2})))

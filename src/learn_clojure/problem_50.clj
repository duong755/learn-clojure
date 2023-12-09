(ns learn-clojure.problem-50)

(defn result-1-split-by-type
  [input-seq]
  (loop [result []
         the-rest input-seq]
    (if (empty? the-rest)
      result
      (recur
       (concat result [(filter #(= (type (first the-rest)) (type %)) the-rest)])
       (filter #(not= (type (first the-rest)) (type %)) the-rest)))))

(defn result-2-split-by-type
  [input-seq]
  (->> input-seq
       (reduce
        #(if (contains? %1 (type %2))
           (update %1 (type %2) conj %2)
           (assoc %1 (type %2) [%2])) {} ,,,)
       (vals ,,,)))

(defn problem_50 []
  (println "Problem 50, Split by Type")
  (assert (= (set (result-1-split-by-type [1 :a 2 :b 3 :c])) #{[1 2 3] [:a :b :c]}))
  (assert (= (set (result-1-split-by-type [:a "foo"  "bar" :b])) #{[:a :b] ["foo" "bar"]}))
  (assert (= (set (result-1-split-by-type [[1 2] :a [3 4] 5 6 :b])) #{[[1 2] [3 4]] [:a :b] [5 6]}))

  (assert (= (set (result-2-split-by-type [1 :a 2 :b 3 :c])) #{[1 2 3] [:a :b :c]}))
  (assert (= (set (result-2-split-by-type [:a "foo"  "bar" :b])) #{[:a :b] ["foo" "bar"]}))
  (assert (= (set (result-2-split-by-type [[1 2] :a [3 4] 5 6 :b])) #{[[1 2] [3 4]] [:a :b] [5 6]})))

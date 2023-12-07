(ns learn-clojure.problem-56)

(defn result-1-distinct
  [input-seq]
  (reduce
   (fn [acc elem]
     (if (empty? (filter #(= % elem) acc))
       (concat acc (conj (empty input-seq) elem))
       acc))
   (empty input-seq) input-seq))

(defn result-2-distinct
  [input-seq]
  (loop [result (empty input-seq)
         the-rest input-seq
         cache {}]
    (if (empty? the-rest)
      result
      (let [next-elem (first the-rest)]
        (if (contains? cache next-elem)
          (recur result (rest the-rest) cache)
          (recur (concat result (conj nil next-elem)) (rest the-rest) (assoc cache next-elem nil)))))))

(defn problem_56 []
  (println "Problem 56, Find Distinct Items")
  (assert (= (result-1-distinct [1 2 1 3 1 2 4]) [1 2 3 4]))
  (assert (= (result-1-distinct [:a :a :b :b :c :c]) [:a :b :c]))
  (assert (= (result-1-distinct '([2 4] [1 2] [1 3] [1 3])) '([2 4] [1 2] [1 3])))
  (assert (= (result-1-distinct (range 50)) (range 50)))

  (assert (= (result-2-distinct [1 2 1 3 1 2 4]) [1 2 3 4]))
  (assert (= (result-2-distinct [:a :a :b :b :c :c]) [:a :b :c]))
  (assert (= (result-2-distinct '([2 4] [1 2] [1 3] [1 3])) '([2 4] [1 2] [1 3])))
  (assert (= (result-2-distinct (range 50)) (range 50))))

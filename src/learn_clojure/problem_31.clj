(ns learn-clojure.problem-31)

(defn result-1-pack
  [s]
  (reduce
   (fn [x y]
     (if (= (first (last x)) y)
       (concat (butlast x) (list (concat (last x) (list y))))
       (concat x (list (list y))))) (empty s) s))

(defn result-2-pack
  [s]
  (loop [result (empty s)
         the-rest s]
    (if (empty? the-rest)
      result
      (recur
       (concat result (list (take-while #(= (first the-rest) %) the-rest)))
       (drop-while #(= (first the-rest) %) the-rest)))))

(defn problem_31 []
  (println "Problem 31, Pack a Sequence")

  (assert (= (result-1-pack [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3))))
  (assert (= (result-1-pack [:a :a :b :b :c]) '((:a :a) (:b :b) (:c))))
  (assert (= (result-1-pack [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4]))))

  (assert (= (result-2-pack [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3))))
  (assert (= (result-2-pack [:a :a :b :b :c]) '((:a :a) (:b :b) (:c))))
  (assert (= (result-2-pack [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4])))))

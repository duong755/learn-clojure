(ns learn-clojure.problem-28)

(defn result-1-flatten
  [s]
  (reduce
   (fn [x y]
     (concat x
             (if (coll? y)
               (result-1-flatten y)
               (conj nil y)))) (empty s) s))

(defn result-2-flatten
  [s]
  (loop [result (empty s)
         my-seq s]
    (if (empty? my-seq)
      result
      (let [[x & xs] my-seq]
        (if (empty? xs)
          (if (coll? x)
            (recur result x)
            (concat result (conj nil x)))
          (if (coll? x)
            (recur result (concat x xs))
            (recur (concat result (conj nil x)) xs)))))))

(defn result-3-flatten
  [s]
  (loop [result (empty s)
         my-seq s]
    (if (empty? my-seq)
      result
      (let [[x & xs] my-seq]
        (if (coll? x)
          (recur result (concat x xs))
          (recur (concat result (conj nil x)) xs))))))


(defn problem_28 []
  (println "Problem 28, Flatten a Sequence")

  (assert (= (result-1-flatten '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6)))
  (assert (= (result-1-flatten ["a" ["b"] "c"]) '("a" "b" "c")))
  (assert (= (result-1-flatten '((((:a))))) '(:a)))

  (assert (= (result-2-flatten '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6)))
  (assert (= (result-2-flatten ["a" ["b"] "c"]) '("a" "b" "c")))
  (assert (= (result-2-flatten '((((:a))))) '(:a)))

  (assert (= (result-3-flatten '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6)))
  (assert (= (result-3-flatten ["a" ["b"] "c"]) '("a" "b" "c")))
  (assert (= (result-3-flatten '((((:a))))) '(:a))))

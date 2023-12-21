(ns learn-clojure.problem-60)

(defn result-1-reductions
  "reductions from https://github.com/clojure/clojure"
  ([f coll]
   (lazy-seq
    (if-let [s (seq coll)]
      (result-1-reductions f (first s) (rest s))
      (list (f)))))
  ([f init coll]
   (if (reduced? init)
     (list @init)
     (cons init
           (lazy-seq
            (when-let [s (seq coll)]
              (result-1-reductions f (f init (first s)) (rest s))))))))

(defn problem_60 []
  (println "Problem 60, Sequence Reductions")
  (assert (= (take 5 (result-1-reductions + (range))) [0 1 3 6 10]))
  (assert (= (result-1-reductions conj [1] [2 3 4]) [[1] [1 2] [1 2 3] [1 2 3 4]]))
  (assert (= (last (result-1-reductions * 2 [3 4 5])) (reduce * 2 [3 4 5]) 120)))

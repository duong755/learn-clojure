(ns learn-clojure.problem-31)

(defn problem_31 []
  (println "Problem 31, Pack a Sequence")
  (let [pack
        (fn [s]
          (reduce
           (fn [x y]
             (if (= (first (last x)) y)
               (concat (butlast x) (list (concat (last x) (list y))))
               (concat x (list (list y))))) (empty s) s))]
    (assert (= (pack [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3))))
    (assert (= (pack [:a :a :b :b :c]) '((:a :a) (:b :b) (:c))))
    (assert (= (pack [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4]))))))

(ns learn-clojure.problem-28)

(defn problem_28 []
  (println "Problem 28, Flatten a Sequence")
  (let [result
        (fn my-flatten [s]
          (reduce
           (fn [x y]
             (concat x
                     (if (coll? y)
                       (my-flatten y)
                       (conj nil y)))) (empty s) s))]
    (assert (= (result '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6)))
    (assert (= (result ["a" ["b"] "c"]) '("a" "b" "c")))
    (assert (= (result '((((:a))))) '(:a)))))

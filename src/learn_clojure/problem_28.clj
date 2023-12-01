(ns learn-clojure.problem-28)

(defn result-1-flatten
  [s]
  (reduce
   (fn [x y]
     (concat x
             (if (coll? y)
               (result-1-flatten y)
               (conj nil y)))) (empty s) s))

(defn problem_28 []
  (println "Problem 28, Flatten a Sequence")

  (assert (= (result-1-flatten '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6)))
  (assert (= (result-1-flatten ["a" ["b"] "c"]) '("a" "b" "c")))
  (assert (= (result-1-flatten '((((:a))))) '(:a))))

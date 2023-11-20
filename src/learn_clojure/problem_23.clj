(ns learn-clojure.problem-23)

(defn problem_23 []
  (println "Problem 23, Reverse a Sequence")
  (let [result
        (fn my-reverse [x]
          (if (< (count x) 2)
            x
            (concat
             (my-reverse (rest x))
             (conj nil (first x)))))]
    (assert
     (= (result [1 2 3 4 5]) [5 4 3 2 1]))
    (assert
     (= (result (sorted-set 5 7 2 7)) '(7 5 2)))
    (assert
     (= (result [[1 2] [3 4] [5 6]]) [[5 6] [3 4] [1 2]]))))

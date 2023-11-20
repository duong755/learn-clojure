(ns learn-clojure.problem-21)

(defn problem_21 []
  (println "Problem 21, Nth Element")
  (let [result
        (fn element-at [x y]
          (if (= y 0)
            (first x)
            (element-at
             (rest x) (dec y))))]
    (assert (= (result '(4 5 6 7) 2) 6))
    (assert (= (result [:a :b :c] 0) :a))
    (assert (= (result [1 2 3 4] 1) 2))
    (assert (= (result '([1 2] [3 4] [5 6]) 2) [5 6]))))

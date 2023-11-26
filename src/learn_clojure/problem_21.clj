(ns learn-clojure.problem-21)

(defn problem_21 []
  (println "Problem 21, Nth Element")
  (let [result
        (fn element-at [x y]
          (if (zero? y)
            (first x)
            (element-at
             (rest x) (dec y))))]
    (assert (= (result '(4 5 6 7) 2) 6))
    (assert (= (result [:a :b :c] 0) :a))
    (assert (= (result [1 2 3 4] 1) 2))
    (assert (= (result '([1 2] [3 4] [5 6]) 2) [5 6])))
  (let [result-2
        (fn element-at [x y]
          (loop [my-list x
                 index y]
            (if (zero? index)
              (first my-list)
              (recur (rest my-list) (dec index)))))]
    (assert (= (result-2 '(4 5 6 7) 2) 6))
    (assert (= (result-2 [:a :b :c] 0) :a))
    (assert (= (result-2 [1 2 3 4] 1) 2))
    (assert (= (result-2 '([1 2] [3 4] [5 6]) 2) [5 6]))))

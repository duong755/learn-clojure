(ns learn-clojure.problem-34)

(defn problem_34 []
  (println "Problem 34, Implement range")
  (let [my-range
        (fn [x y]
          (loop [result '()
                 start-from x]
            (let [next-result (concat result (list start-from))]
              (if (= start-from y) result
                  (if (< start-from y)
                    (recur next-result (inc start-from))
                    (recur next-result (dec start-from)))))))]
    (assert (= (my-range 1 4) '(1 2 3)))
    (assert (= (my-range -2 2) '(-2 -1 0 1)))
    (assert (= (my-range 5 8) '(5 6 7)))))

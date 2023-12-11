(ns learn-clojure.problem-34)

(defn result-1-range
  [x y]
  (lazy-seq
   (loop [result '()
          start-from x]
     (let [next-result (concat result (list start-from))]
       (if (= start-from y) result
           (if (< start-from y)
             (recur next-result (inc start-from))
             (recur next-result (dec start-from))))))))

(defn problem_34 []
  (println "Problem 34, Implement range")

  (assert (= (result-1-range 1 4) '(1 2 3)))
  (assert (= (result-1-range -2 2) '(-2 -1 0 1)))
  (assert (= (result-1-range 5 8) '(5 6 7))))

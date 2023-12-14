(ns learn-clojure.problem-68)

(defn problem_68 []
  (println "Problem 68, Recurring Theme")
  (assert (= [7 6 5 4 3]
             (loop [x 5
                    result []]
               (if (> x 0)
                 (recur (dec x) (conj result (+ 2 x)))
                 result)))))

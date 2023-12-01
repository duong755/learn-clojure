(ns learn-clojure.problem-35)

(defn problem_35 []
  (println "Problem 35, Local bindings")

  (assert (= 7 (let [x 5] (+ 2 x))))
  (assert (= 7 (let [x 3, y 10] (- y x))))
  (assert (= 7 (let [x 21] #_{:clj-kondo/ignore [:redundant-let]}
                           (let [y 3] (/ x y))))))

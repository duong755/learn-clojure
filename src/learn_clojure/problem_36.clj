(ns learn-clojure.problem-36)

(defn problem_36 []
  (println "Problem 36, Let it Be")
  (assert (= 10 (let [x 7 y 3] (+ x y))))
  (assert (= 4 (let [y 3 z 1] (+ y z))))
  (assert (= 1 (let [z 1] z))))

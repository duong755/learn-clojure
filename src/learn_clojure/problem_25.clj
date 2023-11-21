(ns learn-clojure.problem-25)

(defn problem_25 []
  (println "Problem 25, Find the odd numbers")
  (let [result (fn [x] (filter odd? x))]
    (assert
     (= (result #{1 2 3 4 5}) '(1 3 5)))
    (assert
     (= (result [4 2 1 6]) '(1)))
    (assert
     (= (result [2 2 4 6]) '()))
    (assert
     (= (result [1 1 1 3]) '(1 1 1 3)))))

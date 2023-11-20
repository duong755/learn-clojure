(ns learn-clojure.problem-20)

(defn problem_20 []
  (println "Problem 20, Penultimate Element")
  (let [result
        (fn second-to-last [x]
          (nth x (- (count x) 2)))]
    (assert (= (result (list 1 2 3 4 5)) 4))
    (assert (= (result ["a" "b" "c"]) "b"))
    (assert (= (result [[1 2] [3 4]]) [1 2]))))

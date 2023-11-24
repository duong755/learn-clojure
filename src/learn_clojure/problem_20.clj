(ns learn-clojure.problem-20)

(defn problem_20 []
  (println "Problem 20, Penultimate Element")
  (let [result
        (fn second-to-last [x]
          (nth x (- (count x) 2)))]
    (assert (= (result (list 1 2 3 4 5)) 4))
    (assert (= (result ["a" "b" "c"]) "b"))
    (assert (= (result [[1 2] [3 4]]) [1 2])))
  (let [result-2
        (fn second-to-last [x]
          (last (butlast x)))]
    (assert (= (result-2 (list 1 2 3 4 5)) 4))
    (assert (= (result-2 ["a" "b" "c"]) "b"))
    (assert (= (result-2 [[1 2] [3 4]]) [1 2])))
  (let [result-3
        (fn second-to-last [x]
          (if (= (count x) 2)
            (first x)
            (second-to-last (rest x))))]
    (assert (= (result-3 (list 1 2 3 4 5)) 4))
    (assert (= (result-3 ["a" "b" "c"]) "b"))
    (assert (= (result-3 [[1 2] [3 4]]) [1 2])))
  (let [result-4
        (fn second-to-last [x]
          (loop [input-list x]
            (if (= (count input-list) 2)
              (first input-list)
              (recur (rest input-list)))))]
    (assert (= (result-4 (list 1 2 3 4 5)) 4))
    (assert (= (result-4 ["a" "b" "c"]) "b"))
    (assert (= (result-4 [[1 2] [3 4]]) [1 2]))))

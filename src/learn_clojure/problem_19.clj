(ns learn-clojure.problem-19)

(defn problem_19 []
  (println "Problem 19, Last Element")
  (let [result
        (fn my-last [l]
          (nth l (dec (count l))))]
    (assert
     (= (result [1 2 3 4 5]) 5))
    (assert
     (= (result '(5 4 3)) 3))
    (assert
     (= (result ["b" "c" "d"]) "d")))
  (let [result-2
        (fn my-last [l]
          (if
           (= (count l) 1)
            (first l)
            (my-last (rest l))))]
    (assert
     (= (result-2 [1 2 3 4 5]) 5))
    (assert
     (= (result-2 '(5 4 3)) 3))
    (assert
     (= (result-2 ["b" "c" "d"]) "d")))
  (let [result-3
        (fn my-last [l]
          (loop [input-list l]
            (if (= (count input-list) 1)
              (first input-list)
              (recur (rest input-list)))))]
    (assert
     (= (result-3 [1 2 3 4 5]) 5))
    (assert
     (= (result-3 '(5 4 3)) 3))
    (assert
     (= (result-3 ["b" "c" "d"]) "d"))))

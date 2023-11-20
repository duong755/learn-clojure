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
     (= (result ["b" "c" "d"]) "d"))))

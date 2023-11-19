(ns learn-clojure.problem-14)

(defn problem_14 []
  (println "Problem 14, Functions")
  (let [result 8]
    (assert (= result
               ((fn add-five [x] (+ x 5)) 3)))
    (assert (= result
               ((fn [x] (+ x 5)) 3)))
    (assert (= result
               (#(+ % 5) 3)))
    (assert (= result
               ((partial + 5) 3)))))

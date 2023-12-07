(ns learn-clojure.problem-51)

(defn problem_51 []
  (println "Problem 51, Advanced Destructuring")
  (let [result [1 2 3 4 5]]
    (assert (= [1 2 [3 4 5] [1 2 3 4 5]] (let [[a b & c :as d] result] [a b c d])))))

(ns learn-clojure.problem-107)

(defn result-1-power
  [n]
  (fn [x]
    (apply * (repeat n x))))

(defn problem_107
  []
  (println "Problem 107, Simple closures")
  (assert (= 256 ((result-1-power 2) 16), ((result-1-power 8) 2)))
  (assert (= [1 8 27 64] (map (result-1-power 3) [1 2 3 4])))
  (assert (= [1 2 4 8 16] (map #((result-1-power %) 2) [0 1 2 3 4]))))

(ns learn-clojure.problem-47)

(defn problem_47 []
  (println "Problem 47, Contain Yourself")

  (let [result 4]
    (assert (contains? #{4 5 6} result))
    (assert (contains? [1 1 1 1 1] result))
    (assert (contains? {4 :a 2 :b} result))
    (assert (not (contains? [1 2 4] result)))))


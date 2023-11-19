(ns learn-clojure.problem-10)

(defn problem_10 []
  (println "Problem 10, Maps")
  (let [result ({:a 10, :b 20, :c 30} :b)]
    (assert true
            (= result ((hash-map :a 10, :b 20, :c 30) :b)))
    (assert true
            (= result (:b {:a 10, :b 20, :c 30})))))

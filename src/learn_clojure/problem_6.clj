(ns learn-clojure.problem-6)

(defn problem_6 []
  (println "Problem 6, Vectors")
  (let [result [:a :b :c]]
    (assert
     (= result (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c)))))


(ns learn-clojure.problem-8
  (:require clojure.set))

(defn problem_8 []
  (println "Problem 8, Sets")
  (let [result #{:a :b :c :d}]
  (assert true
          (= result (set '(:a :a :b :c :c :c :c :d :d))))
  (assert true
          (= result (clojure.set/union #{:a :b :c} #{:b :c :d})))))

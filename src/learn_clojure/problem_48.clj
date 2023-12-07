(ns learn-clojure.problem-48)

(defn problem_48 []
  (println "Problem 48, Intro to some")
  (let [result 6]
    (assert (= result (some #{2, 7, 6} [5 6 7 8])))
    (assert (= result (some #(when (even? %) %) [5 6 7 8])))))

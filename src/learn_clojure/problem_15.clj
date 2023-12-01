(ns learn-clojure.problem-15)

(def result-1-dbl (fn [x] (* x 2)))
(def result-2-dbl #(* % 2))
(def result-3-dbl (partial * 2))

(defn problem_15 []
  (println "Problem 15, Double Down")

  (assert (= (result-1-dbl 2) 4))
  (assert (= (result-1-dbl 3) 6))
  (assert (= (result-1-dbl 11) 22))
  (assert (= (result-1-dbl 7) 14))

  (assert (= (result-2-dbl 2) 4))
  (assert (= (result-2-dbl 3) 6))
  (assert (= (result-2-dbl 11) 22))
  (assert (= (result-2-dbl 7) 14))

  (assert (= (result-3-dbl 2) 4))
  (assert (= (result-3-dbl 3) 6))
  (assert (= (result-3-dbl 11) 22))
  (assert (= (result-3-dbl 7) 14)))

(ns learn-clojure.problem-15)

(defn problem_15 []
  (println "Problem 15, Double Down")
  (let [result-1
        (fn dbl [x] (* x 2))]
    (assert (= (result-1 2) 4))
    (assert (= (result-1 3) 6))
    (assert (= (result-1 11) 22))
    (assert (= (result-1 7) 14)))
  (let [result-2
        (fn [x] (* x 2))]
    (assert (= (result-2 2) 4))
    (assert (= (result-2 3) 6))
    (assert (= (result-2 11) 22))
    (assert (= (result-2 7) 14)))
  (let [result-3
        #(* % 2)]
    (assert (= (result-3 2) 4))
    (assert (= (result-3 3) 6))
    (assert (= (result-3 11) 22))
    (assert (= (result-3 7) 14)))
  (let [result-4
        (partial * 2)]
    (assert (= (result-4 2) 4))
    (assert (= (result-4 3) 6))
    (assert (= (result-4 11) 22))
    (assert (= (result-4 7) 14))))

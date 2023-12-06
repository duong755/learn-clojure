(ns learn-clojure.problem-46)

(defn result-1-flip
  [f]
  (fn [x y]
    (f y x)))

(defn result-2-flip
  [f]
  #(f %2 %1))

(defn problem_46 []
  (println "Problem 46, Flipping out")

  (assert (= 3 ((result-1-flip nth) 2 [1 2 3 4 5])))
  (assert (= true ((result-1-flip >) 7 8)))
  (assert (= 4 ((result-1-flip quot) 2 8)))
  (assert (= [1 2 3] ((result-1-flip take) [1 2 3 4 5] 3)))

  (assert (= 3 ((result-2-flip nth) 2 [1 2 3 4 5])))
  (assert (= true ((result-2-flip >) 7 8)))
  (assert (= 4 ((result-2-flip quot) 2 8)))
  (assert (= [1 2 3] ((result-2-flip take) [1 2 3 4 5] 3))))

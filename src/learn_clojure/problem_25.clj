(ns learn-clojure.problem-25)

(defn result-1-find-odd
  [s]
  (filter odd? s))

(def result-2-find-odd #(filter odd? %))

(defn problem_25 []
  (println "Problem 25, Find the odd numbers")

  (assert
   (= (result-1-find-odd #{1 2 3 4 5}) '(1 3 5)))
  (assert
   (= (result-1-find-odd [4 2 1 6]) '(1)))
  (assert
   (= (result-1-find-odd [2 2 4 6]) '()))
  (assert
   (= (result-1-find-odd [1 1 1 3]) '(1 1 1 3)))

  (assert
   (= (result-2-find-odd #{1 2 3 4 5}) '(1 3 5)))
  (assert
   (= (result-2-find-odd [4 2 1 6]) '(1)))
  (assert
   (= (result-2-find-odd [2 2 4 6]) '()))
  (assert
   (= (result-2-find-odd [1 1 1 3]) '(1 1 1 3))))

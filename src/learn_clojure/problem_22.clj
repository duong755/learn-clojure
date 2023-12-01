(ns learn-clojure.problem-22)

 (defn result-1-count
   [s]
   (if (empty? s)
     0
     (inc (result-1-count (rest s)))))

 (defn result-2-count
   [s]
   (loop [length 0
          input-list s]
     (if (empty? input-list)
       length
       (recur (inc length) (rest input-list)))))

(defn problem_22 []
  (println "Problem 22, Count a Sequence")

  (assert (= (result-1-count '(1 2 3 3 1)) 5))
  (assert (= (result-1-count "Hello World") 11))
  (assert (= (result-1-count [[1 2] [3 4] [5 6]]) 3))
  (assert (= (result-1-count '(13)) 1))
  (assert (= (result-1-count '(:a :b :c)) 3))

  (assert (= (result-2-count '(1 2 3 3 1)) 5))
  (assert (= (result-2-count "Hello World") 11))
  (assert (= (result-2-count [[1 2] [3 4] [5 6]]) 3))
  (assert (= (result-2-count '(13)) 1))
  (assert (= (result-2-count '(:a :b :c)) 3)))

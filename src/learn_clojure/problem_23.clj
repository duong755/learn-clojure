(ns learn-clojure.problem-23)

(defn result-1-reverse [s]
  (if (< (count s) 2)
    s
    (concat
     (result-1-reverse (rest s))
     (conj nil (first s)))))

(defn result-2-reverse [s]
  (loop [rest-of-s (rest s)
         first-of-s (list (first s))]
    (if (<= (count rest-of-s) 1)
      (concat rest-of-s first-of-s)
      (recur
       (rest rest-of-s)
       (concat (list (first rest-of-s)) first-of-s)))))

(defn problem_23 []
  (println "Problem 23, Reverse a Sequence")

  (assert
   (= (result-1-reverse [1 2 3 4 5]) [5 4 3 2 1]))
  (assert
   (= (result-1-reverse (sorted-set 5 7 2 7)) '(7 5 2)))
  (assert
   (= (result-1-reverse [[1 2] [3 4] [5 6]]) [[5 6] [3 4] [1 2]]))

  (assert
   (= (result-2-reverse [1 2 3 4 5]) [5 4 3 2 1]))
  (assert
   (= (result-2-reverse (sorted-set 5 7 2 7)) '(7 5 2)))
  (assert
   (= (result-2-reverse [[1 2] [3 4] [5 6]]) [[5 6] [3 4] [1 2]])))

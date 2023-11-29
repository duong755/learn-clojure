(ns learn-clojure.problem-22)

(defn problem_22 []
  (println "Problem 22, Count a Sequence")
  (let [result
        (fn my-count [x]
          (if (empty? x)
            0
            (inc (my-count (rest x)))))]
    (assert (= (result '(1 2 3 3 1)) 5))
    (assert (= (result "Hello World") 11))
    (assert (= (result [[1 2] [3 4] [5 6]]) 3))
    (assert (= (result '(13)) 1))
    (assert (= (result '(:a :b :c)) 3)))
  (let [result
        (fn my-count [x]
          (loop [length 0
                 input-list x]
            (if (empty? input-list)
              length
              (recur (inc length) (rest input-list)))))]
    (assert (= (result '(1 2 3 3 1)) 5))
    (assert (= (result "Hello World") 11))
    (assert (= (result [[1 2] [3 4] [5 6]]) 3))
    (assert (= (result '(13)) 1))
    (assert (= (result '(:a :b :c)) 3))))

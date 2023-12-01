(ns learn-clojure.problem-27)

(defn result-1-is-palindrome
  [s]
  (if (< (count s) 2) true
      (if (not= (first s) (last s)) false
          (result-1-is-palindrome (rest (butlast s))))))

(defn result-2-is-palindrome
  [s]
  (loop [input-seq s]
    (cond
      (< (count input-seq) 2) true
      (not= (first input-seq) (last input-seq)) false
      :else (recur (rest (butlast input-seq))))))

(defn problem_27 []
  (println "Problem 27, Palindrome Detector")

  (assert (false? (result-1-is-palindrome '(1 2 3 4 5))))
  (assert (true? (result-1-is-palindrome "racecar")))
  (assert (true? (result-1-is-palindrome [:foo :bar :foo])))
  (assert (true? (result-1-is-palindrome '(1 1 3 3 1 1))))
  (assert (false? (result-1-is-palindrome '(:a :b :c))))

  (assert (false? (result-2-is-palindrome '(1 2 3 4 5))))
  (assert (true? (result-2-is-palindrome "racecar")))
  (assert (true? (result-2-is-palindrome [:foo :bar :foo])))
  (assert (true? (result-2-is-palindrome '(1 1 3 3 1 1))))
  (assert (false? (result-2-is-palindrome '(:a :b :c)))))

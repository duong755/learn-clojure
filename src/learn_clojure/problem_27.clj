(ns learn-clojure.problem-27)

(defn problem_27 []
  (println "Problem 27, Palindrome Detector")
  (let [result
        (fn is_palindrome [s]
          (if (< (count s) 2) true
              (if (not= (first s) (last s)) false
                  (is_palindrome (rest (butlast s))))))]
    (assert (false? (result '(1 2 3 4 5))))
    (assert (true? (result "racecar")))
    (assert (true? (result [:foo :bar :foo])))
    (assert (true? (result '(1 1 3 3 1 1))))
    (assert (false? (result '(:a :b :c)))))
  (let [result-2
        (fn [s]
          (loop [input-seq s]
            (cond
              (< (count input-seq) 2) true
              (not= (first input-seq) (last input-seq)) false
              :else (recur (rest (butlast input-seq))))))]
    (assert (false? (result-2 '(1 2 3 4 5))))
    (assert (true? (result-2 "racecar")))
    (assert (true? (result-2 [:foo :bar :foo])))
    (assert (true? (result-2 '(1 1 3 3 1 1))))
    (assert (false? (result-2 '(:a :b :c))))))

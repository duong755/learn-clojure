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
    (assert (false? (result '(:a :b :c))))))

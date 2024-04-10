(ns learn-clojure.problem-99)

(defn product-digit-1
  [x y]
  (let [prod (* x y)]
    (loop [result '()
           quotient prod]
      (if (zero? quotient)
        result
        (recur (conj result (rem quotient 10)) (quot quotient 10))))))

(defn problem_99
  []
  (println "Problem 99, Product Digits")
  (assert (== (product-digit-1 1 1) [1]))
  (assert (== (product-digit-1 99 9) [8 9 1]))
  (assert (== (product-digit-1 999 99) [9 8 9 0 1])))

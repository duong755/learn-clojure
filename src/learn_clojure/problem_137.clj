(ns learn-clojure.problem-137)

(def MAX_SAFE_INTEGER (dec (apply * (vec (repeat 53 (long 2))))))

(defn int->digits
  [n base]
  (loop [result []
         quotient n]
    (if (zero? quotient)
      (if (empty? result) [0] result)
      (recur (cons (rem quotient base) result) (quot quotient base)))))

(defn problem_137
  []
  (println "Problem 137, Digits and bases")
  (assert (= [1 2 3 4 5 0 1] (int->digits 1234501 10)))
  (assert (= [0] (int->digits 0 11)))
  (assert (= [1 0 0 1] (int->digits 9 2)))
  (assert (= [1 0] (let [n (rand-int 100000)] (int->digits n n))))
  (assert (= [22 6 10 5 0 19 6 9 6 31] (int->digits MAX_SAFE_INTEGER 42))))

(ns learn-clojure.problem-158)

(defn result-1-decurry
  [f]
  (fn [& args]
    (reduce #(%1 %2) f args)))

(defn problem_158
  []
  (println "Problem 158, Decurry")
  (assert (= 10 ((result-1-decurry (fn [a]
                       (fn [b]
                         (fn [c]
                           (fn [d]
                             (+ a b c d))))))
                 1 2 3 4)))
  (assert (= 24 ((result-1-decurry (fn [a]
                       (fn [b]
                         (fn [c]
                           (fn [d]
                             (* a b c d))))))
                 1 2 3 4)))
  (assert (= 25 ((result-1-decurry (fn [a]
                       (fn [b]
                         (* a b))))
                 5 5))))


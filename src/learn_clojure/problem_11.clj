(ns learn-clojure.problem-11)

(defn problem_11 []
  (println "Problem 11, conj on maps")
  (assert
   (=
    {:a 1, :b 2, :c 3}
    (conj {:a 1} [:b 2] [:c 3])))
  (assert
   (=
    {:a 1, :b 2, :c 3}
    (conj {:a 1} {:b 2} [:c 3]))))

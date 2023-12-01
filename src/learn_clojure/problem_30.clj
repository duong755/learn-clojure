(ns learn-clojure.problem-30)

(defn result-1-compress
  [s]
  (keep-indexed
   #(when
     (or
      (zero? %1)
      (not= %2 (nth s (dec %1)))) %2) s))

(defn problem_30 []
  (println "Problem 30, Compress a Sequence")

  (assert (= (apply str (result-1-compress "Leeeeeerrroyyy")) "Leroy"))
  (assert (= (result-1-compress [1 1 2 3 3 2 2 3]) '(1 2 3 2 3)))
  (assert (= (result-1-compress [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))))

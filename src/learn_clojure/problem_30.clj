(ns learn-clojure.problem-30)

(defn problem_30 []
  (println "Problem 30, Compress a Sequence")
  (let [result
        (fn compress [s]
          (keep-indexed
           #(when
             (or
              (zero? %1)
              (not= %2 (nth s (dec %1)))) %2) s))]
    (assert (= (apply str (result "Leeeeeerrroyyy")) "Leroy"))
    (assert (= (result [1 1 2 3 3 2 2 3]) '(1 2 3 2 3)))
    (assert (= (result [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2])))))

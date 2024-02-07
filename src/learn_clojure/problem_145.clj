(ns learn-clojure.problem-145)

(def result-1 (range 1 40 4))

(defn problem_145
  []
  (println "Problem 145, For the win")
  (assert (= result-1 (for [x (range 40)
                      :when (= 1 (rem x 4))]
                  x)))
  (assert (= result-1 (for [x (iterate #(+ 4 %) 0)
                      :let [z (inc x)]
                      :while (< z 40)]
                  z)))
  (assert (= result-1 (for [[x y] (partition 2 (range 20))]
                  (+ x y)))))

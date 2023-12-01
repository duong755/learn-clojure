(ns learn-clojure.problem-39)

(defn result-1-interleave
  [s1 s2]
  (loop [length (min (count s1) (count s2))
         turn :left
         left s1
         right s2
         result (empty s1)]
    (let [[first-left & rest-left] left
          [first-right & rest-right] right
          count-left (count left)]
      (if (zero? length)
        (if (= turn :left)
          result
          (concat result (conj nil first-left)))
        (if (= turn :left)
          (recur (min count-left (count right))
           :right
           rest-left
           right
           (concat result (conj nil first-left)))
          (recur (min count-left (count rest-right))
           :left
           left
           rest-right
           (concat result (conj nil first-right))))))))

(defn problem_39 []
  (println "Problem 39, Interleave Two Seqs")
  (assert (= (result-1-interleave [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c)))
  (assert (= (result-1-interleave [1 2] [3 4 5 6]) '(1 3 2 4)))
  (assert (= (result-1-interleave [1 2 3 4] [5]) [1 5]))
  (assert (= (result-1-interleave [30 20] [25 15]) [30 25 20 15])))

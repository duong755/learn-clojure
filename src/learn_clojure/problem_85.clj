(ns learn-clojure.problem-85)

(defn result-1-power-set
  [input-set]
  (loop [result #{#{}}
         the-rest input-set]
    (if (empty? the-rest)
      result
      (recur
       (apply conj result (map #(conj % (first the-rest)) result))
       (rest the-rest)))))

(defn problem-85 []
  (println "Problem 85, Power Set")
  (assert (= (result-1-power-set #{1 :a}) #{#{1 :a} #{:a} #{} #{1}}))
  (assert (= (result-1-power-set #{}) #{#{}}))
  (assert (= (result-1-power-set #{1 2 3})
             #{#{} #{1} #{2} #{3} #{1 2} #{1 3} #{2 3} #{1 2 3}}))
  (assert (= (count (result-1-power-set (into #{} (range 10)))) 1024)))

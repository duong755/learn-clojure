(ns learn-clojure.problem-41)

(defn result-1-drop-every-nth
  [s n]
  (keep-indexed
   #(when-not
     (zero? (rem (inc %1) n)) %2) s))

(defn result-2-drop-every-nth
  [s n]
  (loop [result (take (dec n) s)
         the-rest (drop n s)]
    (if (< (count the-rest) n)
      (concat result the-rest)
      (recur
       (concat result (take (dec n) the-rest))
       (drop n the-rest)))))

(defn result-3-drop-every-nth
  [s n]
  (loop [result (empty s)
         index 0
         the-rest s]
    (if (>= index (count s))
      result
      (if (zero? (rem (inc index) n))
        (recur result (inc index) (rest the-rest))
        (recur (concat result (conj nil (first the-rest))) (inc index) (rest the-rest))))))

(defn problem_41 []
  (println "Problem 41, Drop Every Nth Item")

  (assert (= (result-1-drop-every-nth [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8]))
  (assert (= (result-1-drop-every-nth [:a :b :c :d :e :f] 2) [:a :c :e]))
  (assert (= (result-1-drop-every-nth [1 2 3 4 5 6] 4) [1 2 3 5 6]))

  (assert (= (result-2-drop-every-nth [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8]))
  (assert (= (result-2-drop-every-nth [:a :b :c :d :e :f] 2) [:a :c :e]))
  (assert (= (result-2-drop-every-nth [1 2 3 4 5 6] 4) [1 2 3 5 6]))

  (assert (= (result-3-drop-every-nth [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8]))
  (assert (= (result-3-drop-every-nth [:a :b :c :d :e :f] 2) [:a :c :e]))
  (assert (= (result-3-drop-every-nth [1 2 3 4 5 6] 4) [1 2 3 5 6])))

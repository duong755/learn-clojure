(ns learn-clojure.problem-53)

(defn result-1-longest-increasing-sub-seq
  [input-vec]
  (let [longest-increasing-sub-seq-from (fn [^Long index
                                             ^clojure.lang.PersistentVector input-vec]
                                          (if (>= index (count input-vec))
                                            []
                                            (let [val-at-index (nth input-vec index)]
                                              (loop [result [val-at-index]
                                                     the-rest (drop (inc index) input-vec)]
                                                (if (or
                                                     (empty? the-rest)
                                                     (<= (first the-rest) (last result)))
                                                  result
                                                  (recur
                                                   (conj result (first the-rest))
                                                   (rest the-rest)))))))]
    (loop [result []
           the-rest input-vec
           index 0]
      (if (empty? the-rest)
        result
        (let [candidate (longest-increasing-sub-seq-from index input-vec)
              candidate-len (count candidate)]
          (if (or (= candidate-len 1) (<= candidate-len (count result)))
            (recur result (drop candidate-len the-rest) (+ index candidate-len))
            (recur candidate (drop candidate-len the-rest) (+ index candidate-len))))))))

(defn problem_53 []
  (println "Problem 53, Longest Increasing Sub-Seq")
  (assert (= (result-1-longest-increasing-sub-seq [1 0 1 2 3 0 4 5]) [0 1 2 3]))
  (assert (= (result-1-longest-increasing-sub-seq [5 6 1 3 2 7]) [5 6]))
  (assert (= (result-1-longest-increasing-sub-seq [2 3 3 4 5]) [3 4 5]))
  (assert (= (result-1-longest-increasing-sub-seq [7 6 5 4]) [])))

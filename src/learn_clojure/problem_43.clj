(ns learn-clojure.problem-43)

(comment
  (defn take-every [input-seq number]
    (if (empty? input-seq)
      input-seq
      (loop [result (empty input-seq)
             next-index 0]
        (if (>= next-index (count input-seq))
          result
          (recur
           (concat result (conj nil (nth input-seq next-index)))
           (+ number next-index)))))))
(comment
  (defn drop-every [input-seq number]
    (if (empty? input-seq)
      input-seq
      (loop [result (empty input-seq)
             index 0]
        (if (>= index (count input-seq))
          result
          (if (zero? (mod index number))
            (recur result (inc index))
            (recur (concat result (conj nil (nth input-seq index))) (inc index))))))))

(defn result-1-reverse-interleave
  [s n]
  (let [take-every (fn [input-seq number]
                     (if (empty? input-seq)
                       input-seq
                       (loop [result (empty input-seq)
                              next-index 0]
                         (if (>= next-index (count input-seq))
                           result
                           (recur
                            (concat result (conj nil (nth input-seq next-index)))
                            (long (+ number next-index)))))))
        drop-every (fn [input-seq number]
                     (if (empty? input-seq)
                       input-seq
                       (loop [result (empty input-seq)
                              index 0]
                         (if (>= index (count input-seq))
                           result
                           (if (zero? (mod index number))
                             (recur result (inc index))
                             (recur (concat result (conj nil (nth input-seq index))) (inc index)))))))]
    (loop [result '()
           the-rest s
           next-n n]
      (if (empty? the-rest)
        result
        (recur
         (concat result (list (take-every the-rest next-n))) (drop-every the-rest next-n) (dec next-n))))))

(defn result-2-reverse-interleave
  [s n]
  (let [take-and-drop (fn [input-seq number]
                        (if (empty? input-seq)
                          input-seq
                          (loop [take-result (empty input-seq),
                                 drop-result (empty input-seq),
                                 the-rest input-seq, ;; first and rest are preferrable because nth is O(n)
                                 index 0]
                            (if (>= index (count input-seq))
                              [take-result drop-result]
                              (if (zero? (rem index number))
                                (recur
                                 (concat take-result (conj nil (first the-rest)))
                                 drop-result
                                 (rest the-rest)
                                 (inc index))
                                (recur
                                 take-result
                                 (concat drop-result (conj nil (first the-rest)))
                                 (rest the-rest)
                                 (inc index)))))))]
    (loop [result '()
           the-rest s
           next-n n]
      (if (empty? the-rest)
        result
        (let [[take-result drop-result] (take-and-drop the-rest next-n)]
          (recur (concat result (list take-result)) drop-result (dec next-n)))))))


(defn problem_43 []
  (println "Problem 43, Reverse Interleave")
  (assert (= (result-1-reverse-interleave [1 2 3 4 5 6] 2) '((1 3 5) (2 4 6))))
  (assert (= (result-1-reverse-interleave (range 9) 3) '((0 3 6) (1 4 7) (2 5 8))))
  (assert (= (result-1-reverse-interleave (range 10) 5) '((0 5) (1 6) (2 7) (3 8) (4 9))))

  (assert (= (result-2-reverse-interleave [1 2 3 4 5 6] 2) '((1 3 5) (2 4 6))))
  (assert (= (result-2-reverse-interleave (range 9) 3) '((0 3 6) (1 4 7) (2 5 8))))
  (assert (= (result-2-reverse-interleave (range 10) 5) '((0 5) (1 6) (2 7) (3 8) (4 9)))))

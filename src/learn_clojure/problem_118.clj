(ns learn-clojure.problem-118)

(defn result-1-map
  [f input-seq]
  (if (empty? input-seq) input-seq
      (lazy-seq
       (cons (f (first input-seq)) (result-1-map f (next input-seq))))))

(defn problem_118
  []
  (println "Problem 118, Re-implement Map")
  (assert (= [3 4 5 6 7]
             (result-1-map inc [2 3 4 5 6])))
  (assert (= (repeat 10 nil)
             (result-1-map (fn [_] nil) (range 10))))
  (assert (= [1000000 1000001]
             (->> (result-1-map inc (range))
                  (drop (dec 1000000))
                  (take 2))))
  (assert (= [1000000 1000001]
             (->> (result-1-map inc (range))
                  (drop (dec 1000000))
                  (take 2)))))

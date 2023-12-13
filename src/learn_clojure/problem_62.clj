(ns learn-clojure.problem-62)

(defn result-1-iterate
  [f init]
  (cons init (lazy-seq (result-1-iterate f (f init)))))

(defn problem_62 []
  (println "Problem 62, Re-implement Iteration")
  (assert (= (take 5 (result-1-iterate #(* 2 %) 1)) [1 2 4 8 16]))
  (assert (= (take 100 (result-1-iterate inc 0)) (take 100 (range))))
  (assert (= (take 9 (result-1-iterate #(inc (mod % 3)) 1)) (take 9 (cycle [1 2 3])))))

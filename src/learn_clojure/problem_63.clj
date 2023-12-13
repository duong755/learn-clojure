(ns learn-clojure.problem-63)

(defn result-1-group
  [f coll]
  (reduce
   #(let [key (f %2)]
      (if (contains? %1 key)
       (update %1 key conj %2)
       (assoc %1 key (vector %2))))
   {} coll))

(defn problem_63 []
  (println "Problem 63, Group a Sequence")
  (assert (= (result-1-group #(> % 5) #{1 3 6 8}) {false [1 3], true [6 8]}))
  (assert (= (result-1-group #(apply / %) [[1 2] [2 4] [4 6] [3 6]])
             {1/2 [[1 2] [2 4] [3 6]], 2/3 [[4 6]]}))
  (assert (= (result-1-group count [[1] [1 2] [3] [1 2 3] [2 3]])
             {1 [[1] [3]], 2 [[1 2] [2 3]], 3 [[1 2 3]]})))

(ns learn-clojure.problem-69)

(defn result-1-merge-with
  [f & maps]
  (if (empty? maps)
    {}
      (reduce
       (fn [merge-map current-map]
         (reduce
          (fn [result current-key]
            (if (contains? result current-key)
              (update result current-key f (current-map current-key))
              (assoc result current-key (current-map current-key))))
          merge-map
          (keys current-map)))
       (first maps)
       (rest maps))))

(defn problem_69 []
  (println "Problem 69, Merge with a Function")
  (assert (= (result-1-merge-with * {:a 2, :b 3, :c 4} {:a 2} {:b 2} {:c 5})
             {:a 4, :b 6, :c 20}))
  (assert (= (result-1-merge-with - {1 10, 2 20} {1 3, 2 10, 3 15})
             {1 7, 2 10, 3 15}))
  (assert (= (result-1-merge-with concat {:a [3], :b [6]} {:a [4 5], :c [8 9]} {:b [7]})
             {:a [3 4 5], :b [6 7], :c [8 9]})))

(ns learn-clojure.problem-65)


(defn coll-type
  [coll]
  (when (coll? coll)
    (if (associative? coll)
      (if (reversible? coll) :vector :map)
      (if (seq? coll) :list :set))))

(defn problem_65 []
  (println "Problem 65, Black Box Testing")
  (assert (= :map (coll-type {:a 1, :b 2})))
  (assert (= :list (coll-type (range (rand-int 20)))))
  (assert (= :vector (coll-type [1 2 3 4 5 6])))
  (assert (= :set (coll-type #{10 (rand-int 5)})))
  (assert (= [:map :set :vector :list] (map coll-type [{} #{} [] ()]))))

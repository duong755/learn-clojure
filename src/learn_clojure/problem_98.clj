(ns learn-clojure.problem-98)

(defn equivalance-classes
  [f input-set]
  (->> input-set
       (reduce
        (fn [result val]
          (let [key (f val)]
            (if (contains? result key)
              (update result key conj val)
              (assoc result key #{val}))))
        {} ,,,)
       vals
       set))

(defn problem_98
  []
  (println "Problem 98, Equivalence Classes")
  (assert (= (equivalance-classes #(* % %) #{-2 -1 0 1 2})
             #{#{0} #{1 -1} #{2 -2}}))
  (assert (= (equivalance-classes #(rem % 3) #{0 1 2 3 4 5})
             #{#{0 3} #{1 4} #{2 5}}))
  (assert (= (equivalance-classes identity #{0 1 2 3 4})
             #{#{0} #{1} #{2} #{3} #{4}}))
  (assert (= (equivalance-classes (constantly true) #{0 1 2 3 4})
             #{#{0 1 2 3 4}})))


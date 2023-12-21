(ns learn-clojure.problem-81)

(defn result-1-intersection
  [set1 set2]
  (reduce
   #(if (contains? set2 %2) (conj %1 %2) %1)
   #{} set1))

(defn problem-81 []
  (println "Problem 81, Set Intersection")
  (assert (= (result-1-intersection #{0 1 2 3} #{2 3 4 5}) #{2 3}))
  (assert (= (result-1-intersection #{0 1 2} #{3 4 5}) #{}))
  (assert (= (result-1-intersection #{:a :b :c :d} #{:c :e :a :f :d}) #{:a :c :d})))

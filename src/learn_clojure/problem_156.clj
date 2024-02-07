(ns learn-clojure.problem-156)

(defn result-1-map-default
  [val lst]
  (reduce #(assoc %1 %2 val) {} lst))

(defn problem_156
  []
  (println "Problem 156, Map Defaults")
  (assert (= (result-1-map-default 0 [:a :b :c]) {:a 0 :b 0 :c 0}))
  (assert (= (result-1-map-default "x" [1 2 3]) {1 "x" 2 "x" 3 "x"}))
  (assert (= (result-1-map-default [:a :b] [:foo :bar]) {:foo [:a :b] :bar [:a :b]})))

(ns learn-clojure.problem-61)

(defn result-1-map
  [vec1 vec2]
  (loop [my-map {}
         left vec1
         right vec2]
    (if (or (empty? left) (empty? right))
      my-map
      (recur (assoc my-map (first left) (first right)) (rest left) (rest right)))))

(defn problem_61 []
  (println "Problem 61, Map Construction")
  (assert (= (result-1-map [:a :b :c] [1 2 3]) {:a 1 :b 2 :c 3}))
  (assert (= (result-1-map [1 2 3 4] ["one" "two" "three"]) {1 "one", 2 "two", 3 "three"}))
  (assert (= (result-1-map [:foo :bar] ["foo" "bar" "baz"]) {:foo "foo", :bar "bar"})))

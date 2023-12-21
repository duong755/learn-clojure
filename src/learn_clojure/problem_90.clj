(ns learn-clojure.problem-90)

(defn result-1-cartesian-product
  [set1 set2]
  (reduce
   (fn [product1 element1]
     (reduce
      (fn [product2 element2]
        (conj product2 [element1 element2])) product1 set2))
   #{} set1))

(defn result-2-cartesian-product
  [set1 set2]
  (set (for [elem1 (vec set1)
             elem2 (vec set2)]
         [elem1 elem2])))

(defn problem_90 []
  (println "Problem 90, Cartesian Product")
  (assert (= (result-1-cartesian-product #{"ace" "king" "queen"} #{"♠" "♥" "♦" "♣"})
             #{["ace"   "♠"] ["ace"   "♥"] ["ace"   "♦"] ["ace"   "♣"]
               ["king"  "♠"] ["king"  "♥"] ["king"  "♦"] ["king"  "♣"]
               ["queen" "♠"] ["queen" "♥"] ["queen" "♦"] ["queen" "♣"]}))
  (assert (= (result-1-cartesian-product #{1 2 3} #{4 5})
             #{[1 4] [2 4] [3 4] [1 5] [2 5] [3 5]}))
  (assert (= 300 (count (result-1-cartesian-product (into #{} (range 10))
                                                    (into #{} (range 30))))))

  (assert (= (result-2-cartesian-product #{"ace" "king" "queen"} #{"♠" "♥" "♦" "♣"})
             #{["ace"   "♠"] ["ace"   "♥"] ["ace"   "♦"] ["ace"   "♣"]
               ["king"  "♠"] ["king"  "♥"] ["king"  "♦"] ["king"  "♣"]
               ["queen" "♠"] ["queen" "♥"] ["queen" "♦"] ["queen" "♣"]}))
  (assert (= (result-2-cartesian-product #{1 2 3} #{4 5})
             #{[1 4] [2 4] [3 4] [1 5] [2 5] [3 5]}))
  (assert (= 300 (count (result-2-cartesian-product (into #{} (range 10))
                                                    (into #{} (range 30)))))))

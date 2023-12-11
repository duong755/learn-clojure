(ns learn-clojure.problem-40)

(defn result-1-interpose
  [val s]
  (rest
   (reduce
    #(concat %1 (conj nil %2 val)) (empty s) s)))

(defn result-2-interpose
  [val s]
  (loop [result (empty s)
         rest-element s]
    (if (empty? rest-element)
      result
      (let [[first-rest-element & rest-rest] rest-element
            next-result (concat result
                                (if (empty? result)
                                  (conj nil first-rest-element)
                                  (conj nil first-rest-element val)))]
        (if (empty? rest-rest)
          next-result
          (recur next-result rest-rest))))))

(defn problem_40 []
  (println "Problem 40, Interpose a Seq")
  (assert (= (result-1-interpose 0 [1 2 3]) [1 0 2 0 3]))
  (assert (= (apply str (result-1-interpose ", " ["one" "two" "three"])) "one, two, three"))
  (assert (= (result-1-interpose :z [:a :b :c :d]) [:a :z :b :z :c :z :d]))

  (assert (= (result-2-interpose 0 [1 2 3]) [1 0 2 0 3]))
  (assert (= (apply str (result-2-interpose ", " ["one" "two" "three"])) "one, two, three"))
  (assert (= (result-2-interpose :z [:a :b :c :d]) [:a :z :b :z :c :z :d])))

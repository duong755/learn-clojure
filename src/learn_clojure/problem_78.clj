(ns learn-clojure.problem-78)

(defn result-1-trampoline
  ([f]
   (let [result (f)]
     (if (fn? result)
       (recur result)
       result)))
  ([f & args]
   (result-1-trampoline #(apply f args))))

(defn problem-78 []
  (println "Problem 78, Reimplement Trampoline")
  (assert (= (letfn [(triple [x] #(sub-two (* 3 x)))
                     (sub-two [x] #(stop? (- x 2)))
                     (stop? [x] (if (> x 50) x #(triple x)))]
               (result-1-trampoline triple 2))
             82))
  (assert (= (letfn [(my-even? [x] (if (zero? x) true #(my-odd? (dec x))))
                     (my-odd? [x] (if (zero? x) false #(my-even? (dec x))))]
               (map (partial result-1-trampoline my-even?) (range 6)))
             [true false true false true false])))

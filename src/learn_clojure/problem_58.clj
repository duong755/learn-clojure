(ns learn-clojure.problem-58)

(defn result-1-comp
  ([] identity)
  ([f] f)
  ([f g] #(f (apply g %&)))
  ([f g & fs]
   (reduce
    (fn [x y]
      (fn [& args]
        (y (apply x args))))
    (reverse (conj fs g f)))))

(defn problem_58 []
  (println "Problem 58, Function Composition")
  (assert (= [3 2 1] ((result-1-comp rest reverse) [1 2 3 4])))
  (assert (= 5 ((result-1-comp (partial + 3) second) [1 2 3 4])))
  (assert (= true ((result-1-comp zero? #(mod % 8) +) 3 5 7 9)))
  (assert (= "HELLO" ((result-1-comp #(.toUpperCase %) #(apply str %) take) 5 "hello world"))))


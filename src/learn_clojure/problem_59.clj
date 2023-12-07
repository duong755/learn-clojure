(ns learn-clojure.problem-59)

(defn result-1-juxtaposition
  [& f]
  (fn [& args]
    (reduce #(conj %1 (apply %2 args)) [] f)))

(defn problem_59 []
  (println "Problem 59, Juxtaposition")
  (assert (= [21 6 1] ((result-1-juxtaposition + max min) 2 3 5 1 6 4)))
  (assert (= ["HELLO" 5] ((result-1-juxtaposition #(.toUpperCase %) count) "hello")))
  (assert (= [2 6 4] ((result-1-juxtaposition :a :c :b) {:a 2, :b 4, :c 6, :d 8 :e 10}))))

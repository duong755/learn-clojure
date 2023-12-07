(ns learn-clojure.problem-52)

(defn problem_52 []
  (println "Problem 52, Intro to Destructuring")
  (assert (= [2 4] #_{:clj-kondo/ignore [:unused-binding]}
                   (let [[a b c d e f g] (range)] [c e]))))

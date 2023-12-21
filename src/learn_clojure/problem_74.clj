(ns learn-clojure.problem-74
  (:require clojure.math)
  (:require clojure.string))

(defn result-1-extract-square
  [lst]
  (->> (re-seq #"\d+" lst)
       (map (comp long bigint))
       (filter #(== % (* (clojure.math/sqrt %) (clojure.math/sqrt %))))
       (clojure.string/join ",")))

(defn problem-74 []
  (println "Problem 74, Filter Perfect Squares")
  (assert (= (result-1-extract-square "4,5,6,7,8,9") "4,9"))
  (assert (= (result-1-extract-square "15,16,25,36,37") "16,25,36")))

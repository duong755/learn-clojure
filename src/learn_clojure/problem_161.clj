(ns learn-clojure.problem-161
  (:require [clojure.set]))

(def result #{1 2})

(defn problem_161
  []
  (println "Problem 161, Subset and Superset")
  (assert (clojure.set/superset? result #{2}))
  (assert (clojure.set/subset? #{1} result))
  (assert (clojure.set/superset? result #{1 2}))
  (assert (clojure.set/subset? #{1 2} result)))

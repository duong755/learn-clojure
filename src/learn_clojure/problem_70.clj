(ns learn-clojure.problem-70
  (:require [clojure.string]))

(defn result-1-word-sorting
  [sentence]
  (->> sentence
       (re-seq #"\w+")
       (map #(vector % (clojure.string/lower-case %)))
       (sort-by second)
       (map first)))

(defn problem_70 []
  (println "Problem 70, Word Sorting")
  (assert (= (result-1-word-sorting  "Have a nice day.")
             ["a" "day" "Have" "nice"]))
  (assert (= (result-1-word-sorting  "Clojure is a fun language!")
             ["a" "Clojure" "fun" "is" "language"]))
  (assert (= (result-1-word-sorting  "Fools fall for foolish follies.")
             ["fall" "follies" "foolish" "Fools" "for"])))

(ns learn-clojure.problem-29
  (:require [clojure.string :as str]))

(defn problem_29 []
  (println "Problem 29, Get the Caps")
  (let [result
        (fn [x]
          (let [alphabet "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                is-upper-letter (fn [c]
                                  (clojure.string/includes? alphabet (str c)))]
            (reduce str (filter is-upper-letter x))))]
    (assert (= (result "HeLlO, WoRlD!") "HLOWRD"))
    (assert (empty? (result "nothing")))
    (assert (= (result "$#A(*&987Zf") "AZ"))))

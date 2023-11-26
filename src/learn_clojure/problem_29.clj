(ns learn-clojure.problem-29
  (:import java.lang.Character)
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
    (assert (= (result "$#A(*&987Zf") "AZ")))
  ;; the following solution does not work in 4ever-clojure
  (let [result-2
        (fn [x]
          (let [char-code-A (Character/codePointAt "A" 0)
                char-code-Z (Character/codePointAt "Z" 0)
                is-upper-letter (fn [c]
                                  (let [char-code-input (Character/codePointAt (str c) 0)]
                                    (and
                                     (>= char-code-input char-code-A)
                                     (<= char-code-input char-code-Z))))]
             (reduce str (filter is-upper-letter x))))]
    (assert (= (result-2 "HeLlO, WoRlD!") "HLOWRD"))
    (assert (empty? (result-2 "nothing")))
    (assert (= (result-2 "$#A(*&987Zf") "AZ"))))

(ns learn-clojure.problem-29
  (:import java.lang.Character)
  (:require [clojure.string :as str]))

(defn result-1-cap
  [s]
  (let [alphabet "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        is-upper-letter (fn [c]
                          (clojure.string/includes? alphabet (str c)))]
    (reduce str (filter is-upper-letter s))))

(defn result-2-cap
  ;; the following solution does not work in 4ever-clojure (the browser)
  [s]
  (let [char-code-A (Character/codePointAt "A" 0)
        char-code-Z (Character/codePointAt "Z" 0)
        is-upper-letter (fn [c]
                          (let [char-code-input (Character/codePointAt (str c) 0)]
                            (and
                             (>= char-code-input char-code-A)
                             (<= char-code-input char-code-Z))))]
    (reduce str (filter is-upper-letter s))))

(defn result-3-cap
  [s]
  (apply str (filter #(re-find #"[A-Z]" (str %)) (seq s))))


(defn problem_29 []
  (println "Problem 29, Get the Caps")

  (assert (= (result-1-cap "HeLlO, WoRlD!") "HLOWRD"))
  (assert (empty? (result-1-cap "nothing")))
  (assert (= (result-1-cap "$#A(*&987Zf") "AZ"))

  (assert (= (result-2-cap "HeLlO, WoRlD!") "HLOWRD"))
  (assert (empty? (result-2-cap "nothing")))
  (assert (= (result-2-cap "$#A(*&987Zf") "AZ"))

  (assert (= (result-3-cap "HeLlO, WoRlD!") "HLOWRD"))
  (assert (empty? (result-3-cap "nothing")))
  (assert (= (result-3-cap "$#A(*&987Zf") "AZ")))

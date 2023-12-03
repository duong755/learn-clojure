(ns learn-clojure.core
  (:require learn-clojure.problem-1)
  (:require learn-clojure.problem-2)
  (:require learn-clojure.problem-3)
  (:require learn-clojure.problem-4)
  (:require learn-clojure.problem-5)
  (:require learn-clojure.problem-6)
  (:require learn-clojure.problem-7)
  (:require learn-clojure.problem-8)
  (:require learn-clojure.problem-9)
  (:require learn-clojure.problem-10)
  (:require learn-clojure.problem-11)
  (:require learn-clojure.problem-12)
  (:require learn-clojure.problem-13)
  (:require learn-clojure.problem-14)
  (:require learn-clojure.problem-15)
  (:require learn-clojure.problem-16)
  (:require learn-clojure.problem-17)
  (:require learn-clojure.problem-18)
  (:require learn-clojure.problem-19)
  (:require learn-clojure.problem-20)
  (:require learn-clojure.problem-21)
  (:require learn-clojure.problem-22)
  (:require learn-clojure.problem-23)
  (:require learn-clojure.problem-24)
  (:require learn-clojure.problem-25)
  (:require learn-clojure.problem-26)
  (:require learn-clojure.problem-27)
  (:require learn-clojure.problem-28)
  (:require learn-clojure.problem-29)
  (:require learn-clojure.problem-30)
  (:require learn-clojure.problem-31)
  (:require learn-clojure.problem-32)
  (:require learn-clojure.problem-33)
  (:require learn-clojure.problem-34)
  (:require learn-clojure.problem-35)
  (:require learn-clojure.problem-36)
  (:require learn-clojure.problem-37)
  (:require learn-clojure.problem-38)
  (:require learn-clojure.problem-39)
  (:require learn-clojure.problem-40)
  (:require learn-clojure.problem-41)
  (:require learn-clojure.problem-42))

(defn -main
  [& args]
  (case (first args)
    "1" (learn-clojure.problem-1/problem_1)
    "2" (learn-clojure.problem-2/problem_2)
    "3" (learn-clojure.problem-3/problem_3)
    "4" (learn-clojure.problem-4/problem_4)
    "5" (learn-clojure.problem-5/problem_5)
    "6" (learn-clojure.problem-6/problem_6)
    "7" (learn-clojure.problem-7/problem_7)
    "8" (learn-clojure.problem-8/problem_8)
    "9" (learn-clojure.problem-9/problem_9)
    "10" (learn-clojure.problem-10/problem_10)
    "11" (learn-clojure.problem-11/problem_11)
    "12" (learn-clojure.problem-12/problem_12)
    "13" (learn-clojure.problem-13/problem_13)
    "14" (learn-clojure.problem-14/problem_14)
    "15" (learn-clojure.problem-15/problem_15)
    "16" (learn-clojure.problem-16/problem_16)
    "17" (learn-clojure.problem-17/problem_17)
    "18" (learn-clojure.problem-18/problem_18)
    "19" (learn-clojure.problem-19/problem_19)
    "20" (learn-clojure.problem-20/problem_20)
    "21" (learn-clojure.problem-21/problem_21)
    "22" (learn-clojure.problem-22/problem_22)
    "23" (learn-clojure.problem-23/problem_23)
    "24" (learn-clojure.problem-24/problem_24)
    "25" (learn-clojure.problem-25/problem_25)
    "26" (learn-clojure.problem-26/problem_26)
    "27" (learn-clojure.problem-27/problem_27)
    "28" (learn-clojure.problem-28/problem_28)
    "29" (learn-clojure.problem-29/problem_29)
    "30" (learn-clojure.problem-30/problem_30)
    "31" (learn-clojure.problem-31/problem_31)
    "32" (learn-clojure.problem-32/problem_32)
    "33" (learn-clojure.problem-33/problem_33)
    "34" (learn-clojure.problem-34/problem_34)
    "35" (learn-clojure.problem-35/problem_35)
    "36" (learn-clojure.problem-36/problem_36)
    "37" (learn-clojure.problem-37/problem_37)
    "38" (learn-clojure.problem-38/problem_38)
    "39" (learn-clojure.problem-39/problem_39)
    "40" (learn-clojure.problem-40/problem_40)
    "41" (learn-clojure.problem-41/problem_41)
    "42" (learn-clojure.problem-42/problem_42)
    (println "No match found. Please choose a positive integer.")))

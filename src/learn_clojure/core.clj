(ns learn-clojure.core
  (:require learn-clojure.problem-1)
  (:require learn-clojure.problem-2)
  (:require learn-clojure.problem-3)
  (:require learn-clojure.problem-4)
  (:require learn-clojure.problem-5)
  (:require learn-clojure.problem-6)
  (:require learn-clojure.problem-7))

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
    (println "No match found. Please choose a positive interger.")))

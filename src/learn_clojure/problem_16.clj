(ns learn-clojure.problem-16)

(defn greet
  [name]
  (str "Hello, " name "!"))

(defn problem_16 []
  (println "Problem 16, Hello World")
  (assert (= (greet "Dave") "Hello, Dave!"))
  (assert (= (greet "Jenn") "Hello, Jenn!"))
  (assert (= (greet "Rhea") "Hello, Rhea!")))

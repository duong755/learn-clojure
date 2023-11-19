(ns learn-clojure.problem-16)

(defn problem_16 []
  (println "Problem 16, Hello World")
  (let [greet (fn [x] (str "Hello, " x "!"))]
    (assert (= (greet "Dave") "Hello, Dave!"))
    (assert (= (greet "Jenn") "Hello, Jenn!"))
    (assert (= (greet "Rhea") "Hello, Rhea!"))))

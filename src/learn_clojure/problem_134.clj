(ns learn-clojure.problem-134)

(def result-1-has-nil #(and (contains? %2 %1) (nil? (%2 %1))))

(defn problem_134
  []
  (println "Problem 134, A nil key")
  (assert (true?  (result-1-has-nil :a {:a nil :b 2})))
  (assert (false? (result-1-has-nil :b {:a nil :b 2})))
  (assert (false? (result-1-has-nil :c {:a nil :b 2}))))

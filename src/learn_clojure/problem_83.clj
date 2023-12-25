(ns learn-clojure.problem-83)

(defn some-but-not-all?
  [init & args]
  (let [all-args (conj args init)]
    (and
     (not (every? false? all-args))
     (not (every? true? all-args)))))

(defn problem_83
  []
  (println "Problem 83, A Half Truth")
  (assert (= false (some-but-not-all? false false)))
  (assert (= true (some-but-not-all? true false)))
  (assert (= false (some-but-not-all? true)))
  (assert (= true (some-but-not-all? false true false)))
  (assert (= false (some-but-not-all? true true true)))
  (assert (= true (some-but-not-all? true true true false))))

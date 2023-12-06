(ns learn-clojure.problem-44)

(defn result-1-rotate-seq
  [num s]
  (let [len (count s)
        index (rem (+ (rem num len) len) len)]
    (concat (drop index s) (take index s))))

(defn result-2-rotate-seq
  [num s]
  (let [len (count s)]
    (loop [result (empty s)
           index 0]
      (if (>= index len)
        result
        (let [rotate-index (rem (+ (rem (+ index num) len) len) len)]
          (recur (concat result (conj nil (nth s rotate-index))) (inc index)))))))

(defn problem_44 []
  (println "Problem 44, Rotate Sequence")

  (assert (= (result-1-rotate-seq 2 [1 2 3 4 5]) '(3 4 5 1 2)))
  (assert (= (result-1-rotate-seq -2 [1 2 3 4 5]) '(4 5 1 2 3)))
  (assert (= (result-1-rotate-seq 6 [1 2 3 4 5]) '(2 3 4 5 1)))
  (assert (= (result-1-rotate-seq 1 '(:a :b :c)) '(:b :c :a)))
  (assert (= (result-1-rotate-seq -4 '(:a :b :c)) '(:c :a :b)))

  (assert (= (result-2-rotate-seq 2 [1 2 3 4 5]) '(3 4 5 1 2)))
  (assert (= (result-2-rotate-seq -2 [1 2 3 4 5]) '(4 5 1 2 3)))
  (assert (= (result-2-rotate-seq 6 [1 2 3 4 5]) '(2 3 4 5 1)))
  (assert (= (result-2-rotate-seq 1 '(:a :b :c)) '(:b :c :a)))
  (assert (= (result-2-rotate-seq -4 '(:a :b :c)) '(:c :a :b))))

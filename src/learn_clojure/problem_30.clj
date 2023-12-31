(ns learn-clojure.problem-30)

(defn result-1-compress
  [s]
  (keep-indexed
   #(when
     (or
      (zero? %1)
      (not= %2 (nth s (dec %1)))) %2) s))

(defn result-2-compress
  [s]
  (reduce
   (fn [x y]
     (if (empty? x)
       (concat x (conj nil y))
       (if (= (last x) y)
         x
         (concat x (conj nil y))))) (empty s) s))

(defn result-3-compress
  [s]
  (reduce
   (fn [x y]
     (let [next-result (concat x (conj nil y))]
       (if (or
            (empty? x)
            (not= (last x) y))
         next-result
         x))) (empty s) s))

(defn result-4-compress
  [s]
  (loop [result (empty s)
         the-rest s]
    (if (empty? the-rest)
      result
      (recur
       (concat result (list (first the-rest)))
       (drop-while #(= % (first the-rest)) the-rest)))))


(defn problem_30 []
  (println "Problem 30, Compress a Sequence")

  (assert (= (apply str (result-1-compress "Leeeeeerrroyyy")) "Leroy"))
  (assert (= (result-1-compress [1 1 2 3 3 2 2 3]) '(1 2 3 2 3)))
  (assert (= (result-1-compress [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2])))

  (assert (= (apply str (result-2-compress "Leeeeeerrroyyy")) "Leroy"))
  (assert (= (result-2-compress [1 1 2 3 3 2 2 3]) '(1 2 3 2 3)))
  (assert (= (result-2-compress [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2])))

  (assert (= (apply str (result-3-compress "Leeeeeerrroyyy")) "Leroy"))
  (assert (= (result-3-compress [1 1 2 3 3 2 2 3]) '(1 2 3 2 3)))
  (assert (= (result-3-compress [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2])))

  (assert (= (apply str (result-4-compress "Leeeeeerrroyyy")) "Leroy"))
  (assert (= (result-4-compress [1 1 2 3 3 2 2 3]) '(1 2 3 2 3)))
  (assert (= (result-4-compress [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))))

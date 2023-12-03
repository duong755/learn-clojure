(ns learn-clojure.problem-20)

(defn result-1-second-to-last
  [s]
  (nth s (- (count s) 2)))

(defn result-2-second-to-last
  [s]
  (last (butlast s)))

(defn result-3-second-to-last
  [s]
  (cond
    (< (count s) 2) (throw IndexOutOfBoundsException)
    (= (count s) 2) (first s)
    :else (result-3-second-to-last (rest s))))

(defn result-4-second-to-last [s]
  (loop [input-list s]
    (let [input-length (count input-list)]
      (cond
        (< input-length 2) (throw IndexOutOfBoundsException)
        (= input-length 2) (first input-list)
        :else (recur (rest input-list))))))

(defn problem_20 []
  (println "Problem 20, Penultimate Element")

  (assert (= (result-1-second-to-last (list 1 2 3 4 5)) 4))
  (assert (= (result-1-second-to-last ["a" "b" "c"]) "b"))
  (assert (= (result-1-second-to-last [[1 2] [3 4]]) [1 2]))


  (assert (= (result-2-second-to-last (list 1 2 3 4 5)) 4))
  (assert (= (result-2-second-to-last ["a" "b" "c"]) "b"))
  (assert (= (result-2-second-to-last [[1 2] [3 4]]) [1 2]))

  (assert (= (result-3-second-to-last (list 1 2 3 4 5)) 4))
  (assert (= (result-3-second-to-last ["a" "b" "c"]) "b"))
  (assert (= (result-3-second-to-last [[1 2] [3 4]]) [1 2]))

  (assert (= (result-4-second-to-last (list 1 2 3 4 5)) 4))
  (assert (= (result-4-second-to-last ["a" "b" "c"]) "b"))
  (assert (= (result-4-second-to-last [[1 2] [3 4]]) [1 2])))

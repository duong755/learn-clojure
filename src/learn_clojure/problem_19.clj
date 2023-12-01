(ns learn-clojure.problem-19)

(defn result-1-last
  [s]
  (nth s (dec (count s))))

(defn result-2-last
  [s]
  (if (= (count s) 1)
    (first s)
    (result-2-last (rest s))))

(defn result-3-last
  [s]
  (loop [input-list s]
    (if (= (count input-list) 1)
      (first input-list)
      (recur (rest input-list)))))

(defn problem_19 []
  (println "Problem 19, Last Element")

  (assert
   (= (result-1-last [1 2 3 4 5]) 5))
  (assert
   (= (result-1-last '(5 4 3)) 3))
  (assert
   (= (result-1-last ["b" "c" "d"]) "d"))
  (assert
   (= (result-2-last [1 2 3 4 5]) 5))
  (assert
   (= (result-2-last '(5 4 3)) 3))
  (assert
   (= (result-2-last ["b" "c" "d"]) "d"))
  (assert
   (= (result-3-last [1 2 3 4 5]) 5))
  (assert
   (= (result-3-last '(5 4 3)) 3))
  (assert
   (= (result-3-last ["b" "c" "d"]) "d")))

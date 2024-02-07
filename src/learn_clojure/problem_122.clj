(ns learn-clojure.problem-122)

(defn result-1-bin->dec
  [binary-str]
  (loop [decimal-result 0
         pos 0
         digits (seq binary-str)]
    (if (empty? digits)
      decimal-result
      (if (= (last digits) \1)
        (recur (+ decimal-result (apply * (repeat pos 2))) (inc pos) (butlast digits))
        (recur decimal-result (inc pos) (butlast digits))))))

(defn result-2-bin->dec
  [binary-str]
  (loop [result 0
         power 1
         digits (seq binary-str)]
    (if (empty? digits)
      result
      (let [next-result (if (= (last digits) \1) (+ result power) result)]
        (recur next-result (* 2 power) (butlast digits))))))

(defn problem_122
  []
  (println "Problem 122, Read a binary number")
  (assert (= 0     (result-1-bin->dec "0")))
  (assert (= 7     (result-1-bin->dec "111")))
  (assert (= 8     (result-1-bin->dec "1000")))
  (assert (= 9     (result-1-bin->dec "1001")))
  (assert (= 255   (result-1-bin->dec "11111111")))
  (assert (= 1365  (result-1-bin->dec "10101010101")))
  (assert (= 65535 (result-1-bin->dec "1111111111111111")))
  (assert (= 0     (result-2-bin->dec "0")))
  (assert (= 7     (result-2-bin->dec "111")))
  (assert (= 8     (result-2-bin->dec "1000")))
  (assert (= 9     (result-2-bin->dec "1001")))
  (assert (= 255   (result-2-bin->dec "11111111")))
  (assert (= 1365  (result-2-bin->dec "10101010101")))
  (assert (= 65535 (result-2-bin->dec "1111111111111111"))))

(ns learn-clojure.problem-150
  (:require [clojure.string]))

(defn int->digits
  ([n] (int->digits n 10))
  ([n base]
   (loop [result []
          quotient n]
     (if (zero? quotient)
       (if (empty? result) [0] result)
       (recur (cons (rem quotient base) result) (quot quotient base))))))

(defn digits->int
  ([digits] (digits->int digits 10))
  ([digits base]
   (loop [result 0
          power 1
          digits digits]
     (if (empty? digits)
       result
       (recur (+ result (* power (last digits))) (* power base) (butlast digits))))))

(defn next-palindrome
  [n]
  (let [length (count (str n))
        n-digits (int->digits n)
        half (take (Math/ceil (/ length 2)) n-digits)
        new-half (int->digits (inc (digits->int half)))
        the-head (if (even? length)
                   new-half
                   (if (= (count half) (count new-half))
                     new-half
                     (butlast new-half)))
        the-rest (if (even? length)
                   (if (= (count half) (count new-half))
                     (reverse new-half)
                     (reverse (butlast new-half)))
                   (reverse (butlast new-half)))]
    (digits->int (concat the-head the-rest))))

(defn closest-palindrome
  [n]
  (let [length (count (str n))
        n-digits (int->digits n)
        the-head (take (Math/ceil (/ length 2)) n-digits)
        the-rest (if (even? length)
                   (reverse the-head)
                   (reverse (butlast the-head)))
        smallest (digits->int (concat the-head the-rest))]
    (if (>= smallest n)
      smallest
      (closest-palindrome (next-palindrome smallest)))))

(defn palindrome
  [n]
  (iterate next-palindrome (closest-palindrome n)))

(defn problem_150
  []
  (println "Problem 150, Palindromic Numbers")
  (assert (= (take 26 (palindrome 0))
             [0 1 2 3 4 5 6 7 8 9
              11 22 33 44 55 66 77 88 99
              101 111 121 131 141 151 161]))
  (assert (= (take 16 (palindrome 162))
             [171 181 191 202
              212 222 232 242
              252 262 272 282
              292 303 313 323]))
  (assert (= (take 6 (palindrome 1234550000))
             [1234554321 1234664321 1234774321
              1234884321 1234994321 1235005321]))
  (assert (= (first (palindrome (* 111111111 111111111)))
             (* 111111111 111111111)))
  (assert (= (set (take 199 (palindrome 0)))
             (set (map #(first (palindrome %)) (range 0 10000))))))



(ns learn-clojure.problem-92)

(defn result-1-read-roman
  [roman-str]
  (let [roman-regexp #"^(M{1,3})?(CD|CM|DCCC|DCC|DC|D|C{1,3})?(XL|XC|LXXX|LXX|LX|L|X{1,3})?(III|II|IV|VIII|VII|VI|V|IX|I)?$"
        roman-basic {"I" 1 "II" 2 "III" 3 "IV" 4 "V" 5 "VI" 6 "VII" 7 "VIII" 8 "IX" 9
                     "X" 10 "XX" 20 "XXX" 30 "XL" 40 "L" 50 "LX" 60 "LXX" 70 "LXXX" 80 "XC" 90
                     "C" 100 "CC" 200 "CCC" 300 "CD" 400 "D" 500 "DC" 600 "DCC" 700 "DCCC" 800 "CM" 900
                     "M" 1000 "MM" 2000 "MMM" 3000}]
    (->> (re-find roman-regexp roman-str)
         (rest)
         (remove nil?)
         (reduce #(+ %1 (roman-basic %2)) 0))))

(defn problem-92 []
  (println "Problem 92, Read Roman numerals")
  (assert (= 14 (result-1-read-roman "XIV")))
  (assert (= 827 (result-1-read-roman "DCCCXXVII")))
  (assert (= 3999 (result-1-read-roman "MMMCMXCIX")))
  (assert (= 48 (result-1-read-roman "XLVIII"))))

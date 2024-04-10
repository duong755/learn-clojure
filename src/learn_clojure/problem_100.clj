(ns learn-clojure.problem-100)

(defn gcd
  ([x] x)
  ([x y]
   (loop [a x b y]
     (if (zero? (rem a b))
       b
       (recur b (rem a b)))))
  ([x y & zs]
   (reduce #(gcd %1 %2) (gcd x y) zs)))

(defn lcm
  ([x] x)
  ([x y] (* (/ x (gcd x y)) y))
  ([x y & zs]
   (reduce #(lcm %1 %2) (lcm x y) zs)))

(defn general-numerator
  [x]
  (if (int? x)
    x
    (if (ratio? x)
      (numerator x)
      (throw (IllegalArgumentException. "Input of general-numerator must be an integer or ratio.")))))

(defn general-denominator
  [x]
  (if (int? x)
    1
    (if (ratio? x)
      (denominator x)
      (throw (IllegalArgumentException. "Input of general-denominator must be an integer or ratio.")))))

(defn lcm-fraction
  [x y & zs]
  (let [args (concat [x y] zs)
        numerators (map general-numerator args)
        denominators (map general-denominator args)
        lcm-numerator (apply lcm numerators)
        gcd-denominator (apply gcd denominators)
        result (/ lcm-numerator gcd-denominator)]
    result))

(defn problem_100
  []
  (println "Problem 100, Least Common Multiple")
  (assert (== (lcm-fraction 2 3) 6))
  (assert (== (lcm-fraction 5 3 7) 105))
  (assert (== (lcm-fraction 1/3 2/5) 2))
  (assert (== (lcm-fraction 3/4 1/6) 3/2))
  (assert (== (lcm-fraction 7 5/7 2 3/5) 210)))

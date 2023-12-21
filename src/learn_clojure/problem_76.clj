(ns learn-clojure.problem-76)

(defn problem-76 []
  (println "Problem 76, Intro to Trampoline")
  (assert (= [1 3 5 7 9 11]
             (letfn
              [(foo [x y] #(bar (conj x y) y))
               (bar [x y] (if (> (last x) 10)
                            x
                            #(foo x (+ 2 y))))]
               (trampoline foo [] 1)))))

(def result '(1 2 3 4))
(assert true
        (= result (conj '(2 3 4) 1)))
(assert true
        (= result (conj '(3 4) 2 1)))

(def result [1 2 3 4])
(assert true
        (= result (conj [1 2 3] 4)))
(assert true
        (= result (conj [1 2] 3 4)))

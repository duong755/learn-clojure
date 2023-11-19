(def result [:a :b :c])
(assert true
        (= result (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c)))

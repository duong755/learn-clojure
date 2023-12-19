(ns learn-clojure.problem-73)

(defn tictactoe
  [board]
  (let [cell (fn [board row col]
                 (nth (nth board row) col))]
    (as-> board $
      (cond
        (apply = [(cell $ 0 0) (cell $ 0 1) (cell $ 0 2)]) (cell $ 0 0)
        (apply = [(cell $ 1 0) (cell $ 1 1) (cell $ 1 2)]) (cell $ 1 0)
        (apply = [(cell $ 2 0) (cell $ 2 1) (cell $ 2 2)]) (cell $ 2 0)
        (apply = [(cell $ 0 0) (cell $ 1 0) (cell $ 2 0)]) (cell $ 0 0)
        (apply = [(cell $ 0 1) (cell $ 1 1) (cell $ 2 1)]) (cell $ 0 1)
        (apply = [(cell $ 0 2) (cell $ 1 2) (cell $ 2 2)]) (cell $ 0 2)
        (apply = [(cell $ 0 0) (cell $ 1 1) (cell $ 2 2)]) (cell $ 1 1)
        (apply = [(cell $ 0 2) (cell $ 1 1) (cell $ 2 0)]) (cell $ 1 1)
        :else nil)
      (if (or (= $ :e) (= $ nil)) nil $))))

(defn problem_73 []
  (println "Problem 73, Analyze a Tic-Tac-Toe Board")
  (assert (= nil (tictactoe [[:e :e :e]
                      [:e :e :e]
                      [:e :e :e]])))
  (assert (= :x (tictactoe [[:x :e :o]
                     [:x :e :e]
                     [:x :e :o]])))
  (assert (= :o (tictactoe [[:e :x :e]
                     [:o :o :o]
                     [:x :e :x]])))
  (assert (= nil (tictactoe [[:x :e :o]
                      [:x :x :e]
                      [:o :x :o]])))
  (assert (= :x (tictactoe [[:x :e :e]
                     [:o :x :e]
                     [:o :e :x]])))
  (assert (= :o (tictactoe [[:x :e :o]
                     [:x :o :e]
                     [:o :e :x]])))
  (assert (= nil (tictactoe [[:x :o :x]
                      [:x :o :x]
                      [:o :x :o]]))))

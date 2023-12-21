(ns learn-clojure.problem-77)


(defn result-1-anagram-finder
  [input-vec]
  (->> input-vec
       (group-by frequencies)
       (vals)
       (filter #(> (count %) 1))
       (map #(apply hash-set %))
       (apply hash-set)))

(defn problem_77 []
  (println "Problem 77, Anagram Finder")
  (assert (= (result-1-anagram-finder ["meat" "mat" "team" "mate" "eat"])
             #{#{"meat" "team" "mate"}}))
  (assert (= (result-1-anagram-finder ["veer" "lake" "item" "kale" "mite" "ever"])
             #{#{"veer" "ever"} #{"lake" "kale"} #{"mite" "item"}})))

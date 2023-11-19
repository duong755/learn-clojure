(defproject learn-clojure "0.1.0-SNAPSHOT"
  :description "I am learning Clojure"
  :url "http://github.com/duong755/learn-clojure"
  :license {:name "MIT"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.11.1"]]
  :main ^:skip-aot learn-clojure.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})

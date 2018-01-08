(defproject learning_clojure "0.1.0-SNAPSHOT"
  :description "First project in clojure"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
    [org.clojure/clojure "1.8.0"]
    [software.amazon.awssdk/aws-sdk-java "2.0.0-preview-5"]
    ; [korma "0.4.3"]
  ]
  :main ^:skip-aot learning-clojure.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})

(defproject ring-example "0.1.0-SNAPSHOT"
  :description "Reitit Buddy Auth App"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [ring/ring-jetty-adapter "1.7.1"]
                 [metosin/reitit "0.5.3"]
                 [buddy "2.0.0"]]
  :repl-options {:init-ns example.server})

(defproject tvaughan/ring-jetty9-adapter "0.1.0-SNAPSHOT"
  :description "Ring Jetty 9 adapter."
  :url "https://github.com/tvaughan/ring-jetty9-adapter"
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[ring/ring-core "1.3.0"]
                 [ring/ring-servlet "1.3.0"]
                 [org.eclipse.jetty/jetty-server "9.2.0.RC0"]]
  :profiles
  {:dev {:dependencies [[clj-http "0.9.1"]]}
   :1.4 {:dependencies [[org.clojure/clojure "1.4.0"]]}
   :1.5 {:dependencies [[org.clojure/clojure "1.5.1"]]}
   :1.6 {:dependencies [[org.clojure/clojure "1.6.0"]]}})

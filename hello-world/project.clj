(defproject hello-world "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [io.pedestal/pedestal.service "0.5.4"]
                 [io.pedestal/pedestal.route   "0.5.4"]
                 [io.pedestal/pedestal.jetty   "0.5.4"]
                 [org.slf4j/slf4j-simple       "1.7.25"]]
  :repl-options {:init (do
                         (use 'hello-world.core)
                         (use 'hello-world.hello)
                         )
                 :skip-default-init true}
  :main hello-world.core)

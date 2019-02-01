(ns hello-world.hello
  (:require [io.pedestal.http :as http]
            [io.pedestal.http.route :as route]))

(defn respond-hello [request]
  {:status 200 :body (str "Hello World, " (:name (:query-params request)))})


(def routes
  (route/expand-routes #{["/greet" :get respond-hello :route-name :greet]}))

(defn create-servidor []
  (http/create-server
    {::http/routes routes
     ::http/type   :jetty
     ::http/port   8890}))

(defn comeca []
  (http/start (create-servidor)))

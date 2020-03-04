(ns edn2xml
  (:require [hiccup.core]
            [clojure edn]))

(defn -main [& args]
  (-> *in*
      slurp
      clojure.edn/read-string
      hiccup.core/html
      print))

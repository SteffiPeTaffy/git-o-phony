(ns git-o-phony.core
  (:gen-class))

(defn do-da-magic [log-file-name]
  (take 10 (clojure.string/split (slurp log-file-name) (re-pattern "^$"))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (do-da-magic (first args)))

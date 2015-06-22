(ns solsort.test.hello
  (:require
    [solsort.hello-module :refer [hello]]
    [cljs.test :refer-macros [run-tests]]))

(enable-console-print!)
(js/setTimeout #(run-tests 'solsort.hello-module) 0)

(defmethod cljs.test/report [:cljs.test/default :end-run-tests] [m]
  (println m)
  (when (exists? js/process)
    ((aget js/process "exit") (if (cljs.test/successful? m) 0 1))))

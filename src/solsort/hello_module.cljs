(ns solsort.hello-module
  (:require-macros [cljs.core.async.macros :refer [go go-loop alt!]])
  (:require
    [cljs.core.async :refer [>! <! chan put! take! timeout close! pipe]]))

(defn hello []
  (js/console.log "hi")
  "hello")
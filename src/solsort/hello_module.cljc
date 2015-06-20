(ns solsort.hello-module)

(defn hello []
  #?(:cljs (js/console.log "hi"))
  "hello")

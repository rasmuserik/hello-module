(ns solsort.hello-module
  "Sample module for learning how modules are implemented"
  (:require
    #?(:cljs [cljs.test :as test :refer-macros [deftest is testing]])
    #?(:clj [clojure.test :as test :refer [deftest is testing]])))

(defn hello
  "simple function that says hello"
  []
  #?(:cljs (js/console.log "hi"))
  "hello")


(deftest hello-test
  (testing "Hello module"
    (is (= (hello) "hello"))))

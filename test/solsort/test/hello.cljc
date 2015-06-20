(ns solsort.test.hello
  (:require
    [solsort.hello-module :refer [hello]]
    #?(:cljs [cljs.test :as test :refer-macros [deftest is run-tests testing]]))
    #?(:clj (:use clojure.test))
             )


#?(:cljs (enable-console-print!))

(deftest hello-test
  (testing "Hello module"
    (is (= (hello) "hello"))))

#?(:cljs (js/setTimeout #(run-tests) 0))
#?(:clj (print 'here))

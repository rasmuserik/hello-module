(ns solsort.test.hello
  (:require
    [solsort.hello :refer [hello]]
    [cljs.test :as test :refer-macros [deftest is run-tests testing]]))


(enable-console-print!)

(deftest hello-test
  (testing "Hello module"
    (is (= (hello) "hello"))))

(js/setTimeout #(run-tests) 0)

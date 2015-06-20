(defproject com.solsort/hello-module "0.0.1-SNAPSHOT"
  :description "hello world module"
  :url "https://solsort.com"

  :dependencies [[org.clojure/clojure "1.7.0-RC1"]
                 [org.clojure/clojurescript "0.0-3308"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]]

  :plugins [[lein-cljsbuild "1.0.6"]]

  :source-paths ["src"]
  :test-paths ["test"]
  :cljsbuild 
  {:builds 
   [
    {:id "test-node"
     :source-paths ["src" "test"]
     :notify-command ["node" "target/run-test.js"]
     :compiler {
                :output-to "target/run-test.js"
                :output-dir "target/out-test"
                :optimizations :advanced
                :pretty-print false
                :externs ["node_modules/nodejs-externs/externs/assert.js" "node_modules/nodejs-externs/externs/buffer.js" "node_modules/nodejs-externs/externs/child_process.js" "node_modules/nodejs-externs/externs/cluster.js" "node_modules/nodejs-externs/externs/core.js" "node_modules/nodejs-externs/externs/crypto.js" "node_modules/nodejs-externs/externs/dgram.js" "node_modules/nodejs-externs/externs/dns.js" "node_modules/nodejs-externs/externs/domain.js" "node_modules/nodejs-externs/externs/events.js" "node_modules/nodejs-externs/externs/fs.js" "node_modules/nodejs-externs/externs/http.js" "node_modules/nodejs-externs/externs/https.js" "node_modules/nodejs-externs/externs/net.js" "node_modules/nodejs-externs/externs/os.js" "node_modules/nodejs-externs/externs/path.js" "node_modules/nodejs-externs/externs/process.js" "node_modules/nodejs-externs/externs/punycode.js" "node_modules/nodejs-externs/externs/querystring.js" "node_modules/nodejs-externs/externs/readline.js" "node_modules/nodejs-externs/externs/repl.js" "node_modules/nodejs-externs/externs/stream.js" "node_modules/nodejs-externs/externs/string_decoder.js" "node_modules/nodejs-externs/externs/tls.js" "node_modules/nodejs-externs/externs/tty.js" "node_modules/nodejs-externs/externs/url.js" "node_modules/nodejs-externs/externs/util.js" "node_modules/nodejs-externs/externs/vm.js" "node_modules/nodejs-externs/externs/zlib.js"]
                }}]})

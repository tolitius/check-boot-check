(set-env!
  :source-paths #{"src"}
  :dependencies '[[boot/core              "2.6.0"           :scope "provided"]
                  [tolitius/boot-check    "0.1.3-SNAPSHOT"  :scope "test"]])

(require '[tolitius.boot-check :as check])

(deftask check-sources []
  (comp
    (check/with-bikeshed)
    (check/with-eastwood)
    (check/with-yagni)
    (check/with-kibit)))

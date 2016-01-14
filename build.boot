(set-env!
  :source-paths #{"src"}
  :dependencies '[[boot/core              "2.5.1"           :scope "provided"]
                  [tolitius/boot-check    "0.1.1"           :scope "test"]])

(require '[tolitius.boot-check :as check])

(deftask check-sources []
  (comp
    (check/with-bikeshed)
    (check/with-eastwood)
    (check/with-yagni)
    (check/with-kibit)))

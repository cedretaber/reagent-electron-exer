(ns ^:figwheel-no-load exercise.dev
  (:require
    [exercise.core :as core]
    [devtools.core :as devtools]))


(enable-console-print!)

(devtools/install!)

(core/init!)

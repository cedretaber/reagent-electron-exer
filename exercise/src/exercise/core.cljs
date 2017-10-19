(ns exercise.core
  (:require [reagent.core :as r]
            [exercise.home :as home]))

(defn mount-root []
  (r/render [home/home-page] (.getElementById js/document "app")))

(defn init! []
  (mount-root))

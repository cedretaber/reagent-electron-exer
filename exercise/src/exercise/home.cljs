(ns exercise.home
  (:require [reagent.core :as r]))

(def state (r/atom {:state {:x 0 :y 0}}))

(defn- update-state [key val]
  (swap! state #(assoc-in %
                          [:state key]
                          (if (js/isNaN val) 0 val))))

(defn- make-input [key value]
  [:input {:type "text"
           :value value
           :on-change #(update-state key (-> %
                                             .-target
                                             .-value
                                             (js/parseInt 10)))}])

(defn- calc-app [{{:keys [x y]} :state}]
  [:div
   [:h2 "Calc App"]
   [:div
    [make-input :x x]
    "+"
    [make-input :y y]
    "="
    (+ x y)]])

(defn home-page []
  [calc-app @state])

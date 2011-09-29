(def SMALL 1)
(def BIG 100)

(defn guess-my-number []
  (bit-shift-right (+ SMALL BIG) 1))

(defn bigger []
  (def SMALL (+ (guess-my-number) 1))
  (guess-my-number))

(defn smaller []
  (def BIG (- (guess-my-number) 1))
  (guess-my-number))

(defn start-over []
  (def SMALL 1)
  (def BIG 100)
  (guess-my-number))

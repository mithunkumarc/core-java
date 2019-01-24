#### REPL : read evaluate print loop
            added in java9

reactive programming : 
      1. elastic : scale
      2. message driven : 
      3. Responsive : 
      4. Resilient : recover quickly


Dont expose your db
instead export your data



java 8 streams 

            pipleline
            lazy
            push
            data only
            error : goodluck
            1 datachannel
            no forking
            push at will
            seq vs parallel
---------
reactive streams

              pipeline
              lazy
              push
              data also
              error : deal withit downstream
              3 datachannel : data, error, complete
              multiple subscribers
              backpressure : match data speed from source to client (sync and async)


------------

Reactive Streams API

        four interfaces
        publisher : emitter
        subscriber : subscribe to data
        subscription : multiple subs for same publisher
        Processors : (can be both pubs / subs) : ex : map filter


 java 9 api
java.util.concurrent.Flow


cold  : different session
hot  : same stream session

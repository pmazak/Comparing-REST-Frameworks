## Api Framework Comparisons
##### Taking the highest of 3 runs using:

    brew install wrk
    wrk -t12 -c400 -d30s http://127.0.0.1:8080/hello

- Gist is underlying architecture:
  - eclipse jetty gets about 55,000 requests/sec
  - jboss netty gets about 70,000 requests/sec
  - eclipse vertx gets about 70,000 requests/sec
  - jboss xnio gets about 80,000 requests/sec

### :dropwizard (eclipse jetty)
    Running 30s test @ http://127.0.0.1:8080/hello
      12 threads and 400 connections
      Thread Stats   Avg      Stdev     Max   +/- Stdev
   	    Latency    16.20ms   29.04ms 433.69ms   89.63%
   	    Req/Sec     4.88k     3.76k   40.53k    85.72%
      1696404 requests in 30.08s, 231.17MB read
      Socket errors: connect 0, read 252, write 0, timeout 0
    Requests/sec:  56389.00
    Transfer/sec:      7.68MB
- Requests/sec:  56389.00

### :httpobjects (jobss netty)
    Running 30s test @ http://127.0.0.1:8080/hello
      12 threads and 400 connections
      Thread Stats   Avg      Stdev     Max   +/- Stdev
        Latency     5.04ms    3.30ms 132.48ms   91.56%
        Req/Sec     6.10k     0.86k   11.21k    83.11%
      2186808 requests in 30.04s, 254.20MB read
      Socket errors: connect 0, read 660, write 0, timeout 0
    Requests/sec:  72785.48
    Transfer/sec:      8.46MB
- Requests/sec:  72785.48

### :restexpress (jboss netty)
    Running 30s test @ http://127.0.0.1:8080/hello
      12 threads and 400 connections
      Thread Stats   Avg      Stdev     Max   +/- Stdev
        Latency     5.89ms    3.53ms  96.35ms   93.72%
        Req/Sec     5.72k   587.65    13.96k    84.92%
      2052170 requests in 30.06s, 166.14MB read
      Socket errors: connect 0, read 240, write 0, timeout 0
    Requests/sec:  68275.79
    Transfer/sec:      5.53MB
- Very CRUD XML biased
- Requests/sec:  68275.79

### :restlet (jboss netty)
    Running 30s test @ http://127.0.0.1:8080/hello
      12 threads and 400 connections
      Thread Stats   Avg      Stdev     Max   +/- Stdev
        Latency     0.93ms   11.72ms 654.14ms   99.47%
        Req/Sec     5.51k     4.64k   17.96k    66.67%
      691352 requests in 30.07s, 148.94MB read
      Socket errors: connect 0, read 623, write 0, timeout 0
    Requests/sec:  22989.92
    Transfer/sec:      4.95MB
- Logs error Unable to run the following server-side task: sun.net.httpserver.Server
- Requests/sec:  22989.92

### :scalatra (jboss netty?)
- Could not get to run

### :sparkjava (eclipse jetty)
    Running 30s test @ http://127.0.0.1:8080/hello
      12 threads and 400 connections
      Thread Stats   Avg      Stdev     Max   +/- Stdev
        Latency     8.54ms   13.40ms 370.92ms   99.03%
        Req/Sec     3.94k   678.51     8.83k    89.09%
      1402187 requests in 30.03s, 227.18MB read
      Socket errors: connect 0, read 696, write 0, timeout 0
    Requests/sec:  46692.50
    Transfer/sec:      7.57MB
- Consistent
- Requests/sec:  46692.50

### :spray (spray-can)
    Running 30s test @ http://127.0.0.1:8080/hello
      12 threads and 400 connections
      Thread Stats   Avg      Stdev     Max   +/- Stdev
        Latency    11.50ms   17.21ms 162.90ms   90.59%
        Req/Sec     4.60k     1.68k   14.98k    68.92%
      1640194 requests in 30.08s, 240.72MB read
      Socket errors: connect 0, read 373, write 0, timeout 0
    Requests/sec:  54523.19
    Transfer/sec:      8.00MB
- Requests/sec:  54523.19

### :spring (eclipse jetty)
    Running 30s test @ http://127.0.0.1:8080/hello
      12 threads and 400 connections
      Thread Stats   Avg      Stdev     Max   +/- Stdev
        Latency    10.87ms   18.54ms 371.75ms   92.09%
        Req/Sec     4.36k     2.35k   37.93k    83.59%
      1547776 requests in 30.09s, 196.16MB read
      Socket errors: connect 0, read 625, write 0, timeout 0
    Requests/sec:  51440.01
    Transfer/sec:      6.52MB
- Super slow in beginning until it seeds, then fast
- Requests/sec:  57882.25

### :undertow (jboss xnio)
    Running 30s test @ http://127.0.0.1:8080/hello
      12 threads and 400 connections
      Thread Stats   Avg      Stdev     Max   +/- Stdev
        Latency     4.58ms    1.07ms  28.05ms   83.72%
        Req/Sec     7.12k   658.16     9.28k    69.25%
      2550946 requests in 30.02s, 335.45MB read
      Socket errors: connect 0, read 267, write 0, timeout 0
    Requests/sec:  84971.76
    Transfer/sec:     11.17MB
- Pretty raw. Deal with HttpServerExchange
- Requests/sec:  84971.76

### :vertx (eclipse vertx.io)
    Running 30s test @ http://127.0.0.1:8080/hello
      12 threads and 400 connections
      Thread Stats   Avg      Stdev     Max   +/- Stdev
        Latency     4.58ms    1.07ms  28.05ms   83.72%
        Req/Sec     7.12k   658.16     9.28k    69.25%
      2550946 requests in 30.02s, 335.45MB read
      Socket errors: connect 0, read 267, write 0, timeout 0
    Requests/sec:  84971.76
    Transfer/sec:     11.17MB
- Requests/sec:  84971.76

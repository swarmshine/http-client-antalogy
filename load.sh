#!/bin/bash
#
# Generate 100_000 http requests
#
for i in {1..10000}
do
  echo "request $i"
  curl --url "http://localhost:8080/slow/mono?requestId=$i" &
done
wait

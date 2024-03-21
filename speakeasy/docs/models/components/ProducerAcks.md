# ProducerAcks

The number of acknowledgments the producer requires the leader to have received before considering a request complete. If set to 'all' or '-1', the leader will wait for the full set of in-sync replicas to acknowledge the record.


## Values

| Name     | Value    |
| -------- | -------- |
| `ALL`    | all      |
| `MINUS1` | -1       |
| `ZERO`   | 0        |
| `ONE`    | 1        |
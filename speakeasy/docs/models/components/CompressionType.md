# CompressionType

Specify the final compression type for a given topic. This configuration accepts the standard compression codecs ('gzip', 'snappy', 'lz4', 'zstd'). It additionally accepts 'uncompressed' which is equivalent to no compression; and 'producer' which means retain the original compression codec set by the producer.


## Values

| Name           | Value          |
| -------------- | -------------- |
| `GZIP`         | gzip           |
| `SNAPPY`       | snappy         |
| `LZ4`          | lz4            |
| `ZSTD`         | zstd           |
| `UNCOMPRESSED` | uncompressed   |
| `PRODUCER`     | producer       |
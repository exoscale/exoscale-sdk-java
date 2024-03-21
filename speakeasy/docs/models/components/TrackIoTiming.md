# TrackIoTiming

Enables timing of database I/O calls. This parameter is off by default, because it will repeatedly query the operating system for the current time, which may cause significant overhead on some platforms.


## Values

| Name  | Value |
| ----- | ----- |
| `OFF` | off   |
| `ON`  | on    |
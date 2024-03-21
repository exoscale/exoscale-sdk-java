
# Background BG Writer Settings

## Structure

`BackgroundBGWriterSettings`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BgwriterDelay` | `Integer` | Optional | Specifies the delay between activity rounds for the background writer in milliseconds. Default is 200.<br>**Constraints**: `>= 10`, `<= 10000` | Integer getBgwriterDelay() | setBgwriterDelay(Integer bgwriterDelay) |
| `BgwriterFlushAfter` | `Integer` | Optional | Whenever more than bgwriter_flush_after bytes have been written by the background writer, attempt to force the OS to issue these writes to the underlying storage. Specified in kilobytes, default is 512. Setting of 0 disables forced writeback.<br>**Constraints**: `>= 0`, `<= 2048` | Integer getBgwriterFlushAfter() | setBgwriterFlushAfter(Integer bgwriterFlushAfter) |
| `BgwriterLruMultiplier` | `Double` | Optional | The average recent need for new buffers is multiplied by bgwriter_lru_multiplier to arrive at an estimate of the number that will be needed during the next round, (up to bgwriter_lru_maxpages). 1.0 represents a “just in time” policy of writing exactly the number of buffers predicted to be needed. Larger values provide some cushion against spikes in demand, while smaller values intentionally leave writes to be done by server processes. The default is 2.0.<br>**Constraints**: `>= 0`, `<= 10` | Double getBgwriterLruMultiplier() | setBgwriterLruMultiplier(Double bgwriterLruMultiplier) |
| `BgwriterLruMaxpages` | `Integer` | Optional | In each round, no more than this many buffers will be written by the background writer. Setting this to zero disables background writing. Default is 100.<br>**Constraints**: `>= 0`, `<= 1073741823` | Integer getBgwriterLruMaxpages() | setBgwriterLruMaxpages(Integer bgwriterLruMaxpages) |

## Example (as JSON)

```json
{
  "bgwriter_delay": 200,
  "bgwriter_flush_after": 512,
  "bgwriter_lru_multiplier": 2.0,
  "bgwriter_lru_maxpages": 100
}
```


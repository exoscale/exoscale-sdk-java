
# Event

A notable Mutation Event which happened on the infrastructure

## Structure

`Event`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `String` | Optional | Operation unique identifier | String getRequestId() | setRequestId(String requestId) |
| `Zone` | `String` | Optional | Operation targeted zone | String getZone() | setZone(String zone) |
| `RemoteAddr` | `String` | Optional | Client IP address | String getRemoteAddr() | setRemoteAddr(String remoteAddr) |
| `GetParams` | `Object` | Optional | Query string parameters (free form map) | Object getGetParams() | setGetParams(Object getParams) |
| `BodyParams` | `Object` | Optional | Body parameters (free form map) | Object getBodyParams() | setBodyParams(Object bodyParams) |
| `Status` | `Long` | Optional | Operation HTTP status<br>**Constraints**: `> 0` | Long getStatus() | setStatus(Long status) |
| `Uri` | `String` | Optional | Operation request URI | String getUri() | setUri(String uri) |
| `ElapsedMs` | `Long` | Optional | Operation processing time<br>**Constraints**: `> 0` | Long getElapsedMs() | setElapsedMs(Long elapsedMs) |
| `Timestamp` | `LocalDateTime` | Optional | Time at which the event happened, millisecond resolution | LocalDateTime getTimestamp() | setTimestamp(LocalDateTime timestamp) |
| `PathParams` | `Object` | Optional | URI path parameters (free form map) | Object getPathParams() | setPathParams(Object pathParams) |
| `Handler` | `String` | Optional | Operation handler name | String getHandler() | setHandler(String handler) |
| `Message` | `String` | Optional | Operation message | String getMessage() | setMessage(String message) |

## Example (as JSON)

```json
{
  "request-id": "request-id2",
  "zone": "zone2",
  "remote-addr": "remote-addr4",
  "get-params": {
    "key1": "val1",
    "key2": "val2"
  },
  "body-params": {
    "key1": "val1",
    "key2": "val2"
  }
}
```



# Dbaas Service Logs Request

## Structure

`DbaasServiceLogsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Limit` | `Long` | Optional | How many log entries to receive at most, up to 500 (default: 100)<br>**Constraints**: `>= 1`, `<= 500` | Long getLimit() | setLimit(Long limit) |
| `SortOrder` | [`EnumSortOrderEnum`](../../doc/models/enum-sort-order-enum.md) | Optional | - | EnumSortOrderEnum getSortOrder() | setSortOrder(EnumSortOrderEnum sortOrder) |
| `Offset` | `String` | Optional | Opaque offset identifier | String getOffset() | setOffset(String offset) |

## Example (as JSON)

```json
{
  "limit": 156,
  "sort-order": "desc",
  "offset": "offset8"
}
```


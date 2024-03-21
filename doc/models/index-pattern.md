
# Index Pattern

## Structure

`IndexPattern`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MaxIndexCount` | `Long` | Optional | Maximum number of indexes to keep<br>**Constraints**: `>= 0` | Long getMaxIndexCount() | setMaxIndexCount(Long maxIndexCount) |
| `SortingAlgorithm` | [`SortingAlgorithmEnum`](../../doc/models/sorting-algorithm-enum.md) | Optional | Deletion sorting algorithm | SortingAlgorithmEnum getSortingAlgorithm() | setSortingAlgorithm(SortingAlgorithmEnum sortingAlgorithm) |
| `Pattern` | `String` | Optional | fnmatch pattern<br>**Constraints**: *Maximum Length*: `1024` | String getPattern() | setPattern(String pattern) |

## Example (as JSON)

```json
{
  "max-index-count": 180,
  "sorting-algorithm": "alphabetical",
  "pattern": "pattern8"
}
```


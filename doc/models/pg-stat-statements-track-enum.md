
# Pg Stat Statements Track Enum

Controls which statements are counted. Specify top to track top-level statements (those issued directly by clients), all to also track nested statements (such as statements invoked within functions), or none to disable statement statistics collection. The default value is top.

## Enumeration

`PgStatStatementsTrackEnum`

## Fields

| Name |
|  --- |
| `All` |
| `Top` |
| `None` |


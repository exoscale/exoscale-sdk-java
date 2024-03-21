
# Sks Nodepool Taint

Nodepool taint

## Structure

`SksNodepoolTaint`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Value` | `String` | Required | Nodepool taint value<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getValue() | setValue(String value) |
| `Effect` | [`EffectEnum`](../../doc/models/effect-enum.md) | Required | Nodepool taint effect | EffectEnum getEffect() | setEffect(EffectEnum effect) |

## Example (as JSON)

```json
{
  "value": "value4",
  "effect": "NoExecute"
}
```



# Grafana Date Format Specifications

## Structure

`GrafanaDateFormatSpecifications`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FullDate` | `String` | Optional | **Constraints**: *Maximum Length*: `128`, *Pattern*: `^(([Hh]mm(ss)?\|Mo\|MM?M?M?\|Do\|DDDo\|DD?D?D?\|ddd?d?\|do?\|w[o\|w]?\|W[o\|W]?\|Qo?\|N{1,5}\|YYYYYY\|YYYYY\|YYYY\|YY\|y{2,4}\|yo?\|gg(ggg?)?\|GG(GGG?)?\|e\|E\|a\|A\|hh?\|HH?\|kk?\|mm?\|ss?\|S{1,9}\|x\|X\|zz?\|ZZ?\|LTS\|LT\|LL?L?L?\|l{1,4}\|[-+/T,;.: ]?)*)$` | String getFullDate() | setFullDate(String fullDate) |
| `IntervalSecond` | `String` | Optional | **Constraints**: *Maximum Length*: `128`, *Pattern*: `^(([Hh]mm(ss)?\|Mo\|MM?M?M?\|Do\|DDDo\|DD?D?D?\|ddd?d?\|do?\|w[o\|w]?\|W[o\|W]?\|Qo?\|N{1,5}\|YYYYYY\|YYYYY\|YYYY\|YY\|y{2,4}\|yo?\|gg(ggg?)?\|GG(GGG?)?\|e\|E\|a\|A\|hh?\|HH?\|kk?\|mm?\|ss?\|S{1,9}\|x\|X\|zz?\|ZZ?\|LTS\|LT\|LL?L?L?\|l{1,4}\|[-+/T,;.: ]?)*)$` | String getIntervalSecond() | setIntervalSecond(String intervalSecond) |
| `IntervalMinute` | `String` | Optional | **Constraints**: *Maximum Length*: `128`, *Pattern*: `^(([Hh]mm(ss)?\|Mo\|MM?M?M?\|Do\|DDDo\|DD?D?D?\|ddd?d?\|do?\|w[o\|w]?\|W[o\|W]?\|Qo?\|N{1,5}\|YYYYYY\|YYYYY\|YYYY\|YY\|y{2,4}\|yo?\|gg(ggg?)?\|GG(GGG?)?\|e\|E\|a\|A\|hh?\|HH?\|kk?\|mm?\|ss?\|S{1,9}\|x\|X\|zz?\|ZZ?\|LTS\|LT\|LL?L?L?\|l{1,4}\|[-+/T,;.: ]?)*)$` | String getIntervalMinute() | setIntervalMinute(String intervalMinute) |
| `IntervalHour` | `String` | Optional | **Constraints**: *Maximum Length*: `128`, *Pattern*: `^(([Hh]mm(ss)?\|Mo\|MM?M?M?\|Do\|DDDo\|DD?D?D?\|ddd?d?\|do?\|w[o\|w]?\|W[o\|W]?\|Qo?\|N{1,5}\|YYYYYY\|YYYYY\|YYYY\|YY\|y{2,4}\|yo?\|gg(ggg?)?\|GG(GGG?)?\|e\|E\|a\|A\|hh?\|HH?\|kk?\|mm?\|ss?\|S{1,9}\|x\|X\|zz?\|ZZ?\|LTS\|LT\|LL?L?L?\|l{1,4}\|[-+/T,;.: ]?)*)$` | String getIntervalHour() | setIntervalHour(String intervalHour) |
| `IntervalDay` | `String` | Optional | **Constraints**: *Maximum Length*: `128`, *Pattern*: `^(([Hh]mm(ss)?\|Mo\|MM?M?M?\|Do\|DDDo\|DD?D?D?\|ddd?d?\|do?\|w[o\|w]?\|W[o\|W]?\|Qo?\|N{1,5}\|YYYYYY\|YYYYY\|YYYY\|YY\|y{2,4}\|yo?\|gg(ggg?)?\|GG(GGG?)?\|e\|E\|a\|A\|hh?\|HH?\|kk?\|mm?\|ss?\|S{1,9}\|x\|X\|zz?\|ZZ?\|LTS\|LT\|LL?L?L?\|l{1,4}\|[-+/T,;.: ]?)*)$` | String getIntervalDay() | setIntervalDay(String intervalDay) |
| `IntervalMonth` | `String` | Optional | **Constraints**: *Maximum Length*: `128`, *Pattern*: `^(([Hh]mm(ss)?\|Mo\|MM?M?M?\|Do\|DDDo\|DD?D?D?\|ddd?d?\|do?\|w[o\|w]?\|W[o\|W]?\|Qo?\|N{1,5}\|YYYYYY\|YYYYY\|YYYY\|YY\|y{2,4}\|yo?\|gg(ggg?)?\|GG(GGG?)?\|e\|E\|a\|A\|hh?\|HH?\|kk?\|mm?\|ss?\|S{1,9}\|x\|X\|zz?\|ZZ?\|LTS\|LT\|LL?L?L?\|l{1,4}\|[-+/T,;.: ]?)*)$` | String getIntervalMonth() | setIntervalMonth(String intervalMonth) |
| `IntervalYear` | `String` | Optional | **Constraints**: *Maximum Length*: `128`, *Pattern*: `^(([Hh]mm(ss)?\|Mo\|MM?M?M?\|Do\|DDDo\|DD?D?D?\|ddd?d?\|do?\|w[o\|w]?\|W[o\|W]?\|Qo?\|N{1,5}\|YYYYYY\|YYYYY\|YYYY\|YY\|y{2,4}\|yo?\|gg(ggg?)?\|GG(GGG?)?\|e\|E\|a\|A\|hh?\|HH?\|kk?\|mm?\|ss?\|S{1,9}\|x\|X\|zz?\|ZZ?\|LTS\|LT\|LL?L?L?\|l{1,4}\|[-+/T,;.: ]?)*)$` | String getIntervalYear() | setIntervalYear(String intervalYear) |
| `DefaultTimezone` | `String` | Optional | **Constraints**: *Maximum Length*: `64`, *Pattern*: `^([a-zA-Z_]+/){1,2}[a-zA-Z_-]+$\|^(Etc/)?([Uu][Tt][Cc]\|[Gg][Mm][Tt])([+-](\d){1,2})?$\|^([Ff][Aa][Cc][Tt][Oo][Rr][Yy])$\|^([Bb][Rr][Oo][Ww][Ss][Ee][Rr])$` | String getDefaultTimezone() | setDefaultTimezone(String defaultTimezone) |

## Example (as JSON)

```json
{
  "full_date": "YYYY MM DD",
  "interval_second": "HH:mm:ss",
  "interval_minute": "HH:mm",
  "interval_hour": "MM/DD HH:mm",
  "interval_day": "MM/DD",
  "interval_month": "YYYY-MM",
  "interval_year": "YYYY",
  "default_timezone": "Europe/Helsinki"
}
```


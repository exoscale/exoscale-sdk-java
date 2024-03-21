# DefaultACLForPubSubChannelsUsedWhenRedisUserIsCreated

Determines default pub/sub channels' ACL for new users if ACL is not supplied. When this option is not defined, all_channels is assumed to keep backward compatibility. This option doesn't affect Redis configuration acl-pubsub-default.


## Values

| Name            | Value           |
| --------------- | --------------- |
| `ALLCHANNELS`   | allchannels     |
| `RESETCHANNELS` | resetchannels   |
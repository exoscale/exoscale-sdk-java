# LogLinePrefix

Choose from one of the available log-formats. These can support popular log analyzers like pgbadger, pganalyze etc.


## Values

| Name                                                                                                                | Value                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `PID_EQUAL_PERCENT_P_USER_EQUAL_PERCENT_U_DB_EQUAL_PERCENT_D_APP_EQUAL_PERCENT_A_CLIENT_EQUAL_PERCENT_H`            | 'pid=%p,user=%u,db=%d,app=%a,client=%h '                                                                            |
| `PERCENT_T_PERCENT_P_PERCENT_L1_USER_EQUAL_PERCENT_U_DB_EQUAL_PERCENT_D_APP_EQUAL_PERCENT_A_CLIENT_EQUAL_PERCENT_H` | '%t [%p]: [%l-1] user=%u,db=%d,app=%a,client=%h '                                                                   |
| `PERCENT_M_PERCENT_P_PERCENT_Q_USER_EQUAL_PERCENT_U_DB_EQUAL_PERCENT_D_APP_EQUAL_PERCENT_A`                         | '%m [%p] %q[user=%u,db=%d,app=%a] '                                                                                 |
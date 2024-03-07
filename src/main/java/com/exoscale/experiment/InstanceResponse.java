package com.exoscale.experiment;

import lombok.*;

import java.util.UUID;

/**
 * Class representing the response for an Exoscale compute instance operation.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InstanceResponse {
    private UUID id;
    private String state;
    private Reference reference;

}

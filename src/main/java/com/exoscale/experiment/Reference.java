package com.exoscale.experiment;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

/**
 * Class representing a reference object in Exoscale responses.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reference {
    private UUID id;
    private String link;
    private String command;
}

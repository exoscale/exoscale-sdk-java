package com.exoscale.experiment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Class representing an Exoscale compute instance.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Instance {

    private String autoStart;
    private String instanceTypeId;
    private String templateId;
    private String diskSize;
    private String securityGroupId;
    //private String userData;
}

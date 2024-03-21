/*
 * ExoscalePublicAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.exoscale.apichgva2.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for BlockStorageResponse type.
 */
public class BlockStorageResponse {
    private List<BlockStorageVolume> blockStorageVolumes;

    /**
     * Default constructor.
     */
    public BlockStorageResponse() {
    }

    /**
     * Initialization constructor.
     * @param  blockStorageVolumes  List of BlockStorageVolume value for blockStorageVolumes.
     */
    public BlockStorageResponse(
            List<BlockStorageVolume> blockStorageVolumes) {
        this.blockStorageVolumes = blockStorageVolumes;
    }

    /**
     * Getter for BlockStorageVolumes.
     * @return Returns the List of BlockStorageVolume
     */
    @JsonGetter("block-storage-volumes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<BlockStorageVolume> getBlockStorageVolumes() {
        return blockStorageVolumes;
    }

    /**
     * Setter for BlockStorageVolumes.
     * @param blockStorageVolumes Value for List of BlockStorageVolume
     */
    @JsonSetter("block-storage-volumes")
    public void setBlockStorageVolumes(List<BlockStorageVolume> blockStorageVolumes) {
        this.blockStorageVolumes = blockStorageVolumes;
    }

    /**
     * Converts this BlockStorageResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BlockStorageResponse [" + "blockStorageVolumes=" + blockStorageVolumes + "]";
    }

    /**
     * Builds a new {@link BlockStorageResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BlockStorageResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .blockStorageVolumes(getBlockStorageVolumes());
        return builder;
    }

    /**
     * Class to build instances of {@link BlockStorageResponse}.
     */
    public static class Builder {
        private List<BlockStorageVolume> blockStorageVolumes;



        /**
         * Setter for blockStorageVolumes.
         * @param  blockStorageVolumes  List of BlockStorageVolume value for blockStorageVolumes.
         * @return Builder
         */
        public Builder blockStorageVolumes(List<BlockStorageVolume> blockStorageVolumes) {
            this.blockStorageVolumes = blockStorageVolumes;
            return this;
        }

        /**
         * Builds a new {@link BlockStorageResponse} object using the set fields.
         * @return {@link BlockStorageResponse}
         */
        public BlockStorageResponse build() {
            return new BlockStorageResponse(blockStorageVolumes);
        }
    }
}

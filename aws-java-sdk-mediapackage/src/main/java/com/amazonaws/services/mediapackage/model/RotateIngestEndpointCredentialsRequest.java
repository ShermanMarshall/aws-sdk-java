/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.mediapackage.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/RotateIngestEndpointCredentials"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RotateIngestEndpointCredentialsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The ID of the channel the IngestEndpoint is on. */
    private String id;
    /** The id of the IngestEndpoint whose credentials should be rotated */
    private String ingestEndpointId;

    /**
     * The ID of the channel the IngestEndpoint is on.
     * 
     * @param id
     *        The ID of the channel the IngestEndpoint is on.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The ID of the channel the IngestEndpoint is on.
     * 
     * @return The ID of the channel the IngestEndpoint is on.
     */

    public String getId() {
        return this.id;
    }

    /**
     * The ID of the channel the IngestEndpoint is on.
     * 
     * @param id
     *        The ID of the channel the IngestEndpoint is on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RotateIngestEndpointCredentialsRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * The id of the IngestEndpoint whose credentials should be rotated
     * 
     * @param ingestEndpointId
     *        The id of the IngestEndpoint whose credentials should be rotated
     */

    public void setIngestEndpointId(String ingestEndpointId) {
        this.ingestEndpointId = ingestEndpointId;
    }

    /**
     * The id of the IngestEndpoint whose credentials should be rotated
     * 
     * @return The id of the IngestEndpoint whose credentials should be rotated
     */

    public String getIngestEndpointId() {
        return this.ingestEndpointId;
    }

    /**
     * The id of the IngestEndpoint whose credentials should be rotated
     * 
     * @param ingestEndpointId
     *        The id of the IngestEndpoint whose credentials should be rotated
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RotateIngestEndpointCredentialsRequest withIngestEndpointId(String ingestEndpointId) {
        setIngestEndpointId(ingestEndpointId);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getIngestEndpointId() != null)
            sb.append("IngestEndpointId: ").append(getIngestEndpointId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RotateIngestEndpointCredentialsRequest == false)
            return false;
        RotateIngestEndpointCredentialsRequest other = (RotateIngestEndpointCredentialsRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIngestEndpointId() == null ^ this.getIngestEndpointId() == null)
            return false;
        if (other.getIngestEndpointId() != null && other.getIngestEndpointId().equals(this.getIngestEndpointId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getIngestEndpointId() == null) ? 0 : getIngestEndpointId().hashCode());
        return hashCode;
    }

    @Override
    public RotateIngestEndpointCredentialsRequest clone() {
        return (RotateIngestEndpointCredentialsRequest) super.clone();
    }

}

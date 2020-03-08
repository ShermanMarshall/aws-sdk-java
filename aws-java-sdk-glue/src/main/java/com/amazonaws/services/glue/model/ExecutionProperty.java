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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An execution property of a job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ExecutionProperty" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecutionProperty implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum number of concurrent runs allowed for the job. The default is 1. An error is returned when this
     * threshold is reached. The maximum value you can specify is controlled by a service limit.
     * </p>
     */
    private Integer maxConcurrentRuns;

    /**
     * <p>
     * The maximum number of concurrent runs allowed for the job. The default is 1. An error is returned when this
     * threshold is reached. The maximum value you can specify is controlled by a service limit.
     * </p>
     * 
     * @param maxConcurrentRuns
     *        The maximum number of concurrent runs allowed for the job. The default is 1. An error is returned when
     *        this threshold is reached. The maximum value you can specify is controlled by a service limit.
     */

    public void setMaxConcurrentRuns(Integer maxConcurrentRuns) {
        this.maxConcurrentRuns = maxConcurrentRuns;
    }

    /**
     * <p>
     * The maximum number of concurrent runs allowed for the job. The default is 1. An error is returned when this
     * threshold is reached. The maximum value you can specify is controlled by a service limit.
     * </p>
     * 
     * @return The maximum number of concurrent runs allowed for the job. The default is 1. An error is returned when
     *         this threshold is reached. The maximum value you can specify is controlled by a service limit.
     */

    public Integer getMaxConcurrentRuns() {
        return this.maxConcurrentRuns;
    }

    /**
     * <p>
     * The maximum number of concurrent runs allowed for the job. The default is 1. An error is returned when this
     * threshold is reached. The maximum value you can specify is controlled by a service limit.
     * </p>
     * 
     * @param maxConcurrentRuns
     *        The maximum number of concurrent runs allowed for the job. The default is 1. An error is returned when
     *        this threshold is reached. The maximum value you can specify is controlled by a service limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionProperty withMaxConcurrentRuns(Integer maxConcurrentRuns) {
        setMaxConcurrentRuns(maxConcurrentRuns);
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
        if (getMaxConcurrentRuns() != null)
            sb.append("MaxConcurrentRuns: ").append(getMaxConcurrentRuns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExecutionProperty == false)
            return false;
        ExecutionProperty other = (ExecutionProperty) obj;
        if (other.getMaxConcurrentRuns() == null ^ this.getMaxConcurrentRuns() == null)
            return false;
        if (other.getMaxConcurrentRuns() != null && other.getMaxConcurrentRuns().equals(this.getMaxConcurrentRuns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxConcurrentRuns() == null) ? 0 : getMaxConcurrentRuns().hashCode());
        return hashCode;
    }

    @Override
    public ExecutionProperty clone() {
        try {
            return (ExecutionProperty) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.ExecutionPropertyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

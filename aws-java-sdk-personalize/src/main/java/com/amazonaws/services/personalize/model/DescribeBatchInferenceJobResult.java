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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeBatchInferenceJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBatchInferenceJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information on the specified batch inference job.
     * </p>
     */
    private BatchInferenceJob batchInferenceJob;

    /**
     * <p>
     * Information on the specified batch inference job.
     * </p>
     * 
     * @param batchInferenceJob
     *        Information on the specified batch inference job.
     */

    public void setBatchInferenceJob(BatchInferenceJob batchInferenceJob) {
        this.batchInferenceJob = batchInferenceJob;
    }

    /**
     * <p>
     * Information on the specified batch inference job.
     * </p>
     * 
     * @return Information on the specified batch inference job.
     */

    public BatchInferenceJob getBatchInferenceJob() {
        return this.batchInferenceJob;
    }

    /**
     * <p>
     * Information on the specified batch inference job.
     * </p>
     * 
     * @param batchInferenceJob
     *        Information on the specified batch inference job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBatchInferenceJobResult withBatchInferenceJob(BatchInferenceJob batchInferenceJob) {
        setBatchInferenceJob(batchInferenceJob);
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
        if (getBatchInferenceJob() != null)
            sb.append("BatchInferenceJob: ").append(getBatchInferenceJob());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeBatchInferenceJobResult == false)
            return false;
        DescribeBatchInferenceJobResult other = (DescribeBatchInferenceJobResult) obj;
        if (other.getBatchInferenceJob() == null ^ this.getBatchInferenceJob() == null)
            return false;
        if (other.getBatchInferenceJob() != null && other.getBatchInferenceJob().equals(this.getBatchInferenceJob()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBatchInferenceJob() == null) ? 0 : getBatchInferenceJob().hashCode());
        return hashCode;
    }

    @Override
    public DescribeBatchInferenceJobResult clone() {
        try {
            return (DescribeBatchInferenceJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

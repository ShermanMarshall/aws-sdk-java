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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information on a batch inference job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/BatchInferenceJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchInferenceJob implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the batch inference job.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the batch inference job.
     * </p>
     */
    private String batchInferenceJobArn;
    /**
     * <p>
     * If the batch inference job failed, the reason for the failure.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution version from which the batch inference job was created.
     * </p>
     */
    private String solutionVersionArn;
    /**
     * <p>
     * The number of recommendations generated by the batch inference job. This number includes the error messages
     * generated for failed input records.
     * </p>
     */
    private Integer numResults;
    /**
     * <p>
     * The Amazon S3 path that leads to the input data used to generate the batch inference job.
     * </p>
     */
    private BatchInferenceJobInput jobInput;
    /**
     * <p>
     * The Amazon S3 bucket that contains the output data generated by the batch inference job.
     * </p>
     */
    private BatchInferenceJobOutput jobOutput;
    /**
     * <p>
     * The ARN of the Amazon Identity and Access Management (IAM) role that requested the batch inference job.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The status of the batch inference job. The status is one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING
     * </p>
     * </li>
     * <li>
     * <p>
     * IN PROGRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE FAILED
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The time at which the batch inference job was created.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The time at which the batch inference job was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;

    /**
     * <p>
     * The name of the batch inference job.
     * </p>
     * 
     * @param jobName
     *        The name of the batch inference job.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the batch inference job.
     * </p>
     * 
     * @return The name of the batch inference job.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name of the batch inference job.
     * </p>
     * 
     * @param jobName
     *        The name of the batch inference job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchInferenceJob withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the batch inference job.
     * </p>
     * 
     * @param batchInferenceJobArn
     *        The Amazon Resource Name (ARN) of the batch inference job.
     */

    public void setBatchInferenceJobArn(String batchInferenceJobArn) {
        this.batchInferenceJobArn = batchInferenceJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the batch inference job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the batch inference job.
     */

    public String getBatchInferenceJobArn() {
        return this.batchInferenceJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the batch inference job.
     * </p>
     * 
     * @param batchInferenceJobArn
     *        The Amazon Resource Name (ARN) of the batch inference job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchInferenceJob withBatchInferenceJobArn(String batchInferenceJobArn) {
        setBatchInferenceJobArn(batchInferenceJobArn);
        return this;
    }

    /**
     * <p>
     * If the batch inference job failed, the reason for the failure.
     * </p>
     * 
     * @param failureReason
     *        If the batch inference job failed, the reason for the failure.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If the batch inference job failed, the reason for the failure.
     * </p>
     * 
     * @return If the batch inference job failed, the reason for the failure.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If the batch inference job failed, the reason for the failure.
     * </p>
     * 
     * @param failureReason
     *        If the batch inference job failed, the reason for the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchInferenceJob withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution version from which the batch inference job was created.
     * </p>
     * 
     * @param solutionVersionArn
     *        The Amazon Resource Name (ARN) of the solution version from which the batch inference job was created.
     */

    public void setSolutionVersionArn(String solutionVersionArn) {
        this.solutionVersionArn = solutionVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution version from which the batch inference job was created.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the solution version from which the batch inference job was created.
     */

    public String getSolutionVersionArn() {
        return this.solutionVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution version from which the batch inference job was created.
     * </p>
     * 
     * @param solutionVersionArn
     *        The Amazon Resource Name (ARN) of the solution version from which the batch inference job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchInferenceJob withSolutionVersionArn(String solutionVersionArn) {
        setSolutionVersionArn(solutionVersionArn);
        return this;
    }

    /**
     * <p>
     * The number of recommendations generated by the batch inference job. This number includes the error messages
     * generated for failed input records.
     * </p>
     * 
     * @param numResults
     *        The number of recommendations generated by the batch inference job. This number includes the error
     *        messages generated for failed input records.
     */

    public void setNumResults(Integer numResults) {
        this.numResults = numResults;
    }

    /**
     * <p>
     * The number of recommendations generated by the batch inference job. This number includes the error messages
     * generated for failed input records.
     * </p>
     * 
     * @return The number of recommendations generated by the batch inference job. This number includes the error
     *         messages generated for failed input records.
     */

    public Integer getNumResults() {
        return this.numResults;
    }

    /**
     * <p>
     * The number of recommendations generated by the batch inference job. This number includes the error messages
     * generated for failed input records.
     * </p>
     * 
     * @param numResults
     *        The number of recommendations generated by the batch inference job. This number includes the error
     *        messages generated for failed input records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchInferenceJob withNumResults(Integer numResults) {
        setNumResults(numResults);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 path that leads to the input data used to generate the batch inference job.
     * </p>
     * 
     * @param jobInput
     *        The Amazon S3 path that leads to the input data used to generate the batch inference job.
     */

    public void setJobInput(BatchInferenceJobInput jobInput) {
        this.jobInput = jobInput;
    }

    /**
     * <p>
     * The Amazon S3 path that leads to the input data used to generate the batch inference job.
     * </p>
     * 
     * @return The Amazon S3 path that leads to the input data used to generate the batch inference job.
     */

    public BatchInferenceJobInput getJobInput() {
        return this.jobInput;
    }

    /**
     * <p>
     * The Amazon S3 path that leads to the input data used to generate the batch inference job.
     * </p>
     * 
     * @param jobInput
     *        The Amazon S3 path that leads to the input data used to generate the batch inference job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchInferenceJob withJobInput(BatchInferenceJobInput jobInput) {
        setJobInput(jobInput);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket that contains the output data generated by the batch inference job.
     * </p>
     * 
     * @param jobOutput
     *        The Amazon S3 bucket that contains the output data generated by the batch inference job.
     */

    public void setJobOutput(BatchInferenceJobOutput jobOutput) {
        this.jobOutput = jobOutput;
    }

    /**
     * <p>
     * The Amazon S3 bucket that contains the output data generated by the batch inference job.
     * </p>
     * 
     * @return The Amazon S3 bucket that contains the output data generated by the batch inference job.
     */

    public BatchInferenceJobOutput getJobOutput() {
        return this.jobOutput;
    }

    /**
     * <p>
     * The Amazon S3 bucket that contains the output data generated by the batch inference job.
     * </p>
     * 
     * @param jobOutput
     *        The Amazon S3 bucket that contains the output data generated by the batch inference job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchInferenceJob withJobOutput(BatchInferenceJobOutput jobOutput) {
        setJobOutput(jobOutput);
        return this;
    }

    /**
     * <p>
     * The ARN of the Amazon Identity and Access Management (IAM) role that requested the batch inference job.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the Amazon Identity and Access Management (IAM) role that requested the batch inference job.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the Amazon Identity and Access Management (IAM) role that requested the batch inference job.
     * </p>
     * 
     * @return The ARN of the Amazon Identity and Access Management (IAM) role that requested the batch inference job.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the Amazon Identity and Access Management (IAM) role that requested the batch inference job.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the Amazon Identity and Access Management (IAM) role that requested the batch inference job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchInferenceJob withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The status of the batch inference job. The status is one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING
     * </p>
     * </li>
     * <li>
     * <p>
     * IN PROGRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the batch inference job. The status is one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PENDING
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IN PROGRESS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ACTIVE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATE FAILED
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the batch inference job. The status is one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING
     * </p>
     * </li>
     * <li>
     * <p>
     * IN PROGRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the batch inference job. The status is one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         PENDING
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IN PROGRESS
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACTIVE
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATE FAILED
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the batch inference job. The status is one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING
     * </p>
     * </li>
     * <li>
     * <p>
     * IN PROGRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the batch inference job. The status is one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PENDING
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IN PROGRESS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ACTIVE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATE FAILED
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchInferenceJob withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The time at which the batch inference job was created.
     * </p>
     * 
     * @param creationDateTime
     *        The time at which the batch inference job was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The time at which the batch inference job was created.
     * </p>
     * 
     * @return The time at which the batch inference job was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The time at which the batch inference job was created.
     * </p>
     * 
     * @param creationDateTime
     *        The time at which the batch inference job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchInferenceJob withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The time at which the batch inference job was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The time at which the batch inference job was last updated.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The time at which the batch inference job was last updated.
     * </p>
     * 
     * @return The time at which the batch inference job was last updated.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * The time at which the batch inference job was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The time at which the batch inference job was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchInferenceJob withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
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
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getBatchInferenceJobArn() != null)
            sb.append("BatchInferenceJobArn: ").append(getBatchInferenceJobArn()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getSolutionVersionArn() != null)
            sb.append("SolutionVersionArn: ").append(getSolutionVersionArn()).append(",");
        if (getNumResults() != null)
            sb.append("NumResults: ").append(getNumResults()).append(",");
        if (getJobInput() != null)
            sb.append("JobInput: ").append(getJobInput()).append(",");
        if (getJobOutput() != null)
            sb.append("JobOutput: ").append(getJobOutput()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getLastUpdatedDateTime() != null)
            sb.append("LastUpdatedDateTime: ").append(getLastUpdatedDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchInferenceJob == false)
            return false;
        BatchInferenceJob other = (BatchInferenceJob) obj;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getBatchInferenceJobArn() == null ^ this.getBatchInferenceJobArn() == null)
            return false;
        if (other.getBatchInferenceJobArn() != null && other.getBatchInferenceJobArn().equals(this.getBatchInferenceJobArn()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getSolutionVersionArn() == null ^ this.getSolutionVersionArn() == null)
            return false;
        if (other.getSolutionVersionArn() != null && other.getSolutionVersionArn().equals(this.getSolutionVersionArn()) == false)
            return false;
        if (other.getNumResults() == null ^ this.getNumResults() == null)
            return false;
        if (other.getNumResults() != null && other.getNumResults().equals(this.getNumResults()) == false)
            return false;
        if (other.getJobInput() == null ^ this.getJobInput() == null)
            return false;
        if (other.getJobInput() != null && other.getJobInput().equals(this.getJobInput()) == false)
            return false;
        if (other.getJobOutput() == null ^ this.getJobOutput() == null)
            return false;
        if (other.getJobOutput() != null && other.getJobOutput().equals(this.getJobOutput()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getBatchInferenceJobArn() == null) ? 0 : getBatchInferenceJobArn().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getSolutionVersionArn() == null) ? 0 : getSolutionVersionArn().hashCode());
        hashCode = prime * hashCode + ((getNumResults() == null) ? 0 : getNumResults().hashCode());
        hashCode = prime * hashCode + ((getJobInput() == null) ? 0 : getJobInput().hashCode());
        hashCode = prime * hashCode + ((getJobOutput() == null) ? 0 : getJobOutput().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        return hashCode;
    }

    @Override
    public BatchInferenceJob clone() {
        try {
            return (BatchInferenceJob) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalize.model.transform.BatchInferenceJobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

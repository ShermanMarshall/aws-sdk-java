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
package com.amazonaws.services.migrationhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/DisassociateCreatedArtifact"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateCreatedArtifactRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the ProgressUpdateStream.
     * </p>
     */
    private String progressUpdateStream;
    /**
     * <p>
     * Unique identifier that references the migration task to be disassociated with the artifact. <i>Do not store
     * personal data in this field.</i>
     * </p>
     */
    private String migrationTaskName;
    /**
     * <p>
     * An ARN of the AWS resource related to the migration (e.g., AMI, EC2 instance, RDS instance, etc.)
     * </p>
     */
    private String createdArtifactName;
    /**
     * <p>
     * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission
     * to make the call.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The name of the ProgressUpdateStream.
     * </p>
     * 
     * @param progressUpdateStream
     *        The name of the ProgressUpdateStream.
     */

    public void setProgressUpdateStream(String progressUpdateStream) {
        this.progressUpdateStream = progressUpdateStream;
    }

    /**
     * <p>
     * The name of the ProgressUpdateStream.
     * </p>
     * 
     * @return The name of the ProgressUpdateStream.
     */

    public String getProgressUpdateStream() {
        return this.progressUpdateStream;
    }

    /**
     * <p>
     * The name of the ProgressUpdateStream.
     * </p>
     * 
     * @param progressUpdateStream
     *        The name of the ProgressUpdateStream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateCreatedArtifactRequest withProgressUpdateStream(String progressUpdateStream) {
        setProgressUpdateStream(progressUpdateStream);
        return this;
    }

    /**
     * <p>
     * Unique identifier that references the migration task to be disassociated with the artifact. <i>Do not store
     * personal data in this field.</i>
     * </p>
     * 
     * @param migrationTaskName
     *        Unique identifier that references the migration task to be disassociated with the artifact. <i>Do not
     *        store personal data in this field.</i>
     */

    public void setMigrationTaskName(String migrationTaskName) {
        this.migrationTaskName = migrationTaskName;
    }

    /**
     * <p>
     * Unique identifier that references the migration task to be disassociated with the artifact. <i>Do not store
     * personal data in this field.</i>
     * </p>
     * 
     * @return Unique identifier that references the migration task to be disassociated with the artifact. <i>Do not
     *         store personal data in this field.</i>
     */

    public String getMigrationTaskName() {
        return this.migrationTaskName;
    }

    /**
     * <p>
     * Unique identifier that references the migration task to be disassociated with the artifact. <i>Do not store
     * personal data in this field.</i>
     * </p>
     * 
     * @param migrationTaskName
     *        Unique identifier that references the migration task to be disassociated with the artifact. <i>Do not
     *        store personal data in this field.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateCreatedArtifactRequest withMigrationTaskName(String migrationTaskName) {
        setMigrationTaskName(migrationTaskName);
        return this;
    }

    /**
     * <p>
     * An ARN of the AWS resource related to the migration (e.g., AMI, EC2 instance, RDS instance, etc.)
     * </p>
     * 
     * @param createdArtifactName
     *        An ARN of the AWS resource related to the migration (e.g., AMI, EC2 instance, RDS instance, etc.)
     */

    public void setCreatedArtifactName(String createdArtifactName) {
        this.createdArtifactName = createdArtifactName;
    }

    /**
     * <p>
     * An ARN of the AWS resource related to the migration (e.g., AMI, EC2 instance, RDS instance, etc.)
     * </p>
     * 
     * @return An ARN of the AWS resource related to the migration (e.g., AMI, EC2 instance, RDS instance, etc.)
     */

    public String getCreatedArtifactName() {
        return this.createdArtifactName;
    }

    /**
     * <p>
     * An ARN of the AWS resource related to the migration (e.g., AMI, EC2 instance, RDS instance, etc.)
     * </p>
     * 
     * @param createdArtifactName
     *        An ARN of the AWS resource related to the migration (e.g., AMI, EC2 instance, RDS instance, etc.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateCreatedArtifactRequest withCreatedArtifactName(String createdArtifactName) {
        setCreatedArtifactName(createdArtifactName);
        return this;
    }

    /**
     * <p>
     * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission
     * to make the call.
     * </p>
     * 
     * @param dryRun
     *        Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has
     *        permission to make the call.
     */

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission
     * to make the call.
     * </p>
     * 
     * @return Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has
     *         permission to make the call.
     */

    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * <p>
     * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission
     * to make the call.
     * </p>
     * 
     * @param dryRun
     *        Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has
     *        permission to make the call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateCreatedArtifactRequest withDryRun(Boolean dryRun) {
        setDryRun(dryRun);
        return this;
    }

    /**
     * <p>
     * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission
     * to make the call.
     * </p>
     * 
     * @return Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has
     *         permission to make the call.
     */

    public Boolean isDryRun() {
        return this.dryRun;
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
        if (getProgressUpdateStream() != null)
            sb.append("ProgressUpdateStream: ").append(getProgressUpdateStream()).append(",");
        if (getMigrationTaskName() != null)
            sb.append("MigrationTaskName: ").append(getMigrationTaskName()).append(",");
        if (getCreatedArtifactName() != null)
            sb.append("CreatedArtifactName: ").append(getCreatedArtifactName()).append(",");
        if (getDryRun() != null)
            sb.append("DryRun: ").append(getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateCreatedArtifactRequest == false)
            return false;
        DisassociateCreatedArtifactRequest other = (DisassociateCreatedArtifactRequest) obj;
        if (other.getProgressUpdateStream() == null ^ this.getProgressUpdateStream() == null)
            return false;
        if (other.getProgressUpdateStream() != null && other.getProgressUpdateStream().equals(this.getProgressUpdateStream()) == false)
            return false;
        if (other.getMigrationTaskName() == null ^ this.getMigrationTaskName() == null)
            return false;
        if (other.getMigrationTaskName() != null && other.getMigrationTaskName().equals(this.getMigrationTaskName()) == false)
            return false;
        if (other.getCreatedArtifactName() == null ^ this.getCreatedArtifactName() == null)
            return false;
        if (other.getCreatedArtifactName() != null && other.getCreatedArtifactName().equals(this.getCreatedArtifactName()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProgressUpdateStream() == null) ? 0 : getProgressUpdateStream().hashCode());
        hashCode = prime * hashCode + ((getMigrationTaskName() == null) ? 0 : getMigrationTaskName().hashCode());
        hashCode = prime * hashCode + ((getCreatedArtifactName() == null) ? 0 : getCreatedArtifactName().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateCreatedArtifactRequest clone() {
        return (DisassociateCreatedArtifactRequest) super.clone();
    }

}

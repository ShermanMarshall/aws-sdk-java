/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Information about a group.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GroupInformation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GroupInformation implements Serializable, Cloneable, StructuredPojo {

    /** The ARN of the group. */
    private String arn;
    /** The time, in milliseconds since the epoch, when the group was created. */
    private String creationTimestamp;
    /** The ID of the group. */
    private String id;
    /** The time, in milliseconds since the epoch, when the group was last updated. */
    private String lastUpdatedTimestamp;
    /** The ID of the latest version associated with the group. */
    private String latestVersion;
    /** The ARN of the latest version associated with the group. */
    private String latestVersionArn;
    /** The name of the group. */
    private String name;

    /**
     * The ARN of the group.
     * 
     * @param arn
     *        The ARN of the group.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * The ARN of the group.
     * 
     * @return The ARN of the group.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * The ARN of the group.
     * 
     * @param arn
     *        The ARN of the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupInformation withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * The time, in milliseconds since the epoch, when the group was created.
     * 
     * @param creationTimestamp
     *        The time, in milliseconds since the epoch, when the group was created.
     */

    public void setCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * The time, in milliseconds since the epoch, when the group was created.
     * 
     * @return The time, in milliseconds since the epoch, when the group was created.
     */

    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }

    /**
     * The time, in milliseconds since the epoch, when the group was created.
     * 
     * @param creationTimestamp
     *        The time, in milliseconds since the epoch, when the group was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupInformation withCreationTimestamp(String creationTimestamp) {
        setCreationTimestamp(creationTimestamp);
        return this;
    }

    /**
     * The ID of the group.
     * 
     * @param id
     *        The ID of the group.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The ID of the group.
     * 
     * @return The ID of the group.
     */

    public String getId() {
        return this.id;
    }

    /**
     * The ID of the group.
     * 
     * @param id
     *        The ID of the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupInformation withId(String id) {
        setId(id);
        return this;
    }

    /**
     * The time, in milliseconds since the epoch, when the group was last updated.
     * 
     * @param lastUpdatedTimestamp
     *        The time, in milliseconds since the epoch, when the group was last updated.
     */

    public void setLastUpdatedTimestamp(String lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }

    /**
     * The time, in milliseconds since the epoch, when the group was last updated.
     * 
     * @return The time, in milliseconds since the epoch, when the group was last updated.
     */

    public String getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    /**
     * The time, in milliseconds since the epoch, when the group was last updated.
     * 
     * @param lastUpdatedTimestamp
     *        The time, in milliseconds since the epoch, when the group was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupInformation withLastUpdatedTimestamp(String lastUpdatedTimestamp) {
        setLastUpdatedTimestamp(lastUpdatedTimestamp);
        return this;
    }

    /**
     * The ID of the latest version associated with the group.
     * 
     * @param latestVersion
     *        The ID of the latest version associated with the group.
     */

    public void setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
    }

    /**
     * The ID of the latest version associated with the group.
     * 
     * @return The ID of the latest version associated with the group.
     */

    public String getLatestVersion() {
        return this.latestVersion;
    }

    /**
     * The ID of the latest version associated with the group.
     * 
     * @param latestVersion
     *        The ID of the latest version associated with the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupInformation withLatestVersion(String latestVersion) {
        setLatestVersion(latestVersion);
        return this;
    }

    /**
     * The ARN of the latest version associated with the group.
     * 
     * @param latestVersionArn
     *        The ARN of the latest version associated with the group.
     */

    public void setLatestVersionArn(String latestVersionArn) {
        this.latestVersionArn = latestVersionArn;
    }

    /**
     * The ARN of the latest version associated with the group.
     * 
     * @return The ARN of the latest version associated with the group.
     */

    public String getLatestVersionArn() {
        return this.latestVersionArn;
    }

    /**
     * The ARN of the latest version associated with the group.
     * 
     * @param latestVersionArn
     *        The ARN of the latest version associated with the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupInformation withLatestVersionArn(String latestVersionArn) {
        setLatestVersionArn(latestVersionArn);
        return this;
    }

    /**
     * The name of the group.
     * 
     * @param name
     *        The name of the group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the group.
     * 
     * @return The name of the group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * The name of the group.
     * 
     * @param name
     *        The name of the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupInformation withName(String name) {
        setName(name);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreationTimestamp() != null)
            sb.append("CreationTimestamp: ").append(getCreationTimestamp()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLastUpdatedTimestamp() != null)
            sb.append("LastUpdatedTimestamp: ").append(getLastUpdatedTimestamp()).append(",");
        if (getLatestVersion() != null)
            sb.append("LatestVersion: ").append(getLatestVersion()).append(",");
        if (getLatestVersionArn() != null)
            sb.append("LatestVersionArn: ").append(getLatestVersionArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GroupInformation == false)
            return false;
        GroupInformation other = (GroupInformation) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null)
            return false;
        if (other.getCreationTimestamp() != null && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLastUpdatedTimestamp() == null ^ this.getLastUpdatedTimestamp() == null)
            return false;
        if (other.getLastUpdatedTimestamp() != null && other.getLastUpdatedTimestamp().equals(this.getLastUpdatedTimestamp()) == false)
            return false;
        if (other.getLatestVersion() == null ^ this.getLatestVersion() == null)
            return false;
        if (other.getLatestVersion() != null && other.getLatestVersion().equals(this.getLatestVersion()) == false)
            return false;
        if (other.getLatestVersionArn() == null ^ this.getLatestVersionArn() == null)
            return false;
        if (other.getLatestVersionArn() != null && other.getLatestVersionArn().equals(this.getLatestVersionArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTimestamp() == null) ? 0 : getLastUpdatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLatestVersion() == null) ? 0 : getLatestVersion().hashCode());
        hashCode = prime * hashCode + ((getLatestVersionArn() == null) ? 0 : getLatestVersionArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public GroupInformation clone() {
        try {
            return (GroupInformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrass.model.transform.GroupInformationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

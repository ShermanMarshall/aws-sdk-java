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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the status and settings of the APNs (Apple Push Notification service) channel for an
 * application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/APNSChannelResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class APNSChannelResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the application that the APNs channel applies to.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The date and time when the APNs channel was enabled.
     * </p>
     */
    private String creationDate;
    /**
     * <p>
     * The default authentication method that Amazon Pinpoint uses to authenticate with APNs for this channel, key or
     * certificate.
     * </p>
     */
    private String defaultAuthenticationMethod;
    /**
     * <p>
     * Specifies whether the APNs channel is enabled for the application.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * (Not used) This property is retained only for backward compatibility.
     * </p>
     */
    private Boolean hasCredential;
    /**
     * <p>
     * Specifies whether the APNs channel is configured to communicate with APNs by using APNs tokens. To provide an
     * authentication key for APNs tokens, set the TokenKey property of the channel.
     * </p>
     */
    private Boolean hasTokenKey;
    /**
     * <p>
     * (Deprecated) An identifier for the APNs channel. This property is retained only for backward compatibility.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Specifies whether the APNs channel is archived.
     * </p>
     */
    private Boolean isArchived;
    /**
     * <p>
     * The user who last modified the APNs channel.
     * </p>
     */
    private String lastModifiedBy;
    /**
     * <p>
     * The date and time when the APNs channel was last modified.
     * </p>
     */
    private String lastModifiedDate;
    /**
     * <p>
     * The type of messaging or notification platform for the channel. For the APNs channel, this value is APNS.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * The current version of the APNs channel.
     * </p>
     */
    private Integer version;

    /**
     * <p>
     * The unique identifier for the application that the APNs channel applies to.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier for the application that the APNs channel applies to.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application that the APNs channel applies to.
     * </p>
     * 
     * @return The unique identifier for the application that the APNs channel applies to.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application that the APNs channel applies to.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier for the application that the APNs channel applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSChannelResponse withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The date and time when the APNs channel was enabled.
     * </p>
     * 
     * @param creationDate
     *        The date and time when the APNs channel was enabled.
     */

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time when the APNs channel was enabled.
     * </p>
     * 
     * @return The date and time when the APNs channel was enabled.
     */

    public String getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date and time when the APNs channel was enabled.
     * </p>
     * 
     * @param creationDate
     *        The date and time when the APNs channel was enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSChannelResponse withCreationDate(String creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The default authentication method that Amazon Pinpoint uses to authenticate with APNs for this channel, key or
     * certificate.
     * </p>
     * 
     * @param defaultAuthenticationMethod
     *        The default authentication method that Amazon Pinpoint uses to authenticate with APNs for this channel,
     *        key or certificate.
     */

    public void setDefaultAuthenticationMethod(String defaultAuthenticationMethod) {
        this.defaultAuthenticationMethod = defaultAuthenticationMethod;
    }

    /**
     * <p>
     * The default authentication method that Amazon Pinpoint uses to authenticate with APNs for this channel, key or
     * certificate.
     * </p>
     * 
     * @return The default authentication method that Amazon Pinpoint uses to authenticate with APNs for this channel,
     *         key or certificate.
     */

    public String getDefaultAuthenticationMethod() {
        return this.defaultAuthenticationMethod;
    }

    /**
     * <p>
     * The default authentication method that Amazon Pinpoint uses to authenticate with APNs for this channel, key or
     * certificate.
     * </p>
     * 
     * @param defaultAuthenticationMethod
     *        The default authentication method that Amazon Pinpoint uses to authenticate with APNs for this channel,
     *        key or certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSChannelResponse withDefaultAuthenticationMethod(String defaultAuthenticationMethod) {
        setDefaultAuthenticationMethod(defaultAuthenticationMethod);
        return this;
    }

    /**
     * <p>
     * Specifies whether the APNs channel is enabled for the application.
     * </p>
     * 
     * @param enabled
     *        Specifies whether the APNs channel is enabled for the application.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether the APNs channel is enabled for the application.
     * </p>
     * 
     * @return Specifies whether the APNs channel is enabled for the application.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specifies whether the APNs channel is enabled for the application.
     * </p>
     * 
     * @param enabled
     *        Specifies whether the APNs channel is enabled for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSChannelResponse withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether the APNs channel is enabled for the application.
     * </p>
     * 
     * @return Specifies whether the APNs channel is enabled for the application.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * (Not used) This property is retained only for backward compatibility.
     * </p>
     * 
     * @param hasCredential
     *        (Not used) This property is retained only for backward compatibility.
     */

    public void setHasCredential(Boolean hasCredential) {
        this.hasCredential = hasCredential;
    }

    /**
     * <p>
     * (Not used) This property is retained only for backward compatibility.
     * </p>
     * 
     * @return (Not used) This property is retained only for backward compatibility.
     */

    public Boolean getHasCredential() {
        return this.hasCredential;
    }

    /**
     * <p>
     * (Not used) This property is retained only for backward compatibility.
     * </p>
     * 
     * @param hasCredential
     *        (Not used) This property is retained only for backward compatibility.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSChannelResponse withHasCredential(Boolean hasCredential) {
        setHasCredential(hasCredential);
        return this;
    }

    /**
     * <p>
     * (Not used) This property is retained only for backward compatibility.
     * </p>
     * 
     * @return (Not used) This property is retained only for backward compatibility.
     */

    public Boolean isHasCredential() {
        return this.hasCredential;
    }

    /**
     * <p>
     * Specifies whether the APNs channel is configured to communicate with APNs by using APNs tokens. To provide an
     * authentication key for APNs tokens, set the TokenKey property of the channel.
     * </p>
     * 
     * @param hasTokenKey
     *        Specifies whether the APNs channel is configured to communicate with APNs by using APNs tokens. To provide
     *        an authentication key for APNs tokens, set the TokenKey property of the channel.
     */

    public void setHasTokenKey(Boolean hasTokenKey) {
        this.hasTokenKey = hasTokenKey;
    }

    /**
     * <p>
     * Specifies whether the APNs channel is configured to communicate with APNs by using APNs tokens. To provide an
     * authentication key for APNs tokens, set the TokenKey property of the channel.
     * </p>
     * 
     * @return Specifies whether the APNs channel is configured to communicate with APNs by using APNs tokens. To
     *         provide an authentication key for APNs tokens, set the TokenKey property of the channel.
     */

    public Boolean getHasTokenKey() {
        return this.hasTokenKey;
    }

    /**
     * <p>
     * Specifies whether the APNs channel is configured to communicate with APNs by using APNs tokens. To provide an
     * authentication key for APNs tokens, set the TokenKey property of the channel.
     * </p>
     * 
     * @param hasTokenKey
     *        Specifies whether the APNs channel is configured to communicate with APNs by using APNs tokens. To provide
     *        an authentication key for APNs tokens, set the TokenKey property of the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSChannelResponse withHasTokenKey(Boolean hasTokenKey) {
        setHasTokenKey(hasTokenKey);
        return this;
    }

    /**
     * <p>
     * Specifies whether the APNs channel is configured to communicate with APNs by using APNs tokens. To provide an
     * authentication key for APNs tokens, set the TokenKey property of the channel.
     * </p>
     * 
     * @return Specifies whether the APNs channel is configured to communicate with APNs by using APNs tokens. To
     *         provide an authentication key for APNs tokens, set the TokenKey property of the channel.
     */

    public Boolean isHasTokenKey() {
        return this.hasTokenKey;
    }

    /**
     * <p>
     * (Deprecated) An identifier for the APNs channel. This property is retained only for backward compatibility.
     * </p>
     * 
     * @param id
     *        (Deprecated) An identifier for the APNs channel. This property is retained only for backward
     *        compatibility.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * (Deprecated) An identifier for the APNs channel. This property is retained only for backward compatibility.
     * </p>
     * 
     * @return (Deprecated) An identifier for the APNs channel. This property is retained only for backward
     *         compatibility.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * (Deprecated) An identifier for the APNs channel. This property is retained only for backward compatibility.
     * </p>
     * 
     * @param id
     *        (Deprecated) An identifier for the APNs channel. This property is retained only for backward
     *        compatibility.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSChannelResponse withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Specifies whether the APNs channel is archived.
     * </p>
     * 
     * @param isArchived
     *        Specifies whether the APNs channel is archived.
     */

    public void setIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
    }

    /**
     * <p>
     * Specifies whether the APNs channel is archived.
     * </p>
     * 
     * @return Specifies whether the APNs channel is archived.
     */

    public Boolean getIsArchived() {
        return this.isArchived;
    }

    /**
     * <p>
     * Specifies whether the APNs channel is archived.
     * </p>
     * 
     * @param isArchived
     *        Specifies whether the APNs channel is archived.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSChannelResponse withIsArchived(Boolean isArchived) {
        setIsArchived(isArchived);
        return this;
    }

    /**
     * <p>
     * Specifies whether the APNs channel is archived.
     * </p>
     * 
     * @return Specifies whether the APNs channel is archived.
     */

    public Boolean isArchived() {
        return this.isArchived;
    }

    /**
     * <p>
     * The user who last modified the APNs channel.
     * </p>
     * 
     * @param lastModifiedBy
     *        The user who last modified the APNs channel.
     */

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * <p>
     * The user who last modified the APNs channel.
     * </p>
     * 
     * @return The user who last modified the APNs channel.
     */

    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * <p>
     * The user who last modified the APNs channel.
     * </p>
     * 
     * @param lastModifiedBy
     *        The user who last modified the APNs channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSChannelResponse withLastModifiedBy(String lastModifiedBy) {
        setLastModifiedBy(lastModifiedBy);
        return this;
    }

    /**
     * <p>
     * The date and time when the APNs channel was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date and time when the APNs channel was last modified.
     */

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date and time when the APNs channel was last modified.
     * </p>
     * 
     * @return The date and time when the APNs channel was last modified.
     */

    public String getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The date and time when the APNs channel was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date and time when the APNs channel was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSChannelResponse withLastModifiedDate(String lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * The type of messaging or notification platform for the channel. For the APNs channel, this value is APNS.
     * </p>
     * 
     * @param platform
     *        <p>
     *        The type of messaging or notification platform for the channel. For the APNs channel, this value is APNS.
     *        </p>
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The type of messaging or notification platform for the channel. For the APNs channel, this value is APNS.
     * </p>
     * 
     * @return <p>
     *         The type of messaging or notification platform for the channel. For the APNs channel, this value is APNS.
     *         </p>
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The type of messaging or notification platform for the channel. For the APNs channel, this value is APNS.
     * </p>
     * 
     * @param platform
     *        <p>
     *        The type of messaging or notification platform for the channel. For the APNs channel, this value is APNS.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSChannelResponse withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The current version of the APNs channel.
     * </p>
     * 
     * @param version
     *        The current version of the APNs channel.
     */

    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * <p>
     * The current version of the APNs channel.
     * </p>
     * 
     * @return The current version of the APNs channel.
     */

    public Integer getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The current version of the APNs channel.
     * </p>
     * 
     * @param version
     *        The current version of the APNs channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSChannelResponse withVersion(Integer version) {
        setVersion(version);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getDefaultAuthenticationMethod() != null)
            sb.append("DefaultAuthenticationMethod: ").append(getDefaultAuthenticationMethod()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getHasCredential() != null)
            sb.append("HasCredential: ").append(getHasCredential()).append(",");
        if (getHasTokenKey() != null)
            sb.append("HasTokenKey: ").append(getHasTokenKey()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getIsArchived() != null)
            sb.append("IsArchived: ").append(getIsArchived()).append(",");
        if (getLastModifiedBy() != null)
            sb.append("LastModifiedBy: ").append(getLastModifiedBy()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof APNSChannelResponse == false)
            return false;
        APNSChannelResponse other = (APNSChannelResponse) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getDefaultAuthenticationMethod() == null ^ this.getDefaultAuthenticationMethod() == null)
            return false;
        if (other.getDefaultAuthenticationMethod() != null && other.getDefaultAuthenticationMethod().equals(this.getDefaultAuthenticationMethod()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getHasCredential() == null ^ this.getHasCredential() == null)
            return false;
        if (other.getHasCredential() != null && other.getHasCredential().equals(this.getHasCredential()) == false)
            return false;
        if (other.getHasTokenKey() == null ^ this.getHasTokenKey() == null)
            return false;
        if (other.getHasTokenKey() != null && other.getHasTokenKey().equals(this.getHasTokenKey()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIsArchived() == null ^ this.getIsArchived() == null)
            return false;
        if (other.getIsArchived() != null && other.getIsArchived().equals(this.getIsArchived()) == false)
            return false;
        if (other.getLastModifiedBy() == null ^ this.getLastModifiedBy() == null)
            return false;
        if (other.getLastModifiedBy() != null && other.getLastModifiedBy().equals(this.getLastModifiedBy()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getDefaultAuthenticationMethod() == null) ? 0 : getDefaultAuthenticationMethod().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getHasCredential() == null) ? 0 : getHasCredential().hashCode());
        hashCode = prime * hashCode + ((getHasTokenKey() == null) ? 0 : getHasTokenKey().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getIsArchived() == null) ? 0 : getIsArchived().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public APNSChannelResponse clone() {
        try {
            return (APNSChannelResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.APNSChannelResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

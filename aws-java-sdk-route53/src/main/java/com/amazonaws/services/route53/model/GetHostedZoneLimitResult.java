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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A complex type that contains the requested limit.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetHostedZoneLimit" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetHostedZoneLimitResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The current setting for the specified limit. For example, if you specified <code>MAX_RRSETS_BY_ZONE</code> for
     * the value of <code>Type</code> in the request, the value of <code>Limit</code> is the maximum number of records
     * that you can create in the specified hosted zone.
     * </p>
     */
    private HostedZoneLimit limit;
    /**
     * <p>
     * The current number of entities that you have created of the specified type. For example, if you specified
     * <code>MAX_RRSETS_BY_ZONE</code> for the value of <code>Type</code> in the request, the value of
     * <code>Count</code> is the current number of records that you have created in the specified hosted zone.
     * </p>
     */
    private Long count;

    /**
     * <p>
     * The current setting for the specified limit. For example, if you specified <code>MAX_RRSETS_BY_ZONE</code> for
     * the value of <code>Type</code> in the request, the value of <code>Limit</code> is the maximum number of records
     * that you can create in the specified hosted zone.
     * </p>
     * 
     * @param limit
     *        The current setting for the specified limit. For example, if you specified <code>MAX_RRSETS_BY_ZONE</code>
     *        for the value of <code>Type</code> in the request, the value of <code>Limit</code> is the maximum number
     *        of records that you can create in the specified hosted zone.
     */

    public void setLimit(HostedZoneLimit limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The current setting for the specified limit. For example, if you specified <code>MAX_RRSETS_BY_ZONE</code> for
     * the value of <code>Type</code> in the request, the value of <code>Limit</code> is the maximum number of records
     * that you can create in the specified hosted zone.
     * </p>
     * 
     * @return The current setting for the specified limit. For example, if you specified
     *         <code>MAX_RRSETS_BY_ZONE</code> for the value of <code>Type</code> in the request, the value of
     *         <code>Limit</code> is the maximum number of records that you can create in the specified hosted zone.
     */

    public HostedZoneLimit getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The current setting for the specified limit. For example, if you specified <code>MAX_RRSETS_BY_ZONE</code> for
     * the value of <code>Type</code> in the request, the value of <code>Limit</code> is the maximum number of records
     * that you can create in the specified hosted zone.
     * </p>
     * 
     * @param limit
     *        The current setting for the specified limit. For example, if you specified <code>MAX_RRSETS_BY_ZONE</code>
     *        for the value of <code>Type</code> in the request, the value of <code>Limit</code> is the maximum number
     *        of records that you can create in the specified hosted zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetHostedZoneLimitResult withLimit(HostedZoneLimit limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * The current number of entities that you have created of the specified type. For example, if you specified
     * <code>MAX_RRSETS_BY_ZONE</code> for the value of <code>Type</code> in the request, the value of
     * <code>Count</code> is the current number of records that you have created in the specified hosted zone.
     * </p>
     * 
     * @param count
     *        The current number of entities that you have created of the specified type. For example, if you specified
     *        <code>MAX_RRSETS_BY_ZONE</code> for the value of <code>Type</code> in the request, the value of
     *        <code>Count</code> is the current number of records that you have created in the specified hosted zone.
     */

    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * <p>
     * The current number of entities that you have created of the specified type. For example, if you specified
     * <code>MAX_RRSETS_BY_ZONE</code> for the value of <code>Type</code> in the request, the value of
     * <code>Count</code> is the current number of records that you have created in the specified hosted zone.
     * </p>
     * 
     * @return The current number of entities that you have created of the specified type. For example, if you specified
     *         <code>MAX_RRSETS_BY_ZONE</code> for the value of <code>Type</code> in the request, the value of
     *         <code>Count</code> is the current number of records that you have created in the specified hosted zone.
     */

    public Long getCount() {
        return this.count;
    }

    /**
     * <p>
     * The current number of entities that you have created of the specified type. For example, if you specified
     * <code>MAX_RRSETS_BY_ZONE</code> for the value of <code>Type</code> in the request, the value of
     * <code>Count</code> is the current number of records that you have created in the specified hosted zone.
     * </p>
     * 
     * @param count
     *        The current number of entities that you have created of the specified type. For example, if you specified
     *        <code>MAX_RRSETS_BY_ZONE</code> for the value of <code>Type</code> in the request, the value of
     *        <code>Count</code> is the current number of records that you have created in the specified hosted zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetHostedZoneLimitResult withCount(Long count) {
        setCount(count);
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
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getCount() != null)
            sb.append("Count: ").append(getCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetHostedZoneLimitResult == false)
            return false;
        GetHostedZoneLimitResult other = (GetHostedZoneLimitResult) obj;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        return hashCode;
    }

    @Override
    public GetHostedZoneLimitResult clone() {
        try {
            return (GetHostedZoneLimitResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

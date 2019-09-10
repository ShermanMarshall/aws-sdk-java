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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTrafficMirrorFiltersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about one or more Traffic Mirror filters.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TrafficMirrorFilter> trafficMirrorFilters;
    /**
     * <p>
     * The token to use to retrieve the next page of results. The value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about one or more Traffic Mirror filters.
     * </p>
     * 
     * @return Information about one or more Traffic Mirror filters.
     */

    public java.util.List<TrafficMirrorFilter> getTrafficMirrorFilters() {
        if (trafficMirrorFilters == null) {
            trafficMirrorFilters = new com.amazonaws.internal.SdkInternalList<TrafficMirrorFilter>();
        }
        return trafficMirrorFilters;
    }

    /**
     * <p>
     * Information about one or more Traffic Mirror filters.
     * </p>
     * 
     * @param trafficMirrorFilters
     *        Information about one or more Traffic Mirror filters.
     */

    public void setTrafficMirrorFilters(java.util.Collection<TrafficMirrorFilter> trafficMirrorFilters) {
        if (trafficMirrorFilters == null) {
            this.trafficMirrorFilters = null;
            return;
        }

        this.trafficMirrorFilters = new com.amazonaws.internal.SdkInternalList<TrafficMirrorFilter>(trafficMirrorFilters);
    }

    /**
     * <p>
     * Information about one or more Traffic Mirror filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTrafficMirrorFilters(java.util.Collection)} or {@link #withTrafficMirrorFilters(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param trafficMirrorFilters
     *        Information about one or more Traffic Mirror filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrafficMirrorFiltersResult withTrafficMirrorFilters(TrafficMirrorFilter... trafficMirrorFilters) {
        if (this.trafficMirrorFilters == null) {
            setTrafficMirrorFilters(new com.amazonaws.internal.SdkInternalList<TrafficMirrorFilter>(trafficMirrorFilters.length));
        }
        for (TrafficMirrorFilter ele : trafficMirrorFilters) {
            this.trafficMirrorFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about one or more Traffic Mirror filters.
     * </p>
     * 
     * @param trafficMirrorFilters
     *        Information about one or more Traffic Mirror filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrafficMirrorFiltersResult withTrafficMirrorFilters(java.util.Collection<TrafficMirrorFilter> trafficMirrorFilters) {
        setTrafficMirrorFilters(trafficMirrorFilters);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. The value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. The value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. The value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. The value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. The value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. The value is <code>null</code> when there are no
     *        more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrafficMirrorFiltersResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getTrafficMirrorFilters() != null)
            sb.append("TrafficMirrorFilters: ").append(getTrafficMirrorFilters()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTrafficMirrorFiltersResult == false)
            return false;
        DescribeTrafficMirrorFiltersResult other = (DescribeTrafficMirrorFiltersResult) obj;
        if (other.getTrafficMirrorFilters() == null ^ this.getTrafficMirrorFilters() == null)
            return false;
        if (other.getTrafficMirrorFilters() != null && other.getTrafficMirrorFilters().equals(this.getTrafficMirrorFilters()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrafficMirrorFilters() == null) ? 0 : getTrafficMirrorFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTrafficMirrorFiltersResult clone() {
        try {
            return (DescribeTrafficMirrorFiltersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}

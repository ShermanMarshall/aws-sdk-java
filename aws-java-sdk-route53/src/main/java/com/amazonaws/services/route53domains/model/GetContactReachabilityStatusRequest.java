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
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/GetContactReachabilityStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetContactReachabilityStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain for which you want to know whether the registrant contact has confirmed that the email
     * address is valid.
     * </p>
     */
    private String domainName;

    /**
     * <p>
     * The name of the domain for which you want to know whether the registrant contact has confirmed that the email
     * address is valid.
     * </p>
     * 
     * @param domainName
     *        The name of the domain for which you want to know whether the registrant contact has confirmed that the
     *        email address is valid.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain for which you want to know whether the registrant contact has confirmed that the email
     * address is valid.
     * </p>
     * 
     * @return The name of the domain for which you want to know whether the registrant contact has confirmed that the
     *         email address is valid.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of the domain for which you want to know whether the registrant contact has confirmed that the email
     * address is valid.
     * </p>
     * 
     * @param domainName
     *        The name of the domain for which you want to know whether the registrant contact has confirmed that the
     *        email address is valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContactReachabilityStatusRequest withDomainName(String domainName) {
        setDomainName(domainName);
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetContactReachabilityStatusRequest == false)
            return false;
        GetContactReachabilityStatusRequest other = (GetContactReachabilityStatusRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        return hashCode;
    }

    @Override
    public GetContactReachabilityStatusRequest clone() {
        return (GetContactReachabilityStatusRequest) super.clone();
    }

}

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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A complex type that contains information about the query string parameters that you want CloudFront to use for
 * caching for a cache behavior.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2019-03-26/QueryStringCacheKeys" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryStringCacheKeys implements Serializable, Cloneable {

    /**
     * <p>
     * The number of <code>whitelisted</code> query string parameters for a cache behavior.
     * </p>
     */
    private Integer quantity;
    /**
     * <p>
     * A list that contains the query string parameters that you want CloudFront to use as a basis for caching for a
     * cache behavior. If <code>Quantity</code> is 0, you can omit <code>Items</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> items;

    /**
     * <p>
     * The number of <code>whitelisted</code> query string parameters for a cache behavior.
     * </p>
     * 
     * @param quantity
     *        The number of <code>whitelisted</code> query string parameters for a cache behavior.
     */

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * The number of <code>whitelisted</code> query string parameters for a cache behavior.
     * </p>
     * 
     * @return The number of <code>whitelisted</code> query string parameters for a cache behavior.
     */

    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * <p>
     * The number of <code>whitelisted</code> query string parameters for a cache behavior.
     * </p>
     * 
     * @param quantity
     *        The number of <code>whitelisted</code> query string parameters for a cache behavior.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryStringCacheKeys withQuantity(Integer quantity) {
        setQuantity(quantity);
        return this;
    }

    /**
     * <p>
     * A list that contains the query string parameters that you want CloudFront to use as a basis for caching for a
     * cache behavior. If <code>Quantity</code> is 0, you can omit <code>Items</code>.
     * </p>
     * 
     * @return A list that contains the query string parameters that you want CloudFront to use as a basis for caching
     *         for a cache behavior. If <code>Quantity</code> is 0, you can omit <code>Items</code>.
     */

    public java.util.List<String> getItems() {
        if (items == null) {
            items = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return items;
    }

    /**
     * <p>
     * A list that contains the query string parameters that you want CloudFront to use as a basis for caching for a
     * cache behavior. If <code>Quantity</code> is 0, you can omit <code>Items</code>.
     * </p>
     * 
     * @param items
     *        A list that contains the query string parameters that you want CloudFront to use as a basis for caching
     *        for a cache behavior. If <code>Quantity</code> is 0, you can omit <code>Items</code>.
     */

    public void setItems(java.util.Collection<String> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new com.amazonaws.internal.SdkInternalList<String>(items);
    }

    /**
     * <p>
     * A list that contains the query string parameters that you want CloudFront to use as a basis for caching for a
     * cache behavior. If <code>Quantity</code> is 0, you can omit <code>Items</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        A list that contains the query string parameters that you want CloudFront to use as a basis for caching
     *        for a cache behavior. If <code>Quantity</code> is 0, you can omit <code>Items</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryStringCacheKeys withItems(String... items) {
        if (this.items == null) {
            setItems(new com.amazonaws.internal.SdkInternalList<String>(items.length));
        }
        for (String ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list that contains the query string parameters that you want CloudFront to use as a basis for caching for a
     * cache behavior. If <code>Quantity</code> is 0, you can omit <code>Items</code>.
     * </p>
     * 
     * @param items
     *        A list that contains the query string parameters that you want CloudFront to use as a basis for caching
     *        for a cache behavior. If <code>Quantity</code> is 0, you can omit <code>Items</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryStringCacheKeys withItems(java.util.Collection<String> items) {
        setItems(items);
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
        if (getQuantity() != null)
            sb.append("Quantity: ").append(getQuantity()).append(",");
        if (getItems() != null)
            sb.append("Items: ").append(getItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryStringCacheKeys == false)
            return false;
        QueryStringCacheKeys other = (QueryStringCacheKeys) obj;
        if (other.getQuantity() == null ^ this.getQuantity() == null)
            return false;
        if (other.getQuantity() != null && other.getQuantity().equals(this.getQuantity()) == false)
            return false;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        return hashCode;
    }

    @Override
    public QueryStringCacheKeys clone() {
        try {
            return (QueryStringCacheKeys) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

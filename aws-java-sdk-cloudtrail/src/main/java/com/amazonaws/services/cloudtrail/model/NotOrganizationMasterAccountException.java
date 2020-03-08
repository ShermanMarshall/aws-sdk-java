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
package com.amazonaws.services.cloudtrail.model;

import javax.annotation.Generated;

/**
 * <p>
 * This exception is thrown when the AWS account making the request to create or update an organization trail is not the
 * master account for an organization in AWS Organizations. For more information, see <a
 * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/creating-an-organizational-trail-prepare.html"
 * >Prepare For Creating a Trail For Your Organization</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotOrganizationMasterAccountException extends com.amazonaws.services.cloudtrail.model.AWSCloudTrailException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new NotOrganizationMasterAccountException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public NotOrganizationMasterAccountException(String message) {
        super(message);
    }

}

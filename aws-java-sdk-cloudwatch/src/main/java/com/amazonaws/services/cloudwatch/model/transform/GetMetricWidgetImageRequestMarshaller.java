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
package com.amazonaws.services.cloudwatch.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * GetMetricWidgetImageRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMetricWidgetImageRequestMarshaller implements Marshaller<Request<GetMetricWidgetImageRequest>, GetMetricWidgetImageRequest> {

    public Request<GetMetricWidgetImageRequest> marshall(GetMetricWidgetImageRequest getMetricWidgetImageRequest) {

        if (getMetricWidgetImageRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetMetricWidgetImageRequest> request = new DefaultRequest<GetMetricWidgetImageRequest>(getMetricWidgetImageRequest, "AmazonCloudWatch");
        request.addParameter("Action", "GetMetricWidgetImage");
        request.addParameter("Version", "2010-08-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (getMetricWidgetImageRequest.getMetricWidget() != null) {
            request.addParameter("MetricWidget", StringUtils.fromString(getMetricWidgetImageRequest.getMetricWidget()));
        }

        if (getMetricWidgetImageRequest.getOutputFormat() != null) {
            request.addParameter("OutputFormat", StringUtils.fromString(getMetricWidgetImageRequest.getOutputFormat()));
        }

        return request;
    }

}

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
package com.amazonaws.services.support.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.support.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * TrustedAdvisorCheckSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrustedAdvisorCheckSummaryJsonUnmarshaller implements Unmarshaller<TrustedAdvisorCheckSummary, JsonUnmarshallerContext> {

    public TrustedAdvisorCheckSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        TrustedAdvisorCheckSummary trustedAdvisorCheckSummary = new TrustedAdvisorCheckSummary();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("checkId", targetDepth)) {
                    context.nextToken();
                    trustedAdvisorCheckSummary.setCheckId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("timestamp", targetDepth)) {
                    context.nextToken();
                    trustedAdvisorCheckSummary.setTimestamp(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    trustedAdvisorCheckSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("hasFlaggedResources", targetDepth)) {
                    context.nextToken();
                    trustedAdvisorCheckSummary.setHasFlaggedResources(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("resourcesSummary", targetDepth)) {
                    context.nextToken();
                    trustedAdvisorCheckSummary.setResourcesSummary(TrustedAdvisorResourcesSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("categorySpecificSummary", targetDepth)) {
                    context.nextToken();
                    trustedAdvisorCheckSummary.setCategorySpecificSummary(TrustedAdvisorCategorySpecificSummaryJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return trustedAdvisorCheckSummary;
    }

    private static TrustedAdvisorCheckSummaryJsonUnmarshaller instance;

    public static TrustedAdvisorCheckSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TrustedAdvisorCheckSummaryJsonUnmarshaller();
        return instance;
    }
}

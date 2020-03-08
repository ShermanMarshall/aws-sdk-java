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
package com.amazonaws.services.quicksight.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateDataSetResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDataSetResultJsonUnmarshaller implements Unmarshaller<UpdateDataSetResult, JsonUnmarshallerContext> {

    public UpdateDataSetResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateDataSetResult updateDataSetResult = new UpdateDataSetResult();

        updateDataSetResult.setStatus(context.getHttpResponse().getStatusCode());

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateDataSetResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    updateDataSetResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DataSetId", targetDepth)) {
                    context.nextToken();
                    updateDataSetResult.setDataSetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IngestionArn", targetDepth)) {
                    context.nextToken();
                    updateDataSetResult.setIngestionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IngestionId", targetDepth)) {
                    context.nextToken();
                    updateDataSetResult.setIngestionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RequestId", targetDepth)) {
                    context.nextToken();
                    updateDataSetResult.setRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updateDataSetResult;
    }

    private static UpdateDataSetResultJsonUnmarshaller instance;

    public static UpdateDataSetResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateDataSetResultJsonUnmarshaller();
        return instance;
    }
}

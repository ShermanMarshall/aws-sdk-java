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
package com.amazonaws.services.ec2.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DeleteClientVpnRouteResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteClientVpnRouteResultStaxUnmarshaller implements Unmarshaller<DeleteClientVpnRouteResult, StaxUnmarshallerContext> {

    public DeleteClientVpnRouteResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DeleteClientVpnRouteResult deleteClientVpnRouteResult = new DeleteClientVpnRouteResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return deleteClientVpnRouteResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("status", targetDepth)) {
                    deleteClientVpnRouteResult.setStatus(ClientVpnRouteStatusStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return deleteClientVpnRouteResult;
                }
            }
        }
    }

    private static DeleteClientVpnRouteResultStaxUnmarshaller instance;

    public static DeleteClientVpnRouteResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteClientVpnRouteResultStaxUnmarshaller();
        return instance;
    }
}

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
package com.amazonaws.services.kafka.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kafka.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BrokerLogsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BrokerLogsMarshaller {

    private static final MarshallingInfo<StructuredPojo> CLOUDWATCHLOGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cloudWatchLogs").build();
    private static final MarshallingInfo<StructuredPojo> FIREHOSE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("firehose").build();
    private static final MarshallingInfo<StructuredPojo> S3_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("s3").build();

    private static final BrokerLogsMarshaller instance = new BrokerLogsMarshaller();

    public static BrokerLogsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BrokerLogs brokerLogs, ProtocolMarshaller protocolMarshaller) {

        if (brokerLogs == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(brokerLogs.getCloudWatchLogs(), CLOUDWATCHLOGS_BINDING);
            protocolMarshaller.marshall(brokerLogs.getFirehose(), FIREHOSE_BINDING);
            protocolMarshaller.marshall(brokerLogs.getS3(), S3_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

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
package com.amazonaws.services.backup.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.backup.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PutBackupVaultNotificationsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutBackupVaultNotificationsRequestMarshaller {

    private static final MarshallingInfo<String> BACKUPVAULTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("backupVaultName").build();
    private static final MarshallingInfo<String> SNSTOPICARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SNSTopicArn").build();
    private static final MarshallingInfo<List> BACKUPVAULTEVENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackupVaultEvents").build();

    private static final PutBackupVaultNotificationsRequestMarshaller instance = new PutBackupVaultNotificationsRequestMarshaller();

    public static PutBackupVaultNotificationsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutBackupVaultNotificationsRequest putBackupVaultNotificationsRequest, ProtocolMarshaller protocolMarshaller) {

        if (putBackupVaultNotificationsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putBackupVaultNotificationsRequest.getBackupVaultName(), BACKUPVAULTNAME_BINDING);
            protocolMarshaller.marshall(putBackupVaultNotificationsRequest.getSNSTopicArn(), SNSTOPICARN_BINDING);
            protocolMarshaller.marshall(putBackupVaultNotificationsRequest.getBackupVaultEvents(), BACKUPVAULTEVENTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

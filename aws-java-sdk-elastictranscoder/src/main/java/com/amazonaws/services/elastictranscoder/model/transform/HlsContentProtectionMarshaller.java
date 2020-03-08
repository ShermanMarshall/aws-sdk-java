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
package com.amazonaws.services.elastictranscoder.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elastictranscoder.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * HlsContentProtectionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class HlsContentProtectionMarshaller {

    private static final MarshallingInfo<String> METHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Method").build();
    private static final MarshallingInfo<String> KEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Key").build();
    private static final MarshallingInfo<String> KEYMD5_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KeyMd5").build();
    private static final MarshallingInfo<String> INITIALIZATIONVECTOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InitializationVector").build();
    private static final MarshallingInfo<String> LICENSEACQUISITIONURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LicenseAcquisitionUrl").build();
    private static final MarshallingInfo<String> KEYSTORAGEPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KeyStoragePolicy").build();

    private static final HlsContentProtectionMarshaller instance = new HlsContentProtectionMarshaller();

    public static HlsContentProtectionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(HlsContentProtection hlsContentProtection, ProtocolMarshaller protocolMarshaller) {

        if (hlsContentProtection == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(hlsContentProtection.getMethod(), METHOD_BINDING);
            protocolMarshaller.marshall(hlsContentProtection.getKey(), KEY_BINDING);
            protocolMarshaller.marshall(hlsContentProtection.getKeyMd5(), KEYMD5_BINDING);
            protocolMarshaller.marshall(hlsContentProtection.getInitializationVector(), INITIALIZATIONVECTOR_BINDING);
            protocolMarshaller.marshall(hlsContentProtection.getLicenseAcquisitionUrl(), LICENSEACQUISITIONURL_BINDING);
            protocolMarshaller.marshall(hlsContentProtection.getKeyStoragePolicy(), KEYSTORAGEPOLICY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

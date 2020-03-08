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
package com.amazonaws.services.directconnect.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.directconnect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateVirtualInterfaceAttributesRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateVirtualInterfaceAttributesRequestMarshaller {

    private static final MarshallingInfo<String> VIRTUALINTERFACEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("virtualInterfaceId").build();
    private static final MarshallingInfo<Integer> MTU_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("mtu").build();

    private static final UpdateVirtualInterfaceAttributesRequestMarshaller instance = new UpdateVirtualInterfaceAttributesRequestMarshaller();

    public static UpdateVirtualInterfaceAttributesRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateVirtualInterfaceAttributesRequest updateVirtualInterfaceAttributesRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateVirtualInterfaceAttributesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateVirtualInterfaceAttributesRequest.getVirtualInterfaceId(), VIRTUALINTERFACEID_BINDING);
            protocolMarshaller.marshall(updateVirtualInterfaceAttributesRequest.getMtu(), MTU_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

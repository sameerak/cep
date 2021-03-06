/**
 *
 * Copyright (c) WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wso2.carbon.databridge.core;

import org.wso2.carbon.databridge.commons.Credentials;
import org.wso2.carbon.databridge.commons.Event;
import org.wso2.carbon.databridge.commons.StreamDefinition;

import java.util.List;

/**
 * The call back that notifies Event arrivals and StreamDefinition declarations
 */
public interface AgentCallback {


    /**
     * will get called  when types are defined
     *
     * @param streamDefinition TypeDefinition of event streams
     * @param credentials      of the credential defining the event stream definition
     */
    void definedStream(StreamDefinition streamDefinition, Credentials credentials);


    /**
     * will get called  when types are removed
     *
     * @param streamDefinition TypeDefinition of event streams
     * @param credentials      of the credential defining the event stream definition
     */
    void removeStream(StreamDefinition streamDefinition, Credentials credentials);

    /**
     * will get called when Events arrive
     *
     * @param eventList Arrived event list
     */
    void receive(List<Event> eventList, Credentials credentials);
}

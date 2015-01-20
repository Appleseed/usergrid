/*
 *
 *  * Licensed to the Apache Software Foundation (ASF) under one
 *  * or more contributor license agreements.  See the NOTICE file
 *  * distributed with this work for additional information
 *  * regarding copyright ownership.  The ASF licenses this file
 *  * to you under the Apache License, Version 2.0 (the
 *  * "License"); you may not use this file except in compliance
 *  * with the License.  You may obtain a copy of the License at
 *  *
 *  *    http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing,
 *  * software distributed under the License is distributed on an
 *  * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  * KIND, either express or implied.  See the License for the
 *  * specific language governing permissions and limitations
 *  * under the License.
 *
 */

package org.apache.usergrid.persistence.graph.serialization.impl.shard.impl.comparators;


import org.apache.usergrid.persistence.graph.MarkedEdge;
import org.apache.usergrid.persistence.model.entity.Id;


/**
 *
 * Comparator that uses source Id for comparisons.  Newer time uuids will be first.
 *
 */
public class TargetDirectedEdgeDescendingComparator extends DirectedEdgeDescendingComparator {

    public static final TargetDirectedEdgeDescendingComparator INSTANCE = new TargetDirectedEdgeDescendingComparator();

    @Override
    protected Id getId( final MarkedEdge edge ) {
        return edge.getTargetNode();
    }
}
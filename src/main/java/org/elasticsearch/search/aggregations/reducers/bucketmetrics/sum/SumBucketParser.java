/*
 * Licensed to Elasticsearch under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.elasticsearch.search.aggregations.reducers.bucketmetrics.sum;

import org.elasticsearch.common.Nullable;
import org.elasticsearch.search.aggregations.reducers.BucketHelpers.GapPolicy;
import org.elasticsearch.search.aggregations.reducers.bucketmetrics.BucketMetricsParser;
import org.elasticsearch.search.aggregations.reducers.ReducerFactory;
import org.elasticsearch.search.aggregations.support.format.ValueFormatter;

public class SumBucketParser extends BucketMetricsParser {
    @Override
    public String type() {
        return SumBucketReducer.TYPE.name();
    }

    @Override
    protected ReducerFactory buildFactory(String reducerName, String[] bucketsPaths, GapPolicy gapPolicy, @Nullable ValueFormatter formatter) {
        return new SumBucketReducer.Factory(reducerName, bucketsPaths, gapPolicy, formatter);
    }
}

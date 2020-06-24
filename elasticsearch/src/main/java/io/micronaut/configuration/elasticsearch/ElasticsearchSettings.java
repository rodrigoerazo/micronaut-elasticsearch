/*
 * Copyright 2017-2020 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.configuration.elasticsearch;

import org.apache.http.HttpHost;

/**
 * Common constants for Elasticsearch settings.
 *
 * @author lishuai
 * @since 1.0.0
 */
public interface ElasticsearchSettings {

    /**
     * The prefix to use for all Elasticsearch settings.
     */
    String PREFIX = "elasticsearch";

    /**
     * Default Elasticsearch host.
     */
    HttpHost DEFAULT_HOST = new HttpHost("127.0.0.1", 9200, "http");

}
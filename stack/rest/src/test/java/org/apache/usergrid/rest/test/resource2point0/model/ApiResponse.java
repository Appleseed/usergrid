/**
 * Created by ApigeeCorporation on 12/4/14.
 */
/*
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
package org.apache.usergrid.rest.test.resource2point0.model;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;


/**
 * Contains the needed types
 */
public class ApiResponse {

    private String accessToken;

    private String error;
    private String errorDescription;
    private String errorUri;
    private String exception;

    private String path;
    private String uri;
    private String status;
    private long timestamp;
    private List<Entity> entities;
    private String cursor;


    private final Map<String, JsonNode> properties = new HashMap<String, JsonNode>();


    public ApiResponse() {
    }


    @JsonAnyGetter
    public Map<String, JsonNode> getProperties() {
        return properties;
    }


    @JsonAnySetter
    public void setProperty( String key, JsonNode value ) {
        properties.put( key, value );
    }


    @JsonProperty( "access_token" )
    @JsonSerialize( include = Inclusion.NON_NULL )
    public String getAccessToken() {
        return accessToken;
    }


    @JsonProperty( "access_token" )
    public void setAccessToken( String accessToken ) {
        this.accessToken = accessToken;
    }


    @JsonSerialize( include = Inclusion.NON_NULL )
    public String getError() {
        return error;
    }


    public void setError( String error ) {
        this.error = error;
    }


    @JsonSerialize( include = Inclusion.NON_NULL )
    @JsonProperty( "error_description" )
    public String getErrorDescription() {
        return errorDescription;
    }


    @JsonProperty( "error_description" )
    public void setErrorDescription( String errorDescription ) {
        this.errorDescription = errorDescription;
    }


    @JsonSerialize( include = Inclusion.NON_NULL )
    @JsonProperty( "error_uri" )
    public String getErrorUri() {
        return errorUri;
    }


    @JsonProperty( "error_uri" )
    public void setErrorUri( String errorUri ) {
        this.errorUri = errorUri;
    }


    @JsonSerialize( include = Inclusion.NON_NULL )
    public String getException() {
        return exception;
    }


    public void setException( String exception ) {
        this.exception = exception;
    }


    @JsonSerialize( include = Inclusion.NON_NULL )
    public String getPath() {
        return path;
    }


    public void setPath( String path ) {
        this.path = path;
    }


    @JsonSerialize( include = Inclusion.NON_NULL )
    public String getUri() {
        return uri;
    }


    public void setUri( String uri ) {
        this.uri = uri;
    }


    @JsonSerialize( include = Inclusion.NON_NULL )
    public String getStatus() {
        return status;
    }


    public void setStatus( String status ) {
        this.status = status;
    }


    public long getTimestamp() {
        return timestamp;
    }


    public void setTimestamp( long timestamp ) {
        this.timestamp = timestamp;
    }

    @JsonSerialize( include = Inclusion.NON_NULL  )
    public List<Entity> getEntities() {
        return entities;
    }


    public void setEntities( List<Entity> entities ) {
        this.entities = entities;
    }


    public int getEntityCount() {
        if ( entities == null ) {
            return 0;
        }
        return entities.size();
    }

    @JsonSerialize( include = Inclusion.NON_NULL )
    public String getCursor() {
        return cursor;
    }


    public void setCursor( String cursor ) {
        this.cursor = cursor;
    }


}

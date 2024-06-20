/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.merge.api.resources.crm.customobjects;

import com.merge.api.core.ClientOptions;
import com.merge.api.core.MediaTypes;
import com.merge.api.core.MergeApiApiError;
import com.merge.api.core.MergeApiError;
import com.merge.api.core.ObjectMappers;
import com.merge.api.core.RequestOptions;
import com.merge.api.resources.crm.customobjects.requests.CrmCustomObjectEndpointRequest;
import com.merge.api.resources.crm.customobjects.requests.CustomObjectClassesCustomObjectsListRequest;
import com.merge.api.resources.crm.customobjects.requests.CustomObjectClassesCustomObjectsRetrieveRequest;
import com.merge.api.resources.crm.types.CrmCustomObjectResponse;
import com.merge.api.resources.crm.types.CustomObject;
import com.merge.api.resources.crm.types.MetaResponse;
import com.merge.api.resources.crm.types.PaginatedCustomObjectList;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class CustomObjectsClient {
    protected final ClientOptions clientOptions;

    public CustomObjectsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * Returns a list of <code>CustomObject</code> objects.
     */
    public PaginatedCustomObjectList customObjectClassesCustomObjectsList(String customObjectClassId) {
        return customObjectClassesCustomObjectsList(
                customObjectClassId,
                CustomObjectClassesCustomObjectsListRequest.builder().build());
    }

    /**
     * Returns a list of <code>CustomObject</code> objects.
     */
    public PaginatedCustomObjectList customObjectClassesCustomObjectsList(
            String customObjectClassId, CustomObjectClassesCustomObjectsListRequest request) {
        return customObjectClassesCustomObjectsList(customObjectClassId, request, null);
    }

    /**
     * Returns a list of <code>CustomObject</code> objects.
     */
    public PaginatedCustomObjectList customObjectClassesCustomObjectsList(
            String customObjectClassId,
            CustomObjectClassesCustomObjectsListRequest request,
            RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("crm/v1/custom-object-classes")
                .addPathSegment(customObjectClassId)
                .addPathSegments("custom-objects");
        if (request.getCreatedAfter().isPresent()) {
            httpUrl.addQueryParameter(
                    "created_after", request.getCreatedAfter().get().toString());
        }
        if (request.getCreatedBefore().isPresent()) {
            httpUrl.addQueryParameter(
                    "created_before", request.getCreatedBefore().get().toString());
        }
        if (request.getCursor().isPresent()) {
            httpUrl.addQueryParameter("cursor", request.getCursor().get());
        }
        if (request.getIncludeDeletedData().isPresent()) {
            httpUrl.addQueryParameter(
                    "include_deleted_data",
                    request.getIncludeDeletedData().get().toString());
        }
        if (request.getIncludeRemoteData().isPresent()) {
            httpUrl.addQueryParameter(
                    "include_remote_data", request.getIncludeRemoteData().get().toString());
        }
        if (request.getIncludeRemoteFields().isPresent()) {
            httpUrl.addQueryParameter(
                    "include_remote_fields",
                    request.getIncludeRemoteFields().get().toString());
        }
        if (request.getModifiedAfter().isPresent()) {
            httpUrl.addQueryParameter(
                    "modified_after", request.getModifiedAfter().get().toString());
        }
        if (request.getModifiedBefore().isPresent()) {
            httpUrl.addQueryParameter(
                    "modified_before", request.getModifiedBefore().get().toString());
        }
        if (request.getPageSize().isPresent()) {
            httpUrl.addQueryParameter("page_size", request.getPageSize().get().toString());
        }
        if (request.getRemoteId().isPresent()) {
            httpUrl.addQueryParameter("remote_id", request.getRemoteId().get());
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), PaginatedCustomObjectList.class);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            throw new MergeApiApiError(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new MergeApiError("Network error executing HTTP request", e);
        }
    }

    /**
     * Creates a <code>CustomObject</code> object with the given values.
     */
    public CrmCustomObjectResponse customObjectClassesCustomObjectsCreate(
            String customObjectClassId, CrmCustomObjectEndpointRequest request) {
        return customObjectClassesCustomObjectsCreate(customObjectClassId, request, null);
    }

    /**
     * Creates a <code>CustomObject</code> object with the given values.
     */
    public CrmCustomObjectResponse customObjectClassesCustomObjectsCreate(
            String customObjectClassId, CrmCustomObjectEndpointRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("crm/v1/custom-object-classes")
                .addPathSegment(customObjectClassId)
                .addPathSegments("custom-objects");
        if (request.getIsDebugMode().isPresent()) {
            httpUrl.addQueryParameter(
                    "is_debug_mode", request.getIsDebugMode().get().toString());
        }
        if (request.getRunAsync().isPresent()) {
            httpUrl.addQueryParameter("run_async", request.getRunAsync().get().toString());
        }
        Map<String, Object> properties = new HashMap<>();
        properties.put("model", request.getModel());
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(properties), MediaTypes.APPLICATION_JSON);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("POST", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), CrmCustomObjectResponse.class);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            throw new MergeApiApiError(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new MergeApiError("Network error executing HTTP request", e);
        }
    }

    /**
     * Returns a <code>CustomObject</code> object with the given <code>id</code>.
     */
    public CustomObject customObjectClassesCustomObjectsRetrieve(String customObjectClassId, String id) {
        return customObjectClassesCustomObjectsRetrieve(
                customObjectClassId,
                id,
                CustomObjectClassesCustomObjectsRetrieveRequest.builder().build());
    }

    /**
     * Returns a <code>CustomObject</code> object with the given <code>id</code>.
     */
    public CustomObject customObjectClassesCustomObjectsRetrieve(
            String customObjectClassId, String id, CustomObjectClassesCustomObjectsRetrieveRequest request) {
        return customObjectClassesCustomObjectsRetrieve(customObjectClassId, id, request, null);
    }

    /**
     * Returns a <code>CustomObject</code> object with the given <code>id</code>.
     */
    public CustomObject customObjectClassesCustomObjectsRetrieve(
            String customObjectClassId,
            String id,
            CustomObjectClassesCustomObjectsRetrieveRequest request,
            RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("crm/v1/custom-object-classes")
                .addPathSegment(customObjectClassId)
                .addPathSegments("custom-objects")
                .addPathSegment(id);
        if (request.getIncludeRemoteData().isPresent()) {
            httpUrl.addQueryParameter(
                    "include_remote_data", request.getIncludeRemoteData().get().toString());
        }
        if (request.getIncludeRemoteFields().isPresent()) {
            httpUrl.addQueryParameter(
                    "include_remote_fields",
                    request.getIncludeRemoteFields().get().toString());
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), CustomObject.class);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            throw new MergeApiApiError(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new MergeApiError("Network error executing HTTP request", e);
        }
    }

    /**
     * Returns metadata for <code>CRMCustomObject</code> POSTs.
     */
    public MetaResponse customObjectClassesCustomObjectsMetaPostRetrieve(String customObjectClassId) {
        return customObjectClassesCustomObjectsMetaPostRetrieve(customObjectClassId, null);
    }

    /**
     * Returns metadata for <code>CRMCustomObject</code> POSTs.
     */
    public MetaResponse customObjectClassesCustomObjectsMetaPostRetrieve(
            String customObjectClassId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("crm/v1/custom-object-classes")
                .addPathSegment(customObjectClassId)
                .addPathSegments("custom-objects/meta/post")
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), MetaResponse.class);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            throw new MergeApiApiError(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new MergeApiError("Network error executing HTTP request", e);
        }
    }
}

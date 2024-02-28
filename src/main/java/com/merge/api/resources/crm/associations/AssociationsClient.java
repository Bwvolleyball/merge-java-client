/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.merge.api.resources.crm.associations;

import com.merge.api.core.ApiError;
import com.merge.api.core.ClientOptions;
import com.merge.api.core.ObjectMappers;
import com.merge.api.core.RequestOptions;
import com.merge.api.resources.crm.associations.requests.CustomObjectClassesCustomObjectsAssociationsListRequest;
import com.merge.api.resources.crm.associations.requests.CustomObjectClassesCustomObjectsAssociationsUpdateRequest;
import com.merge.api.resources.crm.types.Association;
import com.merge.api.resources.crm.types.PaginatedAssociationList;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class AssociationsClient {
    protected final ClientOptions clientOptions;

    public AssociationsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * Returns a list of <code>Association</code> objects.
     */
    public PaginatedAssociationList customObjectClassesCustomObjectsAssociationsList(
            String customObjectClassId, String objectId) {
        return customObjectClassesCustomObjectsAssociationsList(
                customObjectClassId,
                objectId,
                CustomObjectClassesCustomObjectsAssociationsListRequest.builder()
                        .build());
    }

    /**
     * Returns a list of <code>Association</code> objects.
     */
    public PaginatedAssociationList customObjectClassesCustomObjectsAssociationsList(
            String customObjectClassId,
            String objectId,
            CustomObjectClassesCustomObjectsAssociationsListRequest request) {
        return customObjectClassesCustomObjectsAssociationsList(customObjectClassId, objectId, request, null);
    }

    /**
     * Returns a list of <code>Association</code> objects.
     */
    public PaginatedAssociationList customObjectClassesCustomObjectsAssociationsList(
            String customObjectClassId,
            String objectId,
            CustomObjectClassesCustomObjectsAssociationsListRequest request,
            RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("crm/v1/custom-object-classes")
                .addPathSegment(customObjectClassId)
                .addPathSegments("custom-objects")
                .addPathSegment(objectId)
                .addPathSegments("associations");
        if (request.getAssociationTypeId().isPresent()) {
            httpUrl.addQueryParameter(
                    "association_type_id", request.getAssociationTypeId().get());
        }
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
        if (request.getExpand().isPresent()) {
            httpUrl.addQueryParameter("expand", request.getExpand().get());
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
        try {
            OkHttpClient client = clientOptions.httpClient();
            if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
                client = clientOptions.httpClientWithTimeout(requestOptions);
            }
            Response response = client.newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), PaginatedAssociationList.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Creates an Association between <code>source_object_id</code> and <code>target_object_id</code> of type <code>association_type_id</code>.
     */
    public Association customObjectClassesCustomObjectsAssociationsUpdate(
            String associationTypeId,
            String sourceClassId,
            String sourceObjectId,
            String targetClassId,
            String targetObjectId) {
        return customObjectClassesCustomObjectsAssociationsUpdate(
                associationTypeId,
                sourceClassId,
                sourceObjectId,
                targetClassId,
                targetObjectId,
                CustomObjectClassesCustomObjectsAssociationsUpdateRequest.builder()
                        .build());
    }

    /**
     * Creates an Association between <code>source_object_id</code> and <code>target_object_id</code> of type <code>association_type_id</code>.
     */
    public Association customObjectClassesCustomObjectsAssociationsUpdate(
            String associationTypeId,
            String sourceClassId,
            String sourceObjectId,
            String targetClassId,
            String targetObjectId,
            CustomObjectClassesCustomObjectsAssociationsUpdateRequest request) {
        return customObjectClassesCustomObjectsAssociationsUpdate(
                associationTypeId, sourceClassId, sourceObjectId, targetClassId, targetObjectId, request, null);
    }

    /**
     * Creates an Association between <code>source_object_id</code> and <code>target_object_id</code> of type <code>association_type_id</code>.
     */
    public Association customObjectClassesCustomObjectsAssociationsUpdate(
            String associationTypeId,
            String sourceClassId,
            String sourceObjectId,
            String targetClassId,
            String targetObjectId,
            CustomObjectClassesCustomObjectsAssociationsUpdateRequest request,
            RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("crm/v1/custom-object-classes")
                .addPathSegment(sourceClassId)
                .addPathSegments("custom-objects")
                .addPathSegment(sourceObjectId)
                .addPathSegments("associations")
                .addPathSegment(targetClassId)
                .addPathSegment(targetObjectId)
                .addPathSegment(associationTypeId);
        if (request.getIsDebugMode().isPresent()) {
            httpUrl.addQueryParameter(
                    "is_debug_mode", request.getIsDebugMode().get().toString());
        }
        if (request.getRunAsync().isPresent()) {
            httpUrl.addQueryParameter("run_async", request.getRunAsync().get().toString());
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("PUT", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        try {
            OkHttpClient client = clientOptions.httpClient();
            if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
                client = clientOptions.httpClientWithTimeout(requestOptions);
            }
            Response response = client.newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Association.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

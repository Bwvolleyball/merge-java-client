/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.merge.api.resources.ticketing.linkedaccounts;

import com.merge.api.core.ApiError;
import com.merge.api.core.ClientOptions;
import com.merge.api.core.ObjectMappers;
import com.merge.api.core.RequestOptions;
import com.merge.api.resources.ticketing.linkedaccounts.requests.LinkedAccountsListRequest;
import com.merge.api.resources.ticketing.types.PaginatedAccountDetailsAndActionsList;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class LinkedAccountsClient {
    protected final ClientOptions clientOptions;

    public LinkedAccountsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * List linked accounts for your organization.
     */
    public PaginatedAccountDetailsAndActionsList list() {
        return list(LinkedAccountsListRequest.builder().build());
    }

    /**
     * List linked accounts for your organization.
     */
    public PaginatedAccountDetailsAndActionsList list(LinkedAccountsListRequest request) {
        return list(request, null);
    }

    /**
     * List linked accounts for your organization.
     */
    public PaginatedAccountDetailsAndActionsList list(
            LinkedAccountsListRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("ticketing/v1/linked-accounts");
        if (request.getCategory().isPresent()) {
            httpUrl.addQueryParameter("category", request.getCategory().get().toString());
        }
        if (request.getCursor().isPresent()) {
            httpUrl.addQueryParameter("cursor", request.getCursor().get());
        }
        if (request.getEndUserEmailAddress().isPresent()) {
            httpUrl.addQueryParameter(
                    "end_user_email_address", request.getEndUserEmailAddress().get());
        }
        if (request.getEndUserOrganizationName().isPresent()) {
            httpUrl.addQueryParameter(
                    "end_user_organization_name",
                    request.getEndUserOrganizationName().get());
        }
        if (request.getEndUserOriginId().isPresent()) {
            httpUrl.addQueryParameter(
                    "end_user_origin_id", request.getEndUserOriginId().get());
        }
        if (request.getEndUserOriginIds().isPresent()) {
            httpUrl.addQueryParameter(
                    "end_user_origin_ids", request.getEndUserOriginIds().get());
        }
        if (request.getId().isPresent()) {
            httpUrl.addQueryParameter("id", request.getId().get());
        }
        if (request.getIds().isPresent()) {
            httpUrl.addQueryParameter("ids", request.getIds().get());
        }
        if (request.getIncludeDuplicates().isPresent()) {
            httpUrl.addQueryParameter(
                    "include_duplicates", request.getIncludeDuplicates().get().toString());
        }
        if (request.getIntegrationName().isPresent()) {
            httpUrl.addQueryParameter(
                    "integration_name", request.getIntegrationName().get());
        }
        if (request.getIsTestAccount().isPresent()) {
            httpUrl.addQueryParameter(
                    "is_test_account", request.getIsTestAccount().get());
        }
        if (request.getPageSize().isPresent()) {
            httpUrl.addQueryParameter("page_size", request.getPageSize().get().toString());
        }
        if (request.getStatus().isPresent()) {
            httpUrl.addQueryParameter("status", request.getStatus().get());
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
                return ObjectMappers.JSON_MAPPER.readValue(
                        response.body().string(), PaginatedAccountDetailsAndActionsList.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

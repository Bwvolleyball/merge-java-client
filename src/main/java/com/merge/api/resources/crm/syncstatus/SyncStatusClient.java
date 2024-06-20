/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.merge.api.resources.crm.syncstatus;

import com.merge.api.core.ClientOptions;
import com.merge.api.core.MergeApiApiError;
import com.merge.api.core.MergeApiError;
import com.merge.api.core.ObjectMappers;
import com.merge.api.core.RequestOptions;
import com.merge.api.resources.crm.syncstatus.requests.SyncStatusListRequest;
import com.merge.api.resources.crm.types.PaginatedSyncStatusList;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class SyncStatusClient {
    protected final ClientOptions clientOptions;

    public SyncStatusClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * Get syncing status. Possible values: <code>DISABLED</code>, <code>DONE</code>, <code>FAILED</code>, <code>PARTIALLY_SYNCED</code>, <code>PAUSED</code>, <code>SYNCING</code>. Learn more about sync status in our <a href="https://help.merge.dev/en/articles/8184193-merge-sync-statuses">Help Center</a>.
     */
    public PaginatedSyncStatusList list() {
        return list(SyncStatusListRequest.builder().build());
    }

    /**
     * Get syncing status. Possible values: <code>DISABLED</code>, <code>DONE</code>, <code>FAILED</code>, <code>PARTIALLY_SYNCED</code>, <code>PAUSED</code>, <code>SYNCING</code>. Learn more about sync status in our <a href="https://help.merge.dev/en/articles/8184193-merge-sync-statuses">Help Center</a>.
     */
    public PaginatedSyncStatusList list(SyncStatusListRequest request) {
        return list(request, null);
    }

    /**
     * Get syncing status. Possible values: <code>DISABLED</code>, <code>DONE</code>, <code>FAILED</code>, <code>PARTIALLY_SYNCED</code>, <code>PAUSED</code>, <code>SYNCING</code>. Learn more about sync status in our <a href="https://help.merge.dev/en/articles/8184193-merge-sync-statuses">Help Center</a>.
     */
    public PaginatedSyncStatusList list(SyncStatusListRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("crm/v1/sync-status");
        if (request.getCursor().isPresent()) {
            httpUrl.addQueryParameter("cursor", request.getCursor().get());
        }
        if (request.getPageSize().isPresent()) {
            httpUrl.addQueryParameter("page_size", request.getPageSize().get().toString());
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
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), PaginatedSyncStatusList.class);
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

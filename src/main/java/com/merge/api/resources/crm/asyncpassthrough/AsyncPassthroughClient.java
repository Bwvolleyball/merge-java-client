/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.merge.api.resources.crm.asyncpassthrough;

import com.merge.api.core.ApiError;
import com.merge.api.core.ClientOptions;
import com.merge.api.core.MediaTypes;
import com.merge.api.core.ObjectMappers;
import com.merge.api.core.RequestOptions;
import com.merge.api.resources.crm.types.AsyncPassthroughReciept;
import com.merge.api.resources.crm.types.DataPassthroughRequest;
import com.merge.api.resources.crm.types.RemoteResponse;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class AsyncPassthroughClient {
    protected final ClientOptions clientOptions;

    public AsyncPassthroughClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * Asynchronously pull data from an endpoint not currently supported by Merge.
     */
    public AsyncPassthroughReciept create(DataPassthroughRequest request) {
        return create(request, null);
    }

    /**
     * Asynchronously pull data from an endpoint not currently supported by Merge.
     */
    public AsyncPassthroughReciept create(DataPassthroughRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("crm/v1/async-passthrough")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            OkHttpClient client = clientOptions.httpClient();
            if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
                client = clientOptions.httpClientWithTimeout(requestOptions);
            }
            Response response = client.newCall(okhttpRequest).execute();
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), AsyncPassthroughReciept.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(
                            responseBody != null ? responseBody.string() : "{}", Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Retrieves data from earlier async-passthrough POST request
     */
    public RemoteResponse retrieve(String asyncPassthroughReceiptId) {
        return retrieve(asyncPassthroughReceiptId, null);
    }

    /**
     * Retrieves data from earlier async-passthrough POST request
     */
    public RemoteResponse retrieve(String asyncPassthroughReceiptId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("crm/v1/async-passthrough")
                .addPathSegment(asyncPassthroughReceiptId)
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            OkHttpClient client = clientOptions.httpClient();
            if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
                client = clientOptions.httpClientWithTimeout(requestOptions);
            }
            Response response = client.newCall(okhttpRequest).execute();
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), RemoteResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(
                            responseBody != null ? responseBody.string() : "{}", Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

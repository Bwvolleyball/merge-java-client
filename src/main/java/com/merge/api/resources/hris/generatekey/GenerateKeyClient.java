/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.merge.api.resources.hris.generatekey;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.merge.api.core.ClientOptions;
import com.merge.api.core.MediaTypes;
import com.merge.api.core.MergeApiApiError;
import com.merge.api.core.MergeApiError;
import com.merge.api.core.ObjectMappers;
import com.merge.api.core.RequestOptions;
import com.merge.api.resources.hris.generatekey.requests.GenerateRemoteKeyRequest;
import com.merge.api.resources.hris.types.RemoteKey;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class GenerateKeyClient {
    protected final ClientOptions clientOptions;

    public GenerateKeyClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * Create a remote key.
     */
    public RemoteKey create(GenerateRemoteKeyRequest request) {
        return create(request, null);
    }

    /**
     * Create a remote key.
     */
    public RemoteKey create(GenerateRemoteKeyRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("hris/v1/generate-key")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
        } catch (JsonProcessingException e) {
            throw new MergeApiError("Failed to serialize request", e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", body)
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
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), RemoteKey.class);
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

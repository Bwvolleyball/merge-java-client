/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.merge.api.resources.crm.deleteaccount;

import com.merge.api.core.ClientOptions;
import com.merge.api.core.MergeApiApiError;
import com.merge.api.core.MergeApiError;
import com.merge.api.core.ObjectMappers;
import com.merge.api.core.RequestOptions;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class DeleteAccountClient {
    protected final ClientOptions clientOptions;

    public DeleteAccountClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * Delete a linked account.
     */
    public void delete() {
        delete(null);
    }

    /**
     * Delete a linked account.
     */
    public void delete(RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("crm/v1/delete-account")
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", RequestBody.create("", null))
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return;
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

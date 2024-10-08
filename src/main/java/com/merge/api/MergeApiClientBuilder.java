/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.merge.api;

import com.merge.api.core.ClientOptions;
import com.merge.api.core.Environment;
import okhttp3.OkHttpClient;

import java.util.function.Consumer;

public final class MergeApiClientBuilder {
    private ClientOptions.Builder clientOptionsBuilder = ClientOptions.builder();

    private String apiKey = null;

    private String accountToken = null;

    private Environment environment = Environment.PRODUCTION;

    private Consumer<OkHttpClient.Builder> okHttpConfigurer;

    /**
     * Sets apiKey
     */
    public MergeApiClientBuilder apiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    /**
     * Sets accountToken
     */
    public MergeApiClientBuilder accountToken(String accountToken) {
        this.accountToken = accountToken;
        return this;
    }

    public MergeApiClientBuilder environment(Environment environment) {
        this.environment = environment;
        return this;
    }

    public MergeApiClientBuilder url(String url) {
        this.environment = Environment.custom(url);
        return this;
    }

    public MergeApiClientBuilder okHttpConfigurer(Consumer<OkHttpClient.Builder> okHttpConfigurer) {
        this.okHttpConfigurer = okHttpConfigurer;
        return this;
    }

    public MergeApiClient build() {
        if (apiKey == null) {
            throw new RuntimeException("Please provide apiKey");
        }
        this.clientOptionsBuilder.addHeader("Authorization", "Bearer " + this.apiKey);
        if (accountToken != null) {
            this.clientOptionsBuilder.addHeader("X-Account-Token", this.accountToken);
        }
        clientOptionsBuilder.environment(this.environment);
        if (okHttpConfigurer != null) {
            clientOptionsBuilder.addOkHttpConfigurer(okHttpConfigurer);
        }
        return new MergeApiClient(clientOptionsBuilder.build());
    }
}

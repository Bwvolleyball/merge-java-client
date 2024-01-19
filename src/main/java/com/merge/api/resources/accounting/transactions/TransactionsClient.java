/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.merge.api.resources.accounting.transactions;

import com.merge.api.core.ApiError;
import com.merge.api.core.ClientOptions;
import com.merge.api.core.ObjectMappers;
import com.merge.api.core.RequestOptions;
import com.merge.api.resources.accounting.transactions.requests.TransactionsListRequest;
import com.merge.api.resources.accounting.transactions.requests.TransactionsRetrieveRequest;
import com.merge.api.resources.accounting.types.PaginatedTransactionList;
import com.merge.api.resources.accounting.types.Transaction;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;

public class TransactionsClient {
    protected final ClientOptions clientOptions;

    public TransactionsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * Returns a list of <code>Transaction</code> objects.
     */
    public PaginatedTransactionList list() {
        return list(TransactionsListRequest.builder().build());
    }

    /**
     * Returns a list of <code>Transaction</code> objects.
     */
    public PaginatedTransactionList list(TransactionsListRequest request) {
        return list(request, null);
    }

    /**
     * Returns a list of <code>Transaction</code> objects.
     */
    public PaginatedTransactionList list(TransactionsListRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("api/accounting/v1/transactions");
        if (request.getCompanyId().isPresent()) {
            httpUrl.addQueryParameter("company_id", request.getCompanyId().get());
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
            httpUrl.addQueryParameter("expand", request.getExpand().get().toString());
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
        if (request.getTransactionDateAfter().isPresent()) {
            httpUrl.addQueryParameter(
                    "transaction_date_after",
                    request.getTransactionDateAfter().get().toString());
        }
        if (request.getTransactionDateBefore().isPresent()) {
            httpUrl.addQueryParameter(
                    "transaction_date_before",
                    request.getTransactionDateBefore().get().toString());
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), PaginatedTransactionList.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Returns a <code>Transaction</code> object with the given <code>id</code>.
     */
    public Transaction retrieve(String id) {
        return retrieve(id, TransactionsRetrieveRequest.builder().build());
    }

    /**
     * Returns a <code>Transaction</code> object with the given <code>id</code>.
     */
    public Transaction retrieve(String id, TransactionsRetrieveRequest request) {
        return retrieve(id, request, null);
    }

    /**
     * Returns a <code>Transaction</code> object with the given <code>id</code>.
     */
    public Transaction retrieve(String id, TransactionsRetrieveRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("api/accounting/v1/transactions")
                .addPathSegment(id);
        if (request.getExpand().isPresent()) {
            httpUrl.addQueryParameter("expand", request.getExpand().get().toString());
        }
        if (request.getIncludeRemoteData().isPresent()) {
            httpUrl.addQueryParameter(
                    "include_remote_data", request.getIncludeRemoteData().get().toString());
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Transaction.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

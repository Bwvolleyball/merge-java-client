package com.merge.api.resources.accounting.payments.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.merge.api.core.ObjectMappers;
import com.merge.api.resources.accounting.payments.types.PaymentsListRequestExpand;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = PaymentsListRequest.Builder.class)
public final class PaymentsListRequest {
    private final Optional<String> accountId;

    private final Optional<String> companyId;

    private final Optional<String> contactId;

    private final Optional<OffsetDateTime> createdAfter;

    private final Optional<OffsetDateTime> createdBefore;

    private final Optional<String> cursor;

    private final Optional<PaymentsListRequestExpand> expand;

    private final Optional<Boolean> includeDeletedData;

    private final Optional<Boolean> includeRemoteData;

    private final Optional<OffsetDateTime> modifiedAfter;

    private final Optional<OffsetDateTime> modifiedBefore;

    private final Optional<Integer> pageSize;

    private final Optional<String> remoteId;

    private final Optional<OffsetDateTime> transactionDateAfter;

    private final Optional<OffsetDateTime> transactionDateBefore;

    private PaymentsListRequest(
            Optional<String> accountId,
            Optional<String> companyId,
            Optional<String> contactId,
            Optional<OffsetDateTime> createdAfter,
            Optional<OffsetDateTime> createdBefore,
            Optional<String> cursor,
            Optional<PaymentsListRequestExpand> expand,
            Optional<Boolean> includeDeletedData,
            Optional<Boolean> includeRemoteData,
            Optional<OffsetDateTime> modifiedAfter,
            Optional<OffsetDateTime> modifiedBefore,
            Optional<Integer> pageSize,
            Optional<String> remoteId,
            Optional<OffsetDateTime> transactionDateAfter,
            Optional<OffsetDateTime> transactionDateBefore) {
        this.accountId = accountId;
        this.companyId = companyId;
        this.contactId = contactId;
        this.createdAfter = createdAfter;
        this.createdBefore = createdBefore;
        this.cursor = cursor;
        this.expand = expand;
        this.includeDeletedData = includeDeletedData;
        this.includeRemoteData = includeRemoteData;
        this.modifiedAfter = modifiedAfter;
        this.modifiedBefore = modifiedBefore;
        this.pageSize = pageSize;
        this.remoteId = remoteId;
        this.transactionDateAfter = transactionDateAfter;
        this.transactionDateBefore = transactionDateBefore;
    }

    /**
     * @return If provided, will only return payments for this account.
     */
    @JsonProperty("account_id")
    public Optional<String> getAccountId() {
        return accountId;
    }

    /**
     * @return If provided, will only return payments for this company.
     */
    @JsonProperty("company_id")
    public Optional<String> getCompanyId() {
        return companyId;
    }

    /**
     * @return If provided, will only return payments for this contact.
     */
    @JsonProperty("contact_id")
    public Optional<String> getContactId() {
        return contactId;
    }

    /**
     * @return If provided, will only return objects created after this datetime.
     */
    @JsonProperty("created_after")
    public Optional<OffsetDateTime> getCreatedAfter() {
        return createdAfter;
    }

    /**
     * @return If provided, will only return objects created before this datetime.
     */
    @JsonProperty("created_before")
    public Optional<OffsetDateTime> getCreatedBefore() {
        return createdBefore;
    }

    /**
     * @return The pagination cursor value.
     */
    @JsonProperty("cursor")
    public Optional<String> getCursor() {
        return cursor;
    }

    /**
     * @return Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
     */
    @JsonProperty("expand")
    public Optional<PaymentsListRequestExpand> getExpand() {
        return expand;
    }

    /**
     * @return Whether to include data that was marked as deleted by third party webhooks.
     */
    @JsonProperty("include_deleted_data")
    public Optional<Boolean> getIncludeDeletedData() {
        return includeDeletedData;
    }

    /**
     * @return Whether to include the original data Merge fetched from the third-party to produce these models.
     */
    @JsonProperty("include_remote_data")
    public Optional<Boolean> getIncludeRemoteData() {
        return includeRemoteData;
    }

    /**
     * @return If provided, only objects synced by Merge after this date time will be returned.
     */
    @JsonProperty("modified_after")
    public Optional<OffsetDateTime> getModifiedAfter() {
        return modifiedAfter;
    }

    /**
     * @return If provided, only objects synced by Merge before this date time will be returned.
     */
    @JsonProperty("modified_before")
    public Optional<OffsetDateTime> getModifiedBefore() {
        return modifiedBefore;
    }

    /**
     * @return Number of results to return per page.
     */
    @JsonProperty("page_size")
    public Optional<Integer> getPageSize() {
        return pageSize;
    }

    /**
     * @return The API provider's ID for the given object.
     */
    @JsonProperty("remote_id")
    public Optional<String> getRemoteId() {
        return remoteId;
    }

    /**
     * @return If provided, will only return objects created after this datetime.
     */
    @JsonProperty("transaction_date_after")
    public Optional<OffsetDateTime> getTransactionDateAfter() {
        return transactionDateAfter;
    }

    /**
     * @return If provided, will only return objects created before this datetime.
     */
    @JsonProperty("transaction_date_before")
    public Optional<OffsetDateTime> getTransactionDateBefore() {
        return transactionDateBefore;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PaymentsListRequest && equalTo((PaymentsListRequest) other);
    }

    private boolean equalTo(PaymentsListRequest other) {
        return accountId.equals(other.accountId)
                && companyId.equals(other.companyId)
                && contactId.equals(other.contactId)
                && createdAfter.equals(other.createdAfter)
                && createdBefore.equals(other.createdBefore)
                && cursor.equals(other.cursor)
                && expand.equals(other.expand)
                && includeDeletedData.equals(other.includeDeletedData)
                && includeRemoteData.equals(other.includeRemoteData)
                && modifiedAfter.equals(other.modifiedAfter)
                && modifiedBefore.equals(other.modifiedBefore)
                && pageSize.equals(other.pageSize)
                && remoteId.equals(other.remoteId)
                && transactionDateAfter.equals(other.transactionDateAfter)
                && transactionDateBefore.equals(other.transactionDateBefore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.accountId,
                this.companyId,
                this.contactId,
                this.createdAfter,
                this.createdBefore,
                this.cursor,
                this.expand,
                this.includeDeletedData,
                this.includeRemoteData,
                this.modifiedAfter,
                this.modifiedBefore,
                this.pageSize,
                this.remoteId,
                this.transactionDateAfter,
                this.transactionDateBefore);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> accountId = Optional.empty();

        private Optional<String> companyId = Optional.empty();

        private Optional<String> contactId = Optional.empty();

        private Optional<OffsetDateTime> createdAfter = Optional.empty();

        private Optional<OffsetDateTime> createdBefore = Optional.empty();

        private Optional<String> cursor = Optional.empty();

        private Optional<PaymentsListRequestExpand> expand = Optional.empty();

        private Optional<Boolean> includeDeletedData = Optional.empty();

        private Optional<Boolean> includeRemoteData = Optional.empty();

        private Optional<OffsetDateTime> modifiedAfter = Optional.empty();

        private Optional<OffsetDateTime> modifiedBefore = Optional.empty();

        private Optional<Integer> pageSize = Optional.empty();

        private Optional<String> remoteId = Optional.empty();

        private Optional<OffsetDateTime> transactionDateAfter = Optional.empty();

        private Optional<OffsetDateTime> transactionDateBefore = Optional.empty();

        private Builder() {}

        public Builder from(PaymentsListRequest other) {
            accountId(other.getAccountId());
            companyId(other.getCompanyId());
            contactId(other.getContactId());
            createdAfter(other.getCreatedAfter());
            createdBefore(other.getCreatedBefore());
            cursor(other.getCursor());
            expand(other.getExpand());
            includeDeletedData(other.getIncludeDeletedData());
            includeRemoteData(other.getIncludeRemoteData());
            modifiedAfter(other.getModifiedAfter());
            modifiedBefore(other.getModifiedBefore());
            pageSize(other.getPageSize());
            remoteId(other.getRemoteId());
            transactionDateAfter(other.getTransactionDateAfter());
            transactionDateBefore(other.getTransactionDateBefore());
            return this;
        }

        @JsonSetter(value = "account_id", nulls = Nulls.SKIP)
        public Builder accountId(Optional<String> accountId) {
            this.accountId = accountId;
            return this;
        }

        public Builder accountId(String accountId) {
            this.accountId = Optional.of(accountId);
            return this;
        }

        @JsonSetter(value = "company_id", nulls = Nulls.SKIP)
        public Builder companyId(Optional<String> companyId) {
            this.companyId = companyId;
            return this;
        }

        public Builder companyId(String companyId) {
            this.companyId = Optional.of(companyId);
            return this;
        }

        @JsonSetter(value = "contact_id", nulls = Nulls.SKIP)
        public Builder contactId(Optional<String> contactId) {
            this.contactId = contactId;
            return this;
        }

        public Builder contactId(String contactId) {
            this.contactId = Optional.of(contactId);
            return this;
        }

        @JsonSetter(value = "created_after", nulls = Nulls.SKIP)
        public Builder createdAfter(Optional<OffsetDateTime> createdAfter) {
            this.createdAfter = createdAfter;
            return this;
        }

        public Builder createdAfter(OffsetDateTime createdAfter) {
            this.createdAfter = Optional.of(createdAfter);
            return this;
        }

        @JsonSetter(value = "created_before", nulls = Nulls.SKIP)
        public Builder createdBefore(Optional<OffsetDateTime> createdBefore) {
            this.createdBefore = createdBefore;
            return this;
        }

        public Builder createdBefore(OffsetDateTime createdBefore) {
            this.createdBefore = Optional.of(createdBefore);
            return this;
        }

        @JsonSetter(value = "cursor", nulls = Nulls.SKIP)
        public Builder cursor(Optional<String> cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder cursor(String cursor) {
            this.cursor = Optional.of(cursor);
            return this;
        }

        @JsonSetter(value = "expand", nulls = Nulls.SKIP)
        public Builder expand(Optional<PaymentsListRequestExpand> expand) {
            this.expand = expand;
            return this;
        }

        public Builder expand(PaymentsListRequestExpand expand) {
            this.expand = Optional.of(expand);
            return this;
        }

        @JsonSetter(value = "include_deleted_data", nulls = Nulls.SKIP)
        public Builder includeDeletedData(Optional<Boolean> includeDeletedData) {
            this.includeDeletedData = includeDeletedData;
            return this;
        }

        public Builder includeDeletedData(Boolean includeDeletedData) {
            this.includeDeletedData = Optional.of(includeDeletedData);
            return this;
        }

        @JsonSetter(value = "include_remote_data", nulls = Nulls.SKIP)
        public Builder includeRemoteData(Optional<Boolean> includeRemoteData) {
            this.includeRemoteData = includeRemoteData;
            return this;
        }

        public Builder includeRemoteData(Boolean includeRemoteData) {
            this.includeRemoteData = Optional.of(includeRemoteData);
            return this;
        }

        @JsonSetter(value = "modified_after", nulls = Nulls.SKIP)
        public Builder modifiedAfter(Optional<OffsetDateTime> modifiedAfter) {
            this.modifiedAfter = modifiedAfter;
            return this;
        }

        public Builder modifiedAfter(OffsetDateTime modifiedAfter) {
            this.modifiedAfter = Optional.of(modifiedAfter);
            return this;
        }

        @JsonSetter(value = "modified_before", nulls = Nulls.SKIP)
        public Builder modifiedBefore(Optional<OffsetDateTime> modifiedBefore) {
            this.modifiedBefore = modifiedBefore;
            return this;
        }

        public Builder modifiedBefore(OffsetDateTime modifiedBefore) {
            this.modifiedBefore = Optional.of(modifiedBefore);
            return this;
        }

        @JsonSetter(value = "page_size", nulls = Nulls.SKIP)
        public Builder pageSize(Optional<Integer> pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        public Builder pageSize(Integer pageSize) {
            this.pageSize = Optional.of(pageSize);
            return this;
        }

        @JsonSetter(value = "remote_id", nulls = Nulls.SKIP)
        public Builder remoteId(Optional<String> remoteId) {
            this.remoteId = remoteId;
            return this;
        }

        public Builder remoteId(String remoteId) {
            this.remoteId = Optional.of(remoteId);
            return this;
        }

        @JsonSetter(value = "transaction_date_after", nulls = Nulls.SKIP)
        public Builder transactionDateAfter(Optional<OffsetDateTime> transactionDateAfter) {
            this.transactionDateAfter = transactionDateAfter;
            return this;
        }

        public Builder transactionDateAfter(OffsetDateTime transactionDateAfter) {
            this.transactionDateAfter = Optional.of(transactionDateAfter);
            return this;
        }

        @JsonSetter(value = "transaction_date_before", nulls = Nulls.SKIP)
        public Builder transactionDateBefore(Optional<OffsetDateTime> transactionDateBefore) {
            this.transactionDateBefore = transactionDateBefore;
            return this;
        }

        public Builder transactionDateBefore(OffsetDateTime transactionDateBefore) {
            this.transactionDateBefore = Optional.of(transactionDateBefore);
            return this;
        }

        public PaymentsListRequest build() {
            return new PaymentsListRequest(
                    accountId,
                    companyId,
                    contactId,
                    createdAfter,
                    createdBefore,
                    cursor,
                    expand,
                    includeDeletedData,
                    includeRemoteData,
                    modifiedAfter,
                    modifiedBefore,
                    pageSize,
                    remoteId,
                    transactionDateAfter,
                    transactionDateBefore);
        }
    }
}

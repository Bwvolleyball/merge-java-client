package com.merge.api.resources.accounting.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.merge.api.core.ObjectMappers;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = VendorCreditLine.Builder.class)
public final class VendorCreditLine {
    private final Optional<String> remoteId;

    private final Optional<Double> netAmount;

    private final Optional<String> trackingCategory;

    private final List<String> trackingCategories;

    private final Optional<String> description;

    private final Optional<VendorCreditLineAccount> account;

    private final Optional<String> company;

    private final Optional<String> exchangeRate;

    private final Optional<Boolean> remoteWasDeleted;

    private final Optional<String> id;

    private final Optional<OffsetDateTime> createdAt;

    private final Optional<OffsetDateTime> modifiedAt;

    private VendorCreditLine(
            Optional<String> remoteId,
            Optional<Double> netAmount,
            Optional<String> trackingCategory,
            List<String> trackingCategories,
            Optional<String> description,
            Optional<VendorCreditLineAccount> account,
            Optional<String> company,
            Optional<String> exchangeRate,
            Optional<Boolean> remoteWasDeleted,
            Optional<String> id,
            Optional<OffsetDateTime> createdAt,
            Optional<OffsetDateTime> modifiedAt) {
        this.remoteId = remoteId;
        this.netAmount = netAmount;
        this.trackingCategory = trackingCategory;
        this.trackingCategories = trackingCategories;
        this.description = description;
        this.account = account;
        this.company = company;
        this.exchangeRate = exchangeRate;
        this.remoteWasDeleted = remoteWasDeleted;
        this.id = id;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    /**
     * @return The third-party API ID of the matching object.
     */
    @JsonProperty("remote_id")
    public Optional<String> getRemoteId() {
        return remoteId;
    }

    /**
     * @return The full value of the credit.
     */
    @JsonProperty("net_amount")
    public Optional<Double> getNetAmount() {
        return netAmount;
    }

    /**
     * @return The line's associated tracking category.
     */
    @JsonProperty("tracking_category")
    public Optional<String> getTrackingCategory() {
        return trackingCategory;
    }

    /**
     * @return The line's associated tracking categories.
     */
    @JsonProperty("tracking_categories")
    public List<String> getTrackingCategories() {
        return trackingCategories;
    }

    /**
     * @return The line's description.
     */
    @JsonProperty("description")
    public Optional<String> getDescription() {
        return description;
    }

    /**
     * @return The line's account.
     */
    @JsonProperty("account")
    public Optional<VendorCreditLineAccount> getAccount() {
        return account;
    }

    /**
     * @return The company the line belongs to.
     */
    @JsonProperty("company")
    public Optional<String> getCompany() {
        return company;
    }

    /**
     * @return The vendor credit line item's exchange rate.
     */
    @JsonProperty("exchange_rate")
    public Optional<String> getExchangeRate() {
        return exchangeRate;
    }

    /**
     * @return Indicates whether or not this object has been deleted in the third party platform.
     */
    @JsonProperty("remote_was_deleted")
    public Optional<Boolean> getRemoteWasDeleted() {
        return remoteWasDeleted;
    }

    @JsonProperty("id")
    public Optional<String> getId() {
        return id;
    }

    @JsonProperty("created_at")
    public Optional<OffsetDateTime> getCreatedAt() {
        return createdAt;
    }

    /**
     * @return This is the datetime that this object was last updated by Merge
     */
    @JsonProperty("modified_at")
    public Optional<OffsetDateTime> getModifiedAt() {
        return modifiedAt;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof VendorCreditLine && equalTo((VendorCreditLine) other);
    }

    private boolean equalTo(VendorCreditLine other) {
        return remoteId.equals(other.remoteId)
                && netAmount.equals(other.netAmount)
                && trackingCategory.equals(other.trackingCategory)
                && trackingCategories.equals(other.trackingCategories)
                && description.equals(other.description)
                && account.equals(other.account)
                && company.equals(other.company)
                && exchangeRate.equals(other.exchangeRate)
                && remoteWasDeleted.equals(other.remoteWasDeleted)
                && id.equals(other.id)
                && createdAt.equals(other.createdAt)
                && modifiedAt.equals(other.modifiedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.remoteId,
                this.netAmount,
                this.trackingCategory,
                this.trackingCategories,
                this.description,
                this.account,
                this.company,
                this.exchangeRate,
                this.remoteWasDeleted,
                this.id,
                this.createdAt,
                this.modifiedAt);
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
        private Optional<String> remoteId = Optional.empty();

        private Optional<Double> netAmount = Optional.empty();

        private Optional<String> trackingCategory = Optional.empty();

        private List<String> trackingCategories = new ArrayList<>();

        private Optional<String> description = Optional.empty();

        private Optional<VendorCreditLineAccount> account = Optional.empty();

        private Optional<String> company = Optional.empty();

        private Optional<String> exchangeRate = Optional.empty();

        private Optional<Boolean> remoteWasDeleted = Optional.empty();

        private Optional<String> id = Optional.empty();

        private Optional<OffsetDateTime> createdAt = Optional.empty();

        private Optional<OffsetDateTime> modifiedAt = Optional.empty();

        private Builder() {}

        public Builder from(VendorCreditLine other) {
            remoteId(other.getRemoteId());
            netAmount(other.getNetAmount());
            trackingCategory(other.getTrackingCategory());
            trackingCategories(other.getTrackingCategories());
            description(other.getDescription());
            account(other.getAccount());
            company(other.getCompany());
            exchangeRate(other.getExchangeRate());
            remoteWasDeleted(other.getRemoteWasDeleted());
            id(other.getId());
            createdAt(other.getCreatedAt());
            modifiedAt(other.getModifiedAt());
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

        @JsonSetter(value = "net_amount", nulls = Nulls.SKIP)
        public Builder netAmount(Optional<Double> netAmount) {
            this.netAmount = netAmount;
            return this;
        }

        public Builder netAmount(Double netAmount) {
            this.netAmount = Optional.of(netAmount);
            return this;
        }

        @JsonSetter(value = "tracking_category", nulls = Nulls.SKIP)
        public Builder trackingCategory(Optional<String> trackingCategory) {
            this.trackingCategory = trackingCategory;
            return this;
        }

        public Builder trackingCategory(String trackingCategory) {
            this.trackingCategory = Optional.of(trackingCategory);
            return this;
        }

        @JsonSetter(value = "tracking_categories", nulls = Nulls.SKIP)
        public Builder trackingCategories(List<String> trackingCategories) {
            this.trackingCategories.clear();
            this.trackingCategories.addAll(trackingCategories);
            return this;
        }

        public Builder addTrackingCategories(String trackingCategories) {
            this.trackingCategories.add(trackingCategories);
            return this;
        }

        public Builder addAllTrackingCategories(List<String> trackingCategories) {
            this.trackingCategories.addAll(trackingCategories);
            return this;
        }

        @JsonSetter(value = "description", nulls = Nulls.SKIP)
        public Builder description(Optional<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(String description) {
            this.description = Optional.of(description);
            return this;
        }

        @JsonSetter(value = "account", nulls = Nulls.SKIP)
        public Builder account(Optional<VendorCreditLineAccount> account) {
            this.account = account;
            return this;
        }

        public Builder account(VendorCreditLineAccount account) {
            this.account = Optional.of(account);
            return this;
        }

        @JsonSetter(value = "company", nulls = Nulls.SKIP)
        public Builder company(Optional<String> company) {
            this.company = company;
            return this;
        }

        public Builder company(String company) {
            this.company = Optional.of(company);
            return this;
        }

        @JsonSetter(value = "exchange_rate", nulls = Nulls.SKIP)
        public Builder exchangeRate(Optional<String> exchangeRate) {
            this.exchangeRate = exchangeRate;
            return this;
        }

        public Builder exchangeRate(String exchangeRate) {
            this.exchangeRate = Optional.of(exchangeRate);
            return this;
        }

        @JsonSetter(value = "remote_was_deleted", nulls = Nulls.SKIP)
        public Builder remoteWasDeleted(Optional<Boolean> remoteWasDeleted) {
            this.remoteWasDeleted = remoteWasDeleted;
            return this;
        }

        public Builder remoteWasDeleted(Boolean remoteWasDeleted) {
            this.remoteWasDeleted = Optional.of(remoteWasDeleted);
            return this;
        }

        @JsonSetter(value = "id", nulls = Nulls.SKIP)
        public Builder id(Optional<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(String id) {
            this.id = Optional.of(id);
            return this;
        }

        @JsonSetter(value = "created_at", nulls = Nulls.SKIP)
        public Builder createdAt(Optional<OffsetDateTime> createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder createdAt(OffsetDateTime createdAt) {
            this.createdAt = Optional.of(createdAt);
            return this;
        }

        @JsonSetter(value = "modified_at", nulls = Nulls.SKIP)
        public Builder modifiedAt(Optional<OffsetDateTime> modifiedAt) {
            this.modifiedAt = modifiedAt;
            return this;
        }

        public Builder modifiedAt(OffsetDateTime modifiedAt) {
            this.modifiedAt = Optional.of(modifiedAt);
            return this;
        }

        public VendorCreditLine build() {
            return new VendorCreditLine(
                    remoteId,
                    netAmount,
                    trackingCategory,
                    trackingCategories,
                    description,
                    account,
                    company,
                    exchangeRate,
                    remoteWasDeleted,
                    id,
                    createdAt,
                    modifiedAt);
        }
    }
}

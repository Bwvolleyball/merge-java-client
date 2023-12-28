package com.merge.api.resources.ats.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.merge.api.core.ObjectMappers;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = AccountDetailsAndActions.Builder.class)
public final class AccountDetailsAndActions {
    private final String id;

    private final Optional<CategoryEnum> category;

    private final AccountDetailsAndActionsStatusEnum status;

    private final Optional<String> statusDetail;

    private final Optional<String> endUserOriginId;

    private final String endUserOrganizationName;

    private final String endUserEmailAddress;

    private final String webhookListenerUrl;

    private final Optional<Boolean> isDuplicate;

    private final Optional<AccountDetailsAndActionsIntegration> integration;

    private final String accountType;

    private AccountDetailsAndActions(
            String id,
            Optional<CategoryEnum> category,
            AccountDetailsAndActionsStatusEnum status,
            Optional<String> statusDetail,
            Optional<String> endUserOriginId,
            String endUserOrganizationName,
            String endUserEmailAddress,
            String webhookListenerUrl,
            Optional<Boolean> isDuplicate,
            Optional<AccountDetailsAndActionsIntegration> integration,
            String accountType) {
        this.id = id;
        this.category = category;
        this.status = status;
        this.statusDetail = statusDetail;
        this.endUserOriginId = endUserOriginId;
        this.endUserOrganizationName = endUserOrganizationName;
        this.endUserEmailAddress = endUserEmailAddress;
        this.webhookListenerUrl = webhookListenerUrl;
        this.isDuplicate = isDuplicate;
        this.integration = integration;
        this.accountType = accountType;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("category")
    public Optional<CategoryEnum> getCategory() {
        return category;
    }

    @JsonProperty("status")
    public AccountDetailsAndActionsStatusEnum getStatus() {
        return status;
    }

    @JsonProperty("status_detail")
    public Optional<String> getStatusDetail() {
        return statusDetail;
    }

    @JsonProperty("end_user_origin_id")
    public Optional<String> getEndUserOriginId() {
        return endUserOriginId;
    }

    @JsonProperty("end_user_organization_name")
    public String getEndUserOrganizationName() {
        return endUserOrganizationName;
    }

    @JsonProperty("end_user_email_address")
    public String getEndUserEmailAddress() {
        return endUserEmailAddress;
    }

    @JsonProperty("webhook_listener_url")
    public String getWebhookListenerUrl() {
        return webhookListenerUrl;
    }

    /**
     * @return Whether a Production Linked Account's credentials match another existing Production Linked Account. This field is <code>null</code> for Test Linked Accounts, incomplete Production Linked Accounts, and ignored duplicate Production Linked Account sets.
     */
    @JsonProperty("is_duplicate")
    public Optional<Boolean> getIsDuplicate() {
        return isDuplicate;
    }

    @JsonProperty("integration")
    public Optional<AccountDetailsAndActionsIntegration> getIntegration() {
        return integration;
    }

    @JsonProperty("account_type")
    public String getAccountType() {
        return accountType;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AccountDetailsAndActions && equalTo((AccountDetailsAndActions) other);
    }

    private boolean equalTo(AccountDetailsAndActions other) {
        return id.equals(other.id)
                && category.equals(other.category)
                && status.equals(other.status)
                && statusDetail.equals(other.statusDetail)
                && endUserOriginId.equals(other.endUserOriginId)
                && endUserOrganizationName.equals(other.endUserOrganizationName)
                && endUserEmailAddress.equals(other.endUserEmailAddress)
                && webhookListenerUrl.equals(other.webhookListenerUrl)
                && isDuplicate.equals(other.isDuplicate)
                && integration.equals(other.integration)
                && accountType.equals(other.accountType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.category,
                this.status,
                this.statusDetail,
                this.endUserOriginId,
                this.endUserOrganizationName,
                this.endUserEmailAddress,
                this.webhookListenerUrl,
                this.isDuplicate,
                this.integration,
                this.accountType);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        StatusStage id(String id);

        Builder from(AccountDetailsAndActions other);
    }

    public interface StatusStage {
        EndUserOrganizationNameStage status(AccountDetailsAndActionsStatusEnum status);
    }

    public interface EndUserOrganizationNameStage {
        EndUserEmailAddressStage endUserOrganizationName(String endUserOrganizationName);
    }

    public interface EndUserEmailAddressStage {
        WebhookListenerUrlStage endUserEmailAddress(String endUserEmailAddress);
    }

    public interface WebhookListenerUrlStage {
        AccountTypeStage webhookListenerUrl(String webhookListenerUrl);
    }

    public interface AccountTypeStage {
        _FinalStage accountType(String accountType);
    }

    public interface _FinalStage {
        AccountDetailsAndActions build();

        _FinalStage category(Optional<CategoryEnum> category);

        _FinalStage category(CategoryEnum category);

        _FinalStage statusDetail(Optional<String> statusDetail);

        _FinalStage statusDetail(String statusDetail);

        _FinalStage endUserOriginId(Optional<String> endUserOriginId);

        _FinalStage endUserOriginId(String endUserOriginId);

        _FinalStage isDuplicate(Optional<Boolean> isDuplicate);

        _FinalStage isDuplicate(Boolean isDuplicate);

        _FinalStage integration(Optional<AccountDetailsAndActionsIntegration> integration);

        _FinalStage integration(AccountDetailsAndActionsIntegration integration);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements IdStage,
                    StatusStage,
                    EndUserOrganizationNameStage,
                    EndUserEmailAddressStage,
                    WebhookListenerUrlStage,
                    AccountTypeStage,
                    _FinalStage {
        private String id;

        private AccountDetailsAndActionsStatusEnum status;

        private String endUserOrganizationName;

        private String endUserEmailAddress;

        private String webhookListenerUrl;

        private String accountType;

        private Optional<AccountDetailsAndActionsIntegration> integration = Optional.empty();

        private Optional<Boolean> isDuplicate = Optional.empty();

        private Optional<String> endUserOriginId = Optional.empty();

        private Optional<String> statusDetail = Optional.empty();

        private Optional<CategoryEnum> category = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(AccountDetailsAndActions other) {
            id(other.getId());
            category(other.getCategory());
            status(other.getStatus());
            statusDetail(other.getStatusDetail());
            endUserOriginId(other.getEndUserOriginId());
            endUserOrganizationName(other.getEndUserOrganizationName());
            endUserEmailAddress(other.getEndUserEmailAddress());
            webhookListenerUrl(other.getWebhookListenerUrl());
            isDuplicate(other.getIsDuplicate());
            integration(other.getIntegration());
            accountType(other.getAccountType());
            return this;
        }

        @Override
        @JsonSetter("id")
        public StatusStage id(String id) {
            this.id = id;
            return this;
        }

        @Override
        @JsonSetter("status")
        public EndUserOrganizationNameStage status(AccountDetailsAndActionsStatusEnum status) {
            this.status = status;
            return this;
        }

        @Override
        @JsonSetter("end_user_organization_name")
        public EndUserEmailAddressStage endUserOrganizationName(String endUserOrganizationName) {
            this.endUserOrganizationName = endUserOrganizationName;
            return this;
        }

        @Override
        @JsonSetter("end_user_email_address")
        public WebhookListenerUrlStage endUserEmailAddress(String endUserEmailAddress) {
            this.endUserEmailAddress = endUserEmailAddress;
            return this;
        }

        @Override
        @JsonSetter("webhook_listener_url")
        public AccountTypeStage webhookListenerUrl(String webhookListenerUrl) {
            this.webhookListenerUrl = webhookListenerUrl;
            return this;
        }

        @Override
        @JsonSetter("account_type")
        public _FinalStage accountType(String accountType) {
            this.accountType = accountType;
            return this;
        }

        @Override
        public _FinalStage integration(AccountDetailsAndActionsIntegration integration) {
            this.integration = Optional.of(integration);
            return this;
        }

        @Override
        @JsonSetter(value = "integration", nulls = Nulls.SKIP)
        public _FinalStage integration(Optional<AccountDetailsAndActionsIntegration> integration) {
            this.integration = integration;
            return this;
        }

        /**
         * <p>Whether a Production Linked Account's credentials match another existing Production Linked Account. This field is <code>null</code> for Test Linked Accounts, incomplete Production Linked Accounts, and ignored duplicate Production Linked Account sets.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage isDuplicate(Boolean isDuplicate) {
            this.isDuplicate = Optional.of(isDuplicate);
            return this;
        }

        @Override
        @JsonSetter(value = "is_duplicate", nulls = Nulls.SKIP)
        public _FinalStage isDuplicate(Optional<Boolean> isDuplicate) {
            this.isDuplicate = isDuplicate;
            return this;
        }

        @Override
        public _FinalStage endUserOriginId(String endUserOriginId) {
            this.endUserOriginId = Optional.of(endUserOriginId);
            return this;
        }

        @Override
        @JsonSetter(value = "end_user_origin_id", nulls = Nulls.SKIP)
        public _FinalStage endUserOriginId(Optional<String> endUserOriginId) {
            this.endUserOriginId = endUserOriginId;
            return this;
        }

        @Override
        public _FinalStage statusDetail(String statusDetail) {
            this.statusDetail = Optional.of(statusDetail);
            return this;
        }

        @Override
        @JsonSetter(value = "status_detail", nulls = Nulls.SKIP)
        public _FinalStage statusDetail(Optional<String> statusDetail) {
            this.statusDetail = statusDetail;
            return this;
        }

        @Override
        public _FinalStage category(CategoryEnum category) {
            this.category = Optional.of(category);
            return this;
        }

        @Override
        @JsonSetter(value = "category", nulls = Nulls.SKIP)
        public _FinalStage category(Optional<CategoryEnum> category) {
            this.category = category;
            return this;
        }

        @Override
        public AccountDetailsAndActions build() {
            return new AccountDetailsAndActions(
                    id,
                    category,
                    status,
                    statusDetail,
                    endUserOriginId,
                    endUserOrganizationName,
                    endUserEmailAddress,
                    webhookListenerUrl,
                    isDuplicate,
                    integration,
                    accountType);
        }
    }
}

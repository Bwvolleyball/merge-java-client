package com.merge.api.resources.hris.linkedaccounts.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.merge.api.core.ObjectMappers;
import com.merge.api.resources.hris.linkedaccounts.types.LinkedAccountsListRequestCategory;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = LinkedAccountsListRequest.Builder.class)
public final class LinkedAccountsListRequest {
    private final Optional<LinkedAccountsListRequestCategory> category;

    private final Optional<String> cursor;

    private final Optional<String> endUserEmailAddress;

    private final Optional<String> endUserOrganizationName;

    private final Optional<String> endUserOriginId;

    private final Optional<String> endUserOriginIds;

    private final Optional<String> id;

    private final Optional<String> ids;

    private final Optional<Boolean> includeDuplicates;

    private final Optional<String> integrationName;

    private final Optional<String> isTestAccount;

    private final Optional<Integer> pageSize;

    private final Optional<String> status;

    private LinkedAccountsListRequest(
            Optional<LinkedAccountsListRequestCategory> category,
            Optional<String> cursor,
            Optional<String> endUserEmailAddress,
            Optional<String> endUserOrganizationName,
            Optional<String> endUserOriginId,
            Optional<String> endUserOriginIds,
            Optional<String> id,
            Optional<String> ids,
            Optional<Boolean> includeDuplicates,
            Optional<String> integrationName,
            Optional<String> isTestAccount,
            Optional<Integer> pageSize,
            Optional<String> status) {
        this.category = category;
        this.cursor = cursor;
        this.endUserEmailAddress = endUserEmailAddress;
        this.endUserOrganizationName = endUserOrganizationName;
        this.endUserOriginId = endUserOriginId;
        this.endUserOriginIds = endUserOriginIds;
        this.id = id;
        this.ids = ids;
        this.includeDuplicates = includeDuplicates;
        this.integrationName = integrationName;
        this.isTestAccount = isTestAccount;
        this.pageSize = pageSize;
        this.status = status;
    }

    /**
     * @return Options: ('hris', 'ats', 'accounting', 'ticketing', 'crm', 'mktg', 'filestorage')
     * <ul>
     * <li><code>hris</code> - hris</li>
     * <li><code>ats</code> - ats</li>
     * <li><code>accounting</code> - accounting</li>
     * <li><code>ticketing</code> - ticketing</li>
     * <li><code>crm</code> - crm</li>
     * <li><code>mktg</code> - mktg</li>
     * <li><code>filestorage</code> - filestorage</li>
     * </ul>
     */
    @JsonProperty("category")
    public Optional<LinkedAccountsListRequestCategory> getCategory() {
        return category;
    }

    /**
     * @return The pagination cursor value.
     */
    @JsonProperty("cursor")
    public Optional<String> getCursor() {
        return cursor;
    }

    /**
     * @return If provided, will only return linked accounts associated with the given email address.
     */
    @JsonProperty("end_user_email_address")
    public Optional<String> getEndUserEmailAddress() {
        return endUserEmailAddress;
    }

    /**
     * @return If provided, will only return linked accounts associated with the given organization name.
     */
    @JsonProperty("end_user_organization_name")
    public Optional<String> getEndUserOrganizationName() {
        return endUserOrganizationName;
    }

    /**
     * @return If provided, will only return linked accounts associated with the given origin ID.
     */
    @JsonProperty("end_user_origin_id")
    public Optional<String> getEndUserOriginId() {
        return endUserOriginId;
    }

    /**
     * @return Comma-separated list of EndUser origin IDs, making it possible to specify multiple EndUsers at once.
     */
    @JsonProperty("end_user_origin_ids")
    public Optional<String> getEndUserOriginIds() {
        return endUserOriginIds;
    }

    @JsonProperty("id")
    public Optional<String> getId() {
        return id;
    }

    /**
     * @return Comma-separated list of LinkedAccount IDs, making it possible to specify multiple LinkedAccounts at once.
     */
    @JsonProperty("ids")
    public Optional<String> getIds() {
        return ids;
    }

    /**
     * @return If <code>true</code>, will include complete production duplicates of the account specified by the <code>id</code> query parameter in the response. <code>id</code> must be for a complete production linked account.
     */
    @JsonProperty("include_duplicates")
    public Optional<Boolean> getIncludeDuplicates() {
        return includeDuplicates;
    }

    /**
     * @return If provided, will only return linked accounts associated with the given integration name.
     */
    @JsonProperty("integration_name")
    public Optional<String> getIntegrationName() {
        return integrationName;
    }

    /**
     * @return If included, will only include test linked accounts. If not included, will only include non-test linked accounts.
     */
    @JsonProperty("is_test_account")
    public Optional<String> getIsTestAccount() {
        return isTestAccount;
    }

    /**
     * @return Number of results to return per page.
     */
    @JsonProperty("page_size")
    public Optional<Integer> getPageSize() {
        return pageSize;
    }

    /**
     * @return Filter by status. Options: <code>COMPLETE</code>, <code>INCOMPLETE</code>, <code>RELINK_NEEDED</code>
     */
    @JsonProperty("status")
    public Optional<String> getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof LinkedAccountsListRequest && equalTo((LinkedAccountsListRequest) other);
    }

    private boolean equalTo(LinkedAccountsListRequest other) {
        return category.equals(other.category)
                && cursor.equals(other.cursor)
                && endUserEmailAddress.equals(other.endUserEmailAddress)
                && endUserOrganizationName.equals(other.endUserOrganizationName)
                && endUserOriginId.equals(other.endUserOriginId)
                && endUserOriginIds.equals(other.endUserOriginIds)
                && id.equals(other.id)
                && ids.equals(other.ids)
                && includeDuplicates.equals(other.includeDuplicates)
                && integrationName.equals(other.integrationName)
                && isTestAccount.equals(other.isTestAccount)
                && pageSize.equals(other.pageSize)
                && status.equals(other.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.category,
                this.cursor,
                this.endUserEmailAddress,
                this.endUserOrganizationName,
                this.endUserOriginId,
                this.endUserOriginIds,
                this.id,
                this.ids,
                this.includeDuplicates,
                this.integrationName,
                this.isTestAccount,
                this.pageSize,
                this.status);
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
        private Optional<LinkedAccountsListRequestCategory> category = Optional.empty();

        private Optional<String> cursor = Optional.empty();

        private Optional<String> endUserEmailAddress = Optional.empty();

        private Optional<String> endUserOrganizationName = Optional.empty();

        private Optional<String> endUserOriginId = Optional.empty();

        private Optional<String> endUserOriginIds = Optional.empty();

        private Optional<String> id = Optional.empty();

        private Optional<String> ids = Optional.empty();

        private Optional<Boolean> includeDuplicates = Optional.empty();

        private Optional<String> integrationName = Optional.empty();

        private Optional<String> isTestAccount = Optional.empty();

        private Optional<Integer> pageSize = Optional.empty();

        private Optional<String> status = Optional.empty();

        private Builder() {}

        public Builder from(LinkedAccountsListRequest other) {
            category(other.getCategory());
            cursor(other.getCursor());
            endUserEmailAddress(other.getEndUserEmailAddress());
            endUserOrganizationName(other.getEndUserOrganizationName());
            endUserOriginId(other.getEndUserOriginId());
            endUserOriginIds(other.getEndUserOriginIds());
            id(other.getId());
            ids(other.getIds());
            includeDuplicates(other.getIncludeDuplicates());
            integrationName(other.getIntegrationName());
            isTestAccount(other.getIsTestAccount());
            pageSize(other.getPageSize());
            status(other.getStatus());
            return this;
        }

        @JsonSetter(value = "category", nulls = Nulls.SKIP)
        public Builder category(Optional<LinkedAccountsListRequestCategory> category) {
            this.category = category;
            return this;
        }

        public Builder category(LinkedAccountsListRequestCategory category) {
            this.category = Optional.of(category);
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

        @JsonSetter(value = "end_user_email_address", nulls = Nulls.SKIP)
        public Builder endUserEmailAddress(Optional<String> endUserEmailAddress) {
            this.endUserEmailAddress = endUserEmailAddress;
            return this;
        }

        public Builder endUserEmailAddress(String endUserEmailAddress) {
            this.endUserEmailAddress = Optional.of(endUserEmailAddress);
            return this;
        }

        @JsonSetter(value = "end_user_organization_name", nulls = Nulls.SKIP)
        public Builder endUserOrganizationName(Optional<String> endUserOrganizationName) {
            this.endUserOrganizationName = endUserOrganizationName;
            return this;
        }

        public Builder endUserOrganizationName(String endUserOrganizationName) {
            this.endUserOrganizationName = Optional.of(endUserOrganizationName);
            return this;
        }

        @JsonSetter(value = "end_user_origin_id", nulls = Nulls.SKIP)
        public Builder endUserOriginId(Optional<String> endUserOriginId) {
            this.endUserOriginId = endUserOriginId;
            return this;
        }

        public Builder endUserOriginId(String endUserOriginId) {
            this.endUserOriginId = Optional.of(endUserOriginId);
            return this;
        }

        @JsonSetter(value = "end_user_origin_ids", nulls = Nulls.SKIP)
        public Builder endUserOriginIds(Optional<String> endUserOriginIds) {
            this.endUserOriginIds = endUserOriginIds;
            return this;
        }

        public Builder endUserOriginIds(String endUserOriginIds) {
            this.endUserOriginIds = Optional.of(endUserOriginIds);
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

        @JsonSetter(value = "ids", nulls = Nulls.SKIP)
        public Builder ids(Optional<String> ids) {
            this.ids = ids;
            return this;
        }

        public Builder ids(String ids) {
            this.ids = Optional.of(ids);
            return this;
        }

        @JsonSetter(value = "include_duplicates", nulls = Nulls.SKIP)
        public Builder includeDuplicates(Optional<Boolean> includeDuplicates) {
            this.includeDuplicates = includeDuplicates;
            return this;
        }

        public Builder includeDuplicates(Boolean includeDuplicates) {
            this.includeDuplicates = Optional.of(includeDuplicates);
            return this;
        }

        @JsonSetter(value = "integration_name", nulls = Nulls.SKIP)
        public Builder integrationName(Optional<String> integrationName) {
            this.integrationName = integrationName;
            return this;
        }

        public Builder integrationName(String integrationName) {
            this.integrationName = Optional.of(integrationName);
            return this;
        }

        @JsonSetter(value = "is_test_account", nulls = Nulls.SKIP)
        public Builder isTestAccount(Optional<String> isTestAccount) {
            this.isTestAccount = isTestAccount;
            return this;
        }

        public Builder isTestAccount(String isTestAccount) {
            this.isTestAccount = Optional.of(isTestAccount);
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

        @JsonSetter(value = "status", nulls = Nulls.SKIP)
        public Builder status(Optional<String> status) {
            this.status = status;
            return this;
        }

        public Builder status(String status) {
            this.status = Optional.of(status);
            return this;
        }

        public LinkedAccountsListRequest build() {
            return new LinkedAccountsListRequest(
                    category,
                    cursor,
                    endUserEmailAddress,
                    endUserOrganizationName,
                    endUserOriginId,
                    endUserOriginIds,
                    id,
                    ids,
                    includeDuplicates,
                    integrationName,
                    isTestAccount,
                    pageSize,
                    status);
        }
    }
}

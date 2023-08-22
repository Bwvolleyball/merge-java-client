package com.merge.api.resources.crm.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.merge.api.core.ObjectMappers;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Account.Builder.class)
public final class Account {
    private final Optional<AccountOwner> owner;

    private final Optional<String> name;

    private final Optional<String> description;

    private final Optional<String> industry;

    private final Optional<String> website;

    private final Optional<Integer> numberOfEmployees;

    private final Optional<List<Address>> addresses;

    private final Optional<List<PhoneNumber>> phoneNumbers;

    private final Optional<OffsetDateTime> lastActivityAt;

    private final Optional<OffsetDateTime> remoteUpdatedAt;

    private final Optional<OffsetDateTime> remoteCreatedAt;

    private final Optional<Boolean> remoteWasDeleted;

    private final Optional<String> id;

    private final Optional<String> remoteId;

    private final Optional<OffsetDateTime> modifiedAt;

    private final Optional<Map<String, JsonNode>> fieldMappings;

    private final Optional<List<RemoteData>> remoteData;

    private final Optional<List<RemoteField>> remoteFields;

    private Account(
            Optional<AccountOwner> owner,
            Optional<String> name,
            Optional<String> description,
            Optional<String> industry,
            Optional<String> website,
            Optional<Integer> numberOfEmployees,
            Optional<List<Address>> addresses,
            Optional<List<PhoneNumber>> phoneNumbers,
            Optional<OffsetDateTime> lastActivityAt,
            Optional<OffsetDateTime> remoteUpdatedAt,
            Optional<OffsetDateTime> remoteCreatedAt,
            Optional<Boolean> remoteWasDeleted,
            Optional<String> id,
            Optional<String> remoteId,
            Optional<OffsetDateTime> modifiedAt,
            Optional<Map<String, JsonNode>> fieldMappings,
            Optional<List<RemoteData>> remoteData,
            Optional<List<RemoteField>> remoteFields) {
        this.owner = owner;
        this.name = name;
        this.description = description;
        this.industry = industry;
        this.website = website;
        this.numberOfEmployees = numberOfEmployees;
        this.addresses = addresses;
        this.phoneNumbers = phoneNumbers;
        this.lastActivityAt = lastActivityAt;
        this.remoteUpdatedAt = remoteUpdatedAt;
        this.remoteCreatedAt = remoteCreatedAt;
        this.remoteWasDeleted = remoteWasDeleted;
        this.id = id;
        this.remoteId = remoteId;
        this.modifiedAt = modifiedAt;
        this.fieldMappings = fieldMappings;
        this.remoteData = remoteData;
        this.remoteFields = remoteFields;
    }

    /**
     * @return The account's owner.
     */
    @JsonProperty("owner")
    public Optional<AccountOwner> getOwner() {
        return owner;
    }

    /**
     * @return The account's name.
     */
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    /**
     * @return The account's description.
     */
    @JsonProperty("description")
    public Optional<String> getDescription() {
        return description;
    }

    /**
     * @return The account's industry.
     */
    @JsonProperty("industry")
    public Optional<String> getIndustry() {
        return industry;
    }

    /**
     * @return The account's website.
     */
    @JsonProperty("website")
    public Optional<String> getWebsite() {
        return website;
    }

    /**
     * @return The account's number of employees.
     */
    @JsonProperty("number_of_employees")
    public Optional<Integer> getNumberOfEmployees() {
        return numberOfEmployees;
    }

    @JsonProperty("addresses")
    public Optional<List<Address>> getAddresses() {
        return addresses;
    }

    @JsonProperty("phone_numbers")
    public Optional<List<PhoneNumber>> getPhoneNumbers() {
        return phoneNumbers;
    }

    /**
     * @return The last date (either most recent or furthest in the future) of when an activity occurs in an account.
     */
    @JsonProperty("last_activity_at")
    public Optional<OffsetDateTime> getLastActivityAt() {
        return lastActivityAt;
    }

    /**
     * @return When the CRM system account data was last modified by a user with a login.
     */
    @JsonProperty("remote_updated_at")
    public Optional<OffsetDateTime> getRemoteUpdatedAt() {
        return remoteUpdatedAt;
    }

    /**
     * @return When the third party's account was created.
     */
    @JsonProperty("remote_created_at")
    public Optional<OffsetDateTime> getRemoteCreatedAt() {
        return remoteCreatedAt;
    }

    @JsonProperty("remote_was_deleted")
    public Optional<Boolean> getRemoteWasDeleted() {
        return remoteWasDeleted;
    }

    @JsonProperty("id")
    public Optional<String> getId() {
        return id;
    }

    /**
     * @return The third-party API ID of the matching object.
     */
    @JsonProperty("remote_id")
    public Optional<String> getRemoteId() {
        return remoteId;
    }

    /**
     * @return This is the datetime that this object was last updated by Merge
     */
    @JsonProperty("modified_at")
    public Optional<OffsetDateTime> getModifiedAt() {
        return modifiedAt;
    }

    @JsonProperty("field_mappings")
    public Optional<Map<String, JsonNode>> getFieldMappings() {
        return fieldMappings;
    }

    @JsonProperty("remote_data")
    public Optional<List<RemoteData>> getRemoteData() {
        return remoteData;
    }

    @JsonProperty("remote_fields")
    public Optional<List<RemoteField>> getRemoteFields() {
        return remoteFields;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Account && equalTo((Account) other);
    }

    private boolean equalTo(Account other) {
        return owner.equals(other.owner)
                && name.equals(other.name)
                && description.equals(other.description)
                && industry.equals(other.industry)
                && website.equals(other.website)
                && numberOfEmployees.equals(other.numberOfEmployees)
                && addresses.equals(other.addresses)
                && phoneNumbers.equals(other.phoneNumbers)
                && lastActivityAt.equals(other.lastActivityAt)
                && remoteUpdatedAt.equals(other.remoteUpdatedAt)
                && remoteCreatedAt.equals(other.remoteCreatedAt)
                && remoteWasDeleted.equals(other.remoteWasDeleted)
                && id.equals(other.id)
                && remoteId.equals(other.remoteId)
                && modifiedAt.equals(other.modifiedAt)
                && fieldMappings.equals(other.fieldMappings)
                && remoteData.equals(other.remoteData)
                && remoteFields.equals(other.remoteFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.owner,
                this.name,
                this.description,
                this.industry,
                this.website,
                this.numberOfEmployees,
                this.addresses,
                this.phoneNumbers,
                this.lastActivityAt,
                this.remoteUpdatedAt,
                this.remoteCreatedAt,
                this.remoteWasDeleted,
                this.id,
                this.remoteId,
                this.modifiedAt,
                this.fieldMappings,
                this.remoteData,
                this.remoteFields);
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
        private Optional<AccountOwner> owner = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Optional<String> description = Optional.empty();

        private Optional<String> industry = Optional.empty();

        private Optional<String> website = Optional.empty();

        private Optional<Integer> numberOfEmployees = Optional.empty();

        private Optional<List<Address>> addresses = Optional.empty();

        private Optional<List<PhoneNumber>> phoneNumbers = Optional.empty();

        private Optional<OffsetDateTime> lastActivityAt = Optional.empty();

        private Optional<OffsetDateTime> remoteUpdatedAt = Optional.empty();

        private Optional<OffsetDateTime> remoteCreatedAt = Optional.empty();

        private Optional<Boolean> remoteWasDeleted = Optional.empty();

        private Optional<String> id = Optional.empty();

        private Optional<String> remoteId = Optional.empty();

        private Optional<OffsetDateTime> modifiedAt = Optional.empty();

        private Optional<Map<String, JsonNode>> fieldMappings = Optional.empty();

        private Optional<List<RemoteData>> remoteData = Optional.empty();

        private Optional<List<RemoteField>> remoteFields = Optional.empty();

        private Builder() {}

        public Builder from(Account other) {
            owner(other.getOwner());
            name(other.getName());
            description(other.getDescription());
            industry(other.getIndustry());
            website(other.getWebsite());
            numberOfEmployees(other.getNumberOfEmployees());
            addresses(other.getAddresses());
            phoneNumbers(other.getPhoneNumbers());
            lastActivityAt(other.getLastActivityAt());
            remoteUpdatedAt(other.getRemoteUpdatedAt());
            remoteCreatedAt(other.getRemoteCreatedAt());
            remoteWasDeleted(other.getRemoteWasDeleted());
            id(other.getId());
            remoteId(other.getRemoteId());
            modifiedAt(other.getModifiedAt());
            fieldMappings(other.getFieldMappings());
            remoteData(other.getRemoteData());
            remoteFields(other.getRemoteFields());
            return this;
        }

        @JsonSetter(value = "owner", nulls = Nulls.SKIP)
        public Builder owner(Optional<AccountOwner> owner) {
            this.owner = owner;
            return this;
        }

        public Builder owner(AccountOwner owner) {
            this.owner = Optional.of(owner);
            return this;
        }

        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public Builder name(Optional<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(String name) {
            this.name = Optional.of(name);
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

        @JsonSetter(value = "industry", nulls = Nulls.SKIP)
        public Builder industry(Optional<String> industry) {
            this.industry = industry;
            return this;
        }

        public Builder industry(String industry) {
            this.industry = Optional.of(industry);
            return this;
        }

        @JsonSetter(value = "website", nulls = Nulls.SKIP)
        public Builder website(Optional<String> website) {
            this.website = website;
            return this;
        }

        public Builder website(String website) {
            this.website = Optional.of(website);
            return this;
        }

        @JsonSetter(value = "number_of_employees", nulls = Nulls.SKIP)
        public Builder numberOfEmployees(Optional<Integer> numberOfEmployees) {
            this.numberOfEmployees = numberOfEmployees;
            return this;
        }

        public Builder numberOfEmployees(Integer numberOfEmployees) {
            this.numberOfEmployees = Optional.of(numberOfEmployees);
            return this;
        }

        @JsonSetter(value = "addresses", nulls = Nulls.SKIP)
        public Builder addresses(Optional<List<Address>> addresses) {
            this.addresses = addresses;
            return this;
        }

        public Builder addresses(List<Address> addresses) {
            this.addresses = Optional.of(addresses);
            return this;
        }

        @JsonSetter(value = "phone_numbers", nulls = Nulls.SKIP)
        public Builder phoneNumbers(Optional<List<PhoneNumber>> phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
            return this;
        }

        public Builder phoneNumbers(List<PhoneNumber> phoneNumbers) {
            this.phoneNumbers = Optional.of(phoneNumbers);
            return this;
        }

        @JsonSetter(value = "last_activity_at", nulls = Nulls.SKIP)
        public Builder lastActivityAt(Optional<OffsetDateTime> lastActivityAt) {
            this.lastActivityAt = lastActivityAt;
            return this;
        }

        public Builder lastActivityAt(OffsetDateTime lastActivityAt) {
            this.lastActivityAt = Optional.of(lastActivityAt);
            return this;
        }

        @JsonSetter(value = "remote_updated_at", nulls = Nulls.SKIP)
        public Builder remoteUpdatedAt(Optional<OffsetDateTime> remoteUpdatedAt) {
            this.remoteUpdatedAt = remoteUpdatedAt;
            return this;
        }

        public Builder remoteUpdatedAt(OffsetDateTime remoteUpdatedAt) {
            this.remoteUpdatedAt = Optional.of(remoteUpdatedAt);
            return this;
        }

        @JsonSetter(value = "remote_created_at", nulls = Nulls.SKIP)
        public Builder remoteCreatedAt(Optional<OffsetDateTime> remoteCreatedAt) {
            this.remoteCreatedAt = remoteCreatedAt;
            return this;
        }

        public Builder remoteCreatedAt(OffsetDateTime remoteCreatedAt) {
            this.remoteCreatedAt = Optional.of(remoteCreatedAt);
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

        @JsonSetter(value = "remote_id", nulls = Nulls.SKIP)
        public Builder remoteId(Optional<String> remoteId) {
            this.remoteId = remoteId;
            return this;
        }

        public Builder remoteId(String remoteId) {
            this.remoteId = Optional.of(remoteId);
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

        @JsonSetter(value = "field_mappings", nulls = Nulls.SKIP)
        public Builder fieldMappings(Optional<Map<String, JsonNode>> fieldMappings) {
            this.fieldMappings = fieldMappings;
            return this;
        }

        public Builder fieldMappings(Map<String, JsonNode> fieldMappings) {
            this.fieldMappings = Optional.of(fieldMappings);
            return this;
        }

        @JsonSetter(value = "remote_data", nulls = Nulls.SKIP)
        public Builder remoteData(Optional<List<RemoteData>> remoteData) {
            this.remoteData = remoteData;
            return this;
        }

        public Builder remoteData(List<RemoteData> remoteData) {
            this.remoteData = Optional.of(remoteData);
            return this;
        }

        @JsonSetter(value = "remote_fields", nulls = Nulls.SKIP)
        public Builder remoteFields(Optional<List<RemoteField>> remoteFields) {
            this.remoteFields = remoteFields;
            return this;
        }

        public Builder remoteFields(List<RemoteField> remoteFields) {
            this.remoteFields = Optional.of(remoteFields);
            return this;
        }

        public Account build() {
            return new Account(
                    owner,
                    name,
                    description,
                    industry,
                    website,
                    numberOfEmployees,
                    addresses,
                    phoneNumbers,
                    lastActivityAt,
                    remoteUpdatedAt,
                    remoteCreatedAt,
                    remoteWasDeleted,
                    id,
                    remoteId,
                    modifiedAt,
                    fieldMappings,
                    remoteData,
                    remoteFields);
        }
    }
}

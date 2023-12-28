package com.merge.api.resources.ats.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.merge.api.core.ObjectMappers;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = AuditLogEvent.Builder.class)
public final class AuditLogEvent {
    private final Optional<String> id;

    private final Optional<String> userName;

    private final Optional<String> userEmail;

    private final AuditLogEventRole role;

    private final String ipAddress;

    private final AuditLogEventEventType eventType;

    private final String eventDescription;

    private final Optional<OffsetDateTime> createdAt;

    private AuditLogEvent(
            Optional<String> id,
            Optional<String> userName,
            Optional<String> userEmail,
            AuditLogEventRole role,
            String ipAddress,
            AuditLogEventEventType eventType,
            String eventDescription,
            Optional<OffsetDateTime> createdAt) {
        this.id = id;
        this.userName = userName;
        this.userEmail = userEmail;
        this.role = role;
        this.ipAddress = ipAddress;
        this.eventType = eventType;
        this.eventDescription = eventDescription;
        this.createdAt = createdAt;
    }

    @JsonProperty("id")
    public Optional<String> getId() {
        return id;
    }

    /**
     * @return The User's full name at the time of this Event occurring.
     */
    @JsonProperty("user_name")
    public Optional<String> getUserName() {
        return userName;
    }

    /**
     * @return The User's email at the time of this Event occurring.
     */
    @JsonProperty("user_email")
    public Optional<String> getUserEmail() {
        return userEmail;
    }

    /**
     * @return Designates the role of the user (or SYSTEM/API if action not taken by a user) at the time of this Event occurring.
     * <ul>
     * <li><code>ADMIN</code> - ADMIN</li>
     * <li><code>DEVELOPER</code> - DEVELOPER</li>
     * <li><code>MEMBER</code> - MEMBER</li>
     * <li><code>API</code> - API</li>
     * <li><code>SYSTEM</code> - SYSTEM</li>
     * <li><code>MERGE_TEAM</code> - MERGE_TEAM</li>
     * </ul>
     */
    @JsonProperty("role")
    public AuditLogEventRole getRole() {
        return role;
    }

    @JsonProperty("ip_address")
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * @return Designates the type of event that occurred.
     * <ul>
     * <li><code>CREATED_REMOTE_PRODUCTION_API_KEY</code> - CREATED_REMOTE_PRODUCTION_API_KEY</li>
     * <li><code>DELETED_REMOTE_PRODUCTION_API_KEY</code> - DELETED_REMOTE_PRODUCTION_API_KEY</li>
     * <li><code>CREATED_TEST_API_KEY</code> - CREATED_TEST_API_KEY</li>
     * <li><code>DELETED_TEST_API_KEY</code> - DELETED_TEST_API_KEY</li>
     * <li><code>REGENERATED_PRODUCTION_API_KEY</code> - REGENERATED_PRODUCTION_API_KEY</li>
     * <li><code>INVITED_USER</code> - INVITED_USER</li>
     * <li><code>TWO_FACTOR_AUTH_ENABLED</code> - TWO_FACTOR_AUTH_ENABLED</li>
     * <li><code>TWO_FACTOR_AUTH_DISABLED</code> - TWO_FACTOR_AUTH_DISABLED</li>
     * <li><code>DELETED_LINKED_ACCOUNT</code> - DELETED_LINKED_ACCOUNT</li>
     * <li><code>CREATED_DESTINATION</code> - CREATED_DESTINATION</li>
     * <li><code>DELETED_DESTINATION</code> - DELETED_DESTINATION</li>
     * <li><code>CHANGED_SCOPES</code> - CHANGED_SCOPES</li>
     * <li><code>CHANGED_PERSONAL_INFORMATION</code> - CHANGED_PERSONAL_INFORMATION</li>
     * <li><code>CHANGED_ORGANIZATION_SETTINGS</code> - CHANGED_ORGANIZATION_SETTINGS</li>
     * <li><code>ENABLED_INTEGRATION</code> - ENABLED_INTEGRATION</li>
     * <li><code>DISABLED_INTEGRATION</code> - DISABLED_INTEGRATION</li>
     * <li><code>ENABLED_CATEGORY</code> - ENABLED_CATEGORY</li>
     * <li><code>DISABLED_CATEGORY</code> - DISABLED_CATEGORY</li>
     * <li><code>CHANGED_PASSWORD</code> - CHANGED_PASSWORD</li>
     * <li><code>RESET_PASSWORD</code> - RESET_PASSWORD</li>
     * <li><code>ENABLED_REDACT_UNMAPPED_DATA_FOR_ORGANIZATION</code> - ENABLED_REDACT_UNMAPPED_DATA_FOR_ORGANIZATION</li>
     * <li><code>ENABLED_REDACT_UNMAPPED_DATA_FOR_LINKED_ACCOUNT</code> - ENABLED_REDACT_UNMAPPED_DATA_FOR_LINKED_ACCOUNT</li>
     * <li><code>DISABLED_REDACT_UNMAPPED_DATA_FOR_ORGANIZATION</code> - DISABLED_REDACT_UNMAPPED_DATA_FOR_ORGANIZATION</li>
     * <li><code>DISABLED_REDACT_UNMAPPED_DATA_FOR_LINKED_ACCOUNT</code> - DISABLED_REDACT_UNMAPPED_DATA_FOR_LINKED_ACCOUNT</li>
     * <li><code>CREATED_INTEGRATION_WIDE_FIELD_MAPPING</code> - CREATED_INTEGRATION_WIDE_FIELD_MAPPING</li>
     * <li><code>CREATED_LINKED_ACCOUNT_FIELD_MAPPING</code> - CREATED_LINKED_ACCOUNT_FIELD_MAPPING</li>
     * <li><code>CHANGED_INTEGRATION_WIDE_FIELD_MAPPING</code> - CHANGED_INTEGRATION_WIDE_FIELD_MAPPING</li>
     * <li><code>CHANGED_LINKED_ACCOUNT_FIELD_MAPPING</code> - CHANGED_LINKED_ACCOUNT_FIELD_MAPPING</li>
     * <li><code>DELETED_INTEGRATION_WIDE_FIELD_MAPPING</code> - DELETED_INTEGRATION_WIDE_FIELD_MAPPING</li>
     * <li><code>DELETED_LINKED_ACCOUNT_FIELD_MAPPING</code> - DELETED_LINKED_ACCOUNT_FIELD_MAPPING</li>
     * </ul>
     */
    @JsonProperty("event_type")
    public AuditLogEventEventType getEventType() {
        return eventType;
    }

    @JsonProperty("event_description")
    public String getEventDescription() {
        return eventDescription;
    }

    @JsonProperty("created_at")
    public Optional<OffsetDateTime> getCreatedAt() {
        return createdAt;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AuditLogEvent && equalTo((AuditLogEvent) other);
    }

    private boolean equalTo(AuditLogEvent other) {
        return id.equals(other.id)
                && userName.equals(other.userName)
                && userEmail.equals(other.userEmail)
                && role.equals(other.role)
                && ipAddress.equals(other.ipAddress)
                && eventType.equals(other.eventType)
                && eventDescription.equals(other.eventDescription)
                && createdAt.equals(other.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.userName,
                this.userEmail,
                this.role,
                this.ipAddress,
                this.eventType,
                this.eventDescription,
                this.createdAt);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static RoleStage builder() {
        return new Builder();
    }

    public interface RoleStage {
        IpAddressStage role(AuditLogEventRole role);

        Builder from(AuditLogEvent other);
    }

    public interface IpAddressStage {
        EventTypeStage ipAddress(String ipAddress);
    }

    public interface EventTypeStage {
        EventDescriptionStage eventType(AuditLogEventEventType eventType);
    }

    public interface EventDescriptionStage {
        _FinalStage eventDescription(String eventDescription);
    }

    public interface _FinalStage {
        AuditLogEvent build();

        _FinalStage id(Optional<String> id);

        _FinalStage id(String id);

        _FinalStage userName(Optional<String> userName);

        _FinalStage userName(String userName);

        _FinalStage userEmail(Optional<String> userEmail);

        _FinalStage userEmail(String userEmail);

        _FinalStage createdAt(Optional<OffsetDateTime> createdAt);

        _FinalStage createdAt(OffsetDateTime createdAt);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements RoleStage, IpAddressStage, EventTypeStage, EventDescriptionStage, _FinalStage {
        private AuditLogEventRole role;

        private String ipAddress;

        private AuditLogEventEventType eventType;

        private String eventDescription;

        private Optional<OffsetDateTime> createdAt = Optional.empty();

        private Optional<String> userEmail = Optional.empty();

        private Optional<String> userName = Optional.empty();

        private Optional<String> id = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(AuditLogEvent other) {
            id(other.getId());
            userName(other.getUserName());
            userEmail(other.getUserEmail());
            role(other.getRole());
            ipAddress(other.getIpAddress());
            eventType(other.getEventType());
            eventDescription(other.getEventDescription());
            createdAt(other.getCreatedAt());
            return this;
        }

        /**
         * <p>Designates the role of the user (or SYSTEM/API if action not taken by a user) at the time of this Event occurring.</p>
         * <ul>
         * <li><code>ADMIN</code> - ADMIN</li>
         * <li><code>DEVELOPER</code> - DEVELOPER</li>
         * <li><code>MEMBER</code> - MEMBER</li>
         * <li><code>API</code> - API</li>
         * <li><code>SYSTEM</code> - SYSTEM</li>
         * <li><code>MERGE_TEAM</code> - MERGE_TEAM</li>
         * </ul>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("role")
        public IpAddressStage role(AuditLogEventRole role) {
            this.role = role;
            return this;
        }

        @Override
        @JsonSetter("ip_address")
        public EventTypeStage ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        /**
         * <p>Designates the type of event that occurred.</p>
         * <ul>
         * <li><code>CREATED_REMOTE_PRODUCTION_API_KEY</code> - CREATED_REMOTE_PRODUCTION_API_KEY</li>
         * <li><code>DELETED_REMOTE_PRODUCTION_API_KEY</code> - DELETED_REMOTE_PRODUCTION_API_KEY</li>
         * <li><code>CREATED_TEST_API_KEY</code> - CREATED_TEST_API_KEY</li>
         * <li><code>DELETED_TEST_API_KEY</code> - DELETED_TEST_API_KEY</li>
         * <li><code>REGENERATED_PRODUCTION_API_KEY</code> - REGENERATED_PRODUCTION_API_KEY</li>
         * <li><code>INVITED_USER</code> - INVITED_USER</li>
         * <li><code>TWO_FACTOR_AUTH_ENABLED</code> - TWO_FACTOR_AUTH_ENABLED</li>
         * <li><code>TWO_FACTOR_AUTH_DISABLED</code> - TWO_FACTOR_AUTH_DISABLED</li>
         * <li><code>DELETED_LINKED_ACCOUNT</code> - DELETED_LINKED_ACCOUNT</li>
         * <li><code>CREATED_DESTINATION</code> - CREATED_DESTINATION</li>
         * <li><code>DELETED_DESTINATION</code> - DELETED_DESTINATION</li>
         * <li><code>CHANGED_SCOPES</code> - CHANGED_SCOPES</li>
         * <li><code>CHANGED_PERSONAL_INFORMATION</code> - CHANGED_PERSONAL_INFORMATION</li>
         * <li><code>CHANGED_ORGANIZATION_SETTINGS</code> - CHANGED_ORGANIZATION_SETTINGS</li>
         * <li><code>ENABLED_INTEGRATION</code> - ENABLED_INTEGRATION</li>
         * <li><code>DISABLED_INTEGRATION</code> - DISABLED_INTEGRATION</li>
         * <li><code>ENABLED_CATEGORY</code> - ENABLED_CATEGORY</li>
         * <li><code>DISABLED_CATEGORY</code> - DISABLED_CATEGORY</li>
         * <li><code>CHANGED_PASSWORD</code> - CHANGED_PASSWORD</li>
         * <li><code>RESET_PASSWORD</code> - RESET_PASSWORD</li>
         * <li><code>ENABLED_REDACT_UNMAPPED_DATA_FOR_ORGANIZATION</code> - ENABLED_REDACT_UNMAPPED_DATA_FOR_ORGANIZATION</li>
         * <li><code>ENABLED_REDACT_UNMAPPED_DATA_FOR_LINKED_ACCOUNT</code> - ENABLED_REDACT_UNMAPPED_DATA_FOR_LINKED_ACCOUNT</li>
         * <li><code>DISABLED_REDACT_UNMAPPED_DATA_FOR_ORGANIZATION</code> - DISABLED_REDACT_UNMAPPED_DATA_FOR_ORGANIZATION</li>
         * <li><code>DISABLED_REDACT_UNMAPPED_DATA_FOR_LINKED_ACCOUNT</code> - DISABLED_REDACT_UNMAPPED_DATA_FOR_LINKED_ACCOUNT</li>
         * <li><code>CREATED_INTEGRATION_WIDE_FIELD_MAPPING</code> - CREATED_INTEGRATION_WIDE_FIELD_MAPPING</li>
         * <li><code>CREATED_LINKED_ACCOUNT_FIELD_MAPPING</code> - CREATED_LINKED_ACCOUNT_FIELD_MAPPING</li>
         * <li><code>CHANGED_INTEGRATION_WIDE_FIELD_MAPPING</code> - CHANGED_INTEGRATION_WIDE_FIELD_MAPPING</li>
         * <li><code>CHANGED_LINKED_ACCOUNT_FIELD_MAPPING</code> - CHANGED_LINKED_ACCOUNT_FIELD_MAPPING</li>
         * <li><code>DELETED_INTEGRATION_WIDE_FIELD_MAPPING</code> - DELETED_INTEGRATION_WIDE_FIELD_MAPPING</li>
         * <li><code>DELETED_LINKED_ACCOUNT_FIELD_MAPPING</code> - DELETED_LINKED_ACCOUNT_FIELD_MAPPING</li>
         * </ul>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("event_type")
        public EventDescriptionStage eventType(AuditLogEventEventType eventType) {
            this.eventType = eventType;
            return this;
        }

        @Override
        @JsonSetter("event_description")
        public _FinalStage eventDescription(String eventDescription) {
            this.eventDescription = eventDescription;
            return this;
        }

        @Override
        public _FinalStage createdAt(OffsetDateTime createdAt) {
            this.createdAt = Optional.of(createdAt);
            return this;
        }

        @Override
        @JsonSetter(value = "created_at", nulls = Nulls.SKIP)
        public _FinalStage createdAt(Optional<OffsetDateTime> createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>The User's email at the time of this Event occurring.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage userEmail(String userEmail) {
            this.userEmail = Optional.of(userEmail);
            return this;
        }

        @Override
        @JsonSetter(value = "user_email", nulls = Nulls.SKIP)
        public _FinalStage userEmail(Optional<String> userEmail) {
            this.userEmail = userEmail;
            return this;
        }

        /**
         * <p>The User's full name at the time of this Event occurring.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage userName(String userName) {
            this.userName = Optional.of(userName);
            return this;
        }

        @Override
        @JsonSetter(value = "user_name", nulls = Nulls.SKIP)
        public _FinalStage userName(Optional<String> userName) {
            this.userName = userName;
            return this;
        }

        @Override
        public _FinalStage id(String id) {
            this.id = Optional.of(id);
            return this;
        }

        @Override
        @JsonSetter(value = "id", nulls = Nulls.SKIP)
        public _FinalStage id(Optional<String> id) {
            this.id = id;
            return this;
        }

        @Override
        public AuditLogEvent build() {
            return new AuditLogEvent(id, userName, userEmail, role, ipAddress, eventType, eventDescription, createdAt);
        }
    }
}

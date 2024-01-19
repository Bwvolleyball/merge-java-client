/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.merge.api.resources.filestorage.audittrail.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.merge.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = AuditTrailListRequest.Builder.class)
public final class AuditTrailListRequest {
    private final Optional<String> cursor;

    private final Optional<String> endDate;

    private final Optional<String> eventType;

    private final Optional<Integer> pageSize;

    private final Optional<String> startDate;

    private final Optional<String> userEmail;

    private final Map<String, Object> additionalProperties;

    private AuditTrailListRequest(
            Optional<String> cursor,
            Optional<String> endDate,
            Optional<String> eventType,
            Optional<Integer> pageSize,
            Optional<String> startDate,
            Optional<String> userEmail,
            Map<String, Object> additionalProperties) {
        this.cursor = cursor;
        this.endDate = endDate;
        this.eventType = eventType;
        this.pageSize = pageSize;
        this.startDate = startDate;
        this.userEmail = userEmail;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The pagination cursor value.
     */
    @JsonProperty("cursor")
    public Optional<String> getCursor() {
        return cursor;
    }

    /**
     * @return If included, will only include audit trail events that occurred before this time
     */
    @JsonProperty("end_date")
    public Optional<String> getEndDate() {
        return endDate;
    }

    /**
     * @return If included, will only include events with the given event type. Possible values include: <code>CREATED_REMOTE_PRODUCTION_API_KEY</code>, <code>DELETED_REMOTE_PRODUCTION_API_KEY</code>, <code>CREATED_TEST_API_KEY</code>, <code>DELETED_TEST_API_KEY</code>, <code>REGENERATED_PRODUCTION_API_KEY</code>, <code>INVITED_USER</code>, <code>TWO_FACTOR_AUTH_ENABLED</code>, <code>TWO_FACTOR_AUTH_DISABLED</code>, <code>DELETED_LINKED_ACCOUNT</code>, <code>CREATED_DESTINATION</code>, <code>DELETED_DESTINATION</code>, <code>CHANGED_SCOPES</code>, <code>CHANGED_PERSONAL_INFORMATION</code>, <code>CHANGED_ORGANIZATION_SETTINGS</code>, <code>ENABLED_INTEGRATION</code>, <code>DISABLED_INTEGRATION</code>, <code>ENABLED_CATEGORY</code>, <code>DISABLED_CATEGORY</code>, <code>CHANGED_PASSWORD</code>, <code>RESET_PASSWORD</code>, <code>ENABLED_REDACT_UNMAPPED_DATA_FOR_ORGANIZATION</code>, <code>ENABLED_REDACT_UNMAPPED_DATA_FOR_LINKED_ACCOUNT</code>, <code>DISABLED_REDACT_UNMAPPED_DATA_FOR_ORGANIZATION</code>, <code>DISABLED_REDACT_UNMAPPED_DATA_FOR_LINKED_ACCOUNT</code>, <code>CREATED_INTEGRATION_WIDE_FIELD_MAPPING</code>, <code>CREATED_LINKED_ACCOUNT_FIELD_MAPPING</code>, <code>CHANGED_INTEGRATION_WIDE_FIELD_MAPPING</code>, <code>CHANGED_LINKED_ACCOUNT_FIELD_MAPPING</code>, <code>DELETED_INTEGRATION_WIDE_FIELD_MAPPING</code>, <code>DELETED_LINKED_ACCOUNT_FIELD_MAPPING</code>
     */
    @JsonProperty("event_type")
    public Optional<String> getEventType() {
        return eventType;
    }

    /**
     * @return Number of results to return per page.
     */
    @JsonProperty("page_size")
    public Optional<Integer> getPageSize() {
        return pageSize;
    }

    /**
     * @return If included, will only include audit trail events that occurred after this time
     */
    @JsonProperty("start_date")
    public Optional<String> getStartDate() {
        return startDate;
    }

    /**
     * @return If provided, this will return events associated with the specified user email. Please note that the email address reflects the user's email at the time of the event, and may not be their current email.
     */
    @JsonProperty("user_email")
    public Optional<String> getUserEmail() {
        return userEmail;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AuditTrailListRequest && equalTo((AuditTrailListRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(AuditTrailListRequest other) {
        return cursor.equals(other.cursor)
                && endDate.equals(other.endDate)
                && eventType.equals(other.eventType)
                && pageSize.equals(other.pageSize)
                && startDate.equals(other.startDate)
                && userEmail.equals(other.userEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.cursor, this.endDate, this.eventType, this.pageSize, this.startDate, this.userEmail);
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
        private Optional<String> cursor = Optional.empty();

        private Optional<String> endDate = Optional.empty();

        private Optional<String> eventType = Optional.empty();

        private Optional<Integer> pageSize = Optional.empty();

        private Optional<String> startDate = Optional.empty();

        private Optional<String> userEmail = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(AuditTrailListRequest other) {
            cursor(other.getCursor());
            endDate(other.getEndDate());
            eventType(other.getEventType());
            pageSize(other.getPageSize());
            startDate(other.getStartDate());
            userEmail(other.getUserEmail());
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

        @JsonSetter(value = "end_date", nulls = Nulls.SKIP)
        public Builder endDate(Optional<String> endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder endDate(String endDate) {
            this.endDate = Optional.of(endDate);
            return this;
        }

        @JsonSetter(value = "event_type", nulls = Nulls.SKIP)
        public Builder eventType(Optional<String> eventType) {
            this.eventType = eventType;
            return this;
        }

        public Builder eventType(String eventType) {
            this.eventType = Optional.of(eventType);
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

        @JsonSetter(value = "start_date", nulls = Nulls.SKIP)
        public Builder startDate(Optional<String> startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder startDate(String startDate) {
            this.startDate = Optional.of(startDate);
            return this;
        }

        @JsonSetter(value = "user_email", nulls = Nulls.SKIP)
        public Builder userEmail(Optional<String> userEmail) {
            this.userEmail = userEmail;
            return this;
        }

        public Builder userEmail(String userEmail) {
            this.userEmail = Optional.of(userEmail);
            return this;
        }

        public AuditTrailListRequest build() {
            return new AuditTrailListRequest(
                    cursor, endDate, eventType, pageSize, startDate, userEmail, additionalProperties);
        }
    }
}

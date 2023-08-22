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
@JsonDeserialize(builder = Task.Builder.class)
public final class Task {
    private final Optional<String> subject;

    private final Optional<String> content;

    private final Optional<TaskOwner> owner;

    private final Optional<TaskAccount> account;

    private final Optional<TaskOpportunity> opportunity;

    private final Optional<OffsetDateTime> completedDate;

    private final Optional<OffsetDateTime> dueDate;

    private final Optional<TaskStatus> status;

    private final Optional<Boolean> remoteWasDeleted;

    private final Optional<String> id;

    private final Optional<String> remoteId;

    private final Optional<OffsetDateTime> modifiedAt;

    private final Optional<Map<String, JsonNode>> fieldMappings;

    private final Optional<List<RemoteData>> remoteData;

    private final Optional<List<RemoteField>> remoteFields;

    private Task(
            Optional<String> subject,
            Optional<String> content,
            Optional<TaskOwner> owner,
            Optional<TaskAccount> account,
            Optional<TaskOpportunity> opportunity,
            Optional<OffsetDateTime> completedDate,
            Optional<OffsetDateTime> dueDate,
            Optional<TaskStatus> status,
            Optional<Boolean> remoteWasDeleted,
            Optional<String> id,
            Optional<String> remoteId,
            Optional<OffsetDateTime> modifiedAt,
            Optional<Map<String, JsonNode>> fieldMappings,
            Optional<List<RemoteData>> remoteData,
            Optional<List<RemoteField>> remoteFields) {
        this.subject = subject;
        this.content = content;
        this.owner = owner;
        this.account = account;
        this.opportunity = opportunity;
        this.completedDate = completedDate;
        this.dueDate = dueDate;
        this.status = status;
        this.remoteWasDeleted = remoteWasDeleted;
        this.id = id;
        this.remoteId = remoteId;
        this.modifiedAt = modifiedAt;
        this.fieldMappings = fieldMappings;
        this.remoteData = remoteData;
        this.remoteFields = remoteFields;
    }

    /**
     * @return The task's subject.
     */
    @JsonProperty("subject")
    public Optional<String> getSubject() {
        return subject;
    }

    /**
     * @return The task's content.
     */
    @JsonProperty("content")
    public Optional<String> getContent() {
        return content;
    }

    /**
     * @return The task's owner.
     */
    @JsonProperty("owner")
    public Optional<TaskOwner> getOwner() {
        return owner;
    }

    /**
     * @return The task's account.
     */
    @JsonProperty("account")
    public Optional<TaskAccount> getAccount() {
        return account;
    }

    /**
     * @return The task's opportunity.
     */
    @JsonProperty("opportunity")
    public Optional<TaskOpportunity> getOpportunity() {
        return opportunity;
    }

    /**
     * @return When the task is completed.
     */
    @JsonProperty("completed_date")
    public Optional<OffsetDateTime> getCompletedDate() {
        return completedDate;
    }

    /**
     * @return When the task is due.
     */
    @JsonProperty("due_date")
    public Optional<OffsetDateTime> getDueDate() {
        return dueDate;
    }

    /**
     * @return The task's status.
     * <ul>
     * <li><code>OPEN</code> - OPEN</li>
     * <li><code>CLOSED</code> - CLOSED</li>
     * </ul>
     */
    @JsonProperty("status")
    public Optional<TaskStatus> getStatus() {
        return status;
    }

    /**
     * @return Indicates whether or not this object has been deleted by third party webhooks.
     */
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
        return other instanceof Task && equalTo((Task) other);
    }

    private boolean equalTo(Task other) {
        return subject.equals(other.subject)
                && content.equals(other.content)
                && owner.equals(other.owner)
                && account.equals(other.account)
                && opportunity.equals(other.opportunity)
                && completedDate.equals(other.completedDate)
                && dueDate.equals(other.dueDate)
                && status.equals(other.status)
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
                this.subject,
                this.content,
                this.owner,
                this.account,
                this.opportunity,
                this.completedDate,
                this.dueDate,
                this.status,
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
        private Optional<String> subject = Optional.empty();

        private Optional<String> content = Optional.empty();

        private Optional<TaskOwner> owner = Optional.empty();

        private Optional<TaskAccount> account = Optional.empty();

        private Optional<TaskOpportunity> opportunity = Optional.empty();

        private Optional<OffsetDateTime> completedDate = Optional.empty();

        private Optional<OffsetDateTime> dueDate = Optional.empty();

        private Optional<TaskStatus> status = Optional.empty();

        private Optional<Boolean> remoteWasDeleted = Optional.empty();

        private Optional<String> id = Optional.empty();

        private Optional<String> remoteId = Optional.empty();

        private Optional<OffsetDateTime> modifiedAt = Optional.empty();

        private Optional<Map<String, JsonNode>> fieldMappings = Optional.empty();

        private Optional<List<RemoteData>> remoteData = Optional.empty();

        private Optional<List<RemoteField>> remoteFields = Optional.empty();

        private Builder() {}

        public Builder from(Task other) {
            subject(other.getSubject());
            content(other.getContent());
            owner(other.getOwner());
            account(other.getAccount());
            opportunity(other.getOpportunity());
            completedDate(other.getCompletedDate());
            dueDate(other.getDueDate());
            status(other.getStatus());
            remoteWasDeleted(other.getRemoteWasDeleted());
            id(other.getId());
            remoteId(other.getRemoteId());
            modifiedAt(other.getModifiedAt());
            fieldMappings(other.getFieldMappings());
            remoteData(other.getRemoteData());
            remoteFields(other.getRemoteFields());
            return this;
        }

        @JsonSetter(value = "subject", nulls = Nulls.SKIP)
        public Builder subject(Optional<String> subject) {
            this.subject = subject;
            return this;
        }

        public Builder subject(String subject) {
            this.subject = Optional.of(subject);
            return this;
        }

        @JsonSetter(value = "content", nulls = Nulls.SKIP)
        public Builder content(Optional<String> content) {
            this.content = content;
            return this;
        }

        public Builder content(String content) {
            this.content = Optional.of(content);
            return this;
        }

        @JsonSetter(value = "owner", nulls = Nulls.SKIP)
        public Builder owner(Optional<TaskOwner> owner) {
            this.owner = owner;
            return this;
        }

        public Builder owner(TaskOwner owner) {
            this.owner = Optional.of(owner);
            return this;
        }

        @JsonSetter(value = "account", nulls = Nulls.SKIP)
        public Builder account(Optional<TaskAccount> account) {
            this.account = account;
            return this;
        }

        public Builder account(TaskAccount account) {
            this.account = Optional.of(account);
            return this;
        }

        @JsonSetter(value = "opportunity", nulls = Nulls.SKIP)
        public Builder opportunity(Optional<TaskOpportunity> opportunity) {
            this.opportunity = opportunity;
            return this;
        }

        public Builder opportunity(TaskOpportunity opportunity) {
            this.opportunity = Optional.of(opportunity);
            return this;
        }

        @JsonSetter(value = "completed_date", nulls = Nulls.SKIP)
        public Builder completedDate(Optional<OffsetDateTime> completedDate) {
            this.completedDate = completedDate;
            return this;
        }

        public Builder completedDate(OffsetDateTime completedDate) {
            this.completedDate = Optional.of(completedDate);
            return this;
        }

        @JsonSetter(value = "due_date", nulls = Nulls.SKIP)
        public Builder dueDate(Optional<OffsetDateTime> dueDate) {
            this.dueDate = dueDate;
            return this;
        }

        public Builder dueDate(OffsetDateTime dueDate) {
            this.dueDate = Optional.of(dueDate);
            return this;
        }

        @JsonSetter(value = "status", nulls = Nulls.SKIP)
        public Builder status(Optional<TaskStatus> status) {
            this.status = status;
            return this;
        }

        public Builder status(TaskStatus status) {
            this.status = Optional.of(status);
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

        public Task build() {
            return new Task(
                    subject,
                    content,
                    owner,
                    account,
                    opportunity,
                    completedDate,
                    dueDate,
                    status,
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

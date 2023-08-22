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
@JsonDeserialize(builder = TaskRequest.Builder.class)
public final class TaskRequest {
    private final Optional<String> subject;

    private final Optional<String> content;

    private final Optional<TaskRequestOwner> owner;

    private final Optional<TaskRequestAccount> account;

    private final Optional<TaskRequestOpportunity> opportunity;

    private final Optional<OffsetDateTime> completedDate;

    private final Optional<OffsetDateTime> dueDate;

    private final Optional<TaskRequestStatus> status;

    private final Optional<Map<String, JsonNode>> integrationParams;

    private final Optional<Map<String, JsonNode>> linkedAccountParams;

    private final Optional<List<RemoteFieldRequest>> remoteFields;

    private TaskRequest(
            Optional<String> subject,
            Optional<String> content,
            Optional<TaskRequestOwner> owner,
            Optional<TaskRequestAccount> account,
            Optional<TaskRequestOpportunity> opportunity,
            Optional<OffsetDateTime> completedDate,
            Optional<OffsetDateTime> dueDate,
            Optional<TaskRequestStatus> status,
            Optional<Map<String, JsonNode>> integrationParams,
            Optional<Map<String, JsonNode>> linkedAccountParams,
            Optional<List<RemoteFieldRequest>> remoteFields) {
        this.subject = subject;
        this.content = content;
        this.owner = owner;
        this.account = account;
        this.opportunity = opportunity;
        this.completedDate = completedDate;
        this.dueDate = dueDate;
        this.status = status;
        this.integrationParams = integrationParams;
        this.linkedAccountParams = linkedAccountParams;
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
    public Optional<TaskRequestOwner> getOwner() {
        return owner;
    }

    /**
     * @return The task's account.
     */
    @JsonProperty("account")
    public Optional<TaskRequestAccount> getAccount() {
        return account;
    }

    /**
     * @return The task's opportunity.
     */
    @JsonProperty("opportunity")
    public Optional<TaskRequestOpportunity> getOpportunity() {
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
    public Optional<TaskRequestStatus> getStatus() {
        return status;
    }

    @JsonProperty("integration_params")
    public Optional<Map<String, JsonNode>> getIntegrationParams() {
        return integrationParams;
    }

    @JsonProperty("linked_account_params")
    public Optional<Map<String, JsonNode>> getLinkedAccountParams() {
        return linkedAccountParams;
    }

    @JsonProperty("remote_fields")
    public Optional<List<RemoteFieldRequest>> getRemoteFields() {
        return remoteFields;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TaskRequest && equalTo((TaskRequest) other);
    }

    private boolean equalTo(TaskRequest other) {
        return subject.equals(other.subject)
                && content.equals(other.content)
                && owner.equals(other.owner)
                && account.equals(other.account)
                && opportunity.equals(other.opportunity)
                && completedDate.equals(other.completedDate)
                && dueDate.equals(other.dueDate)
                && status.equals(other.status)
                && integrationParams.equals(other.integrationParams)
                && linkedAccountParams.equals(other.linkedAccountParams)
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
                this.integrationParams,
                this.linkedAccountParams,
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

        private Optional<TaskRequestOwner> owner = Optional.empty();

        private Optional<TaskRequestAccount> account = Optional.empty();

        private Optional<TaskRequestOpportunity> opportunity = Optional.empty();

        private Optional<OffsetDateTime> completedDate = Optional.empty();

        private Optional<OffsetDateTime> dueDate = Optional.empty();

        private Optional<TaskRequestStatus> status = Optional.empty();

        private Optional<Map<String, JsonNode>> integrationParams = Optional.empty();

        private Optional<Map<String, JsonNode>> linkedAccountParams = Optional.empty();

        private Optional<List<RemoteFieldRequest>> remoteFields = Optional.empty();

        private Builder() {}

        public Builder from(TaskRequest other) {
            subject(other.getSubject());
            content(other.getContent());
            owner(other.getOwner());
            account(other.getAccount());
            opportunity(other.getOpportunity());
            completedDate(other.getCompletedDate());
            dueDate(other.getDueDate());
            status(other.getStatus());
            integrationParams(other.getIntegrationParams());
            linkedAccountParams(other.getLinkedAccountParams());
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
        public Builder owner(Optional<TaskRequestOwner> owner) {
            this.owner = owner;
            return this;
        }

        public Builder owner(TaskRequestOwner owner) {
            this.owner = Optional.of(owner);
            return this;
        }

        @JsonSetter(value = "account", nulls = Nulls.SKIP)
        public Builder account(Optional<TaskRequestAccount> account) {
            this.account = account;
            return this;
        }

        public Builder account(TaskRequestAccount account) {
            this.account = Optional.of(account);
            return this;
        }

        @JsonSetter(value = "opportunity", nulls = Nulls.SKIP)
        public Builder opportunity(Optional<TaskRequestOpportunity> opportunity) {
            this.opportunity = opportunity;
            return this;
        }

        public Builder opportunity(TaskRequestOpportunity opportunity) {
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
        public Builder status(Optional<TaskRequestStatus> status) {
            this.status = status;
            return this;
        }

        public Builder status(TaskRequestStatus status) {
            this.status = Optional.of(status);
            return this;
        }

        @JsonSetter(value = "integration_params", nulls = Nulls.SKIP)
        public Builder integrationParams(Optional<Map<String, JsonNode>> integrationParams) {
            this.integrationParams = integrationParams;
            return this;
        }

        public Builder integrationParams(Map<String, JsonNode> integrationParams) {
            this.integrationParams = Optional.of(integrationParams);
            return this;
        }

        @JsonSetter(value = "linked_account_params", nulls = Nulls.SKIP)
        public Builder linkedAccountParams(Optional<Map<String, JsonNode>> linkedAccountParams) {
            this.linkedAccountParams = linkedAccountParams;
            return this;
        }

        public Builder linkedAccountParams(Map<String, JsonNode> linkedAccountParams) {
            this.linkedAccountParams = Optional.of(linkedAccountParams);
            return this;
        }

        @JsonSetter(value = "remote_fields", nulls = Nulls.SKIP)
        public Builder remoteFields(Optional<List<RemoteFieldRequest>> remoteFields) {
            this.remoteFields = remoteFields;
            return this;
        }

        public Builder remoteFields(List<RemoteFieldRequest> remoteFields) {
            this.remoteFields = Optional.of(remoteFields);
            return this;
        }

        public TaskRequest build() {
            return new TaskRequest(
                    subject,
                    content,
                    owner,
                    account,
                    opportunity,
                    completedDate,
                    dueDate,
                    status,
                    integrationParams,
                    linkedAccountParams,
                    remoteFields);
        }
    }
}

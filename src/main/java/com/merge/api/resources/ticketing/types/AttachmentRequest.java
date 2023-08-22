package com.merge.api.resources.ticketing.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.merge.api.core.ObjectMappers;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = AttachmentRequest.Builder.class)
public final class AttachmentRequest {
    private final Optional<String> fileName;

    private final Optional<AttachmentRequestTicket> ticket;

    private final Optional<String> fileUrl;

    private final Optional<String> contentType;

    private final Optional<String> uploadedBy;

    private final Optional<Map<String, JsonNode>> integrationParams;

    private final Optional<Map<String, JsonNode>> linkedAccountParams;

    private AttachmentRequest(
            Optional<String> fileName,
            Optional<AttachmentRequestTicket> ticket,
            Optional<String> fileUrl,
            Optional<String> contentType,
            Optional<String> uploadedBy,
            Optional<Map<String, JsonNode>> integrationParams,
            Optional<Map<String, JsonNode>> linkedAccountParams) {
        this.fileName = fileName;
        this.ticket = ticket;
        this.fileUrl = fileUrl;
        this.contentType = contentType;
        this.uploadedBy = uploadedBy;
        this.integrationParams = integrationParams;
        this.linkedAccountParams = linkedAccountParams;
    }

    /**
     * @return The attachment's name. It is required to include the file extension in the attachment's name.
     */
    @JsonProperty("file_name")
    public Optional<String> getFileName() {
        return fileName;
    }

    /**
     * @return The ticket associated with the attachment.
     */
    @JsonProperty("ticket")
    public Optional<AttachmentRequestTicket> getTicket() {
        return ticket;
    }

    /**
     * @return The attachment's url. It is required to include the file extension in the file's URL.
     */
    @JsonProperty("file_url")
    public Optional<String> getFileUrl() {
        return fileUrl;
    }

    /**
     * @return The attachment's file format.
     */
    @JsonProperty("content_type")
    public Optional<String> getContentType() {
        return contentType;
    }

    /**
     * @return The user who uploaded the attachment.
     */
    @JsonProperty("uploaded_by")
    public Optional<String> getUploadedBy() {
        return uploadedBy;
    }

    @JsonProperty("integration_params")
    public Optional<Map<String, JsonNode>> getIntegrationParams() {
        return integrationParams;
    }

    @JsonProperty("linked_account_params")
    public Optional<Map<String, JsonNode>> getLinkedAccountParams() {
        return linkedAccountParams;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AttachmentRequest && equalTo((AttachmentRequest) other);
    }

    private boolean equalTo(AttachmentRequest other) {
        return fileName.equals(other.fileName)
                && ticket.equals(other.ticket)
                && fileUrl.equals(other.fileUrl)
                && contentType.equals(other.contentType)
                && uploadedBy.equals(other.uploadedBy)
                && integrationParams.equals(other.integrationParams)
                && linkedAccountParams.equals(other.linkedAccountParams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.fileName,
                this.ticket,
                this.fileUrl,
                this.contentType,
                this.uploadedBy,
                this.integrationParams,
                this.linkedAccountParams);
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
        private Optional<String> fileName = Optional.empty();

        private Optional<AttachmentRequestTicket> ticket = Optional.empty();

        private Optional<String> fileUrl = Optional.empty();

        private Optional<String> contentType = Optional.empty();

        private Optional<String> uploadedBy = Optional.empty();

        private Optional<Map<String, JsonNode>> integrationParams = Optional.empty();

        private Optional<Map<String, JsonNode>> linkedAccountParams = Optional.empty();

        private Builder() {}

        public Builder from(AttachmentRequest other) {
            fileName(other.getFileName());
            ticket(other.getTicket());
            fileUrl(other.getFileUrl());
            contentType(other.getContentType());
            uploadedBy(other.getUploadedBy());
            integrationParams(other.getIntegrationParams());
            linkedAccountParams(other.getLinkedAccountParams());
            return this;
        }

        @JsonSetter(value = "file_name", nulls = Nulls.SKIP)
        public Builder fileName(Optional<String> fileName) {
            this.fileName = fileName;
            return this;
        }

        public Builder fileName(String fileName) {
            this.fileName = Optional.of(fileName);
            return this;
        }

        @JsonSetter(value = "ticket", nulls = Nulls.SKIP)
        public Builder ticket(Optional<AttachmentRequestTicket> ticket) {
            this.ticket = ticket;
            return this;
        }

        public Builder ticket(AttachmentRequestTicket ticket) {
            this.ticket = Optional.of(ticket);
            return this;
        }

        @JsonSetter(value = "file_url", nulls = Nulls.SKIP)
        public Builder fileUrl(Optional<String> fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }

        public Builder fileUrl(String fileUrl) {
            this.fileUrl = Optional.of(fileUrl);
            return this;
        }

        @JsonSetter(value = "content_type", nulls = Nulls.SKIP)
        public Builder contentType(Optional<String> contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder contentType(String contentType) {
            this.contentType = Optional.of(contentType);
            return this;
        }

        @JsonSetter(value = "uploaded_by", nulls = Nulls.SKIP)
        public Builder uploadedBy(Optional<String> uploadedBy) {
            this.uploadedBy = uploadedBy;
            return this;
        }

        public Builder uploadedBy(String uploadedBy) {
            this.uploadedBy = Optional.of(uploadedBy);
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

        public AttachmentRequest build() {
            return new AttachmentRequest(
                    fileName, ticket, fileUrl, contentType, uploadedBy, integrationParams, linkedAccountParams);
        }
    }
}

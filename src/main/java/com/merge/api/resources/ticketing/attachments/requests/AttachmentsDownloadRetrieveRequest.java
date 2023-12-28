package com.merge.api.resources.ticketing.attachments.requests;

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
@JsonDeserialize(builder = AttachmentsDownloadRetrieveRequest.Builder.class)
public final class AttachmentsDownloadRetrieveRequest {
    private final Optional<String> mimeType;

    private AttachmentsDownloadRetrieveRequest(Optional<String> mimeType) {
        this.mimeType = mimeType;
    }

    /**
     * @return If provided, specifies the export format of the file to be downloaded. For information on supported export formats, please refer to our &lt;a href='https://help.merge.dev/en/articles/8615316-file-export-and-download-specification' target='_blank'&gt;export format help center article&lt;/a&gt;.
     */
    @JsonProperty("mime_type")
    public Optional<String> getMimeType() {
        return mimeType;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AttachmentsDownloadRetrieveRequest
                && equalTo((AttachmentsDownloadRetrieveRequest) other);
    }

    private boolean equalTo(AttachmentsDownloadRetrieveRequest other) {
        return mimeType.equals(other.mimeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.mimeType);
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
        private Optional<String> mimeType = Optional.empty();

        private Builder() {}

        public Builder from(AttachmentsDownloadRetrieveRequest other) {
            mimeType(other.getMimeType());
            return this;
        }

        @JsonSetter(value = "mime_type", nulls = Nulls.SKIP)
        public Builder mimeType(Optional<String> mimeType) {
            this.mimeType = mimeType;
            return this;
        }

        public Builder mimeType(String mimeType) {
            this.mimeType = Optional.of(mimeType);
            return this;
        }

        public AttachmentsDownloadRetrieveRequest build() {
            return new AttachmentsDownloadRetrieveRequest(mimeType);
        }
    }
}

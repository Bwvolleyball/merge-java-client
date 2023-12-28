package com.merge.api.resources.hris.timesheetentries.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.merge.api.core.ObjectMappers;
import com.merge.api.resources.hris.timesheetentries.types.TimesheetEntriesListRequestOrderBy;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = TimesheetEntriesListRequest.Builder.class)
public final class TimesheetEntriesListRequest {
    private final Optional<OffsetDateTime> createdAfter;

    private final Optional<OffsetDateTime> createdBefore;

    private final Optional<String> cursor;

    private final Optional<String> employeeId;

    private final Optional<String> endedAfter;

    private final Optional<String> endedBefore;

    private final Optional<Boolean> includeDeletedData;

    private final Optional<Boolean> includeRemoteData;

    private final Optional<OffsetDateTime> modifiedAfter;

    private final Optional<OffsetDateTime> modifiedBefore;

    private final Optional<TimesheetEntriesListRequestOrderBy> orderBy;

    private final Optional<Integer> pageSize;

    private final Optional<String> remoteId;

    private final Optional<String> startedAfter;

    private final Optional<String> startedBefore;

    private TimesheetEntriesListRequest(
            Optional<OffsetDateTime> createdAfter,
            Optional<OffsetDateTime> createdBefore,
            Optional<String> cursor,
            Optional<String> employeeId,
            Optional<String> endedAfter,
            Optional<String> endedBefore,
            Optional<Boolean> includeDeletedData,
            Optional<Boolean> includeRemoteData,
            Optional<OffsetDateTime> modifiedAfter,
            Optional<OffsetDateTime> modifiedBefore,
            Optional<TimesheetEntriesListRequestOrderBy> orderBy,
            Optional<Integer> pageSize,
            Optional<String> remoteId,
            Optional<String> startedAfter,
            Optional<String> startedBefore) {
        this.createdAfter = createdAfter;
        this.createdBefore = createdBefore;
        this.cursor = cursor;
        this.employeeId = employeeId;
        this.endedAfter = endedAfter;
        this.endedBefore = endedBefore;
        this.includeDeletedData = includeDeletedData;
        this.includeRemoteData = includeRemoteData;
        this.modifiedAfter = modifiedAfter;
        this.modifiedBefore = modifiedBefore;
        this.orderBy = orderBy;
        this.pageSize = pageSize;
        this.remoteId = remoteId;
        this.startedAfter = startedAfter;
        this.startedBefore = startedBefore;
    }

    /**
     * @return If provided, will only return objects created after this datetime.
     */
    @JsonProperty("created_after")
    public Optional<OffsetDateTime> getCreatedAfter() {
        return createdAfter;
    }

    /**
     * @return If provided, will only return objects created before this datetime.
     */
    @JsonProperty("created_before")
    public Optional<OffsetDateTime> getCreatedBefore() {
        return createdBefore;
    }

    /**
     * @return The pagination cursor value.
     */
    @JsonProperty("cursor")
    public Optional<String> getCursor() {
        return cursor;
    }

    /**
     * @return If provided, will only return employee payroll runs for this employee.
     */
    @JsonProperty("employee_id")
    public Optional<String> getEmployeeId() {
        return employeeId;
    }

    /**
     * @return If provided, will only return employee payroll runs ended after this datetime.
     */
    @JsonProperty("ended_after")
    public Optional<String> getEndedAfter() {
        return endedAfter;
    }

    /**
     * @return If provided, will only return employee payroll runs ended before this datetime.
     */
    @JsonProperty("ended_before")
    public Optional<String> getEndedBefore() {
        return endedBefore;
    }

    /**
     * @return Whether to include data that was marked as deleted by third party webhooks.
     */
    @JsonProperty("include_deleted_data")
    public Optional<Boolean> getIncludeDeletedData() {
        return includeDeletedData;
    }

    /**
     * @return Whether to include the original data Merge fetched from the third-party to produce these models.
     */
    @JsonProperty("include_remote_data")
    public Optional<Boolean> getIncludeRemoteData() {
        return includeRemoteData;
    }

    /**
     * @return If provided, only objects synced by Merge after this date time will be returned.
     */
    @JsonProperty("modified_after")
    public Optional<OffsetDateTime> getModifiedAfter() {
        return modifiedAfter;
    }

    /**
     * @return If provided, only objects synced by Merge before this date time will be returned.
     */
    @JsonProperty("modified_before")
    public Optional<OffsetDateTime> getModifiedBefore() {
        return modifiedBefore;
    }

    /**
     * @return Overrides the default ordering for this endpoint. Possible values include: start_time, -start_time.
     */
    @JsonProperty("order_by")
    public Optional<TimesheetEntriesListRequestOrderBy> getOrderBy() {
        return orderBy;
    }

    /**
     * @return Number of results to return per page.
     */
    @JsonProperty("page_size")
    public Optional<Integer> getPageSize() {
        return pageSize;
    }

    /**
     * @return The API provider's ID for the given object.
     */
    @JsonProperty("remote_id")
    public Optional<String> getRemoteId() {
        return remoteId;
    }

    /**
     * @return If provided, will only return employee payroll runs started after this datetime.
     */
    @JsonProperty("started_after")
    public Optional<String> getStartedAfter() {
        return startedAfter;
    }

    /**
     * @return If provided, will only return employee payroll runs started before this datetime.
     */
    @JsonProperty("started_before")
    public Optional<String> getStartedBefore() {
        return startedBefore;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TimesheetEntriesListRequest && equalTo((TimesheetEntriesListRequest) other);
    }

    private boolean equalTo(TimesheetEntriesListRequest other) {
        return createdAfter.equals(other.createdAfter)
                && createdBefore.equals(other.createdBefore)
                && cursor.equals(other.cursor)
                && employeeId.equals(other.employeeId)
                && endedAfter.equals(other.endedAfter)
                && endedBefore.equals(other.endedBefore)
                && includeDeletedData.equals(other.includeDeletedData)
                && includeRemoteData.equals(other.includeRemoteData)
                && modifiedAfter.equals(other.modifiedAfter)
                && modifiedBefore.equals(other.modifiedBefore)
                && orderBy.equals(other.orderBy)
                && pageSize.equals(other.pageSize)
                && remoteId.equals(other.remoteId)
                && startedAfter.equals(other.startedAfter)
                && startedBefore.equals(other.startedBefore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.createdAfter,
                this.createdBefore,
                this.cursor,
                this.employeeId,
                this.endedAfter,
                this.endedBefore,
                this.includeDeletedData,
                this.includeRemoteData,
                this.modifiedAfter,
                this.modifiedBefore,
                this.orderBy,
                this.pageSize,
                this.remoteId,
                this.startedAfter,
                this.startedBefore);
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
        private Optional<OffsetDateTime> createdAfter = Optional.empty();

        private Optional<OffsetDateTime> createdBefore = Optional.empty();

        private Optional<String> cursor = Optional.empty();

        private Optional<String> employeeId = Optional.empty();

        private Optional<String> endedAfter = Optional.empty();

        private Optional<String> endedBefore = Optional.empty();

        private Optional<Boolean> includeDeletedData = Optional.empty();

        private Optional<Boolean> includeRemoteData = Optional.empty();

        private Optional<OffsetDateTime> modifiedAfter = Optional.empty();

        private Optional<OffsetDateTime> modifiedBefore = Optional.empty();

        private Optional<TimesheetEntriesListRequestOrderBy> orderBy = Optional.empty();

        private Optional<Integer> pageSize = Optional.empty();

        private Optional<String> remoteId = Optional.empty();

        private Optional<String> startedAfter = Optional.empty();

        private Optional<String> startedBefore = Optional.empty();

        private Builder() {}

        public Builder from(TimesheetEntriesListRequest other) {
            createdAfter(other.getCreatedAfter());
            createdBefore(other.getCreatedBefore());
            cursor(other.getCursor());
            employeeId(other.getEmployeeId());
            endedAfter(other.getEndedAfter());
            endedBefore(other.getEndedBefore());
            includeDeletedData(other.getIncludeDeletedData());
            includeRemoteData(other.getIncludeRemoteData());
            modifiedAfter(other.getModifiedAfter());
            modifiedBefore(other.getModifiedBefore());
            orderBy(other.getOrderBy());
            pageSize(other.getPageSize());
            remoteId(other.getRemoteId());
            startedAfter(other.getStartedAfter());
            startedBefore(other.getStartedBefore());
            return this;
        }

        @JsonSetter(value = "created_after", nulls = Nulls.SKIP)
        public Builder createdAfter(Optional<OffsetDateTime> createdAfter) {
            this.createdAfter = createdAfter;
            return this;
        }

        public Builder createdAfter(OffsetDateTime createdAfter) {
            this.createdAfter = Optional.of(createdAfter);
            return this;
        }

        @JsonSetter(value = "created_before", nulls = Nulls.SKIP)
        public Builder createdBefore(Optional<OffsetDateTime> createdBefore) {
            this.createdBefore = createdBefore;
            return this;
        }

        public Builder createdBefore(OffsetDateTime createdBefore) {
            this.createdBefore = Optional.of(createdBefore);
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

        @JsonSetter(value = "employee_id", nulls = Nulls.SKIP)
        public Builder employeeId(Optional<String> employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        public Builder employeeId(String employeeId) {
            this.employeeId = Optional.of(employeeId);
            return this;
        }

        @JsonSetter(value = "ended_after", nulls = Nulls.SKIP)
        public Builder endedAfter(Optional<String> endedAfter) {
            this.endedAfter = endedAfter;
            return this;
        }

        public Builder endedAfter(String endedAfter) {
            this.endedAfter = Optional.of(endedAfter);
            return this;
        }

        @JsonSetter(value = "ended_before", nulls = Nulls.SKIP)
        public Builder endedBefore(Optional<String> endedBefore) {
            this.endedBefore = endedBefore;
            return this;
        }

        public Builder endedBefore(String endedBefore) {
            this.endedBefore = Optional.of(endedBefore);
            return this;
        }

        @JsonSetter(value = "include_deleted_data", nulls = Nulls.SKIP)
        public Builder includeDeletedData(Optional<Boolean> includeDeletedData) {
            this.includeDeletedData = includeDeletedData;
            return this;
        }

        public Builder includeDeletedData(Boolean includeDeletedData) {
            this.includeDeletedData = Optional.of(includeDeletedData);
            return this;
        }

        @JsonSetter(value = "include_remote_data", nulls = Nulls.SKIP)
        public Builder includeRemoteData(Optional<Boolean> includeRemoteData) {
            this.includeRemoteData = includeRemoteData;
            return this;
        }

        public Builder includeRemoteData(Boolean includeRemoteData) {
            this.includeRemoteData = Optional.of(includeRemoteData);
            return this;
        }

        @JsonSetter(value = "modified_after", nulls = Nulls.SKIP)
        public Builder modifiedAfter(Optional<OffsetDateTime> modifiedAfter) {
            this.modifiedAfter = modifiedAfter;
            return this;
        }

        public Builder modifiedAfter(OffsetDateTime modifiedAfter) {
            this.modifiedAfter = Optional.of(modifiedAfter);
            return this;
        }

        @JsonSetter(value = "modified_before", nulls = Nulls.SKIP)
        public Builder modifiedBefore(Optional<OffsetDateTime> modifiedBefore) {
            this.modifiedBefore = modifiedBefore;
            return this;
        }

        public Builder modifiedBefore(OffsetDateTime modifiedBefore) {
            this.modifiedBefore = Optional.of(modifiedBefore);
            return this;
        }

        @JsonSetter(value = "order_by", nulls = Nulls.SKIP)
        public Builder orderBy(Optional<TimesheetEntriesListRequestOrderBy> orderBy) {
            this.orderBy = orderBy;
            return this;
        }

        public Builder orderBy(TimesheetEntriesListRequestOrderBy orderBy) {
            this.orderBy = Optional.of(orderBy);
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

        @JsonSetter(value = "remote_id", nulls = Nulls.SKIP)
        public Builder remoteId(Optional<String> remoteId) {
            this.remoteId = remoteId;
            return this;
        }

        public Builder remoteId(String remoteId) {
            this.remoteId = Optional.of(remoteId);
            return this;
        }

        @JsonSetter(value = "started_after", nulls = Nulls.SKIP)
        public Builder startedAfter(Optional<String> startedAfter) {
            this.startedAfter = startedAfter;
            return this;
        }

        public Builder startedAfter(String startedAfter) {
            this.startedAfter = Optional.of(startedAfter);
            return this;
        }

        @JsonSetter(value = "started_before", nulls = Nulls.SKIP)
        public Builder startedBefore(Optional<String> startedBefore) {
            this.startedBefore = startedBefore;
            return this;
        }

        public Builder startedBefore(String startedBefore) {
            this.startedBefore = Optional.of(startedBefore);
            return this;
        }

        public TimesheetEntriesListRequest build() {
            return new TimesheetEntriesListRequest(
                    createdAfter,
                    createdBefore,
                    cursor,
                    employeeId,
                    endedAfter,
                    endedBefore,
                    includeDeletedData,
                    includeRemoteData,
                    modifiedAfter,
                    modifiedBefore,
                    orderBy,
                    pageSize,
                    remoteId,
                    startedAfter,
                    startedBefore);
        }
    }
}

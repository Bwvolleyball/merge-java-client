package com.merge.api.resources.hris.employees.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.merge.api.core.ObjectMappers;
import com.merge.api.resources.hris.employees.types.EmployeesListRequestEmploymentStatus;
import com.merge.api.resources.hris.employees.types.EmployeesListRequestExpand;
import com.merge.api.resources.hris.employees.types.EmployeesListRequestRemoteFields;
import com.merge.api.resources.hris.employees.types.EmployeesListRequestShowEnumOrigins;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = EmployeesListRequest.Builder.class)
public final class EmployeesListRequest {
    private final Optional<String> companyId;

    private final Optional<OffsetDateTime> createdAfter;

    private final Optional<OffsetDateTime> createdBefore;

    private final Optional<String> cursor;

    private final Optional<String> displayFullName;

    private final Optional<EmployeesListRequestEmploymentStatus> employmentStatus;

    private final Optional<String> employmentType;

    private final Optional<EmployeesListRequestExpand> expand;

    private final Optional<String> firstName;

    private final Optional<String> groups;

    private final Optional<String> homeLocationId;

    private final Optional<Boolean> includeDeletedData;

    private final Optional<Boolean> includeRemoteData;

    private final Optional<Boolean> includeSensitiveFields;

    private final Optional<String> jobTitle;

    private final Optional<String> lastName;

    private final Optional<String> managerId;

    private final Optional<OffsetDateTime> modifiedAfter;

    private final Optional<OffsetDateTime> modifiedBefore;

    private final Optional<Integer> pageSize;

    private final Optional<String> payGroupId;

    private final Optional<String> personalEmail;

    private final Optional<EmployeesListRequestRemoteFields> remoteFields;

    private final Optional<String> remoteId;

    private final Optional<EmployeesListRequestShowEnumOrigins> showEnumOrigins;

    private final Optional<OffsetDateTime> startedAfter;

    private final Optional<OffsetDateTime> startedBefore;

    private final Optional<String> teamId;

    private final Optional<OffsetDateTime> terminatedAfter;

    private final Optional<OffsetDateTime> terminatedBefore;

    private final Optional<String> workEmail;

    private final Optional<String> workLocationId;

    private EmployeesListRequest(
            Optional<String> companyId,
            Optional<OffsetDateTime> createdAfter,
            Optional<OffsetDateTime> createdBefore,
            Optional<String> cursor,
            Optional<String> displayFullName,
            Optional<EmployeesListRequestEmploymentStatus> employmentStatus,
            Optional<String> employmentType,
            Optional<EmployeesListRequestExpand> expand,
            Optional<String> firstName,
            Optional<String> groups,
            Optional<String> homeLocationId,
            Optional<Boolean> includeDeletedData,
            Optional<Boolean> includeRemoteData,
            Optional<Boolean> includeSensitiveFields,
            Optional<String> jobTitle,
            Optional<String> lastName,
            Optional<String> managerId,
            Optional<OffsetDateTime> modifiedAfter,
            Optional<OffsetDateTime> modifiedBefore,
            Optional<Integer> pageSize,
            Optional<String> payGroupId,
            Optional<String> personalEmail,
            Optional<EmployeesListRequestRemoteFields> remoteFields,
            Optional<String> remoteId,
            Optional<EmployeesListRequestShowEnumOrigins> showEnumOrigins,
            Optional<OffsetDateTime> startedAfter,
            Optional<OffsetDateTime> startedBefore,
            Optional<String> teamId,
            Optional<OffsetDateTime> terminatedAfter,
            Optional<OffsetDateTime> terminatedBefore,
            Optional<String> workEmail,
            Optional<String> workLocationId) {
        this.companyId = companyId;
        this.createdAfter = createdAfter;
        this.createdBefore = createdBefore;
        this.cursor = cursor;
        this.displayFullName = displayFullName;
        this.employmentStatus = employmentStatus;
        this.employmentType = employmentType;
        this.expand = expand;
        this.firstName = firstName;
        this.groups = groups;
        this.homeLocationId = homeLocationId;
        this.includeDeletedData = includeDeletedData;
        this.includeRemoteData = includeRemoteData;
        this.includeSensitiveFields = includeSensitiveFields;
        this.jobTitle = jobTitle;
        this.lastName = lastName;
        this.managerId = managerId;
        this.modifiedAfter = modifiedAfter;
        this.modifiedBefore = modifiedBefore;
        this.pageSize = pageSize;
        this.payGroupId = payGroupId;
        this.personalEmail = personalEmail;
        this.remoteFields = remoteFields;
        this.remoteId = remoteId;
        this.showEnumOrigins = showEnumOrigins;
        this.startedAfter = startedAfter;
        this.startedBefore = startedBefore;
        this.teamId = teamId;
        this.terminatedAfter = terminatedAfter;
        this.terminatedBefore = terminatedBefore;
        this.workEmail = workEmail;
        this.workLocationId = workLocationId;
    }

    /**
     * @return If provided, will only return employees for this company.
     */
    @JsonProperty("company_id")
    public Optional<String> getCompanyId() {
        return companyId;
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
     * @return If provided, will only return employees with this display name.
     */
    @JsonProperty("display_full_name")
    public Optional<String> getDisplayFullName() {
        return displayFullName;
    }

    /**
     * @return If provided, will only return employees with this employment status.
     * <ul>
     * <li><code>ACTIVE</code> - ACTIVE</li>
     * <li><code>PENDING</code> - PENDING</li>
     * <li><code>INACTIVE</code> - INACTIVE</li>
     * </ul>
     */
    @JsonProperty("employment_status")
    public Optional<EmployeesListRequestEmploymentStatus> getEmploymentStatus() {
        return employmentStatus;
    }

    /**
     * @return If provided, will only return employees that have an employment of the specified employment_type.
     */
    @JsonProperty("employment_type")
    public Optional<String> getEmploymentType() {
        return employmentType;
    }

    /**
     * @return Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
     */
    @JsonProperty("expand")
    public Optional<EmployeesListRequestExpand> getExpand() {
        return expand;
    }

    /**
     * @return If provided, will only return employees with this first name.
     */
    @JsonProperty("first_name")
    public Optional<String> getFirstName() {
        return firstName;
    }

    /**
     * @return If provided, will only return employees matching the group ids; multiple groups can be separated by commas.
     */
    @JsonProperty("groups")
    public Optional<String> getGroups() {
        return groups;
    }

    /**
     * @return If provided, will only return employees for this home location.
     */
    @JsonProperty("home_location_id")
    public Optional<String> getHomeLocationId() {
        return homeLocationId;
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
     * @return Whether to include sensitive fields (such as social security numbers) in the response.
     */
    @JsonProperty("include_sensitive_fields")
    public Optional<Boolean> getIncludeSensitiveFields() {
        return includeSensitiveFields;
    }

    /**
     * @return If provided, will only return employees that have an employment of the specified job_title.
     */
    @JsonProperty("job_title")
    public Optional<String> getJobTitle() {
        return jobTitle;
    }

    /**
     * @return If provided, will only return employees with this last name.
     */
    @JsonProperty("last_name")
    public Optional<String> getLastName() {
        return lastName;
    }

    /**
     * @return If provided, will only return employees for this manager.
     */
    @JsonProperty("manager_id")
    public Optional<String> getManagerId() {
        return managerId;
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
     * @return Number of results to return per page.
     */
    @JsonProperty("page_size")
    public Optional<Integer> getPageSize() {
        return pageSize;
    }

    /**
     * @return If provided, will only return employees for this pay group
     */
    @JsonProperty("pay_group_id")
    public Optional<String> getPayGroupId() {
        return payGroupId;
    }

    /**
     * @return If provided, will only return Employees with this personal email
     */
    @JsonProperty("personal_email")
    public Optional<String> getPersonalEmail() {
        return personalEmail;
    }

    /**
     * @return Deprecated. Use show_enum_origins.
     */
    @JsonProperty("remote_fields")
    public Optional<EmployeesListRequestRemoteFields> getRemoteFields() {
        return remoteFields;
    }

    /**
     * @return The API provider's ID for the given object.
     */
    @JsonProperty("remote_id")
    public Optional<String> getRemoteId() {
        return remoteId;
    }

    /**
     * @return Which fields should be returned in non-normalized form.
     */
    @JsonProperty("show_enum_origins")
    public Optional<EmployeesListRequestShowEnumOrigins> getShowEnumOrigins() {
        return showEnumOrigins;
    }

    /**
     * @return If provided, will only return employees that started after this datetime.
     */
    @JsonProperty("started_after")
    public Optional<OffsetDateTime> getStartedAfter() {
        return startedAfter;
    }

    /**
     * @return If provided, will only return employees that started before this datetime.
     */
    @JsonProperty("started_before")
    public Optional<OffsetDateTime> getStartedBefore() {
        return startedBefore;
    }

    /**
     * @return If provided, will only return employees for this team.
     */
    @JsonProperty("team_id")
    public Optional<String> getTeamId() {
        return teamId;
    }

    /**
     * @return If provided, will only return employees that were terminated after this datetime.
     */
    @JsonProperty("terminated_after")
    public Optional<OffsetDateTime> getTerminatedAfter() {
        return terminatedAfter;
    }

    /**
     * @return If provided, will only return employees that were terminated before this datetime.
     */
    @JsonProperty("terminated_before")
    public Optional<OffsetDateTime> getTerminatedBefore() {
        return terminatedBefore;
    }

    /**
     * @return If provided, will only return Employees with this work email
     */
    @JsonProperty("work_email")
    public Optional<String> getWorkEmail() {
        return workEmail;
    }

    /**
     * @return If provided, will only return employees for this location.
     */
    @JsonProperty("work_location_id")
    public Optional<String> getWorkLocationId() {
        return workLocationId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EmployeesListRequest && equalTo((EmployeesListRequest) other);
    }

    private boolean equalTo(EmployeesListRequest other) {
        return companyId.equals(other.companyId)
                && createdAfter.equals(other.createdAfter)
                && createdBefore.equals(other.createdBefore)
                && cursor.equals(other.cursor)
                && displayFullName.equals(other.displayFullName)
                && employmentStatus.equals(other.employmentStatus)
                && employmentType.equals(other.employmentType)
                && expand.equals(other.expand)
                && firstName.equals(other.firstName)
                && groups.equals(other.groups)
                && homeLocationId.equals(other.homeLocationId)
                && includeDeletedData.equals(other.includeDeletedData)
                && includeRemoteData.equals(other.includeRemoteData)
                && includeSensitiveFields.equals(other.includeSensitiveFields)
                && jobTitle.equals(other.jobTitle)
                && lastName.equals(other.lastName)
                && managerId.equals(other.managerId)
                && modifiedAfter.equals(other.modifiedAfter)
                && modifiedBefore.equals(other.modifiedBefore)
                && pageSize.equals(other.pageSize)
                && payGroupId.equals(other.payGroupId)
                && personalEmail.equals(other.personalEmail)
                && remoteFields.equals(other.remoteFields)
                && remoteId.equals(other.remoteId)
                && showEnumOrigins.equals(other.showEnumOrigins)
                && startedAfter.equals(other.startedAfter)
                && startedBefore.equals(other.startedBefore)
                && teamId.equals(other.teamId)
                && terminatedAfter.equals(other.terminatedAfter)
                && terminatedBefore.equals(other.terminatedBefore)
                && workEmail.equals(other.workEmail)
                && workLocationId.equals(other.workLocationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.companyId,
                this.createdAfter,
                this.createdBefore,
                this.cursor,
                this.displayFullName,
                this.employmentStatus,
                this.employmentType,
                this.expand,
                this.firstName,
                this.groups,
                this.homeLocationId,
                this.includeDeletedData,
                this.includeRemoteData,
                this.includeSensitiveFields,
                this.jobTitle,
                this.lastName,
                this.managerId,
                this.modifiedAfter,
                this.modifiedBefore,
                this.pageSize,
                this.payGroupId,
                this.personalEmail,
                this.remoteFields,
                this.remoteId,
                this.showEnumOrigins,
                this.startedAfter,
                this.startedBefore,
                this.teamId,
                this.terminatedAfter,
                this.terminatedBefore,
                this.workEmail,
                this.workLocationId);
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
        private Optional<String> companyId = Optional.empty();

        private Optional<OffsetDateTime> createdAfter = Optional.empty();

        private Optional<OffsetDateTime> createdBefore = Optional.empty();

        private Optional<String> cursor = Optional.empty();

        private Optional<String> displayFullName = Optional.empty();

        private Optional<EmployeesListRequestEmploymentStatus> employmentStatus = Optional.empty();

        private Optional<String> employmentType = Optional.empty();

        private Optional<EmployeesListRequestExpand> expand = Optional.empty();

        private Optional<String> firstName = Optional.empty();

        private Optional<String> groups = Optional.empty();

        private Optional<String> homeLocationId = Optional.empty();

        private Optional<Boolean> includeDeletedData = Optional.empty();

        private Optional<Boolean> includeRemoteData = Optional.empty();

        private Optional<Boolean> includeSensitiveFields = Optional.empty();

        private Optional<String> jobTitle = Optional.empty();

        private Optional<String> lastName = Optional.empty();

        private Optional<String> managerId = Optional.empty();

        private Optional<OffsetDateTime> modifiedAfter = Optional.empty();

        private Optional<OffsetDateTime> modifiedBefore = Optional.empty();

        private Optional<Integer> pageSize = Optional.empty();

        private Optional<String> payGroupId = Optional.empty();

        private Optional<String> personalEmail = Optional.empty();

        private Optional<EmployeesListRequestRemoteFields> remoteFields = Optional.empty();

        private Optional<String> remoteId = Optional.empty();

        private Optional<EmployeesListRequestShowEnumOrigins> showEnumOrigins = Optional.empty();

        private Optional<OffsetDateTime> startedAfter = Optional.empty();

        private Optional<OffsetDateTime> startedBefore = Optional.empty();

        private Optional<String> teamId = Optional.empty();

        private Optional<OffsetDateTime> terminatedAfter = Optional.empty();

        private Optional<OffsetDateTime> terminatedBefore = Optional.empty();

        private Optional<String> workEmail = Optional.empty();

        private Optional<String> workLocationId = Optional.empty();

        private Builder() {}

        public Builder from(EmployeesListRequest other) {
            companyId(other.getCompanyId());
            createdAfter(other.getCreatedAfter());
            createdBefore(other.getCreatedBefore());
            cursor(other.getCursor());
            displayFullName(other.getDisplayFullName());
            employmentStatus(other.getEmploymentStatus());
            employmentType(other.getEmploymentType());
            expand(other.getExpand());
            firstName(other.getFirstName());
            groups(other.getGroups());
            homeLocationId(other.getHomeLocationId());
            includeDeletedData(other.getIncludeDeletedData());
            includeRemoteData(other.getIncludeRemoteData());
            includeSensitiveFields(other.getIncludeSensitiveFields());
            jobTitle(other.getJobTitle());
            lastName(other.getLastName());
            managerId(other.getManagerId());
            modifiedAfter(other.getModifiedAfter());
            modifiedBefore(other.getModifiedBefore());
            pageSize(other.getPageSize());
            payGroupId(other.getPayGroupId());
            personalEmail(other.getPersonalEmail());
            remoteFields(other.getRemoteFields());
            remoteId(other.getRemoteId());
            showEnumOrigins(other.getShowEnumOrigins());
            startedAfter(other.getStartedAfter());
            startedBefore(other.getStartedBefore());
            teamId(other.getTeamId());
            terminatedAfter(other.getTerminatedAfter());
            terminatedBefore(other.getTerminatedBefore());
            workEmail(other.getWorkEmail());
            workLocationId(other.getWorkLocationId());
            return this;
        }

        @JsonSetter(value = "company_id", nulls = Nulls.SKIP)
        public Builder companyId(Optional<String> companyId) {
            this.companyId = companyId;
            return this;
        }

        public Builder companyId(String companyId) {
            this.companyId = Optional.of(companyId);
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

        @JsonSetter(value = "display_full_name", nulls = Nulls.SKIP)
        public Builder displayFullName(Optional<String> displayFullName) {
            this.displayFullName = displayFullName;
            return this;
        }

        public Builder displayFullName(String displayFullName) {
            this.displayFullName = Optional.of(displayFullName);
            return this;
        }

        @JsonSetter(value = "employment_status", nulls = Nulls.SKIP)
        public Builder employmentStatus(Optional<EmployeesListRequestEmploymentStatus> employmentStatus) {
            this.employmentStatus = employmentStatus;
            return this;
        }

        public Builder employmentStatus(EmployeesListRequestEmploymentStatus employmentStatus) {
            this.employmentStatus = Optional.of(employmentStatus);
            return this;
        }

        @JsonSetter(value = "employment_type", nulls = Nulls.SKIP)
        public Builder employmentType(Optional<String> employmentType) {
            this.employmentType = employmentType;
            return this;
        }

        public Builder employmentType(String employmentType) {
            this.employmentType = Optional.of(employmentType);
            return this;
        }

        @JsonSetter(value = "expand", nulls = Nulls.SKIP)
        public Builder expand(Optional<EmployeesListRequestExpand> expand) {
            this.expand = expand;
            return this;
        }

        public Builder expand(EmployeesListRequestExpand expand) {
            this.expand = Optional.of(expand);
            return this;
        }

        @JsonSetter(value = "first_name", nulls = Nulls.SKIP)
        public Builder firstName(Optional<String> firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = Optional.of(firstName);
            return this;
        }

        @JsonSetter(value = "groups", nulls = Nulls.SKIP)
        public Builder groups(Optional<String> groups) {
            this.groups = groups;
            return this;
        }

        public Builder groups(String groups) {
            this.groups = Optional.of(groups);
            return this;
        }

        @JsonSetter(value = "home_location_id", nulls = Nulls.SKIP)
        public Builder homeLocationId(Optional<String> homeLocationId) {
            this.homeLocationId = homeLocationId;
            return this;
        }

        public Builder homeLocationId(String homeLocationId) {
            this.homeLocationId = Optional.of(homeLocationId);
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

        @JsonSetter(value = "include_sensitive_fields", nulls = Nulls.SKIP)
        public Builder includeSensitiveFields(Optional<Boolean> includeSensitiveFields) {
            this.includeSensitiveFields = includeSensitiveFields;
            return this;
        }

        public Builder includeSensitiveFields(Boolean includeSensitiveFields) {
            this.includeSensitiveFields = Optional.of(includeSensitiveFields);
            return this;
        }

        @JsonSetter(value = "job_title", nulls = Nulls.SKIP)
        public Builder jobTitle(Optional<String> jobTitle) {
            this.jobTitle = jobTitle;
            return this;
        }

        public Builder jobTitle(String jobTitle) {
            this.jobTitle = Optional.of(jobTitle);
            return this;
        }

        @JsonSetter(value = "last_name", nulls = Nulls.SKIP)
        public Builder lastName(Optional<String> lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = Optional.of(lastName);
            return this;
        }

        @JsonSetter(value = "manager_id", nulls = Nulls.SKIP)
        public Builder managerId(Optional<String> managerId) {
            this.managerId = managerId;
            return this;
        }

        public Builder managerId(String managerId) {
            this.managerId = Optional.of(managerId);
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

        @JsonSetter(value = "page_size", nulls = Nulls.SKIP)
        public Builder pageSize(Optional<Integer> pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        public Builder pageSize(Integer pageSize) {
            this.pageSize = Optional.of(pageSize);
            return this;
        }

        @JsonSetter(value = "pay_group_id", nulls = Nulls.SKIP)
        public Builder payGroupId(Optional<String> payGroupId) {
            this.payGroupId = payGroupId;
            return this;
        }

        public Builder payGroupId(String payGroupId) {
            this.payGroupId = Optional.of(payGroupId);
            return this;
        }

        @JsonSetter(value = "personal_email", nulls = Nulls.SKIP)
        public Builder personalEmail(Optional<String> personalEmail) {
            this.personalEmail = personalEmail;
            return this;
        }

        public Builder personalEmail(String personalEmail) {
            this.personalEmail = Optional.of(personalEmail);
            return this;
        }

        @JsonSetter(value = "remote_fields", nulls = Nulls.SKIP)
        public Builder remoteFields(Optional<EmployeesListRequestRemoteFields> remoteFields) {
            this.remoteFields = remoteFields;
            return this;
        }

        public Builder remoteFields(EmployeesListRequestRemoteFields remoteFields) {
            this.remoteFields = Optional.of(remoteFields);
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

        @JsonSetter(value = "show_enum_origins", nulls = Nulls.SKIP)
        public Builder showEnumOrigins(Optional<EmployeesListRequestShowEnumOrigins> showEnumOrigins) {
            this.showEnumOrigins = showEnumOrigins;
            return this;
        }

        public Builder showEnumOrigins(EmployeesListRequestShowEnumOrigins showEnumOrigins) {
            this.showEnumOrigins = Optional.of(showEnumOrigins);
            return this;
        }

        @JsonSetter(value = "started_after", nulls = Nulls.SKIP)
        public Builder startedAfter(Optional<OffsetDateTime> startedAfter) {
            this.startedAfter = startedAfter;
            return this;
        }

        public Builder startedAfter(OffsetDateTime startedAfter) {
            this.startedAfter = Optional.of(startedAfter);
            return this;
        }

        @JsonSetter(value = "started_before", nulls = Nulls.SKIP)
        public Builder startedBefore(Optional<OffsetDateTime> startedBefore) {
            this.startedBefore = startedBefore;
            return this;
        }

        public Builder startedBefore(OffsetDateTime startedBefore) {
            this.startedBefore = Optional.of(startedBefore);
            return this;
        }

        @JsonSetter(value = "team_id", nulls = Nulls.SKIP)
        public Builder teamId(Optional<String> teamId) {
            this.teamId = teamId;
            return this;
        }

        public Builder teamId(String teamId) {
            this.teamId = Optional.of(teamId);
            return this;
        }

        @JsonSetter(value = "terminated_after", nulls = Nulls.SKIP)
        public Builder terminatedAfter(Optional<OffsetDateTime> terminatedAfter) {
            this.terminatedAfter = terminatedAfter;
            return this;
        }

        public Builder terminatedAfter(OffsetDateTime terminatedAfter) {
            this.terminatedAfter = Optional.of(terminatedAfter);
            return this;
        }

        @JsonSetter(value = "terminated_before", nulls = Nulls.SKIP)
        public Builder terminatedBefore(Optional<OffsetDateTime> terminatedBefore) {
            this.terminatedBefore = terminatedBefore;
            return this;
        }

        public Builder terminatedBefore(OffsetDateTime terminatedBefore) {
            this.terminatedBefore = Optional.of(terminatedBefore);
            return this;
        }

        @JsonSetter(value = "work_email", nulls = Nulls.SKIP)
        public Builder workEmail(Optional<String> workEmail) {
            this.workEmail = workEmail;
            return this;
        }

        public Builder workEmail(String workEmail) {
            this.workEmail = Optional.of(workEmail);
            return this;
        }

        @JsonSetter(value = "work_location_id", nulls = Nulls.SKIP)
        public Builder workLocationId(Optional<String> workLocationId) {
            this.workLocationId = workLocationId;
            return this;
        }

        public Builder workLocationId(String workLocationId) {
            this.workLocationId = Optional.of(workLocationId);
            return this;
        }

        public EmployeesListRequest build() {
            return new EmployeesListRequest(
                    companyId,
                    createdAfter,
                    createdBefore,
                    cursor,
                    displayFullName,
                    employmentStatus,
                    employmentType,
                    expand,
                    firstName,
                    groups,
                    homeLocationId,
                    includeDeletedData,
                    includeRemoteData,
                    includeSensitiveFields,
                    jobTitle,
                    lastName,
                    managerId,
                    modifiedAfter,
                    modifiedBefore,
                    pageSize,
                    payGroupId,
                    personalEmail,
                    remoteFields,
                    remoteId,
                    showEnumOrigins,
                    startedAfter,
                    startedBefore,
                    teamId,
                    terminatedAfter,
                    terminatedBefore,
                    workEmail,
                    workLocationId);
        }
    }
}

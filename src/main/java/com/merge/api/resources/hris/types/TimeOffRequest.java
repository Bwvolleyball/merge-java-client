package com.merge.api.resources.hris.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.merge.api.core.ObjectMappers;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = TimeOffRequest.Builder.class)
public final class TimeOffRequest {
    private final Optional<TimeOffRequestEmployee> employee;

    private final Optional<TimeOffRequestApprover> approver;

    private final Optional<TimeOffRequestStatus> status;

    private final Optional<String> employeeNote;

    private final Optional<TimeOffRequestUnits> units;

    private final Optional<Double> amount;

    private final Optional<TimeOffRequestRequestType> requestType;

    private final Optional<OffsetDateTime> startTime;

    private final Optional<OffsetDateTime> endTime;

    private final Optional<Map<String, JsonNode>> integrationParams;

    private final Optional<Map<String, JsonNode>> linkedAccountParams;

    private TimeOffRequest(
            Optional<TimeOffRequestEmployee> employee,
            Optional<TimeOffRequestApprover> approver,
            Optional<TimeOffRequestStatus> status,
            Optional<String> employeeNote,
            Optional<TimeOffRequestUnits> units,
            Optional<Double> amount,
            Optional<TimeOffRequestRequestType> requestType,
            Optional<OffsetDateTime> startTime,
            Optional<OffsetDateTime> endTime,
            Optional<Map<String, JsonNode>> integrationParams,
            Optional<Map<String, JsonNode>> linkedAccountParams) {
        this.employee = employee;
        this.approver = approver;
        this.status = status;
        this.employeeNote = employeeNote;
        this.units = units;
        this.amount = amount;
        this.requestType = requestType;
        this.startTime = startTime;
        this.endTime = endTime;
        this.integrationParams = integrationParams;
        this.linkedAccountParams = linkedAccountParams;
    }

    /**
     * @return The employee requesting time off.
     */
    @JsonProperty("employee")
    public Optional<TimeOffRequestEmployee> getEmployee() {
        return employee;
    }

    /**
     * @return The Merge ID of the employee with the ability to approve the time off request.
     */
    @JsonProperty("approver")
    public Optional<TimeOffRequestApprover> getApprover() {
        return approver;
    }

    /**
     * @return The status of this time off request.
     * <ul>
     * <li><code>REQUESTED</code> - REQUESTED</li>
     * <li><code>APPROVED</code> - APPROVED</li>
     * <li><code>DECLINED</code> - DECLINED</li>
     * <li><code>CANCELLED</code> - CANCELLED</li>
     * <li><code>DELETED</code> - DELETED</li>
     * </ul>
     */
    @JsonProperty("status")
    public Optional<TimeOffRequestStatus> getStatus() {
        return status;
    }

    /**
     * @return The employee note for this time off request.
     */
    @JsonProperty("employee_note")
    public Optional<String> getEmployeeNote() {
        return employeeNote;
    }

    /**
     * @return The measurement that the third-party integration uses to count time requested.
     * <ul>
     * <li><code>HOURS</code> - HOURS</li>
     * <li><code>DAYS</code> - DAYS</li>
     * </ul>
     */
    @JsonProperty("units")
    public Optional<TimeOffRequestUnits> getUnits() {
        return units;
    }

    /**
     * @return The time off quantity measured by the prescribed “units”.
     */
    @JsonProperty("amount")
    public Optional<Double> getAmount() {
        return amount;
    }

    /**
     * @return The type of time off request.
     * <ul>
     * <li><code>VACATION</code> - VACATION</li>
     * <li><code>SICK</code> - SICK</li>
     * <li><code>PERSONAL</code> - PERSONAL</li>
     * <li><code>JURY_DUTY</code> - JURY_DUTY</li>
     * <li><code>VOLUNTEER</code> - VOLUNTEER</li>
     * <li><code>BEREAVEMENT</code> - BEREAVEMENT</li>
     * </ul>
     */
    @JsonProperty("request_type")
    public Optional<TimeOffRequestRequestType> getRequestType() {
        return requestType;
    }

    /**
     * @return The day and time of the start of the time requested off.
     */
    @JsonProperty("start_time")
    public Optional<OffsetDateTime> getStartTime() {
        return startTime;
    }

    /**
     * @return The day and time of the end of the time requested off.
     */
    @JsonProperty("end_time")
    public Optional<OffsetDateTime> getEndTime() {
        return endTime;
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
        return other instanceof TimeOffRequest && equalTo((TimeOffRequest) other);
    }

    private boolean equalTo(TimeOffRequest other) {
        return employee.equals(other.employee)
                && approver.equals(other.approver)
                && status.equals(other.status)
                && employeeNote.equals(other.employeeNote)
                && units.equals(other.units)
                && amount.equals(other.amount)
                && requestType.equals(other.requestType)
                && startTime.equals(other.startTime)
                && endTime.equals(other.endTime)
                && integrationParams.equals(other.integrationParams)
                && linkedAccountParams.equals(other.linkedAccountParams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.employee,
                this.approver,
                this.status,
                this.employeeNote,
                this.units,
                this.amount,
                this.requestType,
                this.startTime,
                this.endTime,
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
        private Optional<TimeOffRequestEmployee> employee = Optional.empty();

        private Optional<TimeOffRequestApprover> approver = Optional.empty();

        private Optional<TimeOffRequestStatus> status = Optional.empty();

        private Optional<String> employeeNote = Optional.empty();

        private Optional<TimeOffRequestUnits> units = Optional.empty();

        private Optional<Double> amount = Optional.empty();

        private Optional<TimeOffRequestRequestType> requestType = Optional.empty();

        private Optional<OffsetDateTime> startTime = Optional.empty();

        private Optional<OffsetDateTime> endTime = Optional.empty();

        private Optional<Map<String, JsonNode>> integrationParams = Optional.empty();

        private Optional<Map<String, JsonNode>> linkedAccountParams = Optional.empty();

        private Builder() {}

        public Builder from(TimeOffRequest other) {
            employee(other.getEmployee());
            approver(other.getApprover());
            status(other.getStatus());
            employeeNote(other.getEmployeeNote());
            units(other.getUnits());
            amount(other.getAmount());
            requestType(other.getRequestType());
            startTime(other.getStartTime());
            endTime(other.getEndTime());
            integrationParams(other.getIntegrationParams());
            linkedAccountParams(other.getLinkedAccountParams());
            return this;
        }

        @JsonSetter(value = "employee", nulls = Nulls.SKIP)
        public Builder employee(Optional<TimeOffRequestEmployee> employee) {
            this.employee = employee;
            return this;
        }

        public Builder employee(TimeOffRequestEmployee employee) {
            this.employee = Optional.of(employee);
            return this;
        }

        @JsonSetter(value = "approver", nulls = Nulls.SKIP)
        public Builder approver(Optional<TimeOffRequestApprover> approver) {
            this.approver = approver;
            return this;
        }

        public Builder approver(TimeOffRequestApprover approver) {
            this.approver = Optional.of(approver);
            return this;
        }

        @JsonSetter(value = "status", nulls = Nulls.SKIP)
        public Builder status(Optional<TimeOffRequestStatus> status) {
            this.status = status;
            return this;
        }

        public Builder status(TimeOffRequestStatus status) {
            this.status = Optional.of(status);
            return this;
        }

        @JsonSetter(value = "employee_note", nulls = Nulls.SKIP)
        public Builder employeeNote(Optional<String> employeeNote) {
            this.employeeNote = employeeNote;
            return this;
        }

        public Builder employeeNote(String employeeNote) {
            this.employeeNote = Optional.of(employeeNote);
            return this;
        }

        @JsonSetter(value = "units", nulls = Nulls.SKIP)
        public Builder units(Optional<TimeOffRequestUnits> units) {
            this.units = units;
            return this;
        }

        public Builder units(TimeOffRequestUnits units) {
            this.units = Optional.of(units);
            return this;
        }

        @JsonSetter(value = "amount", nulls = Nulls.SKIP)
        public Builder amount(Optional<Double> amount) {
            this.amount = amount;
            return this;
        }

        public Builder amount(Double amount) {
            this.amount = Optional.of(amount);
            return this;
        }

        @JsonSetter(value = "request_type", nulls = Nulls.SKIP)
        public Builder requestType(Optional<TimeOffRequestRequestType> requestType) {
            this.requestType = requestType;
            return this;
        }

        public Builder requestType(TimeOffRequestRequestType requestType) {
            this.requestType = Optional.of(requestType);
            return this;
        }

        @JsonSetter(value = "start_time", nulls = Nulls.SKIP)
        public Builder startTime(Optional<OffsetDateTime> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder startTime(OffsetDateTime startTime) {
            this.startTime = Optional.of(startTime);
            return this;
        }

        @JsonSetter(value = "end_time", nulls = Nulls.SKIP)
        public Builder endTime(Optional<OffsetDateTime> endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder endTime(OffsetDateTime endTime) {
            this.endTime = Optional.of(endTime);
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

        public TimeOffRequest build() {
            return new TimeOffRequest(
                    employee,
                    approver,
                    status,
                    employeeNote,
                    units,
                    amount,
                    requestType,
                    startTime,
                    endTime,
                    integrationParams,
                    linkedAccountParams);
        }
    }
}

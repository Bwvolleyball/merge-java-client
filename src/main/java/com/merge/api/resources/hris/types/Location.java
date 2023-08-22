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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Location.Builder.class)
public final class Location {
    private final Optional<String> id;

    private final Optional<String> remoteId;

    private final Optional<String> name;

    private final Optional<String> phoneNumber;

    private final Optional<String> street1;

    private final Optional<String> street2;

    private final Optional<String> city;

    private final Optional<String> state;

    private final Optional<String> zipCode;

    private final Optional<LocationCountry> country;

    private final Optional<LocationLocationType> locationType;

    private final Optional<Boolean> remoteWasDeleted;

    private final Optional<OffsetDateTime> modifiedAt;

    private final Optional<Map<String, JsonNode>> fieldMappings;

    private final Optional<List<RemoteData>> remoteData;

    private Location(
            Optional<String> id,
            Optional<String> remoteId,
            Optional<String> name,
            Optional<String> phoneNumber,
            Optional<String> street1,
            Optional<String> street2,
            Optional<String> city,
            Optional<String> state,
            Optional<String> zipCode,
            Optional<LocationCountry> country,
            Optional<LocationLocationType> locationType,
            Optional<Boolean> remoteWasDeleted,
            Optional<OffsetDateTime> modifiedAt,
            Optional<Map<String, JsonNode>> fieldMappings,
            Optional<List<RemoteData>> remoteData) {
        this.id = id;
        this.remoteId = remoteId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.street1 = street1;
        this.street2 = street2;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
        this.locationType = locationType;
        this.remoteWasDeleted = remoteWasDeleted;
        this.modifiedAt = modifiedAt;
        this.fieldMappings = fieldMappings;
        this.remoteData = remoteData;
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
     * @return The location's name.
     */
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    /**
     * @return The location's phone number.
     */
    @JsonProperty("phone_number")
    public Optional<String> getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @return Line 1 of the location's street address.
     */
    @JsonProperty("street_1")
    public Optional<String> getStreet1() {
        return street1;
    }

    /**
     * @return Line 2 of the location's street address.
     */
    @JsonProperty("street_2")
    public Optional<String> getStreet2() {
        return street2;
    }

    /**
     * @return The location's city.
     */
    @JsonProperty("city")
    public Optional<String> getCity() {
        return city;
    }

    /**
     * @return The location's state. Represents a region if outside of the US.
     */
    @JsonProperty("state")
    public Optional<String> getState() {
        return state;
    }

    /**
     * @return The location's zip code or postal code.
     */
    @JsonProperty("zip_code")
    public Optional<String> getZipCode() {
        return zipCode;
    }

    /**
     * @return The location's country.
     * <ul>
     * <li><code>AF</code> - Afghanistan</li>
     * <li><code>AX</code> - Åland Islands</li>
     * <li><code>AL</code> - Albania</li>
     * <li><code>DZ</code> - Algeria</li>
     * <li><code>AS</code> - American Samoa</li>
     * <li><code>AD</code> - Andorra</li>
     * <li><code>AO</code> - Angola</li>
     * <li><code>AI</code> - Anguilla</li>
     * <li><code>AQ</code> - Antarctica</li>
     * <li><code>AG</code> - Antigua and Barbuda</li>
     * <li><code>AR</code> - Argentina</li>
     * <li><code>AM</code> - Armenia</li>
     * <li><code>AW</code> - Aruba</li>
     * <li><code>AU</code> - Australia</li>
     * <li><code>AT</code> - Austria</li>
     * <li><code>AZ</code> - Azerbaijan</li>
     * <li><code>BS</code> - Bahamas</li>
     * <li><code>BH</code> - Bahrain</li>
     * <li><code>BD</code> - Bangladesh</li>
     * <li><code>BB</code> - Barbados</li>
     * <li><code>BY</code> - Belarus</li>
     * <li><code>BE</code> - Belgium</li>
     * <li><code>BZ</code> - Belize</li>
     * <li><code>BJ</code> - Benin</li>
     * <li><code>BM</code> - Bermuda</li>
     * <li><code>BT</code> - Bhutan</li>
     * <li><code>BO</code> - Bolivia</li>
     * <li><code>BQ</code> - Bonaire, Sint Eustatius and Saba</li>
     * <li><code>BA</code> - Bosnia and Herzegovina</li>
     * <li><code>BW</code> - Botswana</li>
     * <li><code>BV</code> - Bouvet Island</li>
     * <li><code>BR</code> - Brazil</li>
     * <li><code>IO</code> - British Indian Ocean Territory</li>
     * <li><code>BN</code> - Brunei</li>
     * <li><code>BG</code> - Bulgaria</li>
     * <li><code>BF</code> - Burkina Faso</li>
     * <li><code>BI</code> - Burundi</li>
     * <li><code>CV</code> - Cabo Verde</li>
     * <li><code>KH</code> - Cambodia</li>
     * <li><code>CM</code> - Cameroon</li>
     * <li><code>CA</code> - Canada</li>
     * <li><code>KY</code> - Cayman Islands</li>
     * <li><code>CF</code> - Central African Republic</li>
     * <li><code>TD</code> - Chad</li>
     * <li><code>CL</code> - Chile</li>
     * <li><code>CN</code> - China</li>
     * <li><code>CX</code> - Christmas Island</li>
     * <li><code>CC</code> - Cocos (Keeling) Islands</li>
     * <li><code>CO</code> - Colombia</li>
     * <li><code>KM</code> - Comoros</li>
     * <li><code>CG</code> - Congo</li>
     * <li><code>CD</code> - Congo (the Democratic Republic of the)</li>
     * <li><code>CK</code> - Cook Islands</li>
     * <li><code>CR</code> - Costa Rica</li>
     * <li><code>CI</code> - Côte d'Ivoire</li>
     * <li><code>HR</code> - Croatia</li>
     * <li><code>CU</code> - Cuba</li>
     * <li><code>CW</code> - Curaçao</li>
     * <li><code>CY</code> - Cyprus</li>
     * <li><code>CZ</code> - Czechia</li>
     * <li><code>DK</code> - Denmark</li>
     * <li><code>DJ</code> - Djibouti</li>
     * <li><code>DM</code> - Dominica</li>
     * <li><code>DO</code> - Dominican Republic</li>
     * <li><code>EC</code> - Ecuador</li>
     * <li><code>EG</code> - Egypt</li>
     * <li><code>SV</code> - El Salvador</li>
     * <li><code>GQ</code> - Equatorial Guinea</li>
     * <li><code>ER</code> - Eritrea</li>
     * <li><code>EE</code> - Estonia</li>
     * <li><code>SZ</code> - Eswatini</li>
     * <li><code>ET</code> - Ethiopia</li>
     * <li><code>FK</code> - Falkland Islands (Malvinas)</li>
     * <li><code>FO</code> - Faroe Islands</li>
     * <li><code>FJ</code> - Fiji</li>
     * <li><code>FI</code> - Finland</li>
     * <li><code>FR</code> - France</li>
     * <li><code>GF</code> - French Guiana</li>
     * <li><code>PF</code> - French Polynesia</li>
     * <li><code>TF</code> - French Southern Territories</li>
     * <li><code>GA</code> - Gabon</li>
     * <li><code>GM</code> - Gambia</li>
     * <li><code>GE</code> - Georgia</li>
     * <li><code>DE</code> - Germany</li>
     * <li><code>GH</code> - Ghana</li>
     * <li><code>GI</code> - Gibraltar</li>
     * <li><code>GR</code> - Greece</li>
     * <li><code>GL</code> - Greenland</li>
     * <li><code>GD</code> - Grenada</li>
     * <li><code>GP</code> - Guadeloupe</li>
     * <li><code>GU</code> - Guam</li>
     * <li><code>GT</code> - Guatemala</li>
     * <li><code>GG</code> - Guernsey</li>
     * <li><code>GN</code> - Guinea</li>
     * <li><code>GW</code> - Guinea-Bissau</li>
     * <li><code>GY</code> - Guyana</li>
     * <li><code>HT</code> - Haiti</li>
     * <li><code>HM</code> - Heard Island and McDonald Islands</li>
     * <li><code>VA</code> - Holy See</li>
     * <li><code>HN</code> - Honduras</li>
     * <li><code>HK</code> - Hong Kong</li>
     * <li><code>HU</code> - Hungary</li>
     * <li><code>IS</code> - Iceland</li>
     * <li><code>IN</code> - India</li>
     * <li><code>ID</code> - Indonesia</li>
     * <li><code>IR</code> - Iran</li>
     * <li><code>IQ</code> - Iraq</li>
     * <li><code>IE</code> - Ireland</li>
     * <li><code>IM</code> - Isle of Man</li>
     * <li><code>IL</code> - Israel</li>
     * <li><code>IT</code> - Italy</li>
     * <li><code>JM</code> - Jamaica</li>
     * <li><code>JP</code> - Japan</li>
     * <li><code>JE</code> - Jersey</li>
     * <li><code>JO</code> - Jordan</li>
     * <li><code>KZ</code> - Kazakhstan</li>
     * <li><code>KE</code> - Kenya</li>
     * <li><code>KI</code> - Kiribati</li>
     * <li><code>KW</code> - Kuwait</li>
     * <li><code>KG</code> - Kyrgyzstan</li>
     * <li><code>LA</code> - Laos</li>
     * <li><code>LV</code> - Latvia</li>
     * <li><code>LB</code> - Lebanon</li>
     * <li><code>LS</code> - Lesotho</li>
     * <li><code>LR</code> - Liberia</li>
     * <li><code>LY</code> - Libya</li>
     * <li><code>LI</code> - Liechtenstein</li>
     * <li><code>LT</code> - Lithuania</li>
     * <li><code>LU</code> - Luxembourg</li>
     * <li><code>MO</code> - Macao</li>
     * <li><code>MG</code> - Madagascar</li>
     * <li><code>MW</code> - Malawi</li>
     * <li><code>MY</code> - Malaysia</li>
     * <li><code>MV</code> - Maldives</li>
     * <li><code>ML</code> - Mali</li>
     * <li><code>MT</code> - Malta</li>
     * <li><code>MH</code> - Marshall Islands</li>
     * <li><code>MQ</code> - Martinique</li>
     * <li><code>MR</code> - Mauritania</li>
     * <li><code>MU</code> - Mauritius</li>
     * <li><code>YT</code> - Mayotte</li>
     * <li><code>MX</code> - Mexico</li>
     * <li><code>FM</code> - Micronesia (Federated States of)</li>
     * <li><code>MD</code> - Moldova</li>
     * <li><code>MC</code> - Monaco</li>
     * <li><code>MN</code> - Mongolia</li>
     * <li><code>ME</code> - Montenegro</li>
     * <li><code>MS</code> - Montserrat</li>
     * <li><code>MA</code> - Morocco</li>
     * <li><code>MZ</code> - Mozambique</li>
     * <li><code>MM</code> - Myanmar</li>
     * <li><code>NA</code> - Namibia</li>
     * <li><code>NR</code> - Nauru</li>
     * <li><code>NP</code> - Nepal</li>
     * <li><code>NL</code> - Netherlands</li>
     * <li><code>NC</code> - New Caledonia</li>
     * <li><code>NZ</code> - New Zealand</li>
     * <li><code>NI</code> - Nicaragua</li>
     * <li><code>NE</code> - Niger</li>
     * <li><code>NG</code> - Nigeria</li>
     * <li><code>NU</code> - Niue</li>
     * <li><code>NF</code> - Norfolk Island</li>
     * <li><code>KP</code> - North Korea</li>
     * <li><code>MK</code> - North Macedonia</li>
     * <li><code>MP</code> - Northern Mariana Islands</li>
     * <li><code>NO</code> - Norway</li>
     * <li><code>OM</code> - Oman</li>
     * <li><code>PK</code> - Pakistan</li>
     * <li><code>PW</code> - Palau</li>
     * <li><code>PS</code> - Palestine, State of</li>
     * <li><code>PA</code> - Panama</li>
     * <li><code>PG</code> - Papua New Guinea</li>
     * <li><code>PY</code> - Paraguay</li>
     * <li><code>PE</code> - Peru</li>
     * <li><code>PH</code> - Philippines</li>
     * <li><code>PN</code> - Pitcairn</li>
     * <li><code>PL</code> - Poland</li>
     * <li><code>PT</code> - Portugal</li>
     * <li><code>PR</code> - Puerto Rico</li>
     * <li><code>QA</code> - Qatar</li>
     * <li><code>RE</code> - Réunion</li>
     * <li><code>RO</code> - Romania</li>
     * <li><code>RU</code> - Russia</li>
     * <li><code>RW</code> - Rwanda</li>
     * <li><code>BL</code> - Saint Barthélemy</li>
     * <li><code>SH</code> - Saint Helena, Ascension and Tristan da Cunha</li>
     * <li><code>KN</code> - Saint Kitts and Nevis</li>
     * <li><code>LC</code> - Saint Lucia</li>
     * <li><code>MF</code> - Saint Martin (French part)</li>
     * <li><code>PM</code> - Saint Pierre and Miquelon</li>
     * <li><code>VC</code> - Saint Vincent and the Grenadines</li>
     * <li><code>WS</code> - Samoa</li>
     * <li><code>SM</code> - San Marino</li>
     * <li><code>ST</code> - Sao Tome and Principe</li>
     * <li><code>SA</code> - Saudi Arabia</li>
     * <li><code>SN</code> - Senegal</li>
     * <li><code>RS</code> - Serbia</li>
     * <li><code>SC</code> - Seychelles</li>
     * <li><code>SL</code> - Sierra Leone</li>
     * <li><code>SG</code> - Singapore</li>
     * <li><code>SX</code> - Sint Maarten (Dutch part)</li>
     * <li><code>SK</code> - Slovakia</li>
     * <li><code>SI</code> - Slovenia</li>
     * <li><code>SB</code> - Solomon Islands</li>
     * <li><code>SO</code> - Somalia</li>
     * <li><code>ZA</code> - South Africa</li>
     * <li><code>GS</code> - South Georgia and the South Sandwich Islands</li>
     * <li><code>KR</code> - South Korea</li>
     * <li><code>SS</code> - South Sudan</li>
     * <li><code>ES</code> - Spain</li>
     * <li><code>LK</code> - Sri Lanka</li>
     * <li><code>SD</code> - Sudan</li>
     * <li><code>SR</code> - Suriname</li>
     * <li><code>SJ</code> - Svalbard and Jan Mayen</li>
     * <li><code>SE</code> - Sweden</li>
     * <li><code>CH</code> - Switzerland</li>
     * <li><code>SY</code> - Syria</li>
     * <li><code>TW</code> - Taiwan</li>
     * <li><code>TJ</code> - Tajikistan</li>
     * <li><code>TZ</code> - Tanzania</li>
     * <li><code>TH</code> - Thailand</li>
     * <li><code>TL</code> - Timor-Leste</li>
     * <li><code>TG</code> - Togo</li>
     * <li><code>TK</code> - Tokelau</li>
     * <li><code>TO</code> - Tonga</li>
     * <li><code>TT</code> - Trinidad and Tobago</li>
     * <li><code>TN</code> - Tunisia</li>
     * <li><code>TR</code> - Turkey</li>
     * <li><code>TM</code> - Turkmenistan</li>
     * <li><code>TC</code> - Turks and Caicos Islands</li>
     * <li><code>TV</code> - Tuvalu</li>
     * <li><code>UG</code> - Uganda</li>
     * <li><code>UA</code> - Ukraine</li>
     * <li><code>AE</code> - United Arab Emirates</li>
     * <li><code>GB</code> - United Kingdom</li>
     * <li><code>UM</code> - United States Minor Outlying Islands</li>
     * <li><code>US</code> - United States of America</li>
     * <li><code>UY</code> - Uruguay</li>
     * <li><code>UZ</code> - Uzbekistan</li>
     * <li><code>VU</code> - Vanuatu</li>
     * <li><code>VE</code> - Venezuela</li>
     * <li><code>VN</code> - Vietnam</li>
     * <li><code>VG</code> - Virgin Islands (British)</li>
     * <li><code>VI</code> - Virgin Islands (U.S.)</li>
     * <li><code>WF</code> - Wallis and Futuna</li>
     * <li><code>EH</code> - Western Sahara</li>
     * <li><code>YE</code> - Yemen</li>
     * <li><code>ZM</code> - Zambia</li>
     * <li><code>ZW</code> - Zimbabwe</li>
     * </ul>
     */
    @JsonProperty("country")
    public Optional<LocationCountry> getCountry() {
        return country;
    }

    /**
     * @return The location's type. Can be either WORK or HOME
     * <ul>
     * <li><code>HOME</code> - HOME</li>
     * <li><code>WORK</code> - WORK</li>
     * </ul>
     */
    @JsonProperty("location_type")
    public Optional<LocationLocationType> getLocationType() {
        return locationType;
    }

    /**
     * @return Indicates whether or not this object has been deleted by third party webhooks.
     */
    @JsonProperty("remote_was_deleted")
    public Optional<Boolean> getRemoteWasDeleted() {
        return remoteWasDeleted;
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

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Location && equalTo((Location) other);
    }

    private boolean equalTo(Location other) {
        return id.equals(other.id)
                && remoteId.equals(other.remoteId)
                && name.equals(other.name)
                && phoneNumber.equals(other.phoneNumber)
                && street1.equals(other.street1)
                && street2.equals(other.street2)
                && city.equals(other.city)
                && state.equals(other.state)
                && zipCode.equals(other.zipCode)
                && country.equals(other.country)
                && locationType.equals(other.locationType)
                && remoteWasDeleted.equals(other.remoteWasDeleted)
                && modifiedAt.equals(other.modifiedAt)
                && fieldMappings.equals(other.fieldMappings)
                && remoteData.equals(other.remoteData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.remoteId,
                this.name,
                this.phoneNumber,
                this.street1,
                this.street2,
                this.city,
                this.state,
                this.zipCode,
                this.country,
                this.locationType,
                this.remoteWasDeleted,
                this.modifiedAt,
                this.fieldMappings,
                this.remoteData);
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
        private Optional<String> id = Optional.empty();

        private Optional<String> remoteId = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Optional<String> phoneNumber = Optional.empty();

        private Optional<String> street1 = Optional.empty();

        private Optional<String> street2 = Optional.empty();

        private Optional<String> city = Optional.empty();

        private Optional<String> state = Optional.empty();

        private Optional<String> zipCode = Optional.empty();

        private Optional<LocationCountry> country = Optional.empty();

        private Optional<LocationLocationType> locationType = Optional.empty();

        private Optional<Boolean> remoteWasDeleted = Optional.empty();

        private Optional<OffsetDateTime> modifiedAt = Optional.empty();

        private Optional<Map<String, JsonNode>> fieldMappings = Optional.empty();

        private Optional<List<RemoteData>> remoteData = Optional.empty();

        private Builder() {}

        public Builder from(Location other) {
            id(other.getId());
            remoteId(other.getRemoteId());
            name(other.getName());
            phoneNumber(other.getPhoneNumber());
            street1(other.getStreet1());
            street2(other.getStreet2());
            city(other.getCity());
            state(other.getState());
            zipCode(other.getZipCode());
            country(other.getCountry());
            locationType(other.getLocationType());
            remoteWasDeleted(other.getRemoteWasDeleted());
            modifiedAt(other.getModifiedAt());
            fieldMappings(other.getFieldMappings());
            remoteData(other.getRemoteData());
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

        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public Builder name(Optional<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(String name) {
            this.name = Optional.of(name);
            return this;
        }

        @JsonSetter(value = "phone_number", nulls = Nulls.SKIP)
        public Builder phoneNumber(Optional<String> phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = Optional.of(phoneNumber);
            return this;
        }

        @JsonSetter(value = "street_1", nulls = Nulls.SKIP)
        public Builder street1(Optional<String> street1) {
            this.street1 = street1;
            return this;
        }

        public Builder street1(String street1) {
            this.street1 = Optional.of(street1);
            return this;
        }

        @JsonSetter(value = "street_2", nulls = Nulls.SKIP)
        public Builder street2(Optional<String> street2) {
            this.street2 = street2;
            return this;
        }

        public Builder street2(String street2) {
            this.street2 = Optional.of(street2);
            return this;
        }

        @JsonSetter(value = "city", nulls = Nulls.SKIP)
        public Builder city(Optional<String> city) {
            this.city = city;
            return this;
        }

        public Builder city(String city) {
            this.city = Optional.of(city);
            return this;
        }

        @JsonSetter(value = "state", nulls = Nulls.SKIP)
        public Builder state(Optional<String> state) {
            this.state = state;
            return this;
        }

        public Builder state(String state) {
            this.state = Optional.of(state);
            return this;
        }

        @JsonSetter(value = "zip_code", nulls = Nulls.SKIP)
        public Builder zipCode(Optional<String> zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        public Builder zipCode(String zipCode) {
            this.zipCode = Optional.of(zipCode);
            return this;
        }

        @JsonSetter(value = "country", nulls = Nulls.SKIP)
        public Builder country(Optional<LocationCountry> country) {
            this.country = country;
            return this;
        }

        public Builder country(LocationCountry country) {
            this.country = Optional.of(country);
            return this;
        }

        @JsonSetter(value = "location_type", nulls = Nulls.SKIP)
        public Builder locationType(Optional<LocationLocationType> locationType) {
            this.locationType = locationType;
            return this;
        }

        public Builder locationType(LocationLocationType locationType) {
            this.locationType = Optional.of(locationType);
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

        public Location build() {
            return new Location(
                    id,
                    remoteId,
                    name,
                    phoneNumber,
                    street1,
                    street2,
                    city,
                    state,
                    zipCode,
                    country,
                    locationType,
                    remoteWasDeleted,
                    modifiedAt,
                    fieldMappings,
                    remoteData);
        }
    }
}

package com.amdoc.pojo;

import com.amdoc.type.AuthType;
import com.amdoc.type.CompanySize;
import com.amdoc.type.SubscriptionPlan;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Value;
import lombok.experimental.NonFinal;
import lombok.extern.jackson.Jacksonized;

import java.time.ZonedDateTime;
import java.util.List;

@Value
@NonFinal
@Builder(toBuilder = true)
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class DocAccount {
    String id;

    String email;

    String firstName;

    String lastName;

    String organization;

    CompanySize companySize;

    String companyWebsite;

    AuthType authType;

    String accessToken;

    Boolean isEmailVerified;

    String hashedPassword;

    String phoneNumber;

    String countryCode;

    String profileImageUrl;

    SubscriptionPlan subscriptionPlan;

    List<String> authorities;

    String jobTitle;

    Boolean isNewsSubscribed;

    Boolean isSetupComplete;

    ZonedDateTime createdAt;

    ZonedDateTime updatedAt;
}

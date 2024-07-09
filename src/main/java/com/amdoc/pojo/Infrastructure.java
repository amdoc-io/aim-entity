package com.amdoc.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import lombok.experimental.NonFinal;
import lombok.extern.jackson.Jacksonized;

import java.time.ZonedDateTime;

@Value
@NonFinal
@Builder(toBuilder = true)
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class Infrastructure {

    String id;
    @NonNull
    String email;
    @NonNull
    String organizationId;
    String gitProvider;
    GitOAuthToken gitOauthToken;
    GitInstallationToken gitInstallationToken;
    String gitInstallationId;
    String docInitialRepo;
    Integer currentStep;
    String docInitialWebsite;
    ZonedDateTime createdAt;
    ZonedDateTime updatedAt;
}

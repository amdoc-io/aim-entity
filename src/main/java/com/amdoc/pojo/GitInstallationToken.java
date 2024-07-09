package com.amdoc.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Value;
import lombok.experimental.NonFinal;
import lombok.extern.jackson.Jacksonized;

import java.time.ZonedDateTime;

@Value
@NonFinal
@Builder(toBuilder = true)
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class GitInstallationToken {
    String token;
    ZonedDateTime expiresAt;
    GitPermissions permissions;
    String repositorySelection;
}

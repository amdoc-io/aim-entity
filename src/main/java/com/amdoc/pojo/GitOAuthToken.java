package com.amdoc.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Value;
import lombok.experimental.NonFinal;
import lombok.extern.jackson.Jacksonized;

@Value
@NonFinal
@Builder(toBuilder = true)
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class GitOAuthToken {
    String accessToken;
    Long expiresIn;
    String refreshToken;
    Long refreshTokenExpiresIn;
    String scope;
    String tokenType;
}

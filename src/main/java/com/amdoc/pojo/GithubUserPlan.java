package com.amdoc.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;
import lombok.experimental.NonFinal;
import lombok.extern.jackson.Jacksonized;

@Value
@NonFinal
@Builder(toBuilder = true)
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class GithubUserPlan {
    @JsonProperty("name")
    String name;

    @JsonProperty("space")
    Integer space;

    @JsonProperty("_repos")
    Integer Repos;

    @JsonProperty("collaborators")
    Integer collaborators;
}

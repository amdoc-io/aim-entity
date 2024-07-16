package com.amdoc.pojo;

import com.amdoc.type.DeploymentStatus;
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
public class DocDeployment {
    String id;

    String organizationId;

    List<String> notificationEmails;

    DeploymentStatus status;

    List<DeploymentProcess> processes;

    ZonedDateTime createdAt;

    ZonedDateTime updatedAt;
}

package com.amdoc.pojo;

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
public class DocSettings {

    String id;
    String email;
    String organizationId;
    String gitLogin;
    String gitRepo;
    String brandName;
    String logoUrl;
    String brandColor;
    String homepageUrl;
    String privacyPolicyUrl;
    String callToActionName;
    String callToActionUrl;
    String infoEmail;
    String supportEmail;
    String careerEmail;
    List<String> socialLinks;
    ZonedDateTime createdAt;
    ZonedDateTime updatedAt;
}

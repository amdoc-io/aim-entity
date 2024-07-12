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
public class GithubUser {

    @JsonProperty("login")
    String login;

    @JsonProperty("id")
    Integer id;

    @JsonProperty("node_id")
    String nodeId;

    @JsonProperty("avatar_url")
    String avatarUrl;

    @JsonProperty("gravatar_id")
    String gravatarId;

    @JsonProperty("url")
    String url;

    @JsonProperty("html_url")
    String htmlUrl;

    @JsonProperty("followers_url")
    String followersUrl;

    @JsonProperty("following_url")
    String followingUrl;

    @JsonProperty("gists_url")
    String gistsUrl;

    @JsonProperty("starred_url")
    String starredUrl;

    @JsonProperty("subscriptions_url")
    String subscriptionsUrl;

    @JsonProperty("organizations_url")
    String organizationsUrl;

    @JsonProperty("repos_url")
    String reposUrl;

    @JsonProperty("events_url")
    String eventsUrl;

    @JsonProperty("received_events_url")
    String receivedEventsUrl;

    @JsonProperty("type")
    String type;

    @JsonProperty("site_admin")
    Boolean siteAdmin;

    @JsonProperty("name")
    String name;

    @JsonProperty("company")
    String company;

    @JsonProperty("blog")
    String blog;

    @JsonProperty("location")
    String location;

    @JsonProperty("email")
    String email;

    @JsonProperty("hireable")
    Boolean hireable;

    @JsonProperty("bio")
    String bio;

    @JsonProperty("twitter_username")
    String twitterUsername;

    @JsonProperty("public_repos")
    Integer publicRepos;

    @JsonProperty("public_gists")
    Integer publicGists;

    @JsonProperty("followers")
    Integer followers;

    @JsonProperty("following")
    Integer following;

    @JsonProperty("created_at")
    String createdAt;

    @JsonProperty("updated_at")
    String updatedAt;

    @JsonProperty("_gists")
    Integer Gists;

    @JsonProperty("total__repos")
    Integer totalRepos;

    @JsonProperty("owned__repos")
    Integer ownedRepos;

    @JsonProperty("disk_usage")
    Integer diskUsage;

    @JsonProperty("collaborators")
    Integer collaborators;

    @JsonProperty("two_factor_authentication")
    Boolean twoFactorAuthentication;

    @JsonProperty("plan")
    GithubUserPlan plan;
}


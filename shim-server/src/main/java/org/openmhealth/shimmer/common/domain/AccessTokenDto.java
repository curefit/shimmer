package org.openmhealth.shimmer.common.domain;


import javax.validation.constraints.NotNull;

public class AccessTokenDto {

    @NotNull
    private long userId;

    @NotNull
    private String shim;

    @NotNull
    private String accessToken;

    public long getUserId() {
        return userId;
    }

    public String getShim() {
        return shim;
    }

    public String getAccessToken() {
        return accessToken;
    }
}

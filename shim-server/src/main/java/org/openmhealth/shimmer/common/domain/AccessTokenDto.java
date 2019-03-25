package org.openmhealth.shimmer.common.domain;


import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;

public class AccessTokenDto {

    @NotNull
    private Long userId;

    @NotEmpty
    private String shim;

    @NotEmpty
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

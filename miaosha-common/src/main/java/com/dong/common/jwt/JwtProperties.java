package com.dong.common.jwt;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author dong
 */
@Data
@Configuration
@ConfigurationProperties(prefix =JwtProperties.JWT_PREFIX )
public class JwtProperties {
    public static final String JWT_PREFIX = "jwt";

    private String header = "Authorization";

    private String secret = "defaultSecret";

    private Long expiration = 604800L;

    private String authPath = "auth";

    private String md5Key = "randomKey";

    private String ignoreUrl = "";
}

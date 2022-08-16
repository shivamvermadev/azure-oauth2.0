package com.start.auth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
import org.springframework.security.oauth2.core.AuthorizationGrantType;
import org.springframework.security.oauth2.core.ClientAuthenticationMethod;
import org.springframework.security.oauth2.core.oidc.IdTokenClaimNames;


@Configuration
public class OAuth2LoginConfig {
	
	@Bean
	public ClientRegistrationRepository clientRegistrationRepository() {
		return new InMemoryClientRegistrationRepository(this.azureClientRegistration());
	}

	private ClientRegistration azureClientRegistration() {
		return ClientRegistration.withRegistrationId("azure")
                .clientId("79ef772a-d6fc-43f1-94db-84a1d1b924f0")
                .clientSecret("2-O8Q~u2SwuvbNZrcSmHzsvbp85peEQYTQm0absf")
                .clientAuthenticationMethod(ClientAuthenticationMethod.CLIENT_SECRET_BASIC)
                .authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE)
                .redirectUri("http://localhost:8090/test")
                .scope("openid", "profile", "email", "address", "phone")
                .authorizationUri("https://login.microsoftonline.com/bdc80e50-4e6b-4b1f-9497-0bb6a43b71e5/oauth2/v2.0/authorize")
                .tokenUri("https://login.microsoftonline.com/bdc80e50-4e6b-4b1f-9497-0bb6a43b71e5/oauth2/v2.0/token")
//                .userInfoUri("https://www.googleapis.com/oauth2/v3/userinfo")
                .userNameAttributeName(IdTokenClaimNames.SUB)
//                .jwkSetUri("https://www.googleapis.com/oauth2/v3/certs")
//                .clientName("google")
                .build();
	}

}

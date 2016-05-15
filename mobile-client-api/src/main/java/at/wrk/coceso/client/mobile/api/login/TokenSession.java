package at.wrk.coceso.client.mobile.api.login;

import at.wrk.coceso.client.mobile.api.Session;

/**
 * A session that is identified by its token.
 */
public class TokenSession implements Session {
    private static final long serialVersionUID = 1L;

    private final String token;

    public TokenSession(final String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}

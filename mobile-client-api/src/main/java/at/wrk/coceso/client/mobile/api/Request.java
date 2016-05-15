package at.wrk.coceso.client.mobile.api;

import java.io.Serializable;

/**
 * Marker interface for requests.
 */
public abstract class Request implements Serializable {
    private static final long serialVersionUID = 1L;

    private Session session;

    public Session getSession() {
        return session;
    }

    public void setSession(final Session session) {
        this.session = session;
    }
}

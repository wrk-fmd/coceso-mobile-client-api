package at.wrk.coceso.client.mobile.api.main;

import java.io.Serializable;

/**
 * Request for all active incidents connected to the currently logged in unit.
 */
public class GetActiveIncidentsRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    private String session;

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }
}

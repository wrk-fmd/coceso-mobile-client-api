package at.wrk.coceso.client.mobile.api.login;

import at.wrk.coceso.client.mobile.api.Response;
import at.wrk.coceso.client.mobile.api.Session;

import java.io.Serializable;

public class LoginResponse extends Response implements Serializable {
    private static final long serialVersionUID = 1L;

    private Session session;

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }
}

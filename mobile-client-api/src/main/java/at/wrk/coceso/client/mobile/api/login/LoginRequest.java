
package at.wrk.coceso.client.mobile.api.login;

import java.io.Serializable;

public class LoginRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    private String username;
    private String password;
    private String gcmId;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGcmId() {
        return gcmId;
    }

    public void setGcmId(String gcmId) {
        this.gcmId = gcmId;
    }

    @Override
    public String toString() {
        return super.toString() + "[" +
                "username=" + getUsername() + "," +
                "password=" + (getPassword() == null ? "<not_set>" : "<set>,") +
                "gcmId=" + getGcmId() +
                "]";
    }
}

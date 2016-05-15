package at.wrk.coceso.client.mobile.api;

import java.io.Serializable;

/**
 * Abstract superclass for all requests to CoCeCl.
 */
public abstract class Response implements Serializable {
    private static final long serialVersionUID = 1L;

    private Boolean success;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(final boolean success) {
        this.success = success;
    }
}

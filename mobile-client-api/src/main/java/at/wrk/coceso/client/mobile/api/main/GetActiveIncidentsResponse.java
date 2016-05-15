package at.wrk.coceso.client.mobile.api.main;


import at.wrk.coceso.client.mobile.api.Response;
import at.wrk.coceso.client.mobile.api.Incident;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Response holding all active incidents of a logged in unit.
 */
public class GetActiveIncidentsResponse extends Response implements Serializable {
    private static final long serialVersionUID = 1L;

    private Collection<Incident> activeIncidents;

    private GetActiveIncidentsResponse() {
        super();
    }

    private GetActiveIncidentsResponse(final Collection<Incident> activeIncidents) {
        super();
        // NullPointerException on given null parameter intended
        this.activeIncidents = new ArrayList<>(activeIncidents);
    }

    public Collection<Incident> getActiveIncidents() {
        return activeIncidents;
    }

    public void setActiveIncidents(Collection<Incident> activeIncidents) {
        this.activeIncidents = activeIncidents;
    }

    public static GetActiveIncidentsResponse create(boolean success, Collection<Incident> activeIncidents) {
        GetActiveIncidentsResponse answer = new GetActiveIncidentsResponse(activeIncidents);
        answer.setSuccess(success);
        return answer;
    }

    @Override
    public String toString() {
        return super.toString() + "[" +
                "success=" + getSuccess() + "," +
                "activeIncidents=" + activeIncidents +
                "]";
    }
}

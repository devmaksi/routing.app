package routing.app.model.routing;

import java.net.URI;
import java.util.List;

public class Server {

    private String toHost;
    private String fromHost;
    private String port;
    private List<URI> uriList;

    public String getFromHost() {
        return fromHost;
    }

    public void setFromHost(String fromHost) {
        this.fromHost = fromHost;
    }

    public String getToHost() {
        return toHost;
    }

    public void setToHost(String toHost) {
        this.toHost = toHost;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public List<URI> getUriList() {
        return uriList;
    }

    public void setUriList(List<URI> uriList) {
        this.uriList = uriList;
    }
}

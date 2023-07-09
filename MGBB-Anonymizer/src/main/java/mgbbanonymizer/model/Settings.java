package mgbbanonymizer.model;

public class Settings {
    
    private String fhirBaseUrl;

    public Settings() {
    }

    public Settings(String fhirBaseUrl) {
        this.fhirBaseUrl = fhirBaseUrl;
    }

    public String getFhirBaseUrl() {
        return fhirBaseUrl;
    }

    public void setFhirBaseUrl(String fhirBaseUrl) {
        this.fhirBaseUrl = fhirBaseUrl;
    }
}

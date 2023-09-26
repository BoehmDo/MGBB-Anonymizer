package mgbbanonymizer.model;

public class Settings {
    
    private String fhirBaseUrl;
    private String fhirTargetUrl;

    public Settings() {
    }

    public Settings(String fhirBaseUrl, String fhirTargetUrl) {
        this.fhirBaseUrl = fhirBaseUrl;
    }

    public String getFhirBaseUrl() {
        return fhirBaseUrl;
    }

    public void setFhirBaseUrl(String fhirBaseUrl) {
        this.fhirBaseUrl = fhirBaseUrl;
    }

    public String getFhirTargetUrl() {
        return fhirTargetUrl;
    }

    public void setFhirTargetUrl(String fhirTargetUrl) {
        this.fhirTargetUrl = fhirTargetUrl;
    }
}

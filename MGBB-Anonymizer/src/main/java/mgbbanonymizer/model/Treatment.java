
package mgbbanonymizer.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "ncit_code",
    "synonyms"
})
public class Treatment {

    @JsonProperty("name")
    private String name;
    @JsonProperty("ncit_code")
    private String ncitCode;
    @JsonProperty("synonyms")
    private String synonyms;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Treatment withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("ncit_code")
    public String getNcitCode() {
        return ncitCode;
    }

    @JsonProperty("ncit_code")
    public void setNcitCode(String ncitCode) {
        this.ncitCode = ncitCode;
    }

    public Treatment withNcitCode(String ncitCode) {
        this.ncitCode = ncitCode;
        return this;
    }

    @JsonProperty("synonyms")
    public String getSynonyms() {
        return synonyms;
    }

    @JsonProperty("synonyms")
    public void setSynonyms(String synonyms) {
        this.synonyms = synonyms;
    }

    public Treatment withSynonyms(String synonyms) {
        this.synonyms = synonyms;
        return this;
    }

}

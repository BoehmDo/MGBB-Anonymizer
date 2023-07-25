package mgbbanonymizer.util;

import org.deidentifier.arx.AttributeType;
import org.deidentifier.arx.AttributeType.Hierarchy;
import org.deidentifier.arx.Data;

public class ArxInitializer {
    
    public static Data defineTherapyRecArxData(Data data) {
        
        //DEFINE IDENTIFIYING ATTRIBUTES
        data.getDefinition().setAttributeType("PatientID", AttributeType.IDENTIFYING_ATTRIBUTE);
        data.getDefinition().setAttributeType("PatientName", AttributeType.IDENTIFYING_ATTRIBUTE);
        data.getDefinition().setAttributeType("PatientBirthDate", AttributeType.IDENTIFYING_ATTRIBUTE);
        
        //DEFINE QUASI-IDENTIFIYING ATTRIBUTES
        //Therapy Recommendation
        data.getDefinition().setAttributeType("Alteration", AttributeType.QUASI_IDENTIFYING_ATTRIBUTE);

        //Alterations
        data.getDefinition().setAttributeType("EntrezGeneId", AttributeType.QUASI_IDENTIFYING_ATTRIBUTE);

        //DEFINE SENSITIVE ATTRIBUTES
        data.getDefinition().setAttributeType("TherapyRecommendation", AttributeType.SENSITIVE_ATTRIBUTE);
        data.getDefinition().setAttributeType("TMB", AttributeType.SENSITIVE_ATTRIBUTE);

        //DEFINE INSENSITIVE ATTRIBUTES
        data.getDefinition().setAttributeType("TherapyRecommendationDate", AttributeType.INSENSITIVE_ATTRIBUTE);

        return data;
    }

    public static Data defineTherapyRecArxHierarchy(Data data) {

        //Define Hierarchies
        Hierarchy hierarchy = Hierarchy.create();
        data.getDefinition().setHierarchy("TherapyRecommendationDate", hierarchy);

        return data;
    }

}

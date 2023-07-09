package mgbbanonymizer;

import java.util.ArrayList;

import org.hl7.fhir.r4.model.Observation;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayList<Observation> therapyRecommendations = ImportUtil.getTherapyRecFromFhirBase();
        ArrayList<Observation> anonymizedTherapyRecommendations = AnonymizationUtil.anonymizeTherapyRecommendations(therapyRecommendations);
        System.out.println(anonymizedTherapyRecommendations);

    }
}

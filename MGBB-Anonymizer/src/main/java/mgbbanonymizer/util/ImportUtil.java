package mgbbanonymizer.util;

import java.nio.charset.Charset;
import java.util.ArrayList;

import mgbbanonymizer.util.ArxInitializer;

import org.deidentifier.arx.AttributeType;
import org.deidentifier.arx.Data;
import org.deidentifier.arx.DataSource;
import org.deidentifier.arx.AttributeType.Hierarchy;
import org.hl7.fhir.r4.model.Observation;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.rest.client.api.IGenericClient;

public class ImportUtil {

    public static void importData(String importType, String path) {
    
        //Define ARX DataSource based on API described in https://arx.deidentifier.org/development/api/
        Data data = null;
        switch (importType) {
            case "FHIR":
                data = getTherapyRecFromFhirBase();
                break;
            case "CSV":
                data = getTherapyRecFromCsv(path);
                break;
            case "EXCEL":
                data = getTherapyRecFromExcel(path);
                break;
        }

        //Define Attributes and Hierarchies based on minimal dataset defined for the anonymized exchange of therapy recommendations
        data = ArxInitializer.defineTherapyRecArxData(data);
        data = ArxInitializer.defineTherapyRecArxHierarchy(data);
    }

    public static Data getTherapyRecFromFhirBase() {

        // Create a context and a client
        FhirContext ctx = FhirContext.forR4();
        String serverBase = "http://hapi.fhr.org/baseR4";
        IGenericClient client = ctx.newRestfulGenericClient(serverBase);
        
        try {
            Data data = Data.create();
            return data;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error while reading data from csv file.");
            return null;
        }
    }

    public static Data getTherapyRecFromCsv(String path) {

        try {
            Data data = Data.create(path, Charset.defaultCharset(), ';');
            return data;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error while reading data from csv file.");
            return null;
        }
    }

    public static Data getTherapyRecFromExcel(String path) {

        try {
            DataSource dataSource = DataSource.createExcelSource(path, 0, true);
            Data data = Data.create(dataSource);
            return data;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error while reading data from Excel file.");
            return null;
        }
    }
    
}

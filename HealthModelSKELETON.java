package org.dgp.decorator;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 100 TOTAL POINTS
 * HealthModel Midterm SOLUTION
 * 
 * Complete the coding in this class.
 * 
 * Use the following Design Patterns:
 *  Adapter, Builder, Composite, Decorator, Factory, Singleton, Strategy
 * 
 * Model a Health Center (HealthCenter) with charts of patient vital signs (VitalsAPI)
 *  vitals represent the measured vital signs (VitalsAPI)
 *  for a patent (Patient), e.g. Boston, NY, DC, etc.
 *  Health Center contain vitals for various patients, e.g. Boston, NY, DC, etc.
 * 
 * Vitals contain only TWO specific metrics: 
 * 	measurement for TEMPERATURE (degrees) AND 
 * 	PULSE rate (beats per minute)
 *  NOTE: Vitals represent:
 *  	compounding symptom of a health concern (malady) affecting patient's vitals
 *  	and also a measurement of a patient's current condition
 * 
 * Utilize one SINGLE factory class (VitalsFactoryAPI)
 *  injected with VARIOUS builder objects (VitalsBuilderAPI):
 *  
 *  	20 POINTS 1. Create Patient builder for NORMAL vital signs of a patient:
 *  	20 POINTS 2. Create Vitals (symptom) builder:
 *  	20 POINTS 3. Create RISK FACTOR Vitals (symptom) builder:
 *  	20 POINTS 4. Create a Patient Vitals builder (Vitals of a Patient with a symptoms):
 *  	20 POINTS 5. Create a REGIONAL Vitals builder  (COMBINED vitals of MULTIPLE patients in a study):
 *  
 *  to create the DIFFERENT patient vitals objects (WeatherAPI)
 *  to initialize the Health Center Bureau.
 *  
 *  DETAILS FOLLOWING IN CLASS
 *  
 */
public class HealthModel {
	private static final int MAJOR_VERSION;
	private static final int MINOR_VERSION;
	private static final String VERSION;
	/** 
	 * use only one factory customized by using Builder objects
	 */
	private static final VitalsFactoryAPI f;

	static {
		MAJOR_VERSION = 1;
		MINOR_VERSION = 8;
		VERSION = MAJOR_VERSION + "." + MINOR_VERSION + "." + 22;
	}
	
	/**
	 * ** STUDENT TODO **
	 * 
	 * HealthCenter class models display of current vital signs for patients with symptoms in Health Center
	 * (Vitals, e.g. TEMPERATURE and PULSE rate for a patient)
	 */
	/**
	 */
	private static class HealthCenter implements Runnable {
		private static final List<VitalsAPI> patientList;
		private static final VitalsBuilderAPI Default;
		private static final VitalsBuilderAPI Patient1;
		private static final VitalsBuilderAPI Patient2;
		private static final VitalsBuilderAPI Patient2b;
		private static final VitalsBuilderAPI Patient2c;
		private static final VitalsBuilderAPI Patient3;
		private static final VitalsBuilderAPI Patient4;
		private static final VitalsBuilderAPI Patient5;
		private static final VitalsBuilderAPI Patient5b;
		private static final VitalsBuilderAPI Patient6;
		private static final VitalsBuilderAPI Patient6a;
		private static final VitalsBuilderAPI Patient5Composite;
		
		/**
		 * ** STUDENT TODO **
		 * 
		 * static initialization block
		 * (executed with class)
		 * used to initialize Health Center
		 */
		static {
			/**
			 * ** STUDENT TODO **
			 * 
			 * use Strategy pattern 
			 * to create Risk Factor Modeling Algorithms which will SPECIFICALLY affect and alter a patient's vitals
			 * AS FOLLOWS:
			 * 	Weather Model A: Increases Temperature by 2 degrees and Increases Pulse rate by 2
			 * 	Weather Model B: Decreases Temperature by 2 degrees and Decreases Pulse by 2
			 */
			RiskFactorStrategyAPI geriatricRF = // ** STUDENT TODO **
			RiskFactorStrategyAPI obeseRF =     // ** STUDENT TODO **
			
			/**
			 * ** STUDENT TODO **
			 * 
			 * Create Builder objects (VitalsBuilderAPI)
			 *  which will be used to create vitals indicating symptoms (VitalsAPI)
			 *  when applied to a patient results in a Patient having one or more Vitals (compounding symptoms)
			 * 
			 * 20 POINTS 1. Create Patient builder for creating current vitals of a patient:
			 * 	use Builder pattern to create a Patient builder,
			 *  e.g. Boston, NY etc., with DEFAULT NORMAL vital signs
			 *  e.g. current temperature of NORMAL_TEMP degrees and a pulse of NORMAL_PULSE rate
			 * 
			 * 20 POINTS 2. Create Vitals (malady symptom) builder:
			 *  use Builder and Decorator patterns to create a Vitals (malady symptoms) decorator
			 *  NOTE: Vitals (malady symptoms) change the current vital signs of a patient.
			 *  
			 * 20 POINTS 3. Create MODELED RISK FACTOR Vitals (malady symptom) builder:
			 *  use Builder, Decorator and Strategy patterns to create a WVitals (malady symptom) decorator
			 *   altered by a RISK FACTOR model
			 *   
			 * 20 POINTS 4. Create a current Vitals builder, Patient with Vitals (malady symptom) affecting a patient current vitals):
			 *  using Builder, Decorator, Factory and Strategy patterns
			 *  to create a Patient affected with one or more Vitals (malady symptom)
			 * 
			 * 20 POINTS 5. Create a STUDY Vitals builder  (COMBINED current vitals from MULTIPLE patients):
			 *  an AVERAGE Vitals from MULTIPLE Patients in a study
			 *  using Adapter, Builder, Composite, Decorator, Factory, Strategy patterns
			 *  to create a COMPOSITE of multiple Patients
			 *  each affected with one or more Vitals (malady symptom)
			 * 
			 * 
			 * 1. Simulate Patient's current vitals: Start with Patient having NORMAL TEMP and NORMAL PULSE
			 * 2. AND ADD to Patient additional Vitals (malady symptom) as specified below
			 *	OR 
			 * 1. Simulate Patient's degrading vitals: Use a PREVIOUS Patient with Vitals (malady symptom)
			 * 2. AND ADD additional Vitals (malady symptom) as specified below
			 *	OR 
			 * 1. Simulate MODELED Patient's current vitals using a RISK FACTOR Model A or B: Start with Patient vitals at NORMAL TEMP and NORMAL PRECIPITATION
			 * 2. AND ADD additional Vitals (malady symptom) ALTERED by RISK FACTOR Model as specified below
			 *	OR 
			 * 1. Simulate multi-patient STUDY current vitals using a Combination of MULTIPLE Patient with Vitals (malady symptom)
			 */
			Default = 
			
			/**
			 * VITALS #1: Patient1 + HYPOTHERMIA TEMPS and CARDIAC_ARRYTHMIA...
			 */
			Patient1 = 
			
			/**
			 * VITALS 2 has degrading vital signs (each successive vitals adds heal conditions to previous vitals) 
			 */
			/**
			 * VITALS #2: Boston + LOW TEMPS and RAPID PULSE...
			 */
			Patient2 = 
			/**
			 * VITALS #3: Forecast #2 + LOW TEMPS and RAPID PULSE...
			 */
			Patient2b = 
			/**
			 * VITALS #4: Forecast #3 + LOW TEMPS and RAPID PULSE...
			 */
			Patient2c = 
			
			/**
			 * VITALS #5: Patient3 + FEVER TEMPS and ElEVATED PULSE...
			 */
			Patient3 = 
			/**
			 * VITALS #6: Patient4 + FEVER TEMPS and ElEVATED PULSE...
			 */
			Patient4 = 
			
			/**
			 * VITALS #7: Patient5 + FEVER TEMPS and ElEVATED PULSE...
			 */
			Patient5 = 
			/**
			 * VITALS #8: MODELED from Model B (weatherModelB): Patient5b + FEVER TEMPS and ElEVATED PULSE...
			 */
			Patient5b = 

			/**
			 * VITALS #9: Patient6 + HYPERTHERMIA TEMPS and TACHYCARDIA PULSE...
			 */
			Patient6 = 
			/**
			 * VITALS #10: MODELED from Model A (weatherModelA): Patient6a + FEVER TEMPS and ElEVATED PULSE...
			 */
			Patient6a = 
			
			/**
			 * VITALS #11: STUDY Patient 3,4 & 5 (VITALS #5,#6 & #7) COMBINED (AVERAGED VITALS METRICS) 3-Patient STUDY VITALS...
			 */
			Patient5Composite = 

			/**
			 */
			
			/**
			 * GIVEN:
			 * use the one and only builder factory with different builder objects
			 * to create the vital signs object for each patient
			 * and initialize all patient vitals in Health Center
			 */
			VitalsAPI[] initializedPatientArray = {
					f.getObject(Default),
					f.getObject(Patient1),
					f.getObject(Patient2),
					f.getObject(Patient3),
					f.getObject(Patient4),
					f.getObject(Patient5),
					f.getObject(Patient5b),
					f.getObject(Patient6),
					f.getObject(Patient6a),
					f.getObject(Patient5Composite),
			};
			patientList = new ArrayList<VitalsAPI>(Arrays.asList(initializedPatientArray));
		}

		@Override
		public void run() {
			System.out.println(this);
		}
		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			
			for (VitalsAPI locale : patientList) {
				sb.append(locale).append("\n");
			}
			return sb.toString();
		}
		
	}
	
	/**
	 * interface VitalsAPI implemented by each set of vital signs for for each patient
	 */
	private interface VitalsAPI {
		int HYPOTHERMIA_TEMP_OFFSET = -30;
		int LOW_TEMP_OFFSET = -10;
		int FEVER_TEMP_OFFSET = 10;
		int HYPERTHERMIA_TEMP_OFFSET = 20;
		int NORMAL_TEMP = 95;
		int NORMAL_PULSE = 60;
		int RAPID_PULSE_OFFSET = 10;
		int ElEVATED_PULSE_OFFSET = 30;
		int TACHYCARDIA_OFFSET = 60;
		int CARDIAC_ARRYTHMIA_OFFSET = 80;
		DecimalFormat fmt = new DecimalFormat("##.##");
		
		String getName();
		int getTemperature();
		int getPulse();
		
		default String vitalsToString() {
			StringBuilder sb = new StringBuilder("Vital Signs for ");

			sb.append(getName());
			sb.append(" temp ").append(getTemperature()).append(" degrees");
			sb.append(" pulse ").append(getPulse()).append(" beats per minute");

			return sb.toString();
		}
	}
	/**
	 * ** STUDENT TODO **
	 * 
	 * interface VitalsBuilderAPI
	 */
	
	/**
	 * ** STUDENT TODO **
	 * 
	 * interface VitalsFactoryAPI
	 */
	
	/**
	 * ** STUDENT TODO **
	 * 
	 * class VitalsBuilderFactory
	 */

	/**
	 * ** STUDENT TODO **
	 * 
	 * VitalsEnumSingletonFactory
	 */

	
	/**
	 * ** STUDENT TODO **
	 * 
	 * class VitalsDecoratorAPI
	 */
	private static abstract class VitalsDecoratorAPI implements VitalsAPI {
		public String toString() {
			return vitalsToString();
		}
	}

	/**
	 * ** STUDENT TODO **
	 * 
	 * Patient class represents the patient with current normal vital signs
	 */

	/**
	 * ** STUDENT TODO **
	 * 
	 * VitalsDecorator class represents a symptom of a compounding health condition
	 * contributing to a patient's vitals
	 */

	/**
	 * ** STUDENT TODO **
	 *  
	 *   interface RiskFactorStrategyAPI
	 *   
	 * Strategy pattern
	 */


	/**
	 * ** STUDENT TODO **
	 * 
	 *  interface StudyPatientComponentAPI
	 *  
	 * Composite pattern
	 */
	private interface StudyPatientComponentAPI {
		int getSize();
		String getName();
		int getTemperature();
		int getPulse();
	}	
	
	/**
	 * ** STUDENT TODO **
	 * 
	 * class StudyPatientComponentBase
	 * 
	 * Study Patient Component API class abstraction for all patients under study 
	 * (composite and leaf alike)
	 * @author dpeters
	 *
	 */

	/**
	 * ** STUDENT TODO **
	 * 
	 * class StudyPatientLeaf is a study of a single Patient (Leaf object with no children)
	 * Adapts a VitalsAPI object to StudyPatientComponentAPI
	 */
	private static class StudyPatientLeafAdapter extends StudyPatientComponentBase {

		
		@Override
		public String toString() {
			return vitalsToString();
		}

	}
	/**
	 * ** STUDENT TODO **
	 * 
	 * class CompositeStudyPatient is a sample group of patients under study (composite object with children)
	 * representing a study of a group of patients treated as a sample (results averaged)
	 */
	private static class CompositeStudyPatientAdapter extends StudyPatientComponentBase {

		
		@Override
		public String toString() {
			return vitalsToString();
		}

	}



	/**
	 * GIVEN:
	 * 
	 * demonstrate the use of this class
	 */
	public static void demo() {
		System.out.println("\n\t" + HealthModel.class.getName() + ".demo() [version " + VERSION + "]...");
		
		System.out.println("\n\t *** TODAY's PATIENT CHARTS: *** \n");

		new HealthCenter().run();
		
		System.out.println("\n\t" + HealthModel.class.getName() + ".demo() [version " + VERSION + "]... done!");
	}
}

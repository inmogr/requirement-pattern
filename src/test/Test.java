package test;

//import java.util.Date;
//
//import org.inmogr.java.web.software.development.requirements.classes.Author;
//import org.inmogr.java.web.software.development.requirements.classes.Classification;
//import org.inmogr.java.web.software.development.requirements.classes.Consideration;
//import org.inmogr.java.web.software.development.requirements.classes.Context;
//import org.inmogr.java.web.software.development.requirements.classes.PatternRelation;
//import org.inmogr.java.web.software.development.requirements.classes.Requirement;
//import org.inmogr.java.web.software.development.requirements.classes.RequirementPattern;
//import org.inmogr.java.web.software.development.requirements.operations.Converter;
//import org.inmogr.java.web.software.development.requirements.classes.SPLDomain;
//import org.inmogr.java.web.software.development.requirements.classes.Solution;
//import org.inmogr.java.web.software.development.requirements.classes.Stakeholder;
//import org.inmogr.java.web.software.development.requirements.classes.User;
//import org.inmogr.java.web.software.development.requirements.classes.extended.MyDate;
//
//import com.google.gson.Gson;
//import com.google.gson.JsonObject;
//import com.google.gson.JsonParser;

public class Test {
	
//	public static void main(String[] args) {
////		System.out.println("I'm test");
////		Requirement requirement = new Requirement();
////		requirement.setReqName("Test domain");
////		requirement.setReqID(0);
////		requirement.setPatternName("Test pattern");
////		requirement.setReqType("none");
////		RequirementPattern r = new RequirementPattern();
////		r.setSolution(new Solution());
////		SPLDomain domain = new SPLDomain();
////		domain.setDateCreated(new Date());
////		Gson gson = new Gson();
////		System.out.println(gson.toJson(domain).toString());
////		System.out.println(gson.toJson(r).toString());
////		System.out.println(gson.toJson(new Sample()).toString());
////		User user = new User();
////		user.setfName("Morhaf");
////		user.setlName("Shamia");
////		user.setPassword("test");
////		user.setUsername("email");
////		JsonObject myJson;
////		myJson = getJsonObject(user);
////		for (String key : myJson.keySet()) {
////			System.out.println(key + " => " + myJson.get(key).getAsString());
////		}
////		Test1 t = new Test1();
////		myJson = getJsonObject(t);
////		printAll(myJson);
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		RequirementPattern requirementPattern = new RequirementPattern();
//		requirementPattern.setPatternID(0);
//		requirementPattern.setPatternName("PatternName");
//		requirementPattern.setAKA("AKA");
//		requirementPattern.setKnownUses("KnownUses");
//		requirementPattern.setApplication("Application");
//		requirementPattern.setSPLDomainName("SPLDomainName");
//		requirementPattern.setProblem("Problem");
//		requirementPattern.setForce("Force");
//		requirementPattern.setExample("Example");
//		Author author = new Author();
//		author.setName("name");
//		author.setDate(new Date());
//		requirementPattern.setAuthor(author);
//		Classification classification = new Classification();
//		classification.setAllowedValue(true);
//		Stakeholder stakeholder = new Stakeholder();
//		stakeholder.setRole("role");
//		stakeholder.setStakeGoal("stakeGoal");
//		classification.setAudience(stakeholder);
//		classification.setClassType("ClassType");
//		classification.setDefaultValue("defaultValue");
//		classification.setPurpose("purpose");
//		requirementPattern.setClassification(classification);
//		Consideration consideration = new Consideration();
//		consideration.setConConstraint("conConstraint");
//		consideration.setConDescription("conDescription");
//		consideration.setConPurpose("conPurpose");
//		requirementPattern.setConsideration(consideration);
//		Context context = new Context();
//		context.setBussinessDomain("BussinessDomain");
//		context.setOrganizationFactor("organizationFactor");
//		context.setPatternType("patternType");
//		context.setReqAct("reqAct");
//		context.setStakeholder(stakeholder);
//		requirementPattern.setContext(context);
//		requirementPattern.setRelatedPatternID(0);
//		PatternRelation patternRelation = new PatternRelation();
//		patternRelation.setRelationExtends(false);
//		patternRelation.setRelationRefers(true);
//		requirementPattern.setRelationType(patternRelation);
////		System.out.println(getJsonObject(requirementPattern).toString());
////		try {
////			RequirementPattern rp = new Gson().fromJson(getJsonObject(requirementPattern), RequirementPattern.class);
////			System.out.println(getJsonObject(rp).toString());
////			getObject(RequirementPattern.class);
////		} catch (Exception e) {
////			// TODO: handle exception
////		}
//		JsonObject j1 = Converter.getJsonObject(requirementPattern);
//		RequirementPattern o1 = (RequirementPattern) Converter.getObject(j1, new RequirementPattern());
//		JsonObject j2 = Converter.getJsonObject(o1);
//		System.out.println(j1.toString());
//		System.out.println(j2.toString());
//		
//	}
//
//	private static void getObject(Class<RequirementPattern> class1) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private static JsonObject getJsonObject(Object ofObject) {
//		return new JsonParser().parse(new Gson().toJson(ofObject)).getAsJsonObject();
//	}
//	
//	private static void printAll(JsonObject json) {
//		for (String key : json.keySet()) {
//			if (json.get(key).isJsonObject()) {
//				printAll(json.get(key).getAsJsonObject());
//			}
//			else {
//				System.out.println(key + " => " + json.get(key).getAsString());
//			}
//		}
//	}
//	
//}
//
//class Test1 {
//	Test2 test = new Test2();
//}
//
//class Test2 {
//	String a = "empty";
//	String b = "empty";
}
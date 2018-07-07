package org.inmogr.java.web.software.development.requirements.beans;

//import java.util.ArrayList;
//import java.util.Map;

public class PrintBeanOLD extends ListItems {
	
//	public SPLDomainBean objectOfSPLDomain;
//	public RequirementPatternBean objectOfRequirementPattern;
//	public SolutionBean objectOfSolution;
//	public ArrayList<RequirementBean> listOfRequirement;
//	public ArrayList<ArrayList<CommonReqBean>> listOfCommonReq;
//	public ArrayList<ArrayList<VariableReqBean>> listOfVariableReq;
//	
//	public void setData(ListItems listItems) {
//		setSPLDomainName(listItems.getSPLDomainName());
//		setPatternID(listItems.getPatternID());
//		setSolutionID(listItems.getSolutionID());
//		setCommonRequirements(listItems.getCommonRequirements());
//		setVariableRequirements(listItems.getVariableRequirements());
//	}
//	
//	public void fetch() {
//		objectOfSPLDomain = new SPLDomainBean();
//		objectOfSPLDomain.setSPLDomainName(getSPLDomainName());
//		objectOfSPLDomain.fetch();
//		objectOfRequirementPattern = new RequirementPatternBean();
//		objectOfRequirementPattern.setPatternID(getPatternID());
//		objectOfRequirementPattern.fetch();
//		objectOfSolution = new SolutionBean();
//		objectOfSolution.setSolutionID(getSolutionID());
//		objectOfSolution.fetch();
//		//
//		//
//		//
//		//
//		//
//		listOfRequirement = new ArrayList<>();
//		listOfCommonReq = new ArrayList<>();
//		listOfVariableReq = new ArrayList<>();
//		//
//		//
//		//
//		//
//		for (String requirementID : getCommonRequirements().keySet()) {
//			double theRequirementID = Double.parseDouble(requirementID);
//			RequirementBean requirement = new RequirementBean();
//			requirement.setReqID(theRequirementID);
//			requirement.fetch();
//			listOfRequirement.add(requirement);
//			//
//			//
//			//
//			//
//			ArrayList<CommonReqBean> partialList = new ArrayList<>();
//			for (String commonReqID : getCommonRequirements().get(requirementID)) {
//				int theCommonReqID = Integer.parseInt(commonReqID);
//				CommonReqBean commonReq = new CommonReqBean();
//				commonReq.setCommonReqID(theCommonReqID);
//				commonReq.fetch();
//				partialList.add(commonReq);
//			}
//			listOfCommonReq.add(partialList);
//		}
//		for (String requirementID : getVariableRequirements().keySet()) {
//			ArrayList<VariableReqBean> partialList = new ArrayList<>();
//			for (String variableReqID : getVariableRequirements().get(requirementID)) {
//				int theVariableReqID = Integer.parseInt(variableReqID);
//				VariableReqBean variableReq = new VariableReqBean();
//				variableReq.setVariableReqID(theVariableReqID);
//				variableReq.fetch();
//				partialList.add(variableReq);
//			}
//			listOfVariableReq.add(partialList);
//		}
//	}
//	
//	public void setCommonRequirements(Map<String, ArrayList<String>> commonRequirements) {
//		this.commonRequirements = commonRequirements;
//	}
//	
//	public void setVariableRequirements(Map<String, ArrayList<String>> variableRequirements) {
//		this.variableRequirements = variableRequirements;
//	}
//	
//	public RequirementPatternBean fetchIfHasRelatives(int patternID, int relatedPatternID) {
//		if (patternID == relatedPatternID || relatedPatternID == 0) {
//			return new RequirementPatternBean();
//		}
//		RequirementPatternBean response = new RequirementPatternBean();
//		response.setPatternID(relatedPatternID);
//		response.fetch();
//		return response;
//	}
	
}

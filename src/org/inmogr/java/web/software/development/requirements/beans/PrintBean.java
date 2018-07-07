package org.inmogr.java.web.software.development.requirements.beans;

import java.util.ArrayList;

public class PrintBean extends ListItemsExt {
	
	public int indexOfRP;
	
	public SPLDomainBean objectOfSPLDomain;
	public ArrayList<RequirementPatternBean> listOfRequirementPattern;
	public ArrayList<SolutionBean> listOfSolution;
	public ArrayList<ArrayList<RequirementBean>> listOfRequirement;
	public ArrayList<ArrayList<ArrayList<CommonReqBean>>> listOfCommonReq;
	public ArrayList<ArrayList<ArrayList<VariableReqBean>>> listOfVariableReq;
	
	public void setData(ListItemsExt listItems) {
		setSPLDomainName(listItems.getSPLDomainName());
		requirementPatterns = listItems.requirementPatterns;
	}
	
	public void fetch() {
		//
		//
		listOfRequirementPattern = new ArrayList<>();
		listOfSolution = new ArrayList<>();
		listOfRequirement = new ArrayList<>();
		listOfCommonReq = new ArrayList<>();
		listOfVariableReq = new ArrayList<>();
		//
		//
		objectOfSPLDomain = new SPLDomainBean();
		objectOfSPLDomain.setSPLDomainName(getSPLDomainName());
		objectOfSPLDomain.fetch();
		for (String key : requirementPatterns.keySet()) {
			//
			// requirement pattern
			int patternID = requirementPatterns.get(key).getPatternID();
			RequirementPatternBean requirementPattern = fetchRequirementPattern(patternID);
			listOfRequirementPattern.add(requirementPattern);
			//
			// solution
			int solutionID = requirementPatterns.get(key).getSolutionID();
			SolutionBean solution = fetchSolution(solutionID);
			listOfSolution.add(solution);
			//
			//
			// requirement
			ArrayList<RequirementBean> partialListOfRequirement = new ArrayList<>();
			ArrayList<ArrayList<CommonReqBean>> tempHolderOfIterationCommonReq = new ArrayList<>();
			ArrayList<ArrayList<VariableReqBean>> tempHolderOfIterationVariableReq = new ArrayList<>();
			//
			for (String requirementID : requirementPatterns.get(key).getCommonRequirements().keySet()) {
				//
				// requirement
				RequirementBean requirement = fetchRequirement(requirementID);
				partialListOfRequirement.add(requirement);
				//
				//
				// common requirement
				ArrayList<CommonReqBean> partialListOfCommonReq = new ArrayList<>();
				//
				for (String commonReqID : requirementPatterns.get(key).getCommonRequirements().get(requirementID)) {
					//
					// common requirement
					CommonReqBean commonReq = fetchCommonReq(commonReqID);
					partialListOfCommonReq.add(commonReq);
				}
				// adding the collected common requirements to the list @tempHolderOfIterationCommonReq
				tempHolderOfIterationCommonReq.add(partialListOfCommonReq);
				// end of common requirement
				//
				//
				// variable requirement
				ArrayList<VariableReqBean> partialListOfVariableReq = new ArrayList<>();
				//
				for (String variableReqID : requirementPatterns.get(key).getVariableRequirements().get(requirementID)) {
					//
					// variable requirement
					VariableReqBean variableReq = fetchVariableReq(variableReqID);
					partialListOfVariableReq.add(variableReq);
				}
				// adding the collected common requirements to the list @tempHolderOfIterationVariableReq
				tempHolderOfIterationVariableReq.add(partialListOfVariableReq);
				// end of variable requirement
				//
				//
				// end of requirement
			}
			// adding the collected requirements to the list @listOfRequirement
			listOfRequirement.add(partialListOfRequirement);
			listOfCommonReq.add(tempHolderOfIterationCommonReq);
			listOfVariableReq.add(tempHolderOfIterationVariableReq);
			//
			//
			// end of requirement pattern
		} // go to next iteration or end
	}
	
	public RequirementPatternBean fetchIfHasRelatives(int patternID, int relatedPatternID) {
		if (patternID == relatedPatternID || relatedPatternID == 0) {
			return new RequirementPatternBean();
		}
		return fetchRequirementPattern(relatedPatternID);
	}
	
	//
	//
	//
	//
	//
	//
	//

	private RequirementPatternBean fetchRequirementPattern(int patternID) {
		RequirementPatternBean requirementPattern = new RequirementPatternBean();
		requirementPattern.setPatternID(patternID);
		requirementPattern.fetch();
		return requirementPattern;
	}
	
	private SolutionBean fetchSolution(int solutionID) {
		SolutionBean solution = new SolutionBean();
		solution.setSolutionID(solutionID);
		solution.fetch();
		return solution;
	}

	private RequirementBean fetchRequirement(String requirementID) {
		double theRequirementID = Double.parseDouble(requirementID);
		RequirementBean requirement = new RequirementBean();
		requirement.setReqID(theRequirementID);
		requirement.fetch();
		return requirement;
	}
	
	private CommonReqBean fetchCommonReq(String commonReqID) {
		int theCommonReqID = Integer.parseInt(commonReqID);
		CommonReqBean commonReq = new CommonReqBean();
		commonReq.setCommonReqID(theCommonReqID);
		commonReq.fetch();
		return commonReq;
	}

	private VariableReqBean fetchVariableReq(String variableReqID) {
		int theVariableReqID = Integer.parseInt(variableReqID);
		VariableReqBean variableReq = new VariableReqBean();
		variableReq.setVariableReqID(theVariableReqID);
		variableReq.fetch();
		return variableReq;
	}
	
	//
	//
	//
	//
	//
	
	public void setIndexOfRP(int indexOfRP) {
		this.indexOfRP = indexOfRP;
	}
	
	public boolean hasData() {
		return requirementPatterns != null && requirementPatterns.size() != 0;
	}
	
}

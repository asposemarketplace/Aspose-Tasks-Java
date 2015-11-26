/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.resourceassignments.assignmentbudget.java;

import com.aspose.tasks.*;

public class AssignmentBudget
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/resourceassignments/assignmentbudget/data/";

	Project prj = new Project(dataDir + "project5.mpp");

	for(ResourceAssignment ra:prj.getResourceAssignments())
	{
     		System.out.println(ra.get(Asn.BUDGET_COST));
     		System.out.println(ra.get(Asn.BUDGET_WORK).toString());
	}  
      
    }
}





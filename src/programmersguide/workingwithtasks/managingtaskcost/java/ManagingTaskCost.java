/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithtasks.managingtaskcost.java;

import com.aspose.tasks.*;

public class ManagingTaskCost
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
	String dataDir = "src/programmersguide/workingwithtasks/managingtaskcost/data/";  

	Project project = new Project();
	Task task = project.getRootTask().getChildren().add("Task");
	
	task.set(Tsk.COST, BigDecimal.valueOf(800));

	System.out.println(task.get(Tsk.REMAINING_COST));
	System.out.println(task.get(Tsk.FIXED_COST));
	System.out.println(task.get(Tsk.COST_VARIANCE));
	System.out.println(project.getRootTask().get(Tsk.COST));
	System.out.println(project.getRootTask().get(Tsk.FIXED_COST));
	System.out.println(project.getRootTask().get(Tsk.REMAINING_COST));
	System.out.println(project.getRootTask().get(Tsk.COST_VARIANCE));
    }
}





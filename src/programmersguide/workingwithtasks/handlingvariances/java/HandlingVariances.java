/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithtasks.handlingvariances.java;

import com.aspose.tasks.*;

public class HandlingVariances
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
	String dataDir = "src/programmersguide/workingwithtasks/handlingvariances/data/";  

	Project project = new Project();
	Task task = project.getRootTask().getChildren().add("Task");
	java.util.Calendar cal = java.util.Calendar.getInstance();
	cal.set(2014, 2, 15, 8, 0, 0);
	project.set(Prj.START_DATE, cal.getTime());
	task.set(Tsk.DURATION, project.getDuration(2));

	project.setBaseline(BaselineType.Baseline);
	cal.set(2013, 11, 29, 8, 0, 0);
	task.set(Tsk.START, cal.getTime());
	cal.set(2013, 11, 27, 8, 0, 0);
	task.set(Tsk.STOP, cal.getTime());  
    }
}





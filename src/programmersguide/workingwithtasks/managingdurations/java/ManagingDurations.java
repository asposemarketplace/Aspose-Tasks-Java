/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithtasks.managingdurations.java;

import com.aspose.tasks.Project;
import com.aspose.tasks.SaveFileFormat;
import com.aspose.tasks.Task;
import com.aspose.tasks.TimeUnitType;

public class ManagingDurations
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithtasks/managingdurations/data/";
	
	// Create a new project
	Project project = new Project();
	Task task = project.getRootTask().getChildren().add("Task");

	// task duration in days (default time unit)
	Duration duration = task.get(Tsk.DURATION);
	System.out.println("Duration in Days" + duration.toString());

	// convert to hours time unit
	duration = duration.convert(TimeUnitType.Hour);
	System.out.println("Duration in Hours"+ duration.toString());

	// get Duration instance
	task.set(Tsk.DURATION, project.getDuration(1, TimeUnitType.Week));
	System.out.println("1 wk" +  task.get(Tsk.DURATION).toString());

	// Decrease task duration
	task.set(Tsk.DURATION, task.get(Tsk.DURATION).subtract(0.5));
	System.out.println("0.5 wks" + task.get(Tsk.DURATION).toString());
    }
}





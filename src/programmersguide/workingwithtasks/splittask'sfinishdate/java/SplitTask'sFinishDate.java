/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithtasks.splittask'sfinishdate.java;

import com.aspose.tasks.*;

public class SplitTask'sFinishDate
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
	String dataDir = "src/programmersguide/workingwithtasks/splittask'sfinishdate/data/";

	//Read project
	String projectName = "SplitTaskProject.mpp";
	Project project = new Project(projectName);

	//Find a split task
	Task splitTask = project.getRootTask().getChildren().getByUid(1);

	//Find the project calendar
	Calendar calendar = project.get(Prj.CALENDAR);

	//Calculate task's finish date with different durations
	System.out.println("Start Date: " + splitTask.get(Tsk.START) + "\n+ Duration 8 hours\nFinish Date: " + calendar.getTaskFinishDateFromDuration(splitTask, 8d));
	System.out.println("Start Date: " + splitTask.get(Tsk.START) + "\n+ Duration 16 hours\nFinish Date: " + calendar.getTaskFinishDateFromDuration(splitTask, 16d));
	System.out.println("Start Date: " + splitTask.get(Tsk.START) + "\n+ Duration 24 hours\nFinish Date: " + calendar.getTaskFinishDateFromDuration(splitTask, 24d));
	System.out.println("Start Date: " + splitTask.get(Tsk.START) + "\n+ Duration 28 hours\nFinish Date: " + calendar.getTaskFinishDateFromDuration(splitTask, 28d));
	System.out.println("Start Date: " + splitTask.get(Tsk.START) + "\n+ Duration 32 hours\nFinish Date: " + calendar.getTaskFinishDateFromDuration(splitTask, 32d));
	System.out.println("Start Date: " + splitTask.get(Tsk.START) + "\n+ Duration 46 hours\nFinish Date: " + calendar.getTaskFinishDateFromDuration(splitTask, 46d));
	System.out.println("Start Date: " + splitTask.get(Tsk.START) + "\n+ Duration 61 hours\nFinish Date: " + calendar.getTaskFinishDateFromDuration(splitTask, 61d));
	System.out.println("Start Date: " + splitTask.get(Tsk.START) + "\n+ Duration 75 hours\nFinish Date: " + calendar.getTaskFinishDateFromDuration(splitTask, 75d));
	System.out.println("Start Date: " + splitTask.get(Tsk.START) + "\n+ Duration 80 hours\nFinish Date: " + calendar.getTaskFinishDateFromDuration(splitTask, 80d));
	System.out.println("Start Date: " + splitTask.get(Tsk.START) + "\n+ Duration 120 hours\nFinish Date: " + calendar.getTaskFinishDateFromDuration(splitTask, 120d));
	System.out.println("Start Date: " + splitTask.get(Tsk.START) + "\n+ Duration 150 hours\nFinish Date: " + calendar.getTaskFinishDateFromDuration(splitTask, 150d));
        
    }
}





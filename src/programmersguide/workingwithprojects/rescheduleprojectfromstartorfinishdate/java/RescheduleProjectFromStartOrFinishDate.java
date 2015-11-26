/*
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package programmersguide.workingwithprojects.rescheduleprojectfromstartorfinishdate.java;

import com.aspose.tasks.DayType;
import com.aspose.tasks.Project;
import com.aspose.tasks.ProjectReader;
import com.aspose.tasks.SaveFileFormat;

import java.io.FileInputStream;

public class RescheduleProjectFromStartOrFinishDate
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithprojects/rescheduleprojectfromstartorfinishdate/data/";

        schedulefromstart();

	schedulefromfinish();

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }

    public static void schedulefromstart()
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithprojects/rescheduleprojectfromstartorfinishdate/data/";

        Project project = new Project(dataDir + "Project.mpp");
        project.set(Prj.SCHEDULE_FROM_START, new NullableBool(true));
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.set(2020, 1, 1, 0, 0, 0);
        project.set(Prj.FINISH_DATE, cal.getTime());

        // Now all tasks dates (Start, Finish, EarlyStart, EarlyFinish, LateStart, LateFinish) are calculated.
        // To get the critical path we need to calculate slacks (can be invoked in separate thread, but only after calculation of all early/late dates)
        project.recalculate();
        TaskCollection criticalPath = project.getCriticalPath();
    }

    public static void schedulefromfinish()
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithprojects/rescheduleprojectfromstartorfinishdate/data/";

        Project project = new Project(dataDir + "Project.mpp");
        project.set(Prj.SCHEDULE_FROM_START, new NullableBool(false));
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.set(2020, 1, 1, 0, 0, 0);
        project.set(Prj.FINISH_DATE, cal.getTime());

        // Now all tasks dates (Start, Finish, EarlyStart, EarlyFinish, LateStart, LateFinish) are calculated.
        // To get the critical path we need to calculate slacks (can be invoked in separate thread, but only after calculation of all early/late dates)
        project.recalculate();
        TaskCollection criticalPath = project.getCriticalPath();
    }     
}





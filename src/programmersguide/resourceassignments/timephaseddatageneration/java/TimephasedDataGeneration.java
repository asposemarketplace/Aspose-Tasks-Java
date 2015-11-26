/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.resourceassignments.timephaseddatageneration.java;

import com.aspose.tasks.*;

public class TimephasedDataGeneration
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/resourceassignments/timephaseddatageneration/data/";
	
	//Read the source MPP file
	Project project = new Project(dataDir + "SampleFile.Mpp");

	//Get the first task of the Project
	Task task = project.getRootTask().getChildren().getById(1);

	//Get the First Resource Assignment of the Project
	ResourceAssignment firstRA = project.getResourceAssignments().toList().get(0);

	// Flat contour is default contour
	System.out.println("Flat contour");
	for (TimephasedData td:task.getTimephasedData(project.get(Prj.START_DATE), project.get(Prj.FINISH_DATE)))
	{
    		System.out.println(td.getStart().toString() + " " + td.getValue());
	}

	// Change contour
	firstRA.set(Asn.WORK_CONTOUR, WorkContourType.Turtle);
	System.out.println("Turtle contour");
	for (TimephasedData td:task.getTimephasedData(project.get(Prj.START_DATE), project.get(Prj.FINISH_DATE)))
	{
		System.out.println(td.getStart().toString() + " " + td.getValue());
	}

	// Change contour
	firstRA.set(Asn.WORK_CONTOUR, WorkContourType.BackLoaded);
	System.out.println("BackLoaded contour");
	for (TimephasedData td:task.getTimephasedData(project.get(Prj.START_DATE), project.get(Prj.FINISH_DATE)))
	{
		System.out.println(td.getStart().toString() + " " + td.getValue());
	}

	// Change contour
	firstRA.set(Asn.WORK_CONTOUR, WorkContourType.FrontLoaded);
	System.out.println("FrontLoaded contour");
	for (TimephasedData td:task.getTimephasedData(project.get(Prj.START_DATE), project.get(Prj.FINISH_DATE)))
	{
		System.out.println(td.getStart().toString() + " " + td.getValue());
	}

	// Change contour
	firstRA.set(Asn.WORK_CONTOUR, WorkContourType.Bell);
	System.out.println("Bell contour");
	for (TimephasedData td:task.getTimephasedData(project.get(Prj.START_DATE), project.get(Prj.FINISH_DATE)))
	{
		System.out.println(td.getStart().toString() + " " + td.getValue());
	}

	// Change contour
	firstRA.set(Asn.WORK_CONTOUR, WorkContourType.EarlyPeak);
	System.out.println("EarlyPeak contour");
	for (TimephasedData td:task.getTimephasedData(project.get(Prj.START_DATE), project.get(Prj.FINISH_DATE)))
	{
		System.out.println(td.getStart().toString() + " " + td.getValue());
	}

	// Change contour
	firstRA.set(Asn.WORK_CONTOUR, WorkContourType.LatePeak);
	System.out.println("LatePeak contour");
	for (TimephasedData td:task.getTimephasedData(project.get(Prj.START_DATE), project.get(Prj.FINISH_DATE)))
	{
		System.out.println(td.getStart().toString() + " " + td.getValue());
	}
	// Change contour
	firstRA.set(Asn.WORK_CONTOUR, WorkContourType.DoublePeak);
	System.out.println("DoublePeak contour");
	for (TimephasedData td:task.getTimephasedData(project.get(Prj.START_DATE), project.get(Prj.FINISH_DATE)))
	{
		System.out.println(td.getStart().toString() + " " + td.getValue());
	}
        
    }
}





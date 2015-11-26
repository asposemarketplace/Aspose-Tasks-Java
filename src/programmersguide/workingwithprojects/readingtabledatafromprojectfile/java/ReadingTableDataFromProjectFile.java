/*
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package programmersguide.workingwithprojects.readingtabledatafromprojectfile.java;

import com.aspose.tasks.DayType;
import com.aspose.tasks.Project;
import com.aspose.tasks.ProjectReader;
import com.aspose.tasks.SaveFileFormat;

import java.io.FileInputStream;

public class ReadingTableDataFromProjectFile
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithprojects/readingtabledatafromprojectfile/data/";
	
	Project project = new Project(dataDir + "TASKS_33579\\Project2003.mpp");

	Table t1 = project.getTables().toList().get(0);
	System.out.println("Table Fields Count" + t1.getTableFields().size());

	TableField f = t1.getTableFields().get(0);
	System.out.println("Field width: " + f.getWidth());
	System.out.println("Field Title: " + f.getTitle());
	System.out.println("Field Title Alignment: " + f.getAlignTitle());
	System.out.println("Field Align Data: " + f.getAlignData());

	f = t1.getTableFields().get(1);
	System.out.println("Field width: " + f.getWidth());
	System.out.println("Field Title: " + f.getTitle());
	System.out.println("Field Title Alignment: " + f.getAlignTitle());
	System.out.println("Field Align Data: " + f.getAlignData());

	f = t1.getTableFields().get(2);
	System.out.println("Field width: " + f.getWidth());
	System.out.println("Field Title: " + f.getTitle());
	System.out.println("Field Title Alignment: " + f.getAlignTitle());
	System.out.println("Field Align Data: " + f.getAlignData());
	
	f = t1.getTableFields().get(3);
	System.out.println("Field width: " + f.getWidth());
	System.out.println("Field Title: " + f.getTitle());
	System.out.println("Field Title Alignment: " + f.getAlignTitle());
	System.out.println("Field Align Data: " + f.getAlignData());
	
	f = t1.getTableFields().get(4);
	System.out.println("Field width: " + f.getWidth());
	System.out.println("Field Title: " + f.getTitle());
	System.out.println("Field Title Alignment: " + f.getAlignTitle());
	System.out.println("Field Align Data: " + f.getAlignData());
	
	f = t1.getTableFields().get(5);
	System.out.println("Field width: " + f.getWidth());
	System.out.println("Field Title: " + f.getTitle());
	System.out.println("Field Title Alignment: " + f.getAlignTitle());
	System.out.println("Field Align Data: " + f.getAlignData());

	f = t1.getTableFields().get(6);
	System.out.println("Field width: " + f.getWidth());
	System.out.println("Field Title: " + f.getTitle());
	System.out.println("Field Title Alignment: " + f.getAlignTitle());
	System.out.println("Field Align Data: " + f.getAlignData());

	f = t1.getTableFields().get(7);
	System.out.println("Field width: " + f.getWidth());
	System.out.println("Field Title: " + f.getTitle());
	System.out.println("Field Title Alignment: " + f.getAlignTitle());
	System.out.println("Field Align Data: " + f.getAlignData());

    	        
    }
}





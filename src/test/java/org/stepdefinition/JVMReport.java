package org.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

	public static void generateJvmReport(String jsonfile) {

		File f = new File("C:\\Users\\KAMAL\\eclipse-workspace\\Cucumber\\Reports\\JVMreport");
		
		Configuration c = new Configuration(f, "FaceBook Application");
		c.addClassifications("paltform", "Windows");
		c.addClassifications("jdk", "1.8");
		
		List<String> li = new ArrayList<String>();
		li.add(jsonfile);
		
		ReportBuilder r = new ReportBuilder(li,c);
		r.generateReports();
		}
}

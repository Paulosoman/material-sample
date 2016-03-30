package com.support.android.designlibdemo;

import com.support.android.designlibdemo.model.RowItem;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Paul Soman.
 */
public class MockDataHelper {
	public static List<RowItem> getRowItems(String widgetType, int size) {
		List<RowItem> rowItems = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			RowItem rowItem = new RowItem( getTitle(widgetType, i),widgetType);
			rowItems.add(rowItem);
		}
		return rowItems;
	}

	private static String getTitle(String widget, int index) {
		String title = "";
		if (widget.equalsIgnoreCase(Constants.TAB_TYPES.TECHNOLOGIES)) {
			title = technologies[index];
		} else if (widget.equalsIgnoreCase(Constants.TAB_TYPES.PROJECTS)) {
			title = projects[index];
		} else if (widget.equalsIgnoreCase(Constants.TAB_TYPES.CLIENTS)) {
			title = clients[index];
		}
		return title;
	}

	private static String technologies[] = { "Big Data", "\n"
			+ "Cloud", "Microsoft", "Mobile", "Open Source", "MongoDB", "CouchDB", "Amazon Web Services",
			"Azure", "Heroku", "Force.com", "Asp.net", "Sharepoint", "Biztalk", "SQL Server",
			"iOS", "Android", "Windows Mobile", "PHP", "Python", "Ruby on Rails", "Node.js", "Big Data", "\n"
			+ "Cloud", "Microsoft", "Mobile", "Open Source", "MongoDB", "CouchDB", "Amazon Web Services",
			"Azure", "Heroku", "Force.com", "Asp.net", "Sharepoint", "Biztalk", "SQL Server",
			"iOS", "Android", "Windows Mobile", "PHP", "Python", "Ruby on Rails", "Node.js",
			"Big Data", "\n"
			+ "Cloud", "Microsoft", "Mobile", "Open Source", "MongoDB", "CouchDB", "Amazon Web Services",
			"Azure", "Heroku", "Force.com", "Asp.net", "Sharepoint", "Biztalk", "SQL Server",
			"iOS", "Android", "Windows Mobile", "PHP", "Python", "Ruby on Rails", "Node.js",
			"Big Data", "\n"
			+ "Cloud", "Microsoft", "Mobile", "Open Source", "MongoDB", "CouchDB", "Amazon Web Services",
			"Azure", "Heroku", "Force.com", "Asp.net", "Sharepoint", "Biztalk", "SQL Server",
			"iOS", "Android", "Windows Mobile", "PHP", "Python", "Ruby on Rails", "Node.js"

	};

	private static String projects[] = { "Socxo", "Single Fit", "ASI", "OTG", "Daily Fish", "Macfomers", "ECRM",
			"Healthy Dose", "Delivery Boy", "Minute Hand", "PROMPA", "Digital Operatives", "BCDRLink", "Sai Global", "Feld",
			"Socxo", "Single Fit", "ASI", "OTG", "Daily Fish", "Macfomers", "ECRM",
			"Healthy Dose", "Delivery Boy", "Minute Hand", "PROMPA", "Digital Operatives", "BCDRLink", "Sai Global", "Feld",
			"Socxo", "Single Fit", "ASI", "OTG", "Daily Fish", "Macfomers", "ECRM",
			"Healthy Dose", "Delivery Boy", "Minute Hand", "PROMPA", "Digital Operatives", "BCDRLink", "Sai Global", "Feld",
			"Socxo", "Single Fit", "ASI", "OTG", "Daily Fish", "Macfomers", "ECRM",
			"Healthy Dose", "Delivery Boy", "Minute Hand", "PROMPA", "Digital Operatives", "BCDRLink", "Sai Global", "Feld",
			"Socxo", "Single Fit", "ASI", "OTG", "Daily Fish", "Macfomers", "ECRM",
			"Healthy Dose", "Delivery Boy", "Minute Hand", "PROMPA", "Digital Operatives", "BCDRLink", "Sai Global", "Feld"

	};

	private static String clients[] = { "BMR",
			"Wellness Telecom", "Fifth Gear", "Author Solutions", "Xait", "The College of Social Work", "TF Publishing",
			"Wellness Telecom", "Fifth Gear", "Author Solutions", "Xait", "The College of Social Work", "TF Publishing"
			,
			"Wellness Telecom", "Fifth Gear", "Author Solutions", "Xait", "The College of Social Work", "TF Publishing",
			"Wellness Telecom", "Fifth Gear", "Author Solutions", "Xait", "The College of Social Work", "TF Publishing",
			"Wellness Telecom", "Fifth Gear", "Author Solutions", "Xait", "The College of Social Work", "TF Publishing",
			"Wellness Telecom", "Fifth Gear", "Author Solutions", "Xait", "The College of Social Work", "TF Publishing",
			"Wellness Telecom", "Fifth Gear", "Author Solutions", "Xait", "The College of Social Work", "TF Publishing",
			"Wellness Telecom", "Fifth Gear", "Author Solutions", "Xait", "The College of Social Work", "TF Publishing"

	};
}

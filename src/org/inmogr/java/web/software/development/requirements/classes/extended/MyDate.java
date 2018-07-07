package org.inmogr.java.web.software.development.requirements.classes.extended;

import java.util.Calendar;
import java.util.Date;

public class MyDate extends Date {
	private static final long serialVersionUID = 5907600711859427193L;
	
	public MyDate() {
		super();
	}
	
	public MyDate(long timestamp) {
		super(timestamp);
	}

	public MyDate(String date, String format) {
		super(0);
		SupportMyDate smd = new SupportMyDate();
		int yyyy = -1, mm = -1, dd = -1;
        if (format == null) return;
        switch (format) {
            case "yyyy-mm-dd":
            	yyyy = smd.gIntFromString(date.substring(0, 4));
                mm = smd.gIntFromString(date.substring(5, 7));
                dd = smd.gIntFromString(date.substring(8, 10));
                break;
            case "mm-dd-yyyy":
                mm = smd.gIntFromString(date.substring(0, 2));
                dd = smd.gIntFromString(date.substring(3, 5));
                yyyy = smd.gIntFromString(date.substring(6, 10));
                break;
            case "dd-mm-yyyy":
                dd = smd.gIntFromString(date.substring(0, 2));
                mm = smd.gIntFromString(date.substring(3, 5));
                yyyy = smd.gIntFromString(date.substring(6, 10));
                break;
        }
        if (yyyy != -1 && mm != -1 && dd != -1) {
        	sYear(yyyy);
        	sMonth(mm);
        	sDay(dd);
        }
	}
	
	public String gString(String format) { 
        int     yyyy = 1900,
                m = 1,
                d = 1;
        String 	mm = "",
                dd = "";
        if (format == null) return "1/Jan/1900";
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this);
        switch (format) {
            case "yyyy-mm-dd":
                yyyy = calendar.get(Calendar.YEAR);
                m = calendar.get(Calendar.MONTH) + 1;
                d = calendar.get(Calendar.DAY_OF_MONTH);
                mm = (m > 9) ? ""+m : "0"+m;
                dd = (d > 9) ? ""+d : "0"+d;
                return "" + yyyy +"-"+ mm +"-"+ dd;
            case "yyyy-m-d":
                yyyy = calendar.get(Calendar.YEAR);
                m = calendar.get(Calendar.MONTH) + 1;
                d = calendar.get(Calendar.DAY_OF_MONTH);
                return "" + yyyy +"-"+ m +"-"+ d;
            case "d MMM yyyy":
                yyyy = calendar.get(Calendar.YEAR);
                m = calendar.get(Calendar.MONTH) + 1;
                d = calendar.get(Calendar.DAY_OF_MONTH);
                return "" + d +" "+ gMonthTitle(m, false, false) +" "+ yyyy;
            case "dd MMM yyyy":
                yyyy = calendar.get(Calendar.YEAR);
                m = calendar.get(Calendar.MONTH) + 1;
                d = calendar.get(Calendar.DAY_OF_MONTH);
                dd = (d > 9) ? ""+d : "0"+d;
                return "" + dd +" "+ gMonthTitle(m, false, false) +" "+ yyyy;
            case "d/MMM/yyyy":
                yyyy = calendar.get(Calendar.YEAR);
                m = calendar.get(Calendar.MONTH) + 1;
                d = calendar.get(Calendar.DAY_OF_MONTH);
                return "" + d +"/"+ gMonthTitle(m, false, false) +"/"+ yyyy;
            case "dd/MMM/yyyy":
                yyyy = calendar.get(Calendar.YEAR);
                m = calendar.get(Calendar.MONTH) + 1;
                d = calendar.get(Calendar.DAY_OF_MONTH);
                dd = (d > 9) ? ""+d : "0"+d;
                return "" + dd +"/"+ gMonthTitle(m, false, false) +"/"+ yyyy;
        }
        return "1/Jan/1900";
    }
    
    public String gFullString() {
        String partial = gString("d MMM yyyy");
        String minutes = gMinutes(true);
        String hours = gHours(false, true);
        String gmt = "GMT"+gZone();
        return partial +" "+ hours +":"+ minutes +" "+ gHoursAmPm() +" (" + gmt + ")";
    }

    public int gDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this);
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

    public void sDay(int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this);
        calendar.set(gYear(), gMonth()-1, day);
        this.setTime(calendar.getTime().getTime());
    }

    public int gMonth() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this);
        return calendar.get(Calendar.MONTH) + 1;
    }
    
    public void sMonth(int month) {
    	Calendar calendar = Calendar.getInstance();
        calendar.setTime(this);
        calendar.set(gYear(), month-1, gDay());
        this.setTime(calendar.getTime().getTime());
    }

    public String gMonthTitle(Boolean shortened, Boolean allCaps) {
        return gMonthTitle(gMonth(), shortened, allCaps);
    }

    public int gYear() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this);
        return calendar.get(Calendar.YEAR);
    }
    
    public void sYear(int year) {
    	Calendar calendar = Calendar.getInstance();
        calendar.setTime(this);
        calendar.set(year, gMonth()-1, gDay());
        this.setTime(calendar.getTime().getTime());
    }

    public String gMinutes(boolean isMM) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this);
        int m = calendar.get(Calendar.MINUTE);
        return (isMM && m < 10) ? "0"+m : ""+m;
    }

    public String gHours(boolean is24, boolean isHH) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this);
        int time = 0;
        if (is24)
            time = calendar.get(Calendar.HOUR_OF_DAY); // 24 based
        else
            time = calendar.get(Calendar.HOUR); // 12 based
        if (isHH && (time < 10))
            return "0"+time;
        return ""+time;
    }

    public String gHoursAmPm() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this);
        return (calendar.get(Calendar.HOUR_OF_DAY) > 11) ? "PM" : "AM";
    }

    public String gZone() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this);
        int zoneOffset = calendar.get(Calendar.ZONE_OFFSET);
        int zoneSub = zoneOffset;
        zoneSub /= 60 * 60;
        zoneSub %= 1000;
        zoneSub *= 60;
        zoneSub /= 1000;
        int zoneMain = zoneOffset / (60 * 60 * 1000);
        zoneMain *= 100;
        int zone = zoneMain + zoneSub;
        if (zone == 0)
            return "";
        else if (zone > 0)
            return (zone < 1000) ? "+0"+zone : "+"+zone;
        else {
            zone *= -1;
            return (zone < 1000) ? "-0"+zone : "-"+zone;
        }
    }

    public String gMonthTitle(int monthNumber, Boolean shortened, Boolean allCaps) {
        String[] months = {
                "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"
        };
        if (monthNumber < 1 || monthNumber > 12) return "INVALID";
        String res = months[monthNumber-1];
        if (allCaps) {
            res = res.toUpperCase();
            shortened = true;
        }
        if (shortened) res = res.substring(0, 2);
        return res;
    }
    
    public boolean equals(long timestamp) {
    	return this.getTime() == timestamp;
    }
    
    public boolean equals(Date date) {
    	return equals(date.getTime());
    }

}

class SupportMyDate {
	public int gIntFromString(String intString) {
        try {
            return Integer.parseInt(intString);
        } catch (Exception error) {
            return -1;
        }
    }

}
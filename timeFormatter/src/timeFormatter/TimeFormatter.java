package timeFormatter;

public class TimeFormatter {
	
	public static void main (String args[]) {
		formatDuration(120);
	}
	public static String formatDuration(int seconds) {
        // your code goes here
        String res = "";
        int ny = 0, nd = 0, nh = 0, nm = 0, ns = 0;
        if(seconds >= (365*24*60*60)) {
        	ny = seconds / (365*24*60*60);
        	seconds = seconds % (365*24*60*60);
        	if(ny>1) res = ny +" years";
        	else res = ny + " year";
        }
        if(seconds >= 24*60*60) {
        	nd = seconds / (24*60*60);
        	seconds = seconds % (24*60*60);
        	if(ny>0 && nd>1) {
        		if(seconds == 0) res = res + " and "+nd+ " days";
        		else res = res + ", "+nd+ " days";
        	}
        	else if (ny>0 && nd==1) {
        		if (seconds == 0) res = res + " and "+nd+ " day";
        		else res = res + ", "+nd+ " day";
        	}
        	else if (ny==0 && nd>1) res = nd + " days";
        	else res = nd + " day"; //nd == 1
        }
        if(seconds >= 60*60) {
        	nh = seconds / (60*60);
        	seconds = seconds % (60*60);
        	if(nd>0 && nh>1) {
        		if(seconds == 0) res = res + " and "+nh+ " hours";
        		res = res + ", "+nh+ " hours";
        	}
        	else if (nd>0 && nh==1) {
        		if (seconds==0) res = res + " and "+nh+ " hour";
        		else res = res + ", "+nh+ " hour";
        	}
        	else if ((ny+nd)==0 && nh>1) res = nh + " hours";
        	else res = nh + " hour"; //nh == 1
        }
        if(seconds >= 60) {
        	nm = seconds / 60;
        	seconds = seconds % 60;
        	if(nh>0 && nm>1) {
        		if(seconds == 0) res = res + " and "+nm+ " minutes";
        		else res = res + ", "+nm+ " minutes";
        	}
        	else if (nh>0 && nm==1) {
        		if(seconds == 0) res = res + " and "+nm+ " minute";
        		else res = res + ", "+nm+ " minute";
        	}
        	else if ((nh+nd+ny)==0 && nm>1) res = nm + " minutes";
        	else res = nm + " minute"; //nm == 1
        }
        ns = seconds;
        if((nm+nh+nd+ny) > 0 && ns > 1) res = res + " and " + ns+ " seconds";
        else if((nm+nh+nd+ny) > 0 && ns == 1) res = res + " and " + ns+ " second";
        else if ((nm+nh+nd+ny) == 0 && ns > 1) res = ns + " seconds";
        else if(ns == 1) res = ns + " second";
        else if ((nm+nh+nd+ny+ns) == 0) res = "now";
		return res;
    }
}

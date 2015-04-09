package no.hib.dpf.text;

import java.util.Comparator;

/**
 * Comparator for DPF-Text Launch configurations TODO: Needs to be fixed! (minor bug)
 */
public class DPFTextLaunchConfigComparator implements Comparator<String> {
	public int compare(String f1, String f2) {
		try {
			return f1.compareTo(f2);
		} catch (Exception e) {
			return -1;
		}
	}
}

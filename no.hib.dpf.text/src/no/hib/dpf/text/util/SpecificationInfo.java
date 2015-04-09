package no.hib.dpf.text.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Transfer object to use information about a specification in the Java code of the GUI project. 
 */
public class SpecificationInfo {

	private String name;
	private String path;
	private List<SpecificationInfo> instances = new ArrayList<SpecificationInfo>();
	private String versionName;
	private boolean dirty;
	
	public SpecificationInfo(String name, String path, String version, boolean dirty) {
		this.name = name;
		this.path = path;
		this.versionName=version;
		this.dirty = dirty;
	}

	public String getName() {
		return name;
	}

	public String getPath() {
		return path;
	}
	
	public String getVersionName() {
		return versionName;
	}

	public boolean isDirty() {
		return dirty;
	}

	public List<SpecificationInfo> getInstances() {
		return instances;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((path == null) ? 0 : path.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SpecificationInfo other = (SpecificationInfo) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (path == null) {
			if (other.path != null)
				return false;
		} else if (!path.equals(other.path))
			return false;
		return true;
	}	
	
}

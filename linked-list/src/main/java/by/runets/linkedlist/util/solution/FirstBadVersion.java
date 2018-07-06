package by.runets.linkedlist.util.solution;

public class FirstBadVersion {
	public boolean isBadVersion (int version) {
		if (version == 4) {
			return true;
		}
		return false;
	}
	
	public int firstBadVersion (int n) {
		int start = 1;
		int end = n;
		
		while (start != end) {
			int mid = start + (end - start) / 2;
			if (!isBadVersion(mid))
				start = mid + 1;
			else
				end = mid;
		}
		return start;
	}
}

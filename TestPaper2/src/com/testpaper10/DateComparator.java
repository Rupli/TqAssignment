package com.testpaper10;

import java.util.Comparator;

public class DateComparator  implements Comparator<Shipment>{

	@Override
	public int compare(Shipment s1, Shipment s2) {
		
		return s1.getMydate().getDate().compareTo(s2.getMydate().getDate());
	}

}

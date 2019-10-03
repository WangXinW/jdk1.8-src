package indi.wangx.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

/**
 * @author 27630
 * @since 20190930
 */
public class IteratorTest {
	
	@Test
	public void testIterator() {
		// HashMap Iterator
		
		
		// ArrayList Iterator
		List<String> list = new ArrayList<String>();
		for (int i = 0;i < 10;i++) {
			list.add( Integer.toString(i));
		}
		
		for (String item : list) {
			if ("0".equals(item)) {
				// list.remove("0");
			}
		}
		
		for (int i = 0;i < list.size();i++) {
			if ("0".equals(list.get(i))) {
				list.remove(i);
			}
		}
		
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			if ("0".equals(iter.next())) {
				iter.remove();
			}
		}
	}
}

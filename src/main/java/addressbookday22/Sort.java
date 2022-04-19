package addressbookday22;

import java.util.Comparator;

public class Sort {
	static Comparator<ContactInfo> compareCity = new Comparator<ContactInfo>() {
        public int compare(ContactInfo one, ContactInfo two) {
            return one.getCity().compareTo(two.getCity());
        }
    };
    static Comparator<ContactInfo> compareState = new Comparator<ContactInfo>() {
        public int compare(ContactInfo one, ContactInfo two) {
            return one.getState().compareTo(two.getState());
        }
    };
}

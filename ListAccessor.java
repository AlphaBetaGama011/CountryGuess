import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class ListAccessor {
	private ArrayList<ImageIcon> flags;
	private ArrayList<String> countries;
	private ArrayList<String> flagAddress;

	public ListAccessor() {
		flags = new ArrayList();
		countries = new ArrayList();
		flagAddress = new ArrayList();
	}

	/**
	 * Creates and adds all the ImageIcon objects, containing the images of the flag
	 * for each country to the flags ArrayList
	 */
	public void createAndAddFlags() {
		// System.out.println(flagAddress.size());

		for (int x = 0; x < flagAddress.size(); x++) {
			ImageIcon objToAdd = new ImageIcon(getClass().getResource(flagAddress.get(x)));
			flags.add(objToAdd);
		}
	}

	/**
	 * returns the ImageIcon object in the ArrayList flags
	 * 
	 * @param
	 * @return flag in the index i in ArrayList flags
	 */
	public ArrayList<ImageIcon> getFlags() {
		return flags;
	}

	public void setFlags(ArrayList<ImageIcon> flags) {
		this.flags = flags;
	}

	public ArrayList<String> getCountries() {
		return countries;
	}

	public void setCountries(ArrayList<String> countries) {
		this.countries = countries;
	}

	public ArrayList<String> getFlagAddress() {
		return flagAddress;
	}

	public void setFlagAddress(ArrayList<String> flagAddress) {
		this.flagAddress = flagAddress;
	}

}

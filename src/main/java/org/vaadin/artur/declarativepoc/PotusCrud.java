package org.vaadin.artur.declarativepoc;

import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.Table;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

/**
 * This whole file is auto generated and overwritten
 */
public class PotusCrud extends VerticalLayout {

	public static final String POTUS_LIST = "potuslist";
	
	Button addNew;
	Table potusList;
	VerticalLayout form;
	TextField firstName;
	TextField lastName;
	ComboBox party;
	PopupDateField tookOffice;
	PopupDateField leftOffice;
	Button save;
	Button revert;
	Button delete;

}

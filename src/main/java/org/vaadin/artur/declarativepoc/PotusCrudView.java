package org.vaadin.artur.declarativepoc;

import org.vaadin.artur.html.DeclaredView;
import org.vaadin.artur.html.binder.annotation.UiDataSource;

import com.vaadin.data.Container;
import com.vaadin.data.util.IndexedContainer;

public class PotusCrudView extends DeclaredView<PotusCrud> {

	public PotusCrudView() {
		getRoot().firstName.setInputPrompt("Enter first name");
	}
	
	@UiDataSource(PotusCrud.POTUS_LIST)
	public Container getData() {
		IndexedContainer ic = new IndexedContainer();
		ic.addItem("foo");
		ic.addItem("bar");
		ic.addContainerProperty("proper1", String.class, "Default");
		return ic;
	}
}

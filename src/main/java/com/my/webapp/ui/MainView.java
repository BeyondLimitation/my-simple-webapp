package com.my.webapp.ui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
/**
 * A sample Vaadin view class.
 * <p>
 * To implement a Vaadin view just extend any Vaadin component and
 * use @Route annotation to announce it in a URL as a Spring managed
 * bean.
 * Use the @PWA annotation make the application installable on phones,
 * tablets and some desktop browsers.
 * <p>
 * A new instance of this class is created for every new user and every
 * browser tab/window.
 */
@Route("")
public class MainView extends VerticalLayout {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MainView() {
		// 누른 횟수를 표시하는 TextField
		TextField sum = new TextField();
		sum.setPlaceholder("누른 횟수가 표시됩니다.");
		// 누를 button. 누르면 자신을 누른 횟수가 추가된다.
		Button counter = new Button("1+");

		// 'sum' 과 'counter' 를 추가한다.
		add(sum, counter);
    }

}

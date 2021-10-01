package com.rafi.testworktimecalculatorapp.ui;

import com.vaadin.flow.component.WebComponentExporter;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.timepicker.TimePicker;
import com.vaadin.flow.component.webcomponent.WebComponent;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.Theme;

import java.time.LocalTime;

@Route("")
@PageTitle("Test | Worktime Calculator")
@CssImport("styles/main-view.css")
public class WorktimeCalculatorView extends Div {
    /*
    public static class Exporter extends WebComponentExporter<WorktimeCalculator> {

        public Exporter() {
            super("worktime-calculator");
            /*addProperty("room", "-1").onChange((roominfo, roomId) -> {
                if ("-1".equals(roomId))
                    return;
                roominfo.setRoom(roomId);
            });
        }

        @Override
        protected void configureInstance(WebComponent<WorktimeCalculator> webComponent, WorktimeCalculator component) {

        }
    }*/

    public WorktimeCalculatorView() {
        this.addClassName("worktime-view");

        Span header = new Span("Worktime Calculator");
        header.addClassName("worktime-header");

        // ------------------------------------------------------------------ //

        Div pickerContainer = new Div();
        pickerContainer.addClassName("worktime-pickerContainer");

        // ------------------------------------------------------------------ //

        Div leftContainer = new Div();
        leftContainer.addClassName("worktime-leftContainer");

        TimePicker startPicker = new TimePicker("Starttime");
        startPicker.setValue(LocalTime.now());
        startPicker.setClearButtonVisible(true);
        startPicker.addClassName("worktime-timepicker");

        TimePicker endPicker = new TimePicker("Endtime");
        endPicker.setValue(LocalTime.now());
        endPicker.setClearButtonVisible(true);
        endPicker.addClassName("worktime-timepicker");

        leftContainer.add(startPicker, endPicker);

        // ------------------------------------------------------------------ //

        Div rightContainer = new Div();
        rightContainer.addClassName("worktime-rightContainer");

        TimePicker breakfastPicker = new TimePicker("Breakfast Breaktime");
        breakfastPicker.setValue(LocalTime.now());
        breakfastPicker.setClearButtonVisible(true);
        breakfastPicker.addClassName("worktime-timepicker");

        TimePicker lunchPicker = new TimePicker("Lunch Breaktime");
        lunchPicker.setValue(LocalTime.now());
        lunchPicker.setClearButtonVisible(true);
        lunchPicker.addClassName("worktime-timepicker");

        TimePicker worktimePicker = new TimePicker("Worktime");
        worktimePicker.setValue(LocalTime.now());
        worktimePicker.setClearButtonVisible(true);
        worktimePicker.addClassName("worktime-timepicker");

        rightContainer.add(breakfastPicker, lunchPicker, worktimePicker);

        // ------------------------------------------------------------------ //

        pickerContainer.add(leftContainer, rightContainer);

        // ------------------------------------------------------------------ //

        Button calculateButton = new Button("Calculate");
        calculateButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        calculateButton.addClickListener(e -> {

        });
        calculateButton.addClassName("worktime-button");

        // ------------------------------------------------------------------ //

        TextArea summaryArea = new TextArea();
        summaryArea.addClassName("worktime-summary");

        this.add(header, pickerContainer, calculateButton, summaryArea);
    }

}

package org.launchcode.techjobsmvc.controllers;

import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class TechJobsController {
    static HashMap<String, String> actionChoices = new HashMap<>();
    static HashMap<String, String> columnChoices = new HashMap<>();
    static LinkedHashMap<String, String> rowLabels = new LinkedHashMap<>();

    public TechJobsController() {
        actionChoices.put("search", "Search");
        actionChoices.put("list", "List");

        columnChoices.put("all", "All");
        columnChoices.put("employer", "Employer");
        columnChoices.put("location", "Location");
        columnChoices.put("positionType", "Position Type");
        columnChoices.put("coreCompetency", "Skill");

        rowLabels.put("id", "ID");
        rowLabels.put("name", "Name");
        rowLabels.put("employer", "Employer");
        rowLabels.put("location", "Location");
        rowLabels.put("positionType", "Position Type");
        rowLabels.put("coreCompetency", "Skill");
    }

    @ModelAttribute("actions")
    static HashMap<String, String> getActionChoices() {
        return actionChoices;
    }

    @ModelAttribute("columns")
    static HashMap<String, String> getColumnChoices() {
        return columnChoices;
    }

    @ModelAttribute("rowLabels")
    static LinkedHashMap<String, String> getRowLabels() {
        return rowLabels;
    }

}

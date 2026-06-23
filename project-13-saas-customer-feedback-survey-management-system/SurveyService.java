package src.services;

import src.models.Survey;
import java.util.*;

public class SurveyService {

    private List<Survey> surveys = new ArrayList<>();
    private int nextId = 1;

    public void createSurvey(String title) {
        surveys.add(new Survey(nextId++, title));
    }

    public int totalSurveys() {
        return surveys.size();
    }
}

package src;

import src.controllers.FeedbackController;
import src.services.*;

public class Main {

    public static void main(String[] args) {

        CustomerService customerService = new CustomerService();
        SurveyService surveyService = new SurveyService();
        ResponseService responseService = new ResponseService();
        AnalyticsService analyticsService = new AnalyticsService(responseService);

        ReportService reportService =
                new ReportService(
                        customerService,
                        surveyService,
                        responseService,
                        analyticsService);

        FeedbackController controller =
                new FeedbackController(
                        customerService,
                        surveyService,
                        responseService,
                        analyticsService,
                        reportService);

        controller.addCustomer("Alhanoof");
        controller.addCustomer("Ahmed");

        controller.createSurvey("Customer Satisfaction Survey");

        controller.submitResponse(
                "Alhanoof",
                "Customer Satisfaction Survey",
                5);

        controller.submitResponse(
                "Ahmed",
                "Customer Satisfaction Survey",
                4);

        controller.showDashboard();
    }
}

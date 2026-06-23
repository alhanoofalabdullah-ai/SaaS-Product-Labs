package src.services;

public class ReportService {

    private CustomerService customerService;
    private SurveyService surveyService;
    private ResponseService responseService;
    private AnalyticsService analyticsService;

    public ReportService(
            CustomerService customerService,
            SurveyService surveyService,
            ResponseService responseService,
            AnalyticsService analyticsService) {

        this.customerService = customerService;
        this.surveyService = surveyService;
        this.responseService = responseService;
        this.analyticsService = analyticsService;
    }

    public void showDashboard() {

        System.out.println(
                "\n===== CUSTOMER EXPERIENCE DASHBOARD =====");

        System.out.println(
                "Customers: "
                        + customerService.totalCustomers());

        System.out.println(
                "Surveys: "
                        + surveyService.totalSurveys());

        System.out.println(
                "Responses: "
                        + responseService.totalResponses());

        System.out.println(
                "Average Rating: "
                        + analyticsService.averageRating());
    }
}

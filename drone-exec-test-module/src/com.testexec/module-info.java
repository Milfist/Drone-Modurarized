module com.testexec {
    requires junit;
    requires org.mockito;

    requires drone.module;

    uses com.drone.driver.Driver;
    uses com.drone.service.UrbanizationsTreatmentService;
    uses com.drone.service.UrbanizationsTreatmentSimulatedService;

    exports com.testexec.driver to junit, org.mockito;
    exports com.testexec.service to junit, org.mockito;
}
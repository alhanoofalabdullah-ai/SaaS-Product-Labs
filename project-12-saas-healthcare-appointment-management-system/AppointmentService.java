package src.services;

import src.models.Appointment;

import java.util.ArrayList;
import java.util.List;

public class AppointmentService {

    private List<Appointment> appointments = new ArrayList<>();
    private int nextId = 1;

    public void bookAppointment(
            String patientName,
            String doctorName,
            String department,
            String date) {

        appointments.add(
                new Appointment(
                        nextId++,
                        patientName,
                        doctorName,
                        department,
                        date
                )
        );
    }

    public Appointment findAppointment(int id) {

        for (Appointment appointment : appointments) {
            if (appointment.getId() == id) {
                return appointment;
            }
        }

        return null;
    }

    public void cancelAppointment(int id) {

        Appointment appointment = findAppointment(id);

        if (appointment != null) {
            appointment.cancel();
        }
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public int totalAppointments() {
        return appointments.size();
    }

    public int activeAppointments() {

        int count = 0;

        for (Appointment appointment : appointments) {
            if (appointment.getStatus().equals("SCHEDULED")) {
                count++;
            }
        }

        return count;
    }

    public int cancelledAppointments() {

        int count = 0;

        for (Appointment appointment : appointments) {
            if (appointment.getStatus().equals("CANCELLED")) {
                count++;
            }
        }

        return count;
    }
}

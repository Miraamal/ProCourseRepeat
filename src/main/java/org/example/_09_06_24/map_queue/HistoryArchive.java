package org.example._09_06_24.map_queue;

import java.util.HashMap;
import java.util.Map;

public class HistoryArchive {
    private Map<Patient, History> patientToHistory;

    public HistoryArchive() {
        this.patientToHistory = new HashMap<>();
    }
   public void createHistory (Patient patient){
        History history = new History();
        patientToHistory.put(patient,history);
    }
    public void addDecease (Patient patient, String decease){
        findHistory(patient).getDecease().add(decease);

    }
    public History findHistory (Patient patient){
        History history = patientToHistory.get(patient);
        return history;
    }
}

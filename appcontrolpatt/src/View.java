package org.techzoo.aqsa;
 
import java.util.Map;
 
public class View {
 
    private Map model;
    private String forward;
 
    public View(String forward) {
        this.setForward(forward);
    }
 
    public View(String forward, Map data) {
        this.setForward(forward);
        if (data != null) {
            this.model = data;
        }
    }
 
    public void clean() {
        this.model = null;
    }
 
    public Map getModel() {
        return model;
    }
 
    public void setModel(Map model) {
        this.model = model;
    }
 
    public String getForward() {
        return forward;
    }
 
    public void setForward(String forward) {
        this.forward = forward;
    }
}
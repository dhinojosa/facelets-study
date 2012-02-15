package com.evolutionnext.facelets.study;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import static javax.faces.application.FacesMessage.SEVERITY_INFO;

public class VisaBean {

    public String process() {
        FacesContext.getCurrentInstance().addMessage(null, new
                FacesMessage(SEVERITY_INFO, "Visa processed", "Visa is processed successfully"));
        return "success";
    }
}

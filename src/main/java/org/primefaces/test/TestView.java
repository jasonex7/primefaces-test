package org.primefaces.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class TestView implements Serializable {
    
    private List<String> selected;
    private List<String> testList;
    
    @PostConstruct  
    public void init() {
        testList = new ArrayList<>();
        testList.add("item 1");
        testList.add("item 2");
        testList.add("item 3");
        testList.add("item 4");
        testList.add("item 5");
    }

    public List<String> getTestList() {
        return testList;
    }

    public List<String> getSelected() {
        return selected;
    }

    public void setSelected(List<String> selected) {
        this.selected = selected;
    }

    public void onItemSelect() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Selected values: " + selected));
    }
}

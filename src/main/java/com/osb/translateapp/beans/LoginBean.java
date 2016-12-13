package com.osb.translateapp.beans;

import java.io.Serializable;
import java.util.Locale;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

/**
 * @author Oscar Blancarte
 */
@ManagedBean
@SessionScoped
public class LoginBean implements Serializable{

    private String lang;
    private String username;
    private String password;
    private boolean remember;
    
    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public boolean isRemember() {
        return remember;
    }

    public void setRemember(boolean remember) {
        this.remember = remember;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void changeLang(ValueChangeEvent e) {
        Object newValue = e.getNewValue();
        this.lang = newValue.toString();
        Logger.getAnonymousLogger().severe("new lang ==> " + newValue.toString());
        UIViewRoot viewRoot = FacesContext.getCurrentInstance().getViewRoot();
        viewRoot.setLocale(new Locale(newValue.toString()));
    }

    public void login() {
    }
}

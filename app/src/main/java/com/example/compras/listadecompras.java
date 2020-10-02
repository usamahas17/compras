package com.example.compras;

public class listadecompras {
    private String verdura;
    private String carne ;
    private String abarrotes;
    public listadecompras(String verdura,String carne,String abarrotes){
        this.verdura = verdura;
        this.carne = carne;
        this.abarrotes = abarrotes;


    }



    public String getVerdura() {
        return verdura;
    }

    public void setVerdura(String verdura) {
        this.verdura = verdura;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getAbarrotes() {
        return abarrotes;
    }

    public void setAbarrotes(String abarrotes) {
        this.abarrotes = abarrotes;
    }
}

package com.example.tp3androidgestionsinterventions;

public class interventions {
    private String titreInterv;// titre de l'intervention
    private String Client;// nom de client
    private String adressClient;//adresse du client
    private String heureInterv;// heureIntervention
    private boolean termine;// intervention terminée

    public interventions(String titreInterv, String client, String adressClient, String heureInterv, boolean termine) {
        this.titreInterv = titreInterv;
        Client = client;
        this.adressClient = adressClient;
        this.heureInterv = heureInterv;
        this.termine = termine;
    }

    public String getTitreInterv() {
        return titreInterv;
    }

    public void setTitreInterv(String titreInterv) {
        this.titreInterv = titreInterv;
    }

    public String getClient() {
        return Client;
    }

    public void setClient(String client) {
        Client = client;
    }

    public String getAdressClient() {
        return adressClient;
    }

    public void setAdressClient(String adressClient) {
        this.adressClient = adressClient;
    }

    public String getHeureInterv() {
        return heureInterv;
    }

    public void setHeureInterv(String heureInterv) {
        this.heureInterv = heureInterv;
    }

    public boolean isTermine() {
        return termine;
    }

    public void setTermine(boolean termine) {
        this.termine = termine;
    }

    public boolean getTermine() { return termine;}
    }



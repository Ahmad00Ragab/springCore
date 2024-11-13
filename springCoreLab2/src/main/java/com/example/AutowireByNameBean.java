package com.example;

public class AutowireByNameBean {
    private Collaborator collaborato;

    public void setCollaborator(Collaborator collaborato) {
        this.collaborato = collaborato;
    }

    public Collaborator getCollaborator() {
        return collaborato;
    }
}

package com.example;

public class AutowireByTypeBean {
    private Collaborator collaborator;

    public void setCollaborator(Collaborator collaborator) {
        this.collaborator = collaborator;
    }

    public Collaborator getCollaborator() {
        return collaborator;
    }
}

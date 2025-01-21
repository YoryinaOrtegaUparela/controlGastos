package com.presupuesto.casa.domain.models;

public class User {
    private Long identifier;
    private String name;
    private String email;

    public User(BuilderUser builderUser) {
        this.identifier = builderUser.identifier;
        this.name = builderUser.name;
        this.email = builderUser.email;
    }

    public static class BuilderUser {
        private Long identifier;
        private String name;
        private String email;

        public BuilderUser setIdentifier(Long identifier) {
            this.identifier = identifier;
            return this;
        }

        public BuilderUser setName(String name) {
            this.name = name;
            return this;
        }

        public BuilderUser setEmail(String email) {
            this.email = email;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "identifier=" + identifier +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
